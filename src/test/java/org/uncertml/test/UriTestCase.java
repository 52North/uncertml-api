package org.uncertml.test;

import org.uncertml.IUncertainty;
import org.uncertml.UncertML;
import org.uncertml.distribution.IDistribution;
import org.uncertml.distribution.categorical.CategoricalUniformDistribution;
import org.uncertml.distribution.categorical.ICategoricalDistribution;
import org.uncertml.distribution.continuous.IContinuousDistribution;
import org.uncertml.distribution.continuous.NormalDistribution;
import org.uncertml.distribution.discrete.DiscreteUniformDistribution;
import org.uncertml.distribution.discrete.IDiscreteDistribution;
import org.uncertml.distribution.discrete.NegativeBinomialDistribution;
import org.uncertml.distribution.multivariate.IMultivariateDistribution;
import org.uncertml.distribution.multivariate.MultivariateStudentTDistribution;
import org.uncertml.distribution.multivariate.WishartDistribution;
import org.uncertml.sample.CategoricalRealisation;
import org.uncertml.sample.ContinuousRealisation;
import org.uncertml.sample.ISample;
import org.uncertml.sample.UnknownSample;
import org.uncertml.statistic.CategoricalMode;
import org.uncertml.statistic.CategoricalStatistic;
import org.uncertml.statistic.ContinuousStatistic;
import org.uncertml.statistic.DiscreteProbability;
import org.uncertml.statistic.DiscreteStatistic;
import org.uncertml.statistic.IStatistic;
import org.uncertml.statistic.Mean;
import org.uncertml.statistic.StatisticCollection;

import junit.framework.TestCase;

public class UriTestCase extends TestCase {

	public void testGerneral() {
		assertEquals(UncertML.getURI(String.class), null);
		assertEquals(UncertML.getURI(IUncertainty.class), "http://www.uncertml.org");
	}
	
	public void testStatistics() {
		assertEquals(UncertML.getURI(IStatistic.class), "http://www.uncertml.org/statistics");
		assertEquals(UncertML.getURI(StatisticCollection.class), "http://www.uncertml.org/statistics/statistic-collection");
		assertEquals(UncertML.getURI(ContinuousStatistic.class), "http://www.uncertml.org/statistics/continuous");
		assertEquals(UncertML.getURI(Mean.class), "http://www.uncertml.org/statistics/mean");
		assertEquals(UncertML.getURI(CategoricalStatistic.class), "http://www.uncertml.org/statistics/categorical");
		assertEquals(UncertML.getURI(CategoricalMode.class), "http://www.uncertml.org/statistics/categorical-mode");
		assertEquals(UncertML.getURI(DiscreteStatistic.class), "http://www.uncertml.org/statistics/discrete");
		assertEquals(UncertML.getURI(DiscreteProbability.class), "http://www.uncertml.org/statistics/discrete-probability");
	}
	
	public void testDistributions() {
		assertEquals(UncertML.getURI(IDistribution.class), "http://www.uncertml.org/distributions");
		assertEquals(UncertML.getURI(IContinuousDistribution.class), "http://www.uncertml.org/distributions/continuous");
		assertEquals(UncertML.getURI(NormalDistribution.class), "http://www.uncertml.org/distributions/normal");
		assertEquals(UncertML.getURI(ICategoricalDistribution.class), "http://www.uncertml.org/distributions/categorical");
		assertEquals(UncertML.getURI(CategoricalUniformDistribution.class), "http://www.uncertml.org/distributions/categorical-uniform");
		assertEquals(UncertML.getURI(IDiscreteDistribution.class), "http://www.uncertml.org/distributions/discrete");
		assertEquals(UncertML.getURI(DiscreteUniformDistribution.class), "http://www.uncertml.org/distributions/discrete-uniform");
		assertEquals(UncertML.getURI(NegativeBinomialDistribution.class), "http://www.uncertml.org/distributions/negative-binomial");
		assertEquals(UncertML.getURI(IMultivariateDistribution.class), "http://www.uncertml.org/distributions/multivariate");
		assertEquals(UncertML.getURI(MultivariateStudentTDistribution.class), "http://www.uncertml.org/distributions/multivariate-student-t");
		assertEquals(UncertML.getURI(WishartDistribution.class), "http://www.uncertml.org/distributions/wishart");
	}
	
	public void testSamples() {
		assertEquals(UncertML.getURI(ISample.class), "http://www.uncertml.org/samples");
		assertEquals(UncertML.getURI(UnknownSample.class), "http://www.uncertml.org/samples/unknown");
		assertEquals(UncertML.getURI(ContinuousRealisation.class), "http://www.uncertml.org/samples/continuous-realisation");
		assertEquals(UncertML.getURI(CategoricalRealisation.class), "http://www.uncertml.org/samples/categorical-realisation");
	}
	
}
