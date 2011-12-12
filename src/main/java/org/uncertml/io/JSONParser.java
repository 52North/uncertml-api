package org.uncertml.io;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Arrays;

import org.uncertml.IUncertainty;
import org.uncertml.distribution.categorical.CategoricalUniformDistribution;
import org.uncertml.distribution.continuous.BetaDistribution;
import org.uncertml.distribution.continuous.CauchyDistribution;
import org.uncertml.distribution.continuous.ChiSquareDistribution;
import org.uncertml.distribution.continuous.ExponentialDistribution;
import org.uncertml.distribution.continuous.FDistribution;
import org.uncertml.distribution.continuous.GammaDistribution;
import org.uncertml.distribution.continuous.NormalDistribution;
import org.uncertml.distribution.continuous.InverseGammaDistribution;
import org.uncertml.distribution.continuous.LaplaceDistribution;
import org.uncertml.distribution.continuous.LogNormalDistribution;
import org.uncertml.distribution.continuous.LogisticDistribution;
import org.uncertml.distribution.continuous.NormalInverseGammaDistribution;
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
import org.uncertml.distribution.multivariate.MultivariateNormalDistribution;
import org.uncertml.distribution.multivariate.MultivariateStudentTDistribution;
import org.uncertml.exception.UncertaintyParserException;
import org.uncertml.io.json.IUncertaintyDeserializer;
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
import org.uncertml.statistic.Variance;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonParseException;
import org.uncertml.distribution.continuous.ParetoDistribution;
import org.uncertml.distribution.multivariate.MultinomialDistribution;
import org.uncertml.distribution.multivariate.WishartDistribution;
import org.uncertml.sample.ContinuousRealisation;
import org.uncertml.sample.RandomSample;
import org.uncertml.sample.SystematicSample;
import org.uncertml.sample.UnknownSample;

/**
 * JSON implementation of an UncertML parser.
 * 
 * @author Richard Jones
 * @version 2.0
 */
public class JSONParser implements IUncertaintyParser {

    // uses GSON library to do the parsing
    private Gson gson;

