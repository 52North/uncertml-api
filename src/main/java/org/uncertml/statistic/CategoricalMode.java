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
import org.uncertml.util.Validate;

/**
 * Class representing a categorical mode statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Mode}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CategoricalMode extends CategoricalStatistic {

    private List<String> category;

    /**
     * Constructor that takes a single category, representing a single categorical mode
     * statistic.
     * 
     * @param category the category of the categorical mode statistic.
     */
    public CategoricalMode(String category) {
        this(new String[]{category});
    }

    /**
     * Constructor that takes an array of Strings. Each category represents
     * a single categorical mode statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param categories an array of Strings representing the category of n
     * categorical mode statistics.
     */
    public CategoricalMode(String[] categories) {
        this(Arrays.asList(categories));
    }

    /**
     * Constructor that takes a <code>List</code> of Strings. Each category represents
     * a single categorical mode statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param categories a <code>List</code> of Strings representing the category of n
     * categorical mode statistics.
     */
    public CategoricalMode(List<String> categories) {
        Validate.notNull(categories);
        Validate.noNullElements(categories);
        this.category = new ArrayList<String>(categories);
    }

    /**
     * 
     * @return a <code>List</code> of Strings representing the categories of n
     * categorical mode statistics.
     */
    public List<String> getCategory() {
        return category;
    }

}
