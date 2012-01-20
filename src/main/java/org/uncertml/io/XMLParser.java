package org.uncertml.io;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.uncertml.IUncertainty;
import org.uncertml.distribution.IDistribution;
import org.uncertml.distribution.WeightedDistribution;
import org.uncertml.distribution.continuous.BetaDistribution;
import org.uncertml.distribution.continuous.CauchyDistribution;
import org.uncertml.distribution.continuous.ChiSquareDistribution;
import org.uncertml.distribution.continuous.ExponentialDistribution;
import org.uncertml.distribution.continuous.FDistribution;
import org.uncertml.distribution.continuous.GammaDistribution;
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
import org.uncertml.distribution.discrete.BinomialDistribution;
import org.uncertml.distribution.discrete.DiscreteUniformDistribution;
import org.uncertml.distribution.discrete.GeometricDistribution;
import org.uncertml.distribution.discrete.HypergeometricDistribution;
import org.uncertml.distribution.discrete.NegativeBinomialDistribution;
import org.uncertml.distribution.multivariate.DirichletDistribution;
import org.uncertml.distribution.multivariate.MultinomialDistribution;
import org.uncertml.distribution.multivariate.MultivariateNormalDistribution;
import org.uncertml.distribution.multivariate.MultivariateStudentTDistribution;
import org.uncertml.distribution.multivariate.WishartDistribution;
import org.uncertml.exception.UncertaintyParserException;
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
import org.uncertml.statistic.ConstraintType;
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
import org.uncertml.x20.AbstractDistributionDocument;
import org.uncertml.x20.AbstractDistributionType;
import org.uncertml.x20.AbstractSampleDocument;
import org.uncertml.x20.AbstractSampleType;
import org.uncertml.x20.AbstractSummaryStatisticDocument;
import org.uncertml.x20.AbstractSummaryStatisticType;
import org.uncertml.x20.AbstractUncertaintyDocument;
import org.uncertml.x20.BetaDistributionType;
import org.uncertml.x20.BinomialDistributionType;
import org.uncertml.x20.CauchyDistributionType;
import org.uncertml.x20.CentredMomentType;
import org.uncertml.x20.ChiSquareDistributionType;
import org.uncertml.x20.CoefficientOfVariationType;
import org.uncertml.x20.ConfidenceIntervalType;
import org.uncertml.x20.ConfusionMatrixType;
import org.uncertml.x20.CorrelationType;
import org.uncertml.x20.CovarianceMatrixType;
import org.uncertml.x20.CredibleIntervalType;
import org.uncertml.x20.DecileType;
import org.uncertml.x20.DirichletDistributionType;
import org.uncertml.x20.DiscreteProbabilityType;
import org.uncertml.x20.ExponentialDistributionType;
import org.uncertml.x20.FDistributionType;
import org.uncertml.x20.GammaDistributionType;
import org.uncertml.x20.GeometricDistributionType;
import org.uncertml.x20.HypergeometricDistributionType;
import org.uncertml.x20.InterquartileRangeType;
import org.uncertml.x20.InverseGammaDistributionType;
import org.uncertml.x20.KurtosisType;
import org.uncertml.x20.LaplaceDistributionType;
import org.uncertml.x20.LogNormalDistributionType;
import org.uncertml.x20.LogisticDistributionType;
import org.uncertml.x20.MeanType;
import org.uncertml.x20.MedianType;
import org.uncertml.x20.MixtureModelType;
import org.uncertml.x20.MixtureModelType.Component;
import org.uncertml.x20.ModeType;
import org.uncertml.x20.MomentType;
import org.uncertml.x20.MultinomialDistributionType;
import org.uncertml.x20.MultivariateNormalDistributionType;
import org.uncertml.x20.MultivariateStudentTDistributionType;
import org.uncertml.x20.NegativeBinomialDistributionType;
import org.uncertml.x20.NormalDistributionType;
import org.uncertml.x20.NormalInverseGammaDistributionType;
import org.uncertml.x20.ParetoDistributionType;
import org.uncertml.x20.PercentileType;
import org.uncertml.x20.PoissonDistributionType;
import org.uncertml.x20.ProbabilityType;
import org.uncertml.x20.QuantileType;
import org.uncertml.x20.QuartileType;
import org.uncertml.x20.RandomSampleType;
import org.uncertml.x20.RangeType;
import org.uncertml.x20.RealisationDocument;
import org.uncertml.x20.RealisationType;
import org.uncertml.x20.SkewnessType;
import org.uncertml.x20.StandardDeviationType;
import org.uncertml.x20.StatisticsCollectionType;
import org.uncertml.x20.StudentTDistributionType;
import org.uncertml.x20.SystematicSampleType;
import org.uncertml.x20.UniformDistributionType;
import org.uncertml.x20.UnknownSampleType;
import org.uncertml.x20.VarianceType;
import org.uncertml.x20.WeibullDistributionType;
import org.uncertml.x20.WishartDistributionType;
import org.w3c.dom.Document;

