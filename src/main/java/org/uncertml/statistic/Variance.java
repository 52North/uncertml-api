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
 * Class representing a variance statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Variance}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Variance extends ContinuousStatistic {

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single variance statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * variance statistics.
     */
    public Variance(List<Double> values) {
        super(values);
        Validate.allElementsGreaterThan(values, 0);
    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single variance statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * variance statistics.
     */
    public Variance(double[] values) {
        this(Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single value, representing a single variance
     * statistic.
     * 
     * @param value the value of the variance statistic.
     */
    public Variance(double value) {
        this(new double[]{value});
    }

}
