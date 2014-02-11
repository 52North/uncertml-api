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
 * Class representing a decile. A decile is a specification of a <code>Quantile</code>.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Decile}
 * 
 * @see org.uncertml.statistic.Quantile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Decile extends Quantile {

    // valid values for the level parameter.
    private static final int[] VALID_DECILES = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     * Constructs a decile from a specified level and a <code>List</code> of doubles.
     * Each double represents a single decile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level an integer level of the set of deciles represented by this object.
     * Must be in the range 1 - 9 inclusive.
     * @param values a <code>List</code> of doubles representing the value of n
     * decile statistics - each with the same level.
     */
    public Decile(int level, List<Double> values) {
        super(Decile.convertLevel(level), values);

        boolean isValid = false;
        for (int valid_level : VALID_DECILES) {
            if (valid_level == level) {
                isValid = true;
            }
        }
        if (!isValid) {
            throw new IllegalArgumentException(level + " is not a valid decile level");
        }
    }

    /**
     * Constructs a decile from a specified level and an array of doubles.
     * Each double represents a single decile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level an integer level of the set of deciles represented by this object.
     * Must be in the range 1 - 9 inclusive.
     * @param values an array of doubles representing the value of n
     * decile statistics - each with the same level.
     */
    public Decile(int level, double[] values) {
        this(level, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single level and value, representing a single decile
     * statistic.
     * 
     * @param level the level of the decile, must be in the range 1 - 9.
     * @param value the value of the decile statistic.
     */
    public Decile(int level, double value) {
        this(level, new double[]{value});
    }

    /**
     * 
     * @return the level of the decile as an integer in the range 1 - 9.
     */
    public int getDecileLevel() {
        return (int) (this.getLevel() * 100);
    }

    /**
     * Method that converts an integer level into a double representation.
     * 
     * @see org.uncertml.statistic.Quantile#level
     * 
     * @param level the integer level to convert.
     * @return a double representation of the integer level.
     */
    private static double convertLevel(int level) {
        return level / 100.0;
    }
 
}
