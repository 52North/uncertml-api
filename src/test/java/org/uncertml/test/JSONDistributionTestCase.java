package org.uncertml.test;

import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

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
import org.uncertml.exception.UncertaintyParserException;
import org.uncertml.io.JSONEncoder;
import org.uncertml.io.JSONParser;
import org.uncertml.statistic.CovarianceMatrix;

public class JSONDistributionTestCase extends TestCase {

    private JSONEncoder je;
    private JSONParser jp;

    @Override
    public void setUp() {
        je = new JSONEncoder();
        jp = new JSONParser();
    }

    public void testBetaDistribution() {
        BetaDistribution b = new BetaDistribution(Arrays.asList(new Double[]{0.4, 0.4}), Arrays.asList(new Double[]{0.2, 0.2}));
        Assert.assertTrue(compareJSON(b));
    }

    public void testBinomialDistribution() {
        BinomialDistribution b = new BinomialDistribution(Arrays.asList(new Integer[]{1, 2}), Arrays.asList(new Double[]{0.5, 0.2}));
        Assert.assertTrue(compareJSON(b));
    }

    public void testCategoricalUniformDistribution() {
        CategoricalUniformDistribution cud = new CategoricalUniformDistribution(Arrays.asList(new Integer[]{1, 2}));
        Assert.assertTrue(compareJSON(cud));
    }

    public void testCauchyDistribution() {
        CauchyDistribution c = new CauchyDistribution(Arrays.asList(new Double[]{0.2, 0.3}), Arrays.asList(new Double[]{0.8, 0.4}));
        Assert.assertTrue(compareJSON(c));
    }

    public void testChiSquareDistribution() {
        ChiSquareDistribution c = new ChiSquareDistribution(Arrays.asList(new Integer[]{1, 2, 3}));
        Assert.assertTrue(compareJSON(c));
    }

    public void testDirichletDistribution() {
        DirichletDistribution d = new DirichletDistribution(Arrays.asList(new Double[]{0.3, 0.6}));
        Assert.assertTrue(compareJSON(d));
    }

    public void testDiscreteUniformDistribution() {
        DiscreteUniformDistribution dud = new DiscreteUniformDistribution(Arrays.asList(new Integer[]{1, 1}));
        Assert.assertTrue(compareJSON(dud));
    }

    public void testExponentialDistribution() {
        ExponentialDistribution e = new ExponentialDistribution(Arrays.asList(new Double[]{0.2, 0.3}));
        Assert.assertTrue(compareJSON(e));
    }

    public void testFDistribution() {
        FDistribution f = new FDistribution(Arrays.asList(new Integer[]{1, 2, 3}), Arrays.asList(new Integer[]{2, 3, 4}));
        Assert.assertTrue(compareJSON(f));
    }

    public void testGammaDistribution() {
        GammaDistribution g = new GammaDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.8, 0.75}));
        Assert.assertTrue(compareJSON(g));
    }

    public void testGaussianDistribution() {
        NormalDistribution g = new NormalDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.8, 0.75}));
        Assert.assertTrue(compareJSON(g));
    }

    public void testGeometricDistribution() {
        GeometricDistribution gd = new GeometricDistribution(Arrays.asList(new Double[]{0.1, 0.2}));
        Assert.assertTrue(compareJSON(gd));
    }

    public void testHypergeometricDistribution() {
        HypergeometricDistribution hd = new HypergeometricDistribution(Arrays.asList(new Integer[]{1, 1}), Arrays.asList(new Integer[]{1, 1}), Arrays.asList(new Integer[]{1, 2}));
        Assert.assertTrue(compareJSON(hd));
    }

    public void testInverseGammaDistribution() {
        InverseGammaDistribution ig = new InverseGammaDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.8, 0.75}));
        Assert.assertTrue(compareJSON(ig));
    }

    public void testLaplaceDistribution() {
        LaplaceDistribution l = new LaplaceDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.8, 0.75}));
        Assert.assertTrue(compareJSON(l));
    }

    public void testLogisticDistribution() {
        LogisticDistribution l = new LogisticDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.8, 0.75}));
        Assert.assertTrue(compareJSON(l));
    }

    public void testLogNormalDistribution() {
        LogNormalDistribution ln = new LogNormalDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.8, 0.75}));
        Assert.assertTrue(compareJSON(ln));
    }

    public void testMixtureModel() {
//		IDistribution d = (IDistribution) rn.generate(NormalDistribution.class, 1);
//		MixtureModel m = new MixtureModel(new WeightedDistribution(1.0, d));
//		Assert.assertTrue(compareJSON(m));
    }

    public void testMultivariateGaussianDistribution() {
        MultivariateNormalDistribution mgd = new MultivariateNormalDistribution(Arrays.asList(new Double[]{0.5, 0.4}), new CovarianceMatrix(2, Arrays.asList(new Double[]{0.1, 0.2, 0.3, 0.4})));
        Assert.assertTrue(compareJSON(mgd));
    }

    public void testMultivariateStudentTDistribution() {
//		Assert.assertTrue(compareJSON(rn.generate(MultivariateStudentTDistribution.class, 1)));
    }

    public void testNegativeBinomialDistribution() {
        NegativeBinomialDistribution nbd = new NegativeBinomialDistribution(Arrays.asList(new Integer[]{1, 2}), Arrays.asList(new Double[]{0.5, 0.25}));
        Assert.assertTrue(compareJSON(nbd));
    }

    public void testNormalInverseGammaDistribution() {
        NormalInverseGammaDistribution ni = new NormalInverseGammaDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.4, 0.5}));
        Assert.assertTrue(compareJSON(ni));
    }

    public void testPoissonDistribution() {
        PoissonDistribution p = new PoissonDistribution(Arrays.asList(new Double[]{0.4, 0.5}));
        Assert.assertTrue(compareJSON(p));
    }

    public void testStudentTDistribution() {
        StudentTDistribution st = new StudentTDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Integer[]{4, 5}));
        Assert.assertTrue(compareJSON(st));
    }

    public void testUniformDistribution() {
        UniformDistribution u = new UniformDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.4, 0.5}));
        Assert.assertTrue(compareJSON(u));
    }

    public void testWeibullDistribution() {
        WeibullDistribution w = new WeibullDistribution(Arrays.asList(new Double[]{0.4, 0.5}), Arrays.asList(new Double[]{0.4, 0.5}));
        Assert.assertTrue(compareJSON(w));
    }

    private boolean compareJSON(IUncertainty u) {
        try {
            String json = je.encode(u);
            System.out.println(json);
            IUncertainty u2 = jp.parse(json);
            String json2 = je.encode(u2);
            return json.equals(json2);
        } catch (UncertaintyParserException e) {
            e.printStackTrace();
            return false;
        }
    }

}
