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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing an interquartile range statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/InterquartileRange}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class InterquartileRange implements IStatistic {

    private List<Double> lower;
    private List<Double> upper;

    /**
     * Constructor that takes a single lower and upper value for a single interquartile
     * range statistic.
     * 
     * @param lower the lower value of the range.
     * @param upper the upper value of the range.
     */
    public InterquartileRange(double lower, double upper) {
        this(new double[]{lower}, new double[]{upper});
    }

    /**
     * Constructor that takes an array of doubles for the lower and upper bounds.
     * Each lower and upper pair represents a single interquartile range statistic.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param lower an array of doubles representing the lower value of n interquartile
     * range statistics.
     * @param upper an array of doubles representing the upper value of n interquartile
     * range statistics.
     */
    public InterquartileRange(double[] lower, double[] upper) {
        this(Arrays.asList(ArrayUtils.toObject(lower)), Arrays.asList(ArrayUtils.toObject(upper)));
    }

    /**
     * Constructor that takes a <code>List</code> of doubles for the lower and upper bounds.
     * Each lower and upper pair represents a single interquartile range statistic.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The lists must be of equal length and 
     * must not contain any null elements.
     * 
     * @param lower a <code>List</code> of doubles representing the lower value of n interquartile
     * range statistics.
     * @param upper a <code>List</code> of doubles representing the upper value of n interquartile
     * range statistics.
     */
    public InterquartileRange(List<Double> lower, List<Double> upper) {
        Validate.notNull(lower);
        Validate.notNull(upper);
        Validate.noNullElements(lower);
        Validate.noNullElements(upper);

        Validate.allListsEqualLength(new List<?>[]{lower, upper});

        for (int i = 0; i < lower.size(); i++) {
            if (upper.get(i) < lower.get(i)) {
                // invalid
                throw new IllegalStateException("Upper bound cannot be lower then lower bound");
            }
        }

        this.lower = new ArrayList<Double>(lower);
        this.upper = new ArrayList<Double>(upper);
    }

    /**
     * 
     * @return the lower value of each interquartile range statistic represented
     * by this object.
     */
    public List<Double> getLower() {
        return lower;
    }

    /**
     * 
     * @return the upper value of each interquartile range statistic represented
     * by this object.
     */
    public List<Double> getUpper() {
        return upper;
    }

}
