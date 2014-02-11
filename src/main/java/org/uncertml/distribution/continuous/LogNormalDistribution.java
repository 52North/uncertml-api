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
 * Class representing a log-normal distribution with log-scale and shape parameters.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/LogNormal}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class LogNormalDistribution implements IContinuousDistribution {

    private List<Double> logScale;
    private List<Double> shape;

    /**
     * Constructor that takes a single log-scale and shape parameter.
     * 
     * @param logScale the log-scale parameter.
     * @param shape the shape parameter.
     */
    public LogNormalDistribution(double logScale, double shape) {
        this(new double[]{logScale}, new double[]{shape});
    }

    /**
     * Constructor that takes an array of doubles for the log-scale and shape parameters.
     * Each log-scale and scale pair represents a unique log-normal distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param logScale an array of doubles representing the log-scale parameter of n
     * log-normal distributions.
     * @param shape an array of doubles representing the shape parameter of n
     * log-normal distributions.
     */
    public LogNormalDistribution(double[] logScale, double[] shape) {
        this(Arrays.asList(ArrayUtils.toObject(logScale)), Arrays.asList(ArrayUtils.toObject(shape)));
    }

    /**
     * Constructor that takes a list of doubles for the log-scale and shape parameters.
     * Each log-scale and scale pair represents a unique log-normal distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The lists must be of equal length and
     * must not contain any null elements.
     * 
     * @param logScale a list of doubles representing the log-scale parameter of n
     * log-normal distributions.
     * @param shape a list of doubles representing the shape parameter of n
     * log-normal distributions.
     */
    public LogNormalDistribution(List<Double> logScale, List<Double> shape) {
        Validate.notNull(logScale);
        Validate.notNull(shape);
        Validate.noNullElements(logScale);
        Validate.noNullElements(shape);
        Validate.allElementsGreaterThan(shape, 0.0);
        Validate.allListsEqualLength(new List<?>[]{logScale, shape});
        this.logScale = new ArrayList<Double>(logScale);
        this.shape = new ArrayList<Double>(shape);
    }

    /**
     * 
     * @return the log-scale parameter of each log-normal distribution represented
     * by this object.
     */
    public List<Double> getLogScale() {
        return this.logScale;
    }

    /**
     * 
     * @return the shape parameter of each log-normal distribution represented
     * by this object.
     */
    public List<Double> getShape() {
        return this.shape;
    }

}
