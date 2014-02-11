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
 * Abstract class representing a continuous statistic. A continuous statistic is
 * one that has an array of doubles as its values.
 * 
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public abstract class ContinuousStatistic implements IStatistic {

    private List<Double> values;

    /**
     * Constructor that takes a single value to represent a single continuous
     * statistic.
     * 
     * @param value the value of the continuous statistic.
     */
    public ContinuousStatistic(double value) {
        this(new double[]{value});
    }

    /**
     * Constructor that takes an array of doubles for the values of a continuous
     * statistic. Each value represents a single continuous statistic. This is in
     * line with the UncertML syntax whereby a collection of types can be represented
     * by a single entity.
     * 
     * @param values an array of doubles representing the values of n continuous
     * statistics.
     */
    public ContinuousStatistic(double[] values) {
        this(Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a <code>List</code> of doubles for the values of a continuous
     * statistic. Each value represents a single continuous statistic. This is in
     * line with the UncertML syntax whereby a collection of types can be represented
     * by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the values of n continuous
     * statistics.
     */
    public ContinuousStatistic(List<Double> values) {
        Validate.notNull(values);
        Validate.noNullElements(values);
        this.values = new ArrayList<Double>(values);
    }

    /**
     * 
     * @return the value of each continuous statistic represented by this object.
     */
    public List<Double> getValues() {
        return this.values;
    }

}
