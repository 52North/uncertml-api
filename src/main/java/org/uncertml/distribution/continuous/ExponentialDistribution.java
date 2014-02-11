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
 * Class representing the exponential distribution with rate parameter.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Exponential}
 * 
 * @author Mattthew Williams
 * @version 2.0
 */
public class ExponentialDistribution implements IContinuousDistribution {

    private List<Double> rate;

    /**
     * Constructor that takes a single rate parameter.
     * 
     * @param rate the rate parameter
     */
    public ExponentialDistribution(double rate) {
        this(new double[]{rate});
    }

    /**
     * Constructor that takes an array of doubles for rate parameters. Each rate
     * represents a unique exponential distribution. This is in line with the 
     * UncertML syntax whereby a collection of types can be represented by a single
     * entity.
     * 
     * @param rate an array of doubles representing the rate parameter of n
     * exponential distributions.
     */
    public ExponentialDistribution(double[] rate) {
        this(Arrays.asList(ArrayUtils.toObject(rate)));
    }

    /**
     * Constructor that takes a list of doubles for rate parameters. Each rate
     * represents a unique exponential distribution. This is in line with the 
     * UncertML syntax whereby a collection of types can be represented by a single
     * entity. The list must not contain any null elements.
     * 
     * @param rate a list of doubles representing the rate parameter of n
     * exponential distributions.
     */
    public ExponentialDistribution(List<Double> rate) {
        Validate.notNull(rate);
        Validate.noNullElements(rate);
        Validate.allElementsGreaterThan(rate, 0);
        this.rate = new ArrayList<Double>();
        this.rate.addAll(rate);
    }

    /**
     * 
     * @return the rate parameter of each exponential distribution
     * represented by this object.
     */
    public List<Double> getRate() {
        return rate;
    }

}
