package org.uncertml.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlOptions;
import org.uncertml.IUncertainty;
import org.uncertml.distribution.IDistribution;
import org.uncertml.distribution.WeightedDistribution;
import org.uncertml.distribution.categorical.CategoricalUniformDistribution;
import org.uncertml.distribution.categorical.ICategoricalDistribution;
import org.uncertml.distribution.continuous.BetaDistribution;
import org.uncertml.distribution.continuous.CauchyDistribution;
import org.uncertml.distribution.continuous.ChiSquareDistribution;
import org.uncertml.distribution.continuous.ExponentialDistribution;
import org.uncertml.distribution.continuous.FDistribution;
import org.uncertml.distribution.continuous.GammaDistribution;
import org.uncertml.distribution.continuous.IContinuousDistribution;
import org.uncertml.distribution.continuous.InverseGammaDistribution;
import org.uncertml.distribution.continuous.LaplaceDistribution;
import org.uncertml.distribution.continuous.LogNormalDistribution;
import org.uncertml.distribution.continuous.LogisticDistribution;
import org.uncertml.distribution.continuous.MixtureModel;
import org.uncertml.distribution.continuous.NormalDistribution;
import org.uncertml.distribution.continuous.NormalInverseGammaDistribution;
import org.uncertml.distribution.continuous.ParetoDistribution;
import org.uncertml.distribution.continuous.PoissonDistribution;
import org.uncertml.distribution.continuous.StudentTDistribution;
import org.uncertml.distribution.continuous.UniformDistribution;
import org.uncertml.distribution.continuous.WeibullDistribution;
import org.uncertml.distribution.discrete.BernoulliDistribution;
import org.uncertml.distribution.discrete.BinomialDistribution;
import org.uncertml.distribution.discrete.DiscreteUniformDistribution;
import org.uncertml.distribution.discrete.GeometricDistribution;
import org.uncertml.distribution.discrete.HypergeometricDistribution;
import org.uncertml.distribution.discrete.IDiscreteDistribution;
import org.uncertml.distribution.discrete.NegativeBinomialDistribution;
import org.uncertml.distribution.multivariate.DirichletDistribution;
import org.uncertml.distribution.multivariate.IMultivariateDistribution;
import org.uncertml.distribution.multivariate.MultinomialDistribution;
import org.uncertml.distribution.multivariate.MultivariateNormalDistribution;
import org.uncertml.distribution.multivariate.MultivariateStudentTDistribution;
import org.uncertml.distribution.multivariate.WishartDistribution;
import org.uncertml.exception.UncertaintyEncoderException;
import org.uncertml.exception.UnsupportedUncertaintyTypeException;
import org.uncertml.sample.AbstractRealisation;
import org.uncertml.sample.CategoricalRealisation;
import org.uncertml.sample.ContinuousRealisation;
import org.uncertml.sample.ISample;
import org.uncertml.sample.RandomSample;
import org.uncertml.sample.SystematicSample;
import org.uncertml.sample.UnknownSample;
import org.uncertml.statistic.CategoricalMode;
import org.uncertml.statistic.CentredMoment;
import org.uncertml.statistic.CoefficientOfVariation;
import org.uncertml.statistic.ConfidenceInterval;
import org.uncertml.statistic.ConfusionMatrix;
import org.uncertml.statistic.Correlation;
import org.uncertml.statistic.CovarianceMatrix;
import org.uncertml.statistic.CredibleInterval;
import org.uncertml.statistic.Decile;
import org.uncertml.statistic.DiscreteProbability;
import org.uncertml.statistic.IStatistic;
import org.uncertml.statistic.InterquartileRange;
import org.uncertml.statistic.Kurtosis;
import org.uncertml.statistic.Mean;
import org.uncertml.statistic.Median;
import org.uncertml.statistic.Mode;
import org.uncertml.statistic.Moment;
import org.uncertml.statistic.Percentile;
import org.uncertml.statistic.Probability;
import org.uncertml.statistic.ProbabilityConstraint;
import org.uncertml.statistic.Quantile;
import org.uncertml.statistic.Quartile;
import org.uncertml.statistic.Range;
import org.uncertml.statistic.Skewness;
import org.uncertml.statistic.StandardDeviation;
import org.uncertml.statistic.StatisticCollection;
import org.uncertml.statistic.Variance;
import org.uncertml.x20.*;
import org.uncertml.x20.MixtureModelType.Component;

