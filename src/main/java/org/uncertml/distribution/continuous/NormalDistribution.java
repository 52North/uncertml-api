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
import org.uncertml.util.Validate;

/**
 * Class representing a normal distribution with parameters mean and variance.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Normal}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class NormalDistribution implements IContinuousDistribution {

    public static class Mean implements IParameter {
    }

    public static class Variance implements IParameter {
    }
    private List<Double> mean;
    private List<Double> variance;

    /**
     * Constructor that takes a single mean and variance parameter.
     * 
     * @param mean the mean parameter.
     * @param variance the variance parameter.
     */
    public NormalDistribution(double mean, double variance) {
        this(new double[]{mean}, new double[]{variance});
    }

    /**
     * Constructor that takes an array of doubles for the mean and variance parameters.
     * Each mean and variance pair represents a unique normal distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param mean an array of doubles representing the mean parameter of n
     * normal distributions.
     * @param variance an array of doubles representing the variance parameter of n
     * normal distributions.
     */
    public NormalDistribution(double[] mean, double[] variance) {
        this(Arrays.asList(ArrayUtils.toObject(mean)), Arrays.asList(ArrayUtils.toObject(variance)));
    }

    /**
     * Constructor that takes a list of doubles for the mean and variance parameters.
     * Each mean and variance pair represents a unique normal distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The lists must be of equal length and 
     * must not contain any null elements.
     * 
     * @param mean a list of doubles representing the mean parameter of n
     * normal distributions.
     * @param variance a list of doubles representing the variance parameter of n
     * normal distributions.
     */
    public NormalDistribution(List<Double> mean, List<Double> variance) {
        Validate.notNull(mean);
        Validate.notNull(variance);
        Validate.noNullElements(mean);
        Validate.noNullElements(variance);
        Validate.allElementsGreaterThan(variance, 0.0);
        Validate.allListsEqualLength(new List<?>[]{mean, variance});
        this.mean = new ArrayList<Double>(mean);
        this.variance = new ArrayList<Double>(variance);
    }

    /**
     * 
     * @return the mean parameter of each normal distribution represented by this
     * object.
     */
    public List<Double> getMean() {
        return this.mean;
    }

    /**
     * 
     * @return the variance parameter of each normal distribution represented by
     * this object.
     */
    public List<Double> getVariance() {
        return this.variance;
    }

}
