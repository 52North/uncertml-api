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
package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.sample.ContinuousRealisation;
import org.uncertml.util.Validate;

/**
 * Class representing a Student T distribution with parameters mean, variance and
 * degrees of freedom.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/StudentT}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class StudentTDistribution implements IContinuousDistribution {

    private List<Double> mean;
    private List<Double> variance;
    private List<Integer> degreesOfFreedom;

    /**
     * Constructor that takes a single mean, variance and degrees of freedom parameter.
     * 
     * @param mean the mean parameter.
     * @param variance the variance parameter.
     * @param degreesOfFreedom the degrees of freedom parameter.
     */
    public StudentTDistribution(double mean, double variance, int degreesOfFreedom) {
        this(new double[]{mean}, new double[]{variance}, new int[]{degreesOfFreedom});
    }

    /**
     * Constructor that takes an array of doubles for the mean, variance and
     * degreed of freedom parameters. Each mean and variance pair represents a 
     * unique Student T distribution. This is in line with the UncertML syntax 
     * whereby a collection of types can be represented by a single entity. The 
     * arrays must be of equal length.
     * 
     * @param mean an array of doubles representing the mean parameter of n
     * Student T distributions.
     * @param variance an array of doubles representing the variance parameter of n
     * Student T distributions.
     * @param degreesOfFreedom an array of integers representing the degrees of
     * freedom parameter of n Student T distributions
     */
    public StudentTDistribution(double[] mean, double[] variance, int[] degreesOfFreedom) {
        this(Arrays.asList(ArrayUtils.toObject(mean)), Arrays.asList(ArrayUtils.toObject(variance)), Arrays.asList(ArrayUtils.toObject(degreesOfFreedom)));
    }

    /**
     * Constructor that takes a list of doubles for the mean, variance and
     * degreed of freedom parameters. Each mean and variance pair represents a 
     * unique Student T distribution. This is in line with the UncertML syntax 
     * whereby a collection of types can be represented by a single entity. The 
     * lists must be of equal length and must not contain any null elements.
     * 
     * @param mean a list of doubles representing the mean parameter of n
     * Student T distributions.
     * @param variance a list of doubles representing the variance parameter of n
     * Student T distributions.
     * @param degreesOfFreedom a list of integers representing the degrees of
     * freedom parameter of n Student T distributions
     */
    public StudentTDistribution(List<Double> mean, List<Double> variance,
            List<Integer> degreesOfFreedom) {
        Validate.notNull(mean);
        Validate.notNull(variance);
        Validate.notNull(degreesOfFreedom);

        Validate.noNullElements(mean);
        Validate.noNullElements(variance);
        Validate.noNullElements(degreesOfFreedom);

        Validate.allElementsGreaterThan(variance, 0.0);

        Validate.allListsEqualLength(new List<?>[]{mean, variance, degreesOfFreedom});

        this.mean = new ArrayList<Double>(mean);
        this.variance = new ArrayList<Double>(variance);
        this.degreesOfFreedom = new ArrayList<Integer>(degreesOfFreedom);
    }

    public List<Integer> getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

    public List<Double> getCentredMoment(int order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Double> getExceedanceProbability(double threshold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Double> getMean() {
        return this.mean;
    }

    public List<Double> getMedian() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Double> getMode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Double> getProbability(double value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Double> getProbability(double lowerValue, double upperValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Double> getQuantile(double level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<ContinuousRealisation> getRealisations(int numberOfRealisations) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public List<Double> getStandardDeviation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Double> getVariance() {
        return this.variance;
    }

}