/**
 * XML implementation of an UncertML parser, based on the XmlBeans library.
 * 
 * @see org.uncertml.io.IUncertaintyParser
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class XMLParser implements IUncertaintyParser {

    @Override
    public IUncertainty parse(String uncertml) throws UncertaintyParserException {
        try {
            XmlObject doc = XmlObject.Factory.parse(uncertml);
            XMLParser.validateXml(doc);
            return parseUncertainty((AbstractUncertaintyDocument) doc);
        } catch (XmlException ex) {
            throw new UncertaintyParserException(ex);
        }
    }

    @Override
    public IUncertainty parse(InputStream stream) throws UncertaintyParserException {
        try {
            XmlObject doc = XmlObject.Factory.parse(stream);
            XMLParser.validateXml(doc);
            return parseUncertainty((AbstractUncertaintyDocument) doc);
        } catch (Exception ex) {
            throw new UncertaintyParserException(ex);
        }
    }

    @Override
    public IUncertainty parse(File file) throws UncertaintyParserException {
        try {
            XmlObject doc = XmlObject.Factory.parse(file);
            XMLParser.validateXml(doc);
            return parseUncertainty((AbstractUncertaintyDocument) doc);
        } catch (Exception ex) {
            throw new UncertaintyParserException(ex);
        }
    }

    @Override
    public IUncertainty parse(Reader reader) throws UncertaintyParserException {
        try {
            XmlObject doc = XmlObject.Factory.parse(reader);
            XMLParser.validateXml(doc);
            return parseUncertainty((AbstractUncertaintyDocument) doc);
        } catch (Exception ex) {
            throw new UncertaintyParserException(ex);
        }
    }

    public IUncertainty parseUncertML(Document document) throws UncertaintyParserException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private IUncertainty parseUncertainty(AbstractUncertaintyDocument doc) throws UncertaintyParserException {
        // test the document
        if (doc instanceof AbstractDistributionDocument) {
            // is a distribution
            return parseDistribution(((AbstractDistributionDocument) doc).getAbstractDistribution());
        } else if (doc instanceof AbstractSummaryStatisticDocument) {
            // is a statistic
            return parseStatistic(((AbstractSummaryStatisticDocument) doc).getAbstractSummaryStatistic());
        } else if (doc instanceof AbstractSampleDocument) {
            // is a realisation
            return parseSample(((AbstractSampleDocument) doc).getAbstractSample());
        } else if (doc instanceof RealisationDocument){
        	return parseRealisation(((RealisationDocument)doc).getRealisation());
        }
        throw new UncertaintyParserException("Unknown UncertML type here");
    }

    private IDistribution parseDistribution(AbstractDistributionType xb_type) throws UncertaintyParserException {
        // Test the document further
        if (xb_type instanceof DirichletDistributionType) {
            // Dirichlet
            return parseDirichletDistribution((DirichletDistributionType) xb_type);
        } else if (xb_type instanceof ExponentialDistributionType) {
            // Exponential
            return parseExponentialDistribution((ExponentialDistributionType) xb_type);
        } else if (xb_type instanceof GammaDistributionType) {
            // Gamma
            return parseGammaDistribution((GammaDistributionType) xb_type);
        } else if (xb_type instanceof InverseGammaDistributionType) {
            // Inverse gamma
            return parseInverseGammaDistribution((InverseGammaDistributionType) xb_type);
        } else if (xb_type instanceof NormalInverseGammaDistributionType) {
            // normal inverse gamma
            return parseNormalInverseGammaDistribution((NormalInverseGammaDistributionType) xb_type);
        } else if (xb_type instanceof PoissonDistributionType) {
            // Poisson
            return parsePoissonDistribution((PoissonDistributionType) xb_type);
        } else if (xb_type instanceof NormalDistributionType) {
            // Gaussian
            return parseNormalDistribution((NormalDistributionType) xb_type);
        } else if (xb_type instanceof BinomialDistributionType) {
            // Binomial
            return parseBinomialDistribution((BinomialDistributionType) xb_type);
        } else if (xb_type instanceof LogNormalDistributionType) {
            // log-normal
            return parseLogNormalDistribution((LogNormalDistributionType) xb_type);
        } else if (xb_type instanceof StudentTDistributionType) {
            // Student T
            return parseStudentTDistribution((StudentTDistributionType) xb_type);
        } else if (xb_type instanceof UniformDistributionType) {
            // Uniform
            return parseUniformDistribution((UniformDistributionType) xb_type);
        } else if (xb_type instanceof MultivariateNormalDistributionType) {
            // Multivariate Gaussian
            return parseMultivariateNormalDistribution((MultivariateNormalDistributionType) xb_type);
        } else if (xb_type instanceof MultivariateStudentTDistributionType) {
            // Multivariate Student T
            return parseMultivariateStudentTDistribution((MultivariateStudentTDistributionType) xb_type);
        } else if (xb_type instanceof MixtureModelType) {
            // Mixture model
            return parseMixtureModel((MixtureModelType) xb_type);
        } else if (xb_type instanceof BetaDistributionType) {
            // Beta
            return parseBetaDistribution((BetaDistributionType) xb_type);
        } else if (xb_type instanceof LaplaceDistributionType) {
            // Laplace
            return parseLaplaceDistribution((LaplaceDistributionType) xb_type);
        } else if (xb_type instanceof CauchyDistributionType) {
            // Cauchy
            return parseCauchyDistribution((CauchyDistributionType) xb_type);
        } else if (xb_type instanceof WeibullDistributionType) {
            // Weibull
            return parseWeibullDistribution((WeibullDistributionType) xb_type);
        } else if (xb_type instanceof LogisticDistributionType) {
            // Logistic
            return parseLogisticDistribution((LogisticDistributionType) xb_type);
        } else if (xb_type instanceof ChiSquareDistributionType) {
            // Chi square
            return parseChiSquareDistribution((ChiSquareDistributionType) xb_type);
        } else if (xb_type instanceof GeometricDistributionType) {
            // Geometric
            return parseGeometricDistribution((GeometricDistributionType) xb_type);
        } else if (xb_type instanceof HypergeometricDistributionType) {
            // Hypergeometric
            return parseHypergeometricDistribution((HypergeometricDistributionType) xb_type);
        } else if (xb_type instanceof FDistributionType) {
            // F
            return parseFDistribution((FDistributionType) xb_type);
        } else if (xb_type instanceof NegativeBinomialDistributionType) {
            // negative binomial
            return parseNegativeBinomialDistribution((NegativeBinomialDistributionType) xb_type);
        }
        throw new UncertaintyParserException("Unknown UncertML type " + xb_type.getClass().getSimpleName());
    }

    private IStatistic parseStatistic(AbstractSummaryStatisticType xb_type) throws UncertaintyParserException {
        // Test the document further
        if (xb_type instanceof MeanType) {
            // Mean
            return parseMean((MeanType) xb_type);
        } else if (xb_type instanceof ModeType) {
            // Mode
            return parseMode((ModeType) xb_type);
        } else if (xb_type instanceof MedianType) {
            // Median
            return parseMedian((MedianType) xb_type);
        } else if (xb_type instanceof QuantileType) {
            // Quantile
            return parseQuantile((QuantileType) xb_type);
        } else if (xb_type instanceof DiscreteProbabilityType) {
            // Discrete probability
            return parseDiscreteProbability((DiscreteProbabilityType) xb_type);
        } else if (xb_type instanceof ProbabilityType) {
            // Probability
            return parseProbability((ProbabilityType) xb_type);
        } else if (xb_type instanceof VarianceType) {
            // Variance
            return parseVariance((VarianceType) xb_type);
        } else if (xb_type instanceof StandardDeviationType) {
            // Standard deviation
            return parseStandardDeviation((StandardDeviationType) xb_type);
        } else if (xb_type instanceof SkewnessType) {
            // Skewness
            return parseSkewness((SkewnessType) xb_type);
        } else if (xb_type instanceof ConfidenceIntervalType) {
            // Confidence interval
            return parseConfidenceInterval((ConfidenceIntervalType) xb_type);
        } else if (xb_type instanceof StatisticsCollectionType) {
            // STatistics collection
            return parseStatisticsCollection((StatisticsCollectionType) xb_type);
        } else if (xb_type instanceof ConfusionMatrixType) {
            // Confusion matrix
            return parseConfusionMatrix((ConfusionMatrixType) xb_type);
        } else if (xb_type instanceof CovarianceMatrixType) {
            // covariance matrix
            return parseCovarianceMatrix((CovarianceMatrixType) xb_type);
        } else if (xb_type instanceof RangeType) {
            // Range
            return parseRange((RangeType) xb_type);
        } else if (xb_type instanceof CentredMomentType) {
            // centred moment
            return parseCentredMoment((CentredMomentType) xb_type);
        } else if (xb_type instanceof MomentType) {
            // moment
            return parseMoment((MomentType) xb_type);
        } else if (xb_type instanceof QuartileType) {
            // Quartile
            return parseQuartile((QuartileType) xb_type);
        } else if (xb_type instanceof DecileType) {
            // Decile
            return parseDecile((DecileType) xb_type);
        } else if (xb_type instanceof PercentileType) {
            // Percentile
            return parsePercentile((PercentileType) xb_type);
        } else if (xb_type instanceof KurtosisType) {
            // Kurtosis
            return parseKurtosis((KurtosisType) xb_type);
        } else if (xb_type instanceof CredibleIntervalType) {
            // Credible interval
            return parseCredibleInterval((CredibleIntervalType) xb_type);
        } else if (xb_type instanceof CorrelationType) {
            // Correlation
            return parseCorrelation((CorrelationType) xb_type);
        } else if (xb_type instanceof CoefficientOfVariationType) {
            // Coefficient of variation
            return parseCoefficientOfVariation((CoefficientOfVariationType) xb_type);
        } else if (xb_type instanceof InterquartileRangeType) {
            // Inter-quartile range
            return parseInterquartileRange((InterquartileRangeType) xb_type);
        }
        throw new UncertaintyParserException("Unknown UncertML type " + xb_type.getClass().getSimpleName());
    }

    private ISample parseSample(AbstractSampleType xb_type) throws UncertaintyParserException {
        // test the document further
        if (xb_type instanceof RandomSampleType) {
            // realisation
            return parseRandomSample((RandomSampleType) xb_type);
        } else if (xb_type instanceof SystematicSampleType) {
            return parseSystematicSample((SystematicSampleType) xb_type);
        } else if (xb_type instanceof UnknownSampleType) {
            return parseUnknownSample((UnknownSampleType) xb_type);
        }
        throw new UncertaintyParserException("Unknown UncertML type " + xb_type.getClass().getSimpleName());
    }

    private ISample parseRandomSample(RandomSampleType xb_rType) {
        String desc = xb_rType.getSamplingMethodDescription();
        if (desc == null) {
            desc = "";
        }
        List<AbstractRealisation> realisations = new ArrayList<AbstractRealisation>();

        // get the realisations
        for (RealisationType rType : xb_rType.getRealisationArray()) {
            realisations.add(this.parseRealisation(rType));
        }

        return new RandomSample(realisations, desc);
    }

    private ISample parseSystematicSample(SystematicSampleType xb_rType) {
        String desc = xb_rType.getSamplingMethodDescription();
        if (desc == null) {
            desc = "";
        }
        List<AbstractRealisation> realisations = new ArrayList<AbstractRealisation>();

        // get the realisations
        for (RealisationType rType : xb_rType.getRealisationArray()) {
            realisations.add(this.parseRealisation(rType));
        }

        return new SystematicSample(realisations, desc);
    }

    private ISample parseUnknownSample(UnknownSampleType xb_rType) {
        String desc = xb_rType.getSamplingMethodDescription();
        if (desc == null) {
            desc = "";
        }
        List<AbstractRealisation> realisations = new ArrayList<AbstractRealisation>();

        // get the realisations
        for (RealisationType rType : xb_rType.getRealisationArray()) {
            realisations.add(this.parseRealisation(rType));
        }

        return new UnknownSample(realisations, desc);
    }

    private AbstractRealisation parseRealisation(RealisationType xb_rType) {
        String id = xb_rType.getId();
        double weight = xb_rType.getWeight();

        // continuous
        AbstractRealisation r;
        if (xb_rType.getValues() != null) {
        	r = new ContinuousRealisation(xb_rType.getValues().getListValue(), weight, id);
        }
        else {
        	r = new CategoricalRealisation(xb_rType.getCategories().getListValue(), weight, id);
        }
        return r;
    }

    private DirichletDistribution parseDirichletDistribution(DirichletDistributionType xb_ddType) {
        DirichletDistribution dd = new DirichletDistribution(xb_ddType.getConcentration().getListValue());
        return dd;
    }

    private ExponentialDistribution parseExponentialDistribution(ExponentialDistributionType xb_edType) {
        ExponentialDistribution ed = new ExponentialDistribution(xb_edType.getRate().getListValue());
        return ed;
    }

    private GammaDistribution parseGammaDistribution(GammaDistributionType xb_gdType) {
        GammaDistribution gd = new GammaDistribution(xb_gdType.getShape().getListValue(), xb_gdType.getScale().getListValue());
        return gd;
    }

    private InverseGammaDistribution parseInverseGammaDistribution(InverseGammaDistributionType xb_igdType) {
        InverseGammaDistribution igd = new InverseGammaDistribution(xb_igdType.getShape().getListValue(), xb_igdType.getScale().getListValue());
        return igd;
    }

    private NormalInverseGammaDistribution parseNormalInverseGammaDistribution(NormalInverseGammaDistributionType xb_nigType) {
        NormalInverseGammaDistribution nigd = new NormalInverseGammaDistribution(xb_nigType.getMean().getListValue(), xb_nigType.getVarianceScaling().getListValue(), xb_nigType.getShape().getListValue(), xb_nigType.getScale().getListValue());
        return nigd;
    }

    private ParetoDistribution parseParetoDistribution(ParetoDistributionType xb_pdType) {
        ParetoDistribution pd = new ParetoDistribution(xb_pdType.getScale().getListValue(), xb_pdType.getShape().getListValue());
        return pd;
    }

    private PoissonDistribution parsePoissonDistribution(PoissonDistributionType xb_pdType) {
        PoissonDistribution pd = new PoissonDistribution(xb_pdType.getRate().getListValue());
        return pd;
    }

    private NormalDistribution parseNormalDistribution(NormalDistributionType xb_gdType) {
        NormalDistribution gd = new NormalDistribution(xb_gdType.getMean().getListValue(), xb_gdType.getVariance().getListValue());
        return gd;
    }

    private BinomialDistribution parseBinomialDistribution(BinomialDistributionType xb_bdType) {
        BinomialDistribution bd = new BinomialDistribution(convertBigIntegers(xb_bdType.getNumberOfTrials().getListValue()), xb_bdType.getProbabilityOfSuccess().getListValue());
        return bd;
    }

    private LogNormalDistribution parseLogNormalDistribution(LogNormalDistributionType xb_lndType) {
        LogNormalDistribution lnd = new LogNormalDistribution(xb_lndType.getLogScale().getListValue(), xb_lndType.getShape().getListValue());
        return lnd;
    }

    private StudentTDistribution parseStudentTDistribution(StudentTDistributionType xb_stdType) {
        StudentTDistribution std = new StudentTDistribution(xb_stdType.getLocation().getListValue(), xb_stdType.getScale().getListValue(), xb_stdType.getDegreesOfFreedom().getListValue());
        return std;
    }

    private IDistribution parseUniformDistribution(UniformDistributionType xb_udType) {
        if (!xb_udType.isSetNumberOfClasses()) {
            // continuous
            UniformDistribution ud = new UniformDistribution(xb_udType.getMinimum().getListValue(), xb_udType.getMaximum().getListValue());
            return ud;
        } else {
            // discrete
            DiscreteUniformDistribution dud = new DiscreteUniformDistribution(convertBigIntegers(xb_udType.getNumberOfClasses().getListValue()));
            return dud;
        }
    }

    private MultivariateNormalDistribution parseMultivariateNormalDistribution(MultivariateNormalDistributionType xb_mgdType) {
        CovarianceMatrix cm = parseCovarianceMatrix(xb_mgdType.getCovarianceMatrix());
        MultivariateNormalDistribution mgd = new MultivariateNormalDistribution(xb_mgdType.getMean().getListValue(), cm);
        return mgd;
    }

    private MultivariateStudentTDistribution parseMultivariateStudentTDistribution(MultivariateStudentTDistributionType xb_mstdType) {
        CovarianceMatrix cm = parseCovarianceMatrix(xb_mstdType.getCovarianceMatrix());
        MultivariateStudentTDistribution mstd = new MultivariateStudentTDistribution(xb_mstdType.getMean().getListValue(), cm, convertBigIntegers(xb_mstdType.getDegreesOfFreedom().getListValue()));
        return mstd;
    }

    private MixtureModel parseMixtureModel(MixtureModelType xb_mmType) throws UncertaintyParserException {
        Component[] components = xb_mmType.getComponentArray();
        ArrayList<WeightedDistribution> distributions = new ArrayList<WeightedDistribution>();
        for (Component c : components) {
            IDistribution distribution = parseDistribution(c.getAbstractDistribution());
            WeightedDistribution w = new WeightedDistribution(c.getWeight(), distribution);
            distributions.add(w);
        }
        return new MixtureModel(distributions);
    }

    private BetaDistribution parseBetaDistribution(BetaDistributionType xb_bdType) {
        BetaDistribution bd = new BetaDistribution(xb_bdType.getAlpha().getListValue(), xb_bdType.getBeta().getListValue());
        return bd;
    }

    private LaplaceDistribution parseLaplaceDistribution(LaplaceDistributionType xb_ldType) {
        LaplaceDistribution ld = new LaplaceDistribution(xb_ldType.getLocation().getListValue(), xb_ldType.getScale().getListValue());
        return ld;
    }

    private CauchyDistribution parseCauchyDistribution(CauchyDistributionType xb_cdType) {
        CauchyDistribution cd = new CauchyDistribution(xb_cdType.getLocation().getListValue(), xb_cdType.getScale().getListValue());
        return cd;
    }

    private WeibullDistribution parseWeibullDistribution(WeibullDistributionType xb_wdType) {
        WeibullDistribution wd = new WeibullDistribution(xb_wdType.getScale().getListValue(), xb_wdType.getShape().getListValue());
        return wd;
    }

    private WishartDistribution parseWishartDistribution(WishartDistributionType xb_wdType) {
        CovarianceMatrix cm = parseCovarianceMatrix(xb_wdType.getScaleMatrix());
        WishartDistribution wd = new WishartDistribution(xb_wdType.getDegreesOfFreedom(), cm);
        return wd;
    }

    private LogisticDistribution parseLogisticDistribution(LogisticDistributionType xb_ldType) {
        LogisticDistribution ld = new LogisticDistribution(xb_ldType.getLocation().getListValue(), xb_ldType.getScale().getListValue());
        return ld;
    }

    private ChiSquareDistribution parseChiSquareDistribution(ChiSquareDistributionType xb_csdType) {
        ChiSquareDistribution csd = new ChiSquareDistribution(convertBigIntegers(xb_csdType.getDegreesOfFreedom().getListValue()));
        return csd;
    }

    private GeometricDistribution parseGeometricDistribution(GeometricDistributionType xb_gdType) {
        GeometricDistribution gd = new GeometricDistribution(xb_gdType.getProbability().getListValue());
        return gd;
    }

    private HypergeometricDistribution parseHypergeometricDistribution(HypergeometricDistributionType xb_hdType) {
        HypergeometricDistribution hd = new HypergeometricDistribution(convertBigIntegers(xb_hdType.getNumberOfTrials().getListValue()), convertBigIntegers(xb_hdType.getNumberOfSuccesses().getListValue()), convertBigIntegers(xb_hdType.getPopulationSize().getListValue()));
        return hd;
    }

    private FDistribution parseFDistribution(FDistributionType xb_fdType) {
        FDistribution fd = new FDistribution(xb_fdType.getDenominator().getListValue(), xb_fdType.getNumerator().getListValue());
        return fd;
    }

    private NegativeBinomialDistribution parseNegativeBinomialDistribution(NegativeBinomialDistributionType xb_nbdType) {
        NegativeBinomialDistribution nbd = new NegativeBinomialDistribution(convertBigIntegers(xb_nbdType.getNumberOfFailures().getListValue()), xb_nbdType.getProbability().getListValue());
        return nbd;
    }

    private Mean parseMean(MeanType xb_mType) {
        Mean m = new Mean(xb_mType.getValues().getListValue());
        return m;
    }

    private IStatistic parseMode(ModeType xb_mType) {
        if (xb_mType.isSetCategories()) {
            // categorical
            CategoricalMode cm = new CategoricalMode(xb_mType.getCategories().getListValue());
            return cm;
        } else {
            // continuous
            Mode m = new Mode(xb_mType.getValues().getListValue());
            return m;
        }
    }

    private Median parseMedian(MedianType xb_mType) {
        Median m = new Median(xb_mType.getValues().getListValue());
        return m;
    }

    private Quantile parseQuantile(QuantileType xb_qType) {
        Quantile q = new Quantile(xb_qType.getLevel(), xb_qType.getValues().getListValue());
        return q;
    }

    private DiscreteProbability parseDiscreteProbability(DiscreteProbabilityType xb_dpType) {
        DiscreteProbability dp = new DiscreteProbability(xb_dpType.getCategories().getListValue(), xb_dpType.getProbabilities().getListValue());
        return dp;
    }

    private Variance parseVariance(VarianceType xb_vType) {
        Variance v = new Variance(xb_vType.getValues().getListValue());
        return v;
    }

    private Probability parseProbability(ProbabilityType xb_pType) {
        ArrayList<ProbabilityConstraint> constraints = new ArrayList<ProbabilityConstraint>();
        if (xb_pType.isSetGe()) {
            // greater or equal
            ProbabilityConstraint pc = new ProbabilityConstraint(ConstraintType.GREATER_OR_EQUAL, xb_pType.getGe());
            constraints.add(pc);
        }
        if (xb_pType.isSetGt()) {
            // greater than
            ProbabilityConstraint pc = new ProbabilityConstraint(ConstraintType.GREATER_THAN, xb_pType.getGt());
            constraints.add(pc);
        }
        if (xb_pType.isSetLe()) {
            // less or equal
            ProbabilityConstraint pc = new ProbabilityConstraint(ConstraintType.LESS_OR_EQUAL, xb_pType.getLe());
            constraints.add(pc);
        }
        if (xb_pType.isSetLt()) {
            // less than
            ProbabilityConstraint pc = new ProbabilityConstraint(ConstraintType.LESS_THAN, xb_pType.getLt());
            constraints.add(pc);
        }
        Probability p = new Probability(constraints, xb_pType.getProbabilities().getListValue());
        return p;
    }

    private Skewness parseSkewness(SkewnessType xb_sType) {
        Skewness s = new Skewness(xb_sType.getValues().getListValue());
        return s;
    }

    private ConfidenceInterval parseConfidenceInterval(ConfidenceIntervalType xb_ciType) {
        QuantileType xb_lqType = xb_ciType.getLower();
        QuantileType xb_uqType = xb_ciType.getUpper();
        Quantile lower = new Quantile(xb_lqType.getLevel(), xb_lqType.getValues().getListValue());
        Quantile upper = new Quantile(xb_uqType.getLevel(), xb_uqType.getValues().getListValue());
        ConfidenceInterval ci = new ConfidenceInterval(lower, upper);
        return ci;
    }

    private StatisticCollection parseStatisticsCollection(StatisticsCollectionType xb_scType) throws UncertaintyParserException {
        AbstractSummaryStatisticType[] asst = xb_scType.getAbstractSummaryStatisticArray();
        StatisticCollection sc = new StatisticCollection();
        for (AbstractSummaryStatisticType ass : asst) {
            try {
                IStatistic statistic = this.parseStatistic(ass);
                sc.add(statistic);
            } catch (UncertaintyParserException ex) {
                throw new UncertaintyParserException(ex);
            }
        }
        return sc;
    }

    private ConfusionMatrix parseConfusionMatrix(ConfusionMatrixType xb_cmType) {
        ConfusionMatrix cm = new ConfusionMatrix(xb_cmType.getSourceCategories().getListValue(), xb_cmType.getTargetCategories().getListValue(), xb_cmType.getCounts().getListValue());
        return cm;
    }

    private Moment parseMoment(MomentType xb_mType) {
        Moment m = new Moment(xb_mType.getOrder().intValue(), xb_mType.getValues().getListValue());
        return m;
    }

    private MultinomialDistribution parseMultinomialDistribution(MultinomialDistributionType xb_mdType) {
        MultinomialDistribution md = new MultinomialDistribution(xb_mdType.getNumberOfTrials().intValue(), xb_mdType.getProbabilities().getListValue());
        return md;
    }

    private CentredMoment parseCentredMoment(CentredMomentType xb_cmType) {
        CentredMoment cm = new CentredMoment(xb_cmType.getOrder().intValue(), xb_cmType.getValues().getListValue());
        return cm;
    }

    private Decile parseDecile(DecileType xb_dType) {
        Decile d = new Decile(xb_dType.getLevel(), xb_dType.getValues().getListValue());
        return d;
    }

    private Kurtosis parseKurtosis(KurtosisType xb_kType) {
        Kurtosis k = new Kurtosis(xb_kType.getValues().getListValue());
        return k;
    }

    private Percentile parsePercentile(PercentileType xb_pType) {
        Percentile p = new Percentile(xb_pType.getLevel(), xb_pType.getValues().getListValue());
        return p;
    }

    private CredibleInterval parseCredibleInterval(CredibleIntervalType xb_ciType) {
        QuantileType xb_lqType = xb_ciType.getLower();
        QuantileType xb_uqType = xb_ciType.getUpper();
        Quantile lower = new Quantile(xb_lqType.getLevel(), xb_lqType.getValues().getListValue());
        Quantile upper = new Quantile(xb_uqType.getLevel(), xb_uqType.getValues().getListValue());
        CredibleInterval ci = new CredibleInterval(lower, upper);
        return ci;
    }

    private CovarianceMatrix parseCovarianceMatrix(CovarianceMatrixType xb_cmType) {
        CovarianceMatrix cm = new CovarianceMatrix(xb_cmType.getDimension().intValue(), xb_cmType.getValues().getListValue());
        return cm;
    }

    private Range parseRange(RangeType xb_rType) {
        Range r = new Range(xb_rType.getLower().getListValue(), xb_rType.getUpper().getListValue());
        return r;
    }

    private Correlation parseCorrelation(CorrelationType xb_cType) {
        Correlation c = new Correlation(xb_cType.getValues().getListValue());
        return c;
    }

    private CoefficientOfVariation parseCoefficientOfVariation(CoefficientOfVariationType xb_cvType) {
        CoefficientOfVariation cov = new CoefficientOfVariation(xb_cvType.getValues().getListValue());
        return cov;
    }

    private InterquartileRange parseInterquartileRange(InterquartileRangeType xb_iqrType) {
        InterquartileRange iqr = new InterquartileRange(xb_iqrType.getLower().getListValue(), xb_iqrType.getUpper().getListValue());
        return iqr;
    }

    private Quartile parseQuartile(QuartileType xb_qType) {
        Quartile q = new Quartile(xb_qType.getLevel(), xb_qType.getValues().getListValue());
        return q;
    }

    private StandardDeviation parseStandardDeviation(StandardDeviationType xb_sdType) {
        StandardDeviation sd = new StandardDeviation(xb_sdType.getValues().getListValue());
        return sd;
    }

    /**
     * <p>Validates the XML, printing error messages when the XML is invalid. Note
     * that this method will properly validate any instance of a compiled schema
     * type because all of these types extend XmlObject.</p>
     *
     * <p>Note that in actual practice, you'll probably want to use an assertion
     * when validating if you want to ensure that your code doesn't pass along
     * invalid XML. This sample prints the generated XML whether or not it's
     * valid so that you can see the result in both cases.</p>
     *
     * @param xml The XML to validate.
     * @return <code>true</code> if the XML is valid; otherwise, <code>false</code>
     */
    public static boolean validateXml(XmlObject xml) {
        boolean isXmlValid = false;

        // A collection instance to hold validation error messages.
        ArrayList validationMessages = new ArrayList();

        // Validate the XML, collecting messages.
        isXmlValid = xml.validate(
                new XmlOptions().setErrorListener(validationMessages));

        // If the XML isn't valid, print the messages.
        if (!isXmlValid) {
            System.out.println("\nInvalid XML: ");
            for (int i = 0; i < validationMessages.size(); i++) {
                XmlError error = (XmlError) validationMessages.get(i);
                System.out.println(error.getMessage());
                System.out.println(error.getObjectLocation());
            }
        }
        return isXmlValid;
    }

    private List<Integer> convertBigIntegers(List<BigInteger> list) {
        List<Integer> result = new ArrayList<Integer>(list.size());
        for (BigInteger bi : list) {
            result.add(bi.intValue());
        }
        return result;
    }

}
