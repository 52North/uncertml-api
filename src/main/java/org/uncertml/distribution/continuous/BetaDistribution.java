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
 * Class representing the beta distribution with parameters alpha and beta.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Beta}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class BetaDistribution implements IContinuousDistribution {

    private List<Double> alpha;
    private List<Double> beta;

    /**
     * Constructor that takes a single alpha and beta parameter.
     * 
     * @param alpha the alpha parameter
     * @param beta the beta parameter
     */
    public BetaDistribution(double alpha, double beta) {
        this(new double[]{alpha}, new double[]{beta});
    }

    /**
     * Constructor that takes an array of doubles for alpha and beta parameters.
     * Each alpha and beta pair represents a unique beta distribution. This is 
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. Both arrays must be of equal length and 
     * contain no null elements.
     * 
     * @param alpha an array of doubles representing the alpha parameter of n
     * beta distributions.
     * @param beta an array of doubles representing the beta parameter of n 
     * beta distributions.
     */
    public BetaDistribution(double[] alpha, double[] beta) {
        this(Arrays.asList(ArrayUtils.toObject(alpha)), Arrays.asList(ArrayUtils.toObject(beta)));
    }

    /**
     * Constructor that takes a list of doubles for alpha and beta parameters.
     * Each alpha and beta pair represents a unique beta distribution. This is 
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. Both Lists must be of equal length and 
     * contain no null elements.
     * 
     * @param alpha a list of doubles representing the alpha parameter of n
     * beta distributions.
     * @param beta a list of doubles representing the beta parameter of n 
     * beta distributions.
     */
    public BetaDistribution(List<Double> alpha, List<Double> beta) {
        Validate.notNull(alpha);
        Validate.notNull(beta);
        Validate.noNullElements(alpha);
        Validate.noNullElements(beta);
        Validate.allElementsGreaterThan(alpha, 0.0);
        Validate.allElementsGreaterThan(beta, 0.0);
        Validate.allListsEqualLength(new List<?>[]{alpha, beta});
        this.alpha = new ArrayList<Double>(alpha);
        this.beta = new ArrayList<Double>(beta);
    }

    /**
     * 
     * @return the alpha parameter of each beta distributions represented 
     * by this object.
     */
    public List<Double> getAlpha() {
        return alpha;
    }

    /**
     * 
     * @return the beta parameter of each beta distributions represented 
     * by this object.
     */
    public List<Double> getBeta() {
        return beta;
    }

}