/**
 * XML implementation of an UncertML encoder. Based on the XmlBeans library.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class XMLEncoder implements IUncertaintyEncoder {

    private final String NAMESPACE = "http://www.uncertml.org/2.0";
    private final String NAMESPACE_PREFIX = "un";

    @Override
    public void encode(IUncertainty element, File file) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {
        try {
            AbstractUncertaintyDocument doc = null;
            doc = encodeUncertainty(element);
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(doc.xmlText(this.getOptions()));
            writer.flush();
        } catch (IOException ex) {
            throw new UncertaintyEncoderException(ex);
        }
    }

    @Override
    public void encode(IUncertainty element, OutputStream stream) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {

        try {
            AbstractUncertaintyDocument doc = null;
            doc = encodeUncertainty(element);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(stream));
            String result = doc.xmlText(this.getOptions());
            bw.write(result);
            bw.flush();
        } catch (IOException ex) {
            throw new UncertaintyEncoderException(ex);
        }
    }

    @Override
    public void encode(IUncertainty element, Writer writer) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {
        try {
            AbstractUncertaintyDocument doc = null;
            doc = encodeUncertainty(element);
            writer.write(doc.xmlText(this.getOptions()));
            writer.flush();
        } catch (IOException ex) {
            throw new UncertaintyEncoderException(ex);
        }
    }

    @Override
    public String encode(IUncertainty element) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {
        AbstractUncertaintyDocument doc = null;
        doc = encodeUncertainty(element);
        return doc.xmlText(this.getOptions());
    }

    private AbstractUncertaintyDocument encodeUncertainty(IUncertainty element) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {
        AbstractUncertaintyDocument doc = null;
        if (element instanceof IDistribution) {
            doc = encodeDistribution((IDistribution) element);
        } else if (element instanceof IStatistic) {
            doc = encodeStatistic((IStatistic) element);
        }
        else if (element instanceof AbstractRealisation) {
            return encodeRealisation((AbstractRealisation) element);
        }
        else if (element instanceof ISample) {
            doc = encodeSample((ISample) element);
        }
        return doc;
    }

    private AbstractSampleDocument encodeSample(ISample element) throws UnsupportedUncertaintyTypeException {
        if (element instanceof RandomSample) {
            return encodeRandomSample((RandomSample) element);
        } else if (element instanceof SystematicSample) {
            return encodeSystematicSample((SystematicSample) element);
        } else if (element instanceof UnknownSample) {
            return encodeUnknownSample((UnknownSample) element);
        } 
        
		throw new UnsupportedUncertaintyTypeException(element.getClass().getSimpleName() + " not supported in this version of the UncertML API");
    }

    private RandomSampleDocument encodeRandomSample(RandomSample element) {
        RandomSampleDocument xb_rDoc = RandomSampleDocument.Factory.newInstance();
        RandomSampleType xb_rType = xb_rDoc.addNewRandomSample();

        xb_rType.setSamplingMethodDescription(element.getSamplingMethodDescription());
        xb_rType.addNewRealisation();
        
        xb_rType.setRealisationArray(this.encodeRealisations(element.getRealisations()));
        return xb_rDoc;
    }

    private SystematicSampleDocument encodeSystematicSample(SystematicSample element) {
        SystematicSampleDocument xb_rDoc = SystematicSampleDocument.Factory.newInstance();
        SystematicSampleType xb_rType = xb_rDoc.addNewSystematicSample();
        xb_rType.setSamplingMethodDescription(element.getSamplingMethodDescription());
        xb_rType.setRealisationArray(this.encodeRealisations(element.getRealisations()));

        return xb_rDoc;
    }

    private UnknownSampleDocument encodeUnknownSample(UnknownSample element) {
        UnknownSampleDocument xb_rDoc = UnknownSampleDocument.Factory.newInstance();
        UnknownSampleType xb_rType = xb_rDoc.addNewUnknownSample();

        xb_rType.setSamplingMethodDescription(element.getSamplingMethodDescription());
        xb_rType.setRealisationArray(this.encodeRealisations(element.getRealisations()));
        
        return xb_rDoc;
    }

    private RealisationDocument encodeRealisation(AbstractRealisation element) {
        RealisationDocument xb_rDoc = RealisationDocument.Factory.newInstance();
        
            RealisationType type = xb_rDoc.addNewRealisation();
            String id = element.getId();
            double weight = element.getWeight();

            if (id != null) {
                type.setId(id);
            }
            if (!Double.isNaN(weight)) {
                type.setWeight(weight);
            }

            if (element instanceof CategoricalRealisation) {
            	type.addNewCategories().setListValue(((CategoricalRealisation)element).getCategories());
            }
            else {
            	type.addNewValues().setListValue(((ContinuousRealisation)element).getValues());
            }
        

        return xb_rDoc;
    }
    
    /*
     * Method to encode categorical, discrete and continuous realisations
     */
    private org.uncertml.x20.RealisationDocument.Realisation[] encodeRealisations(List<AbstractRealisation> elements) {
        RealisationDocument xb_rDoc = RealisationDocument.Factory.newInstance();
        org.uncertml.x20.RealisationDocument.Realisation[] types = new org.uncertml.x20.RealisationDocument.Realisation[elements.size()];
        for (int i = 0; i < types.length; i++) {
        	AbstractRealisation r = elements.get(i);
            org.uncertml.x20.RealisationDocument.Realisation type = xb_rDoc.addNewRealisation();
            String id = r.getId();
            double weight = r.getWeight();

            if (id != null) {
                type.setId(r.getId());
            }
            if (!Double.isNaN(weight)) {
                type.setWeight(r.getWeight());
            }
            
            if (r instanceof CategoricalRealisation) {
            	type.addNewCategories().setListValue(((CategoricalRealisation)r).getCategories());
            }
            else {
            	type.addNewValues().setListValue(((ContinuousRealisation)r).getValues());
            }
            
            types[i] = type;
        }

        return types;
    }

    private AbstractDistributionDocument encodeDistribution(IDistribution element) throws UnsupportedUncertaintyTypeException {
        if (element instanceof ICategoricalDistribution) {
            return encodeCategoricalDistribution((ICategoricalDistribution) element);
        } else if (element instanceof IDiscreteDistribution) {
            return encodeDiscreteDistribution((IDiscreteDistribution) element);
        } else if (element instanceof IContinuousDistribution) {
            // must be continuous
            return encodeContinuousDistribution((IContinuousDistribution) element);
        } else if (element instanceof IMultivariateDistribution) {
            return encodeMultivariateDistribution((IMultivariateDistribution) element);
        }
        throw new UnsupportedUncertaintyTypeException(element.getClass().getSimpleName() + " not supported in this version of the UncertML API");
    }

    private BetaDistributionDocument encodeBetaDistribution(BetaDistribution element) {
        BetaDistributionDocument xb_bdDoc = BetaDistributionDocument.Factory.newInstance();
        BetaDistributionType xb_bdType = xb_bdDoc.addNewBetaDistribution();
        xb_bdType.addNewAlpha().setListValue(element.getAlpha());
        xb_bdType.addNewBeta().setListValue(element.getBeta());
        return xb_bdDoc;
    }

    private BinomialDistributionDocument encodeBinomialDistribution(BinomialDistribution element) {
        BinomialDistributionDocument xb_bdDoc = BinomialDistributionDocument.Factory.newInstance();
        BinomialDistributionType xb_bdType = xb_bdDoc.addNewBinomialDistribution();
        xb_bdType.addNewNumberOfTrials().setListValue(element.getNumberOfTrials());
        xb_bdType.addNewProbabilityOfSuccess().setListValue(element.getProbabilityOfSuccess());
        return xb_bdDoc;
    }

    private AbstractDistributionDocument encodeCategoricalDistribution(ICategoricalDistribution element) throws UnsupportedUncertaintyTypeException {
        if (element instanceof CategoricalUniformDistribution) {
            return encodeCategoricalUniformDistribution((CategoricalUniformDistribution) element);
        }
        throw new UnsupportedUncertaintyTypeException(element.getClass().getSimpleName() + " not supported in this version of the UncertML API");
    }

    private ModeDocument encodeCategoricalMode(CategoricalMode element) {
        ModeDocument xb_mDoc = ModeDocument.Factory.newInstance();
        ModeType xb_mType = xb_mDoc.addNewMode();
        xb_mType.addNewCategories().setListValue(element.getCategory());
        return xb_mDoc;
    }

    private UniformDistributionDocument encodeCategoricalUniformDistribution(CategoricalUniformDistribution element) {
        UniformDistributionDocument xb_udDoc = UniformDistributionDocument.Factory.newInstance();
        UniformDistributionType xb_udType = xb_udDoc.addNewUniformDistribution();
        xb_udType.addNewNumberOfClasses().setListValue(element.getNumberOfClasses());
        return xb_udDoc;
    }

    private CauchyDistributionDocument encodeCauchyDistribution(CauchyDistribution element) {
        CauchyDistributionDocument xb_cdDoc = CauchyDistributionDocument.Factory.newInstance();
        CauchyDistributionType xb_cdType = xb_cdDoc.addNewCauchyDistribution();
        xb_cdType.addNewLocation().setListValue(element.getLocation());
        xb_cdType.addNewScale().setListValue(element.getScale());
        return xb_cdDoc;
    }

    private CentredMomentDocument encodeCentredMoment(CentredMoment element) {
        CentredMomentDocument xb_cmDoc = CentredMomentDocument.Factory.newInstance();
        CentredMomentType xb_cmType = xb_cmDoc.addNewCentredMoment();

        xb_cmType.addNewValues().setListValue(element.getValues());
        xb_cmType.setOrder(BigInteger.valueOf(element.getOrder()));


        return xb_cmDoc;
    }

    private ChiSquareDistributionDocument encodeChiSquareDistribution(ChiSquareDistribution element) {
        ChiSquareDistributionDocument xb_csdDoc = ChiSquareDistributionDocument.Factory.newInstance();
        ChiSquareDistributionType xb_csdType = xb_csdDoc.addNewChiSquareDistribution();
        xb_csdType.addNewDegreesOfFreedom().setListValue(element.getDegreesOfFreedom());
        return xb_csdDoc;
    }

    private CoefficientOfVariationDocument encodeCoefficientOfVariation(CoefficientOfVariation element) {
        CoefficientOfVariationDocument xb_covDoc = CoefficientOfVariationDocument.Factory.newInstance();
        CoefficientOfVariationType xb_covType = xb_covDoc.addNewCoefficientOfVariation();
        xb_covType.addNewValues().setListValue(element.getValues());
        return xb_covDoc;
    }

    private ConfidenceIntervalDocument encodeConfidenceInterval(ConfidenceInterval element) {
        ConfidenceIntervalDocument xb_ciDoc = ConfidenceIntervalDocument.Factory.newInstance();
        ConfidenceIntervalType xb_ciType = xb_ciDoc.addNewConfidenceInterval();

        QuantileType lower = xb_ciType.addNewLower();
        QuantileType upper = xb_ciType.addNewUpper();

        lower.setLevel(element.getLower().getLevel());
        upper.setLevel(element.getUpper().getLevel());

        lower.addNewValues().setListValue(element.getLower().getValues());
        upper.addNewValues().setListValue(element.getUpper().getValues());

        return xb_ciDoc;
    }

    private ConfusionMatrixDocument encodeConfusionMatrix(ConfusionMatrix element) {
        ConfusionMatrixDocument xb_cmDoc = ConfusionMatrixDocument.Factory.newInstance();
        ConfusionMatrixType xb_cmType = xb_cmDoc.addNewConfusionMatrix();

        xb_cmType.addNewSourceCategories().setListValue(element.getSourceCategories());
        xb_cmType.addNewTargetCategories().setListValue(element.getTargetCategories());
        xb_cmType.addNewCounts().setListValue(element.getCounts());
        return xb_cmDoc;
    }

    private AbstractDistributionDocument encodeContinuousDistribution(IContinuousDistribution element) throws UnsupportedUncertaintyTypeException {
        if (element instanceof BetaDistribution) {
            return encodeBetaDistribution((BetaDistribution) element);
        } else if (element instanceof CauchyDistribution) {
            return encodeCauchyDistribution((CauchyDistribution) element);
        } else if (element instanceof ChiSquareDistribution) {
            return encodeChiSquareDistribution((ChiSquareDistribution) element);
        } else if (element instanceof ExponentialDistribution) {
            return encodeExponentialDistribution((ExponentialDistribution) element);
        } else if (element instanceof GammaDistribution) {
            return encodeGammaDistribution((GammaDistribution) element);
        } else if (element instanceof NormalDistribution) {
            return encodeNormalDistribution((NormalDistribution) element);
        } else if (element instanceof InverseGammaDistribution) {
            return encodeInverseGammaDistribution((InverseGammaDistribution) element);
        } else if (element instanceof LaplaceDistribution) {
            return encodeLaplaceDistribution((LaplaceDistribution) element);
        } else if (element instanceof LogisticDistribution) {
            return encodeLogisticDistribution((LogisticDistribution) element);
        } else if (element instanceof LogNormalDistribution) {
            return encodeLogNormalDistribution((LogNormalDistribution) element);
        } else if (element instanceof NormalInverseGammaDistribution) {
            return encodeNormalInverseGammaDistribution((NormalInverseGammaDistribution) element);
        } else if (element instanceof ParetoDistribution) {
            return encodeParetoDistribution((ParetoDistribution) element);
        } else if (element instanceof PoissonDistribution) {
            return encodePoissonDistribution((PoissonDistribution) element);
        } else if (element instanceof StudentTDistribution) {
            return encodeStudentTDistribution((StudentTDistribution) element);
        } else if (element instanceof WeibullDistribution) {
            return encodeWeibullDistribution((WeibullDistribution) element);
        } else if (element instanceof UniformDistribution) {
            return encodeUniformDistribution((UniformDistribution) element);
        } else if (element instanceof FDistribution) {
            return encodeFDistribution((FDistribution) element);
        } else if (element instanceof MixtureModel) {
            return encodeMixtureModel((MixtureModel) element);
        }
        throw new UnsupportedUncertaintyTypeException(element.getClass().getSimpleName() + " not supported in this version of UncertML");
    }

    private CorrelationDocument encodeCorrelation(Correlation element) {
        CorrelationDocument xb_cDoc = CorrelationDocument.Factory.newInstance();
        CorrelationType xb_cType = xb_cDoc.addNewCorrelation();
        xb_cType.addNewValues().setListValue(element.getValues());
        return xb_cDoc;
    }

    private CovarianceMatrixDocument encodeCovarianceMatrix(CovarianceMatrix element) {
        CovarianceMatrixDocument xb_cmDoc = CovarianceMatrixDocument.Factory.newInstance();
        CovarianceMatrixType xb_cmType = xb_cmDoc.addNewCovarianceMatrix();

        xb_cmType.setDimension(BigInteger.valueOf(element.getDimension()));
        xb_cmType.addNewValues().setListValue(element.getValues());

        return xb_cmDoc;
    }

    private CredibleIntervalDocument encodeCredibleInterval(CredibleInterval element) {
        CredibleIntervalDocument xb_ciDoc = CredibleIntervalDocument.Factory.newInstance();
        CredibleIntervalType xb_ciType = xb_ciDoc.addNewCredibleInterval();

        QuantileType lower = xb_ciType.addNewLower();
        QuantileType upper = xb_ciType.addNewUpper();

        lower.setLevel(element.getLower().getLevel());
        upper.setLevel(element.getUpper().getLevel());

        lower.addNewValues().setListValue(element.getLower().getValues());
        upper.addNewValues().setListValue(element.getUpper().getValues());

        return xb_ciDoc;
    }

    private DecileDocument encodeDecile(Decile element) {
        DecileDocument xb_dDoc = DecileDocument.Factory.newInstance();
        DecileType xb_dType = xb_dDoc.addNewDecile();
        xb_dType.setLevel(element.getDecileLevel());
        xb_dType.addNewValues().setListValue(element.getValues());
        return xb_dDoc;
    }

    private AbstractDistributionDocument encodeDiscreteDistribution(IDiscreteDistribution element) throws UnsupportedUncertaintyTypeException {
        if (element instanceof BinomialDistribution) {
            return encodeBinomialDistribution((BinomialDistribution) element);
        } else if (element instanceof DiscreteUniformDistribution) {
            return encodeDiscreteUniformDistribution((DiscreteUniformDistribution) element);
        } else if (element instanceof GeometricDistribution) {
            return encodeGeometricDistribution((GeometricDistribution) element);
        } else if (element instanceof HypergeometricDistribution) {
            return encodeHypergeometricDistribution((HypergeometricDistribution) element);
        } else if (element instanceof NegativeBinomialDistribution) {
            return encodeNegativeBinomialDistribution((NegativeBinomialDistribution) element);
        } else if (element instanceof BernoulliDistribution) {
            return encodeBernoulliDistribution((BernoulliDistribution) element);
        }

        throw new UnsupportedUncertaintyTypeException(element.getClass().getSimpleName() + " not supported in this version of the UncertML API");
    }

    private BernoulliDistributionDocument encodeBernoulliDistribution(BernoulliDistribution element) {
        BernoulliDistributionDocument xb_bdDoc = BernoulliDistributionDocument.Factory.newInstance();
        BernoulliDistributionType xb_bdType = xb_bdDoc.addNewBernoulliDistribution();

        xb_bdType.addNewProbabilities().setListValue(element.getProbabilities());

        return xb_bdDoc;
    }

    private DiscreteProbabilityDocument encodeDiscreteProbability(DiscreteProbability element) {
        DiscreteProbabilityDocument xb_dpDoc = DiscreteProbabilityDocument.Factory.newInstance();
        DiscreteProbabilityType xb_dpType = xb_dpDoc.addNewDiscreteProbability();

        xb_dpType.addNewCategories().setListValue(element.getCategory());
        xb_dpType.addNewProbabilities().setListValue(element.getProbability());

        return xb_dpDoc;
    }

    private UniformDistributionDocument encodeDiscreteUniformDistribution(DiscreteUniformDistribution element) {
        UniformDistributionDocument xb_udDoc = UniformDistributionDocument.Factory.newInstance();
        UniformDistributionType xb_udType = xb_udDoc.addNewUniformDistribution();

        xb_udType.addNewNumberOfClasses().setListValue(element.getNumberOfClasses());

        return xb_udDoc;
    }

    private ExponentialDistributionDocument encodeExponentialDistribution(ExponentialDistribution element) {
        ExponentialDistributionDocument xb_edDoc = ExponentialDistributionDocument.Factory.newInstance();
        ExponentialDistributionType xb_edType = xb_edDoc.addNewExponentialDistribution();

        xb_edType.addNewRate().setListValue(element.getRate());

        return xb_edDoc;
    }

    private FDistributionDocument encodeFDistribution(FDistribution element) {
        FDistributionDocument xb_fdDoc = FDistributionDocument.Factory.newInstance();
        FDistributionType xb_fdType = xb_fdDoc.addNewFDistribution();

        xb_fdType.addNewDenominator().setListValue(element.getDenominator());
        xb_fdType.addNewNumerator().setListValue(element.getNumerator());

        return xb_fdDoc;
    }

    private GammaDistributionDocument encodeGammaDistribution(GammaDistribution element) {
        GammaDistributionDocument xb_gdDoc = GammaDistributionDocument.Factory.newInstance();
        GammaDistributionType xb_gdType = xb_gdDoc.addNewGammaDistribution();

        xb_gdType.addNewScale().setListValue(element.getScale());
        xb_gdType.addNewShape().setListValue(element.getShape());

        return xb_gdDoc;
    }

    private NormalDistributionDocument encodeNormalDistribution(NormalDistribution element) {
        NormalDistributionDocument xb_bdDoc = NormalDistributionDocument.Factory.newInstance();
        NormalDistributionType xb_bdType = xb_bdDoc.addNewNormalDistribution();

        xb_bdType.addNewMean().setListValue(element.getMean());
        xb_bdType.addNewVariance().setListValue(element.getVariance());

        return xb_bdDoc;
    }

    private GeometricDistributionDocument encodeGeometricDistribution(GeometricDistribution element) {
        GeometricDistributionDocument xb_gdDoc = GeometricDistributionDocument.Factory.newInstance();
        GeometricDistributionType xb_gdType = xb_gdDoc.addNewGeometricDistribution();

        xb_gdType.addNewProbability().setListValue(element.getProbability());

        return xb_gdDoc;
    }

    private HypergeometricDistributionDocument encodeHypergeometricDistribution(HypergeometricDistribution element) {
        HypergeometricDistributionDocument xb_hdDoc = HypergeometricDistributionDocument.Factory.newInstance();
        HypergeometricDistributionType xb_hdType = xb_hdDoc.addNewHypergeometricDistribution();

        xb_hdType.addNewNumberOfSuccesses().setListValue(element.getNumberOfSuccesses());
        xb_hdType.addNewNumberOfTrials().setListValue(element.getNumberOfTrials());
        xb_hdType.addNewPopulationSize().setListValue(element.getPopulationSize());

        return xb_hdDoc;
    }

    private InterquartileRangeDocument encodeInterquartileRange(InterquartileRange element) {
        InterquartileRangeDocument xb_iqrDoc = InterquartileRangeDocument.Factory.newInstance();
        InterquartileRangeType xb_iqrType = xb_iqrDoc.addNewInterquartileRange();

        xb_iqrType.addNewLower().setListValue(element.getLower());
        xb_iqrType.addNewUpper().setListValue(element.getUpper());

        return xb_iqrDoc;
    }

    private InverseGammaDistributionDocument encodeInverseGammaDistribution(InverseGammaDistribution element) {
        InverseGammaDistributionDocument xb_igdDoc = InverseGammaDistributionDocument.Factory.newInstance();
        InverseGammaDistributionType xb_igdType = xb_igdDoc.addNewInverseGammaDistribution();

        xb_igdType.addNewScale().setListValue(element.getScale());
        xb_igdType.addNewShape().setListValue(element.getShape());

        return xb_igdDoc;
    }

    private KurtosisDocument encodeKurtosis(Kurtosis element) {
        KurtosisDocument xb_kDoc = KurtosisDocument.Factory.newInstance();
        KurtosisType xb_kType = xb_kDoc.addNewKurtosis();

        xb_kType.addNewValues().setListValue(element.getValues());

        return xb_kDoc;
    }

    private LaplaceDistributionDocument encodeLaplaceDistribution(LaplaceDistribution element) {
        LaplaceDistributionDocument xb_ldDoc = LaplaceDistributionDocument.Factory.newInstance();
        LaplaceDistributionType xb_ldType = xb_ldDoc.addNewLaplaceDistribution();

        xb_ldType.addNewLocation().setListValue(element.getLocation());
        xb_ldType.addNewScale().setListValue(element.getScale());

        return xb_ldDoc;
    }

    private LogisticDistributionDocument encodeLogisticDistribution(LogisticDistribution element) {
        LogisticDistributionDocument xb_ldDoc = LogisticDistributionDocument.Factory.newInstance();
        LogisticDistributionType xb_ldType = xb_ldDoc.addNewLogisticDistribution();

        xb_ldType.addNewLocation().setListValue(element.getLocation());
        xb_ldType.addNewScale().setListValue(element.getScale());

        return xb_ldDoc;
    }

    private LogNormalDistributionDocument encodeLogNormalDistribution(LogNormalDistribution element) {
        LogNormalDistributionDocument xb_lndDoc = LogNormalDistributionDocument.Factory.newInstance();
        LogNormalDistributionType xb_lndType = xb_lndDoc.addNewLogNormalDistribution();

        xb_lndType.addNewLogScale().setListValue(element.getLogScale());
        xb_lndType.addNewShape().setListValue(element.getShape());

        return xb_lndDoc;
    }

    private MeanDocument encodeMean(Mean element) {
        MeanDocument xb_mDoc = MeanDocument.Factory.newInstance();
        MeanType xb_mType = xb_mDoc.addNewMean();

        xb_mType.addNewValues().setListValue(element.getValues());

        return xb_mDoc;
    }

    private MedianDocument encodeMedian(Median element) {
        MedianDocument xb_mDoc = MedianDocument.Factory.newInstance();
        MedianType xb_mType = xb_mDoc.addNewMedian();

        xb_mType.addNewValues().setListValue(element.getValues());

        return xb_mDoc;
    }

    private MixtureModelDocument encodeMixtureModel(MixtureModel element) throws UnsupportedUncertaintyTypeException {
        MixtureModelDocument xb_mmDoc = MixtureModelDocument.Factory.newInstance();
        MixtureModelType xb_mmType = xb_mmDoc.addNewMixtureModel();
        XmlCursor cursor = null;
        for (WeightedDistribution w : element) {
            if (w.getDistribution() instanceof HypergeometricDistribution) {
                System.out.println();
            }
            Component c = xb_mmType.addNewComponent();
            c.setWeight(w.getWeight());
            AbstractDistributionType adt = c.addNewAbstractDistribution();
            AbstractDistributionDocument result = encodeDistribution(w.getDistribution());

            cursor = c.newCursor();
            adt.set(result.getAbstractDistribution());

            //renaming of element and removal of xsi:type attribute
            String elementName = result.getClass().getSimpleName().replace("DocumentImpl", "");
            cursor.toChild(new QName(NAMESPACE, "AbstractDistribution"));
            cursor.setName(new QName(NAMESPACE, elementName));
            cursor.removeAttribute(new QName("http://www.w3.org/2001/XMLSchema-instance", "type"));

        }

        return xb_mmDoc;

    }

    private ModeDocument encodeMode(Mode element) {
        ModeDocument xb_mDoc = ModeDocument.Factory.newInstance();
        ModeType xb_mType = xb_mDoc.addNewMode();

        xb_mType.addNewValues().setListValue(element.getValues());

        return xb_mDoc;
    }

    private MomentDocument encodeMoment(Moment element) {
        MomentDocument xb_mDoc = MomentDocument.Factory.newInstance();
        MomentType xb_mType = xb_mDoc.addNewMoment();


        xb_mType.setOrder(BigInteger.valueOf(element.getOrder()));
        xb_mType.addNewValues().setListValue(element.getValues());

        return xb_mDoc;
    }

    private MultinomialDistributionDocument encodeMultinomialDistribution(MultinomialDistribution element) {
        MultinomialDistributionDocument xb_mdDoc = MultinomialDistributionDocument.Factory.newInstance();
        MultinomialDistributionType xb_mdType = xb_mdDoc.addNewMultinomialDistribution();

        xb_mdType.setNumberOfTrials(BigInteger.valueOf(element.getNumberOfTrials()));
        xb_mdType.addNewProbabilities().setListValue(element.getProbabilities());

        return xb_mdDoc;
    }

    private NegativeBinomialDistributionDocument encodeNegativeBinomialDistribution(NegativeBinomialDistribution element) {
        NegativeBinomialDistributionDocument xb_nbdDoc = NegativeBinomialDistributionDocument.Factory.newInstance();
        NegativeBinomialDistributionType xb_nbdType = xb_nbdDoc.addNewNegativeBinomialDistribution();

        xb_nbdType.addNewNumberOfFailures().setListValue(element.getNumberOfFailures());
        xb_nbdType.addNewProbability().setListValue(element.getProbability());

        return xb_nbdDoc;
    }

    private NormalInverseGammaDistributionDocument encodeNormalInverseGammaDistribution(NormalInverseGammaDistribution element) {
        NormalInverseGammaDistributionDocument xb_nigdDoc = NormalInverseGammaDistributionDocument.Factory.newInstance();
        NormalInverseGammaDistributionType xb_nigdType = xb_nigdDoc.addNewNormalInverseGammaDistribution();

        xb_nigdType.addNewMean().setListValue(element.getMean());
        xb_nigdType.addNewShape().setListValue(element.getShape());
        xb_nigdType.addNewScale().setListValue(element.getScale());
        xb_nigdType.addNewVarianceScaling().setListValue(element.getVarianceScaling());

        return xb_nigdDoc;
    }

    private ParetoDistributionDocument encodeParetoDistribution(ParetoDistribution element) {
        ParetoDistributionDocument xb_pDoc = ParetoDistributionDocument.Factory.newInstance();
        ParetoDistributionType xb_pType = xb_pDoc.addNewParetoDistribution();

        xb_pType.addNewScale().setListValue(element.getScale());
        xb_pType.addNewShape().setListValue(element.getShape());

        return xb_pDoc;
    }

    private PercentileDocument encodePercentile(Percentile element) {
        PercentileDocument xb_pDoc = PercentileDocument.Factory.newInstance();
        PercentileType xb_pType = xb_pDoc.addNewPercentile();

        xb_pType.addNewValues().setListValue(element.getValues());
        xb_pType.setLevel(element.getPercentileLevel());

        return xb_pDoc;
    }

    private PoissonDistributionDocument encodePoissonDistribution(PoissonDistribution element) {
        PoissonDistributionDocument xb_pdDoc = PoissonDistributionDocument.Factory.newInstance();
        PoissonDistributionType xb_pdType = xb_pdDoc.addNewPoissonDistribution();

        xb_pdType.addNewRate().setListValue(element.getRate());
        return xb_pdDoc;
    }

    private ProbabilityDocument encodeProbability(Probability element) {
        ProbabilityDocument xb_pDoc = ProbabilityDocument.Factory.newInstance();
        ProbabilityType xb_pType = xb_pDoc.addNewProbability();

        xb_pType.addNewProbabilities().setListValue(element.getValues());
        for (ProbabilityConstraint c : element.getConstraints()) {
            switch (c.getType()) {
                case GREATER_OR_EQUAL:
                    xb_pType.setGe(c.getValue());
                    break;
                case GREATER_THAN:
                    xb_pType.setGt(c.getValue());
                    break;
                case LESS_THAN:
                    xb_pType.setLt(c.getValue());
                    break;
                case LESS_OR_EQUAL:
                    xb_pType.setLe(c.getValue());
                    break;
            }
        }
        return xb_pDoc;
    }

    private QuantileDocument encodeQuantile(Quantile element) {



        QuantileDocument xb_qDoc = QuantileDocument.Factory.newInstance();
        QuantileType xb_qType = xb_qDoc.addNewQuantile();

        xb_qType.addNewValues().setListValue(element.getValues());
        xb_qType.setLevel(element.getLevel());

        return xb_qDoc;
    }

    private QuartileDocument encodeQuartile(Quartile element) {
        QuartileDocument xb_qDoc = QuartileDocument.Factory.newInstance();
        QuartileType xb_qType = xb_qDoc.addNewQuartile();

        xb_qType.addNewValues().setListValue(element.getValues());
        xb_qType.setLevel(element.getQuartileLevel());

        return xb_qDoc;
    }

    private RangeDocument encodeRange(Range element) {
        RangeDocument xb_rDoc = RangeDocument.Factory.newInstance();
        RangeType xb_rType = xb_rDoc.addNewRange();

        xb_rType.addNewLower().setListValue(element.getLower());
        xb_rType.addNewUpper().setListValue(element.getUpper());

        return xb_rDoc;
    }

    private SkewnessDocument encodeSkewness(Skewness element) {
        SkewnessDocument xb_sDoc = SkewnessDocument.Factory.newInstance();
        SkewnessType xb_sType = xb_sDoc.addNewSkewness();

        xb_sType.addNewValues().setListValue(element.getValues());
        return xb_sDoc;
    }

    private StandardDeviationDocument encodeStandardDeviation(StandardDeviation element) {
        StandardDeviationDocument xb_sdDoc = StandardDeviationDocument.Factory.newInstance();
        StandardDeviationType xb_sdType = xb_sdDoc.addNewStandardDeviation();

        xb_sdType.addNewValues().setListValue(element.getValues());
        return xb_sdDoc;
    }

    private AbstractSummaryStatisticDocument encodeStatistic(IStatistic element) throws UnsupportedUncertaintyTypeException {

        if (element instanceof CategoricalMode) {
            return encodeCategoricalMode((CategoricalMode) element);
        } else if (element instanceof CentredMoment) {
            return encodeCentredMoment((CentredMoment) element);
        } else if (element instanceof CoefficientOfVariation) {
            return encodeCoefficientOfVariation((CoefficientOfVariation) element);
        } else if (element instanceof ConfidenceInterval) {
            return encodeConfidenceInterval((ConfidenceInterval) element);
        } else if (element instanceof ConfusionMatrix) {
            return encodeConfusionMatrix((ConfusionMatrix) element);
        } else if (element instanceof Correlation) {
            return encodeCorrelation((Correlation) element);
        } else if (element instanceof CovarianceMatrix) {
            return encodeCovarianceMatrix((CovarianceMatrix) element);
        } else if (element instanceof CredibleInterval) {
            return encodeCredibleInterval((CredibleInterval) element);
        } else if (element instanceof DiscreteProbability) {
            return encodeDiscreteProbability((DiscreteProbability) element);
        } else if (element instanceof InterquartileRange) {
            return encodeInterquartileRange((InterquartileRange) element);
        } else if (element instanceof Kurtosis) {
            return encodeKurtosis((Kurtosis) element);
        } else if (element instanceof Mean) {
            return encodeMean((Mean) element);
        } else if (element instanceof Median) {
            return encodeMedian((Median) element);
        } else if (element instanceof Mode) {
            return encodeMode((Mode) element);
        } else if (element instanceof Moment) {
            return encodeMoment((Moment) element);
        } else if (element instanceof Probability) {
            return encodeProbability((Probability) element);
        } else if (element instanceof Quantile) {
            if (element instanceof Decile) {
                return this.encodeDecile((Decile) element);
            } else if (element instanceof Percentile) {
                return this.encodePercentile((Percentile) element);
            } else if (element instanceof Quartile) {
                return this.encodeQuartile((Quartile) element);
            } else {
                // must be a quantile
                return this.encodeQuantile((Quantile) element);
            }
        } else if (element instanceof Range) {
            return encodeRange((Range) element);
        } else if (element instanceof Skewness) {
            return encodeSkewness((Skewness) element);
        } else if (element instanceof StandardDeviation) {
            return encodeStandardDeviation((StandardDeviation) element);
        } else if (element instanceof Variance) {
            return encodeVariance((Variance) element);
        } else if (element instanceof StatisticCollection) {
            return encodeStatisticCollection((StatisticCollection) element);
        }
        throw new UnsupportedUncertaintyTypeException("Unrecognised uncertainty type. Found: " + element.getClass().getSimpleName());
    }

    private StudentTDistributionDocument encodeStudentTDistribution(StudentTDistribution element) {
        StudentTDistributionDocument xb_stdDoc = StudentTDistributionDocument.Factory.newInstance();
        StudentTDistributionType xb_stdType = xb_stdDoc.addNewStudentTDistribution();

        xb_stdType.addNewDegreesOfFreedom().setListValue(element.getDegreesOfFreedom());
        xb_stdType.addNewLocation().setListValue(element.getMean());
        xb_stdType.addNewScale().setListValue(element.getVariance());

        return xb_stdDoc;
    }

    private VarianceDocument encodeVariance(Variance element) {
        VarianceDocument xb_vDoc = VarianceDocument.Factory.newInstance();
        VarianceType xb_vType = xb_vDoc.addNewVariance();

        xb_vType.addNewValues().setListValue(element.getValues());

        return xb_vDoc;
    }

    private WeibullDistributionDocument encodeWeibullDistribution(WeibullDistribution element) {
        WeibullDistributionDocument xb_wdDoc = WeibullDistributionDocument.Factory.newInstance();
        WeibullDistributionType xb_wdType = xb_wdDoc.addNewWeibullDistribution();

        xb_wdType.addNewScale().setListValue(element.getScale());
        xb_wdType.addNewShape().setListValue(element.getShape());

        return xb_wdDoc;
    }

    private AbstractDistributionDocument encodeMultivariateDistribution(IMultivariateDistribution element) throws UnsupportedUncertaintyTypeException {
        if (element instanceof MultivariateNormalDistribution) {
            return encodeMultivariateNormalDistribution((MultivariateNormalDistribution) element);
        } else if (element instanceof MultivariateStudentTDistribution) {
            return encodeMultivariateStudentTDistribution((MultivariateStudentTDistribution) element);
        } else if (element instanceof DirichletDistribution) {
            return encodeDirichletDistribution((DirichletDistribution) element);
        } else if (element instanceof WishartDistribution) {
            return encodeWishartDistribution((WishartDistribution) element);
        } else if (element instanceof MultinomialDistribution) {
            return encodeMultinomialDistribution((MultinomialDistribution) element);
        }
        throw new UnsupportedUncertaintyTypeException(element.getClass().getSimpleName() + " not supported in this version of UncertML");
    }

    private MultivariateNormalDistributionDocument encodeMultivariateNormalDistribution(MultivariateNormalDistribution element) {
        MultivariateNormalDistributionDocument xb_mgdDoc = MultivariateNormalDistributionDocument.Factory.newInstance();
        MultivariateNormalDistributionType xb_mgdType = xb_mgdDoc.addNewMultivariateNormalDistribution();
        CovarianceMatrixType xb_cmType = xb_mgdType.addNewCovarianceMatrix();
        xb_cmType.set(encodeCovarianceMatrix(element.getCovarianceMatrix()).getCovarianceMatrix());
        xb_mgdType.addNewMean().setListValue(element.getMean());
        return xb_mgdDoc;
    }

    private MultivariateStudentTDistributionDocument encodeMultivariateStudentTDistribution(MultivariateStudentTDistribution element) {
        MultivariateStudentTDistributionDocument xb_mstdDoc = MultivariateStudentTDistributionDocument.Factory.newInstance();
        MultivariateStudentTDistributionType xb_mstdType = xb_mstdDoc.addNewMultivariateStudentTDistribution();

        CovarianceMatrixType xb_cmType = xb_mstdType.addNewCovarianceMatrix();
        xb_cmType.set(encodeCovarianceMatrix(element.getCovarianceMatrix()).getCovarianceMatrix());

        xb_mstdType.addNewDegreesOfFreedom().setListValue(element.getDegreesOfFreedom());
        xb_mstdType.addNewMean().setListValue(element.getMean());

        return xb_mstdDoc;
    }

    private WishartDistributionDocument encodeWishartDistribution(WishartDistribution element) {
        WishartDistributionDocument xb_wdDoc = WishartDistributionDocument.Factory.newInstance();
        WishartDistributionType xb_wdType = xb_wdDoc.addNewWishartDistribution();
        CovarianceMatrixType xb_cmType = xb_wdType.addNewScaleMatrix();
        xb_cmType.set(encodeCovarianceMatrix(element.getScaleMatrix()).getCovarianceMatrix());
        xb_wdType.setDegreesOfFreedom(element.getDegreesOfFreedom());
        xb_wdType.addNewScaleMatrix();
        return xb_wdDoc;
    }

    private DirichletDistributionDocument encodeDirichletDistribution(DirichletDistribution element) {
        DirichletDistributionDocument xb_ddDoc = DirichletDistributionDocument.Factory.newInstance();
        DirichletDistributionType xb_ddType = xb_ddDoc.addNewDirichletDistribution();

        xb_ddType.addNewConcentration().setListValue(element.getConcentration());

        return xb_ddDoc;
    }

    private UniformDistributionDocument encodeUniformDistribution(UniformDistribution element) {
        UniformDistributionDocument xb_udDoc = UniformDistributionDocument.Factory.newInstance();
        UniformDistributionType xb_udType = xb_udDoc.addNewUniformDistribution();

        xb_udType.addNewMinimum().setListValue(element.getMinimum());
        xb_udType.addNewMaximum().setListValue(element.getMaximum());

        return xb_udDoc;
    }

    private StatisticsCollectionDocument encodeStatisticCollection(StatisticCollection element) throws UnsupportedUncertaintyTypeException {
        StatisticsCollectionDocument xb_scDoc = StatisticsCollectionDocument.Factory.newInstance();
        StatisticsCollectionType xb_scType = xb_scDoc.addNewStatisticsCollection();
        XmlCursor cursor = null;
        for (int i = 0; i < element.size(); i++) {
            IStatistic s = element.get(i);

            AbstractSummaryStatisticType xb_cmType = xb_scType.addNewAbstractSummaryStatistic();
            AbstractSummaryStatisticDocument result = encodeStatistic(s);
            cursor = xb_scType.newCursor();
            xb_cmType.set(result.getAbstractSummaryStatistic());

            //renaming of element and removal of xsi:type attribute
            String elementName = result.getClass().getSimpleName().replace("DocumentImpl", "");
            cursor.toChild(new QName(NAMESPACE, "AbstractSummaryStatistic"));
            cursor.setName(new QName(NAMESPACE, elementName));
            cursor.removeAttribute(new QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
        }

        return xb_scDoc;
    }

    private XmlOptions getOptions() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(NAMESPACE, NAMESPACE_PREFIX);
        XmlOptions options = new XmlOptions();
        options.setSaveAggressiveNamespaces();
        options.setSavePrettyPrint();
        options.setSaveSuggestedPrefixes(map);
        return options;
    }

}