    public JSONParser() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(IUncertainty.class, new IUncertaintyDeserializer());
        registerInstanceCreators(builder);
        gson = builder.create();
    }

    /**
     * Register the individual instance creators with the GSON builder.
     * 
     * @param builder <code>GsonBuilder</code> used to build the UncertML objects
     * from JSON representations.
     */
    private void registerInstanceCreators(GsonBuilder builder) {
        builder.registerTypeAdapter(BetaDistribution.class, new InstanceCreator<BetaDistribution>() {

            @Override
            public BetaDistribution createInstance(Type arg0) {
                return new BetaDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(BinomialDistribution.class, new InstanceCreator<BinomialDistribution>() {

            @Override
            public BinomialDistribution createInstance(Type arg0) {
                return new BinomialDistribution(Arrays.asList(new Integer[]{1}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(CategoricalUniformDistribution.class, new InstanceCreator<CategoricalUniformDistribution>() {

            @Override
            public CategoricalUniformDistribution createInstance(Type arg0) {
                return new CategoricalUniformDistribution(Arrays.asList(new Integer[]{1}));
            }

        });
        builder.registerTypeAdapter(CauchyDistribution.class, new InstanceCreator<CauchyDistribution>() {

            @Override
            public CauchyDistribution createInstance(Type arg0) {
                return new CauchyDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(ChiSquareDistribution.class, new InstanceCreator<ChiSquareDistribution>() {

            @Override
            public ChiSquareDistribution createInstance(Type arg0) {
                return new ChiSquareDistribution(Arrays.asList(new Integer[]{1}));
            }

        });
        builder.registerTypeAdapter(DirichletDistribution.class, new InstanceCreator<DirichletDistribution>() {

            @Override
            public DirichletDistribution createInstance(Type arg0) {
                return new DirichletDistribution(Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(DiscreteUniformDistribution.class, new InstanceCreator<DiscreteUniformDistribution>() {

            @Override
            public DiscreteUniformDistribution createInstance(Type arg0) {
                return new DiscreteUniformDistribution(Arrays.asList(new Integer[]{1}));
            }

        });
        builder.registerTypeAdapter(ExponentialDistribution.class, new InstanceCreator<ExponentialDistribution>() {

            @Override
            public ExponentialDistribution createInstance(Type arg0) {
                return new ExponentialDistribution(Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(FDistribution.class, new InstanceCreator<FDistribution>() {

            @Override
            public FDistribution createInstance(Type arg0) {
                return new FDistribution(Arrays.asList(new Integer[]{1}), Arrays.asList(new Integer[]{1}));
            }

        });
        builder.registerTypeAdapter(GammaDistribution.class, new InstanceCreator<GammaDistribution>() {

            @Override
            public GammaDistribution createInstance(Type arg0) {
                return new GammaDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(NormalDistribution.class, new InstanceCreator<NormalDistribution>() {

            @Override
            public NormalDistribution createInstance(Type arg0) {
                return new NormalDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(GeometricDistribution.class, new InstanceCreator<GeometricDistribution>() {

            @Override
            public GeometricDistribution createInstance(Type arg0) {
                return new GeometricDistribution(Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(HypergeometricDistribution.class, new InstanceCreator<HypergeometricDistribution>() {

            @Override
            public HypergeometricDistribution createInstance(Type arg0) {
                return new HypergeometricDistribution(Arrays.asList(new Integer[]{1}), Arrays.asList(new Integer[]{1}), Arrays.asList(new Integer[]{1}));
            }

        });
        builder.registerTypeAdapter(InverseGammaDistribution.class, new InstanceCreator<InverseGammaDistribution>() {

            @Override
            public InverseGammaDistribution createInstance(Type arg0) {
                return new InverseGammaDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(LaplaceDistribution.class, new InstanceCreator<LaplaceDistribution>() {

            @Override
            public LaplaceDistribution createInstance(Type arg0) {
                return new LaplaceDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(LogisticDistribution.class, new InstanceCreator<LogisticDistribution>() {

            @Override
            public LogisticDistribution createInstance(Type arg0) {
                return new LogisticDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(LogNormalDistribution.class, new InstanceCreator<LogNormalDistribution>() {

            @Override
            public LogNormalDistribution createInstance(Type arg0) {
                return new LogNormalDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(MultivariateNormalDistribution.class, new InstanceCreator<MultivariateNormalDistribution>() {

            @Override
            public MultivariateNormalDistribution createInstance(Type arg0) {
                CovarianceMatrix cm = new CovarianceMatrix(2, new double[]{3.14, 0, 0, 3.14});
                MultivariateNormalDistribution multi = new MultivariateNormalDistribution(new double[]{3.14, 6.28}, cm);
                return multi;
                //return (MultivariateNormalDistribution) new Randomizer().generate(MultivariateNormalDistribution.class, 1);
            }

        });
        builder.registerTypeAdapter(MultivariateStudentTDistribution.class, new InstanceCreator<MultivariateStudentTDistribution>() {

            @Override
            public MultivariateStudentTDistribution createInstance(Type arg0) {
                CovarianceMatrix cm = new CovarianceMatrix(2, new double[]{3.14, 0, 0, 3.14});
                MultivariateStudentTDistribution multi = new MultivariateStudentTDistribution(new double[]{3.14, 6.28}, cm, new int[]{1, 2});
                return multi;
                //return (MultivariateStudentTDistribution) new Randomizer().generate(MultivariateStudentTDistribution.class, 1);
            }

        });
        builder.registerTypeAdapter(NegativeBinomialDistribution.class, new InstanceCreator<NegativeBinomialDistribution>() {

            @Override
            public NegativeBinomialDistribution createInstance(Type arg0) {
                return new NegativeBinomialDistribution(Arrays.asList(new Integer[]{1}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(MultinomialDistribution.class, new InstanceCreator<MultinomialDistribution>() {

            @Override
            public MultinomialDistribution createInstance(Type arg0) {
                return new MultinomialDistribution(2, Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(NormalInverseGammaDistribution.class, new InstanceCreator<NormalInverseGammaDistribution>() {

            @Override
            public NormalInverseGammaDistribution createInstance(Type arg0) {
                return new NormalInverseGammaDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(PoissonDistribution.class, new InstanceCreator<PoissonDistribution>() {

            @Override
            public PoissonDistribution createInstance(Type arg0) {
                return new PoissonDistribution(Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(StudentTDistribution.class, new InstanceCreator<StudentTDistribution>() {

            @Override
            public StudentTDistribution createInstance(Type arg0) {
                return new StudentTDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}), Arrays.asList(new Integer[]{1}));
            }

        });
        builder.registerTypeAdapter(UniformDistribution.class, new InstanceCreator<UniformDistribution>() {

            @Override
            public UniformDistribution createInstance(Type arg0) {
                return new UniformDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        builder.registerTypeAdapter(WeibullDistribution.class, new InstanceCreator<WeibullDistribution>() {

            @Override
            public WeibullDistribution createInstance(Type arg0) {
                return new WeibullDistribution(Arrays.asList(new Double[]{0.5}), Arrays.asList(new Double[]{0.5}));
            }

        });
        
        builder.registerTypeAdapter(ContinuousRealisation.class, new InstanceCreator<ContinuousRealisation>() {

            @Override
            public ContinuousRealisation createInstance(Type arg0) {
                return new ContinuousRealisation(Arrays.asList(new Double[]{0.5}), 0.2, "Test");
            }

        });
        
        builder.registerTypeAdapter(RandomSample.class, new InstanceCreator<RandomSample>() {

            @Override
            public RandomSample createInstance(Type arg0) {
                return new RandomSample(new ContinuousRealisation[] {new ContinuousRealisation(new double[]{0.2})}, "Hello");
            }

        });
        builder.registerTypeAdapter(SystematicSample.class, new InstanceCreator<SystematicSample>() {

            @Override
            public SystematicSample createInstance(Type arg0) {
                return new SystematicSample(new ContinuousRealisation[] {new ContinuousRealisation(new double[]{0.2})}, "Hello");
            }

        });
        builder.registerTypeAdapter(UnknownSample.class, new InstanceCreator<UnknownSample>() {

            @Override
            public UnknownSample createInstance(Type arg0) {
                return new UnknownSample(new ContinuousRealisation[] {new ContinuousRealisation(new double[]{0.2})}, "Hello");
            }

        });
        
        builder.registerTypeAdapter(CategoricalMode.class, new InstanceCreator<CategoricalMode>() {

            @Override
            public CategoricalMode createInstance(Type arg0) {
                return new CategoricalMode(Arrays.asList(new String[]{"A"}));
            }

        });
        builder.registerTypeAdapter(CentredMoment.class, new InstanceCreator<CentredMoment>() {

            @Override
            public CentredMoment createInstance(Type arg0) {
                return new CentredMoment(2, 3.14);
            }

        });
        builder.registerTypeAdapter(CoefficientOfVariation.class, new InstanceCreator<CoefficientOfVariation>() {

            @Override
            public CoefficientOfVariation createInstance(Type arg0) {
                return new CoefficientOfVariation(Arrays.asList(new Double[]{0.0}));
            }

        });
        builder.registerTypeAdapter(ConfidenceInterval.class, new InstanceCreator<ConfidenceInterval>() {

            @Override
            public ConfidenceInterval createInstance(Type arg0) {
                return new ConfidenceInterval(new Quantile(0.25, 0.1), new Quantile(0.75, 0.1));
            }

        });
        builder.registerTypeAdapter(ConfusionMatrix.class, new InstanceCreator<ConfusionMatrix>() {

            @Override
            public ConfusionMatrix createInstance(Type arg0) {
                
                String[] categories = new String[] {"OAK"};
                return new ConfusionMatrix(categories, new int[] {1}); 
                //return (ConfusionMatrix) new Randomizer().generate(ConfusionMatrix.class, 1);
            }

        });
        builder.registerTypeAdapter(Correlation.class, new InstanceCreator<Correlation>() {

            @Override
            public Correlation createInstance(Type arg0) {
                return new Correlation(0.0); 
                //return (Correlation) new Randomizer().generate(Correlation.class, 1);
            }

        });
        builder.registerTypeAdapter(CovarianceMatrix.class, new InstanceCreator<CovarianceMatrix>() {

            @Override
            public CovarianceMatrix createInstance(Type arg0) {
                CovarianceMatrix cm = new CovarianceMatrix(2, new double[]{3.14, 0, 0, 3.14});
                return cm;
            }

        });
        builder.registerTypeAdapter(CredibleInterval.class, new InstanceCreator<CredibleInterval>() {

            @Override
            public CredibleInterval createInstance(Type arg0) {
                return new CredibleInterval(new Quantile(0.25, 0.1), new Quantile(0.75, 0.1));
            }

        });
        builder.registerTypeAdapter(Decile.class, new InstanceCreator<Decile>() {

            @Override
            public Decile createInstance(Type arg0) {
                return new Decile(10, 0.0);
            }

        });
        builder.registerTypeAdapter(DiscreteProbability.class, new InstanceCreator<DiscreteProbability>() {

            @Override
            public DiscreteProbability createInstance(Type arg0) {
                return new DiscreteProbability("A", 0.0);
            }

        });
        builder.registerTypeAdapter(InterquartileRange.class, new InstanceCreator<InterquartileRange>() {

            @Override
            public InterquartileRange createInstance(Type arg0) {
                return new InterquartileRange(0.0, 0.0);
            }

        });
        builder.registerTypeAdapter(Kurtosis.class, new InstanceCreator<Kurtosis>() {

            @Override
            public Kurtosis createInstance(Type arg0) {
                return new Kurtosis(0.0);
            }

        });
        builder.registerTypeAdapter(Mean.class, new InstanceCreator<Mean>() {

            @Override
            public Mean createInstance(Type arg0) {
                return new Mean(0.25);
            }

        });
        builder.registerTypeAdapter(Median.class, new InstanceCreator<Median>() {

            @Override
            public Median createInstance(Type arg0) {
                return new Median(0.25);
            }

        });
        builder.registerTypeAdapter(Mode.class, new InstanceCreator<Mode>() {

            @Override
            public Mode createInstance(Type arg0) {
                return new Mode(0.25);
            }

        });
        builder.registerTypeAdapter(Moment.class, new InstanceCreator<Moment>() {

            @Override
            public Moment createInstance(Type arg0) {
                return new Moment(10, 0.25);
            }

        });
        builder.registerTypeAdapter(ParetoDistribution.class, new InstanceCreator<ParetoDistribution>() {

            @Override
            public ParetoDistribution createInstance(Type arg0) {
                return new ParetoDistribution(0.5, 0.5);
            }

        });
        builder.registerTypeAdapter(WishartDistribution.class, new InstanceCreator<WishartDistribution>() {

            @Override
            public WishartDistribution createInstance(Type arg0) {
                return new WishartDistribution(0.4, new CovarianceMatrix(2, new double[]{1,2}));
            }

        });
        builder.registerTypeAdapter(Percentile.class, new InstanceCreator<Percentile>() {

            @Override
            public Percentile createInstance(Type arg0) {
                return new Percentile(0.5, 0.5);
            }

        });
        builder.registerTypeAdapter(Probability.class, new InstanceCreator<Probability>() {

            @Override
            public Probability createInstance(Type arg0) {
                return new Probability(new ProbabilityConstraint(ConstraintType.GREATER_OR_EQUAL, 0.5), 0.5);
            }

        });
        builder.registerTypeAdapter(ProbabilityConstraint.class, new InstanceCreator<ProbabilityConstraint>() {

            @Override
            public ProbabilityConstraint createInstance(Type arg0) {
                return new ProbabilityConstraint(ConstraintType.GREATER_OR_EQUAL, 0.5);
            }

        });
        builder.registerTypeAdapter(Quantile.class, new InstanceCreator<Quantile>() {

            @Override
            public Quantile createInstance(Type arg0) {
                return new Quantile(0.25, 0.1);
            }

        });
        builder.registerTypeAdapter(Quartile.class, new InstanceCreator<Quartile>() {

            @Override
            public Quartile createInstance(Type arg0) {
                return new Quartile(0.25, 0.1);
            }

        });
        builder.registerTypeAdapter(Range.class, new InstanceCreator<Range>() {

            @Override
            public Range createInstance(Type arg0) {
                return new Range(0.5, 0.5);
            }

        });
        builder.registerTypeAdapter(Skewness.class, new InstanceCreator<Skewness>() {

            @Override
            public Skewness createInstance(Type arg0) {
                return new Skewness(0.5);
            }

        });
        builder.registerTypeAdapter(StandardDeviation.class, new InstanceCreator<StandardDeviation>() {

            @Override
            public StandardDeviation createInstance(Type arg0) {
                return new StandardDeviation(0.5);
            }

        });
        builder.registerTypeAdapter(Variance.class, new InstanceCreator<Variance>() {

            @Override
            public Variance createInstance(Type arg0) {
                return new Variance(0.5);
            }

        });
    }

    @Override
    public IUncertainty parse(String uncertml) throws UncertaintyParserException {
        return parse(new StringReader(uncertml));
    }

    @Override
    public IUncertainty parse(InputStream stream) throws UncertaintyParserException {
        return parse(new InputStreamReader(stream));
    }

    @Override
    public IUncertainty parse(File file) throws UncertaintyParserException {
        try {
            FileReader reader = new FileReader(file);
            IUncertainty u = parse(reader);
            reader.close();
            return u;
        } catch (Exception e) {
            throw new UncertaintyParserException(e);
        }
    }

    @Override
    public IUncertainty parse(Reader reader) throws UncertaintyParserException {
        try {
            IUncertainty u = gson.fromJson(reader, IUncertainty.class);
            if (u == null) {
                throw new UncertaintyParserException();
            } else {
                return u;
            }
        } catch (JsonParseException e) {
            throw new UncertaintyParserException(e);
        }
    }

}
