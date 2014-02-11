/**
 * Copyright 2014 52°North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uncertml.test;

import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.uncertml.IUncertainty;
import org.uncertml.exception.UncertaintyParserException;
import org.uncertml.io.JSONEncoder;
import org.uncertml.io.JSONParser;
import org.uncertml.statistic.CategoricalMode;
import org.uncertml.statistic.CentredMoment;
import org.uncertml.statistic.CoefficientOfVariation;
import org.uncertml.statistic.ConfidenceInterval;
import org.uncertml.statistic.ConstraintType;
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

public class JSONStatisticTestCase extends TestCase {
	
	private JSONEncoder je;
	private JSONParser jp;
	
	public void setUp() {
		je = new JSONEncoder();
        jp = new JSONParser();
	}

	public void testCategoricalMode() {
    	CategoricalMode cm = new CategoricalMode(Arrays.asList(new String[] { "A", "B", "C" }));
    	Assert.assertTrue(compareJSON(cm));
	}
	
	public void testCentredMoment() {
		CentredMoment cm = new CentredMoment(2, Arrays.asList(new Double[] { 0.0, 1.0 }));
		Assert.assertTrue(compareJSON(cm));
	}

	public void testCoefficientOfVariation() {
		CoefficientOfVariation cov = new CoefficientOfVariation(Arrays.asList(new Double[] { 10.5 }));
		Assert.assertTrue(compareJSON(cov));
	}
	
	public void testConfidenceInterval() {
		ConfidenceInterval ci = new ConfidenceInterval(new Quantile(0.25, 0.1), new Quantile(0.75, 0.5));
		Assert.assertTrue(compareJSON(ci));
	}

	public void testConfusionMatrix() {
		//Assert.assertTrue(compareJSON(rn.generate(ConfusionMatrix.class, 1)));
	}
	
	public void testCorrelation() {
		//Assert.assertTrue(compareJSON(rn.generate(Correlation.class, 1)));
	}
	
	public void testCovarianceMatrix() {
		//Assert.assertTrue(compareJSON(rn.generate(CovarianceMatrix.class, 1)));
	}
	
	public void testCredibleInterval() {
		CredibleInterval ci = new CredibleInterval(new Quantile(0.25, 0.1), new Quantile(0.75, 0.5));
		Assert.assertTrue(compareJSON(ci));
	}
	
	public void testDecile() {
		Decile d = new Decile(9, 0.8);
		Assert.assertTrue(compareJSON(d));
	}
	
	public void testDiscreteProbability() {
		DiscreteProbability d = new DiscreteProbability("B", 1.0);
		Assert.assertTrue(compareJSON(d));
	}
	
	public void testInterQuartileRange() {
		InterquartileRange i = new InterquartileRange(4.0, 5.0);
		Assert.assertTrue(compareJSON(i));
	}
	
	public void testKurtosis() {
		Kurtosis k = new Kurtosis(4.5);
		Assert.assertTrue(compareJSON(k));
	}
	
	public void testMean() {
		Mean m = new Mean(0.6);
		Assert.assertTrue(compareJSON(m));
	}
	
	public void testMedian() {
		Median m = new Median(0.5);
		Assert.assertTrue(compareJSON(m));
	}
	
	public void testMode() {
		Mode m = new Mode(0.5);
		Assert.assertTrue(compareJSON(m));
	}
	
	public void testMoment() {
		Moment m = new Moment(10, 0.2);
		Assert.assertTrue(compareJSON(m));
	}
	
	public void testPercentile() {
		Percentile p = new Percentile(10, 0.5);
		Assert.assertTrue(compareJSON(p));
	}
	
	public void testProbability() {
		Probability p = new Probability(new ProbabilityConstraint(ConstraintType.GREATER_OR_EQUAL, 0.2), 0.8);
		Assert.assertTrue(compareJSON(p));
	}
	
	public void testQuantile() {
		Quantile qu = new Quantile(0.5, 13.3);
		Assert.assertTrue(compareJSON(qu));
	}
	
	public void testQuartile() {
		Quartile q = new Quartile(0.75, 124.141);
		Assert.assertTrue(compareJSON(q));
	}
	
	public void testRange() {
		Range r = new Range(0.2, 0.8);
		Assert.assertTrue(compareJSON(r));
	}
	
	public void testSkewness() {
		Skewness s = new Skewness(0.5);
		Assert.assertTrue(compareJSON(s));
	}

	public void testStandardDeviation() {
		StandardDeviation sd = new StandardDeviation(0.5);
		Assert.assertTrue(compareJSON(sd));
	}
	
	public void testStatisticCollection() {
		Mode m = new Mode(0.5);
		Percentile p = new Percentile(10, 0.5);
		Variance v = new Variance(0.4);
		StatisticCollection c = new StatisticCollection(Arrays.asList(new IStatistic[] { m, p, v }));
		Assert.assertTrue(compareJSON(c));
	}
	
	public void testVariance() {
		Variance v = new Variance(0.4);
		Assert.assertTrue(compareJSON(v));
	}
	
	private boolean compareJSON(IUncertainty u) {
		try {
			String json = je.encode(u);
			System.out.println(json);
			IUncertainty u2 = jp.parse(json);
			String json2 = je.encode(u2);
			return json.equals(json2);
		}
		catch (UncertaintyParserException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
