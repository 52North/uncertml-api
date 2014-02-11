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
package org.uncertml.distribution.discrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing a negative binomial distribution with parameters number of
 * failures and probability.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/NegativeBinomial}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class NegativeBinomialDistribution implements IDiscreteDistribution {

    private List<Integer> numberOfFailures;
    private List<Double> probability;

    /**
     * Constructor that takes a single number of failures and probability parameter.
     * 
     * @param numberOfFailures the number of failures parameter.
     * @param probability the probability parameter.
     */
    public NegativeBinomialDistribution(int numberOfFailures, double probability) {
        this(new int[]{numberOfFailures}, new double[]{probability});
    }

    /**
     * Constructor that takes an array of integers for the number of failures
     * and an array of doubles for the probability parameters. Each number of failures
     * and probability pair represents a unique negative binomial distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param numberOfFailures an array of integers representing the number of 
     * failures parameter of n negative binomial distributions.
     * @param probability an array of doubles representing the probability parameter of n
     * negative binomial distributions.
     */
    public NegativeBinomialDistribution(int[] numberOfFailures, double[] probability) {
        this(Arrays.asList(ArrayUtils.toObject(numberOfFailures)), Arrays.asList(ArrayUtils.toObject(probability)));
    }

    /**
     * Constructor that takes a list of integers for the number of failures
     * and a list of doubles for the probability parameters. Each number of failures
     * and probability pair represents a unique negative binomial distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The lists must be of equal length and
     * must not contain any null elements.
     * 
     * @param numberOfFailures a list of integers representing the number of 
     * failures parameter of n negative binomial distributions.
     * @param probability a list of doubles representing the probability parameter of n
     * negative binomial distributions.
     */
    public NegativeBinomialDistribution(List<Integer> numberOfFailures, List<Double> probability) {
        Validate.notNull(numberOfFailures);
        Validate.notNull(probability);
        Validate.noNullElements(numberOfFailures);
        Validate.noNullElements(probability);

        Validate.allElementsGreaterThan(numberOfFailures, -1);
        Validate.allElementsBetween(probability, 0, 1);

        Validate.allListsEqualLength(new List<?>[]{numberOfFailures, probability});

        this.numberOfFailures = new ArrayList<Integer>(numberOfFailures);
        this.probability = new ArrayList<Double>(probability);
    }

    /**
     * 
     * @return the number of failures parameter of each negative binomial distribution
     * represented by this object.
     */
    public List<Integer> getNumberOfFailures() {
        return numberOfFailures;
    }

    /**
     * 
     * @return the probability parameter of each negative binomial distribution
     * represented by this object.
     */
    public List<Double> getProbability() {
        return probability;
    }

}
