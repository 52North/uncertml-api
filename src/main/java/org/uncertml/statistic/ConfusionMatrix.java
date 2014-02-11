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
 * Class representing a confusion matrix.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/ConfusionMatrix}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class ConfusionMatrix implements IStatistic {

    private List<String> sourceCategories;
    private List<String> targetCategories;
    private List<Integer> counts;

    /**
     * Constructor that takes an array of categories and counts. The source and
     * target categories are assumed to the same. There should be categories^2 count values.
     * 
     * @param categories the categories (both source and target) of the confusion matrix.
     * @param counts the counts for each transition from source to target categories.
     */
    public ConfusionMatrix(String[] categories, int[] counts) {
        this(Arrays.asList(categories), Arrays.asList(ArrayUtils.toObject(counts)));
    }

    /**
     * Constructor that takes a <code>List</code> of categories and counts. The source and
     * target categories are assumed to the same. There should be categories^2 count values.
     * 
     * @param categories the categories (both source and target) of the confusion matrix.
     * @param counts the counts for each transition from source to target categories.
     */
    public ConfusionMatrix(List<String> categories, List<Integer> counts) {
        // source and target categories are the same.
        this(categories, categories, counts);
    }

    /**
     * Constructor that takes an array of source and target categories and counts. 
     * There should be source categories * target categories count values.
     * 
     * @param categories the categories (both source and target) of the confusion matrix.
     * @param counts the counts for each transition from source to target categories.
     */
    public ConfusionMatrix(String[] sourceCategories, String[] targetCategories, int[] counts) {
        this(Arrays.asList(sourceCategories), Arrays.asList(targetCategories), Arrays.asList(ArrayUtils.toObject(counts)));
    }

    /**
     * Constructor that takes a <code>List</code> of source and target categories and counts. 
     * There should be source categories * target categories count values.
     * 
     * @param categories the categories (both source and target) of the confusion matrix.
     * @param counts the counts for each transition from source to target categories.
     */
    public ConfusionMatrix(List<String> sourceCategories, List<String> targetCategories, List<Integer> counts) {
        Validate.notNull(sourceCategories);
        Validate.notNull(targetCategories);
        Validate.notNull(counts);
        Validate.noNullElements(sourceCategories);
        Validate.noNullElements(targetCategories);
        Validate.noNullElements(counts);
        Validate.allElementsGreaterThan(counts, 0);

        if (sourceCategories.size() * targetCategories.size() != counts.size()) {
            // invalid
            throw new IllegalStateException("There should be n^2 probabilities, where n is the number of categories");
        }

        this.sourceCategories = new ArrayList<String>(sourceCategories);
        this.targetCategories = new ArrayList<String>(targetCategories);
        this.counts = new ArrayList<Integer>(counts);
    }

    /**
     * 
     * @return the list of counts for the confusion matrix.
     */
    public List<Integer> getCounts() {
        return counts;
    }

    /**
     * 
     * @return the source categories of the confusion matrix.
     */
    public List<String> getSourceCategories() {
        return sourceCategories;
    }

    /**
     * 
     * @return the target categories of the confusion matrix.
     */
    public List<String> getTargetCategories() {
        return targetCategories;
    }

    /**
     * 
     * @return the counts represented as probabilities.
     */
    public List<Double> getProbabilities() {
        int sum = 0;
        for (Integer i : counts) {
            sum += i;
        }
        List<Double> probabilities = new ArrayList<Double>();
        for (Integer i : counts) {
            probabilities.add((double) i / sum);
        }

        return probabilities;
    }

}
