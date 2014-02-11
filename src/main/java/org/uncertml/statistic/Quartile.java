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
package org.uncertml.statistic;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

/**
 * Class representing a quartile. A quartile is a specification of a <code>Quantile</code>.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Quartile}
 * 
 * @see org.uncertml.statistic.Quantile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Quartile extends Quantile {

    /**
     * Constructor that takes a single level and value, representing a single
     * quartile statistic.
     * 
     * @param level the level of the quartile, must be 0.25 or 0.75.
     * @param value the value of the quartile.
     */
    public Quartile(double level, double value) {
        this(level, new double[]{value});
    }

    /**
     * Constructs a quartile from a specified level and an array of doubles.
     * Each double represents a single quartile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double value representing the level of each quartile. Must
     * be either 0.25 or 0.75.
     * @param values an array of doubles representing the value of n
     * quartile statistics - each with the same level.
     */
    public Quartile(double level, double[] values) {
        this(level, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructs a quartile from a specified level and a <code>List</code> of doubles.
     * Each double represents a single quartile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double value representing the level of each quartile. Must
     * be either 0.25 or 0.75.
     * @param values a <code>List</code> of doubles representing the value of n
     * quartile statistics - each with the same level.
     */
    public Quartile(double level, List<Double> values) {
        super(level, values);
    }

    /**
     * A method that returns the level as a quartile representation. Either 0.25
     * or 0.75
     * 
     * @return the quartile level. 
     */
    public double getQuartileLevel() {
        return this.getLevel();
    }

}
