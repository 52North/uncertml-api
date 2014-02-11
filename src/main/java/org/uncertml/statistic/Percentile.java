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
 * Class representing a percentile. A percentile is a specification of a <code>Quantile</code>.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Percentile}
 * 
 * @see org.uncertml.statistic.Quantile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Percentile extends Quantile {

    /**
     * Constructs a percentile from a specified level and a <code>List</code> of doubles.
     * Each double represents a single percentile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double level of the set of percentiles represented by this object.
     * Must be in the range 0 - 100.
     * @param values a <code>List</code> of doubles representing the value of n
     * percentile statistics - each with the same level.
     */
    public Percentile(double level, List<Double> values) {
        super(Percentile.validateLevel(level), values);
        Validate.isTrue((level > 0.0 && level <= 100.0));
    }

    /**
     * Constructs a percentile from a specified level and an array of doubles.
     * Each double represents a single percentile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double level of the set of percentiles represented by this object.
     * Must be in the range 0 - 100.
     * @param values an array of doubles representing the value of n
     * percentile statistics - each with the same level.
     */
    public Percentile(double level, double[] values) {
        this(level, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single level and value, representing a single percentile
     * statistic.
     * 
     * @param level the level of the percentile, must be in the range 0 - 100.
     * @param value the value of the percentile statistic.
     */
    public Percentile(double level, double value) {
        this(level, new double[]{value});
    }

    /**
     * 
     * @return the level of the percentile in the range 0 - 100;
     */
    public int getPercentileLevel() {
        return (int) (this.getLevel() * 100);
    }

    /**
     * Method that validates the level of a percentile by ensuring it is in the 
     * range of 0 - 100.
     * @param level the level to validate.
     * @return the converted level.
     */
    private static double validateLevel(double level) {
        if (level > 0.0 && level <= 100.0) {
            return level / 100.0;
        } else {
            throw new IllegalArgumentException("The level of a percentile has to be between 0 and 100");
        }
    }

}
