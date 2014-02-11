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
package org.uncertml.sample;

import java.util.Arrays;
import java.util.List;

import org.uncertml.util.Validate;

/**
 * Class representing a categorical realisation.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Realisation}
 * 
 * @see org.uncertml.sample.RandomSample
 * @see org.uncertml.sample.SystematicSample
 * @see org.uncertml.sample.UnknownSample
 * 
 * @author Richard Jones
 * @version 2.0
 */
public class CategoricalRealisation extends AbstractRealisation {

    private List<String> categories;

    /**
     * Constructor that takes a <code>List</code> of strings as the categories of
     * the realisation.
     * 
     * @param categories the string categories of a single realisation.
     */
    public CategoricalRealisation(List<String> categories) {
        this(categories, Double.NaN, null);
    }

    /**
     * Constructor that takes a <code>List</code> of strings as the categories of
     * the realisation and a weight, used in weighted samples.
     * 
     * @param categories the string categories of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     */
    public CategoricalRealisation(List<String> categories, double weight) {
        this(categories, weight, null);
    }

    /**
     * Constructor that takes a <code>List</code> of strings as the categories of
     * the realisation, a weight used in weighted samples and an ID.
     * 
     * @param categories the string categories of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     * @param id a unique identifier for this realisation. Used to track realisations
     * through processing chains.
     */
    public CategoricalRealisation(List<String> categories, double weight, String id) {
    	super(weight, id);
        Validate.noNullElements(categories);        
        this.categories = categories;
    }

    /**
     * Constructor that takes an array of strings as the categories of
     * the realisation.
     * 
     * @param categories the string categories of a single realisation.
     */
    public CategoricalRealisation(String[] categories) {
        this(Arrays.asList(categories));
    }

    /**
     * Constructor that takes an array of strings as the categories of
     * the realisation and a weight, used in weighted samples.
     * 
     * @param categories the string categories of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     */
    public CategoricalRealisation(String[] categories, double weight) {
        this(Arrays.asList(categories), weight);
    }

    /**
     * Constructor that takes an array of strings as the categories of
     * the realisation, a weight used in weighted samples and an ID.
     * 
     * @param categories the string categories of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     * @param id a unique identifier for this realisation. Used to track realisations
     * through processing chains.
     */
    public CategoricalRealisation(String[] categories, double weight, String id) {
        this(Arrays.asList(categories), weight, id);
    }

    /**
     * 
     * @return a <code>List</code> of strings representing the categories of this realisation.
     */
    public List<String> getCategories() {
        return categories;
    }
}
