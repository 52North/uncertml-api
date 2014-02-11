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
import org.uncertml.util.Validate;

/**
 * Class representing a quantile. A quantile is the most general representation of
 * the *tiles.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Quantile}
 * 
 * @see org.uncertml.statistic.quantile
 * @see org.uncertml.statistic.Percentile
 * @see org.uncertml.statistic.Quartile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Quantile extends ContinuousStatistic {

    private double level;

    /**
     * Constructor that takes a single level and value, representing a single quantile
     * statistic.
     * 
     * @param level the level of the quantile, 0 - 1.
     * @param value the value of the quantile statistic.
     */
    public Quantile(double level, double value) {
        this(level, new double[]{value});
    }

    /**
     * Constructs a quantile from a specified level and an array of doubles.
     * Each double represents a single quantile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double value representing the level of each quantile represented by
     * this object. Must be in the range 0 - 1.
     * @param values an array of doubles representing the value of n
     * quantile statistics - each with the same level.
     */
    public Quantile(double level, double[] values) {
        this(level, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructs a quantile from a specified level and a <code>List</code> of doubles.
     * Each double represents a single quantile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double value representing the level of each quantile represented by
     * this object. Must be in the range 0 - 1.
     * @param values a <code>List</code> of doubles representing the value of n
     * quantile statistics - each with the same level.
     */
    public Quantile(double level, List<Double> values) {
        super(values);
        Validate.isTrue((level >= 0 && level <= 1.0), "The level of a quantile must be between 0 and 1");
        this.level = level;
    }

    /**
     * 
     * @return the level of a quantile in the range 0 - 1.
     */
    public double getLevel() {
        return level;
    }

}
