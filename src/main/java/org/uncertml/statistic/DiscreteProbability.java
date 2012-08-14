package org.uncertml.statistic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class that represents a discrete probability. I.e., the probability that a discrete
 * event will occur.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/DiscreteProbability}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class DiscreteProbability extends DiscreteStatistic {

    private List<String> categories;
    private List<Double> probability;

    /**
     * Constructor that takes a single category and a probability that event will
     * occur.
     * 
     * @param category the category or event.
     * @param probability the probability the category or event occurs.
     */
    public DiscreteProbability(String category, double probability) {
        this(new String[]{category}, new double[]{probability});
    }

    /**
     * Constructor that takes an array of Strings as categories or events and an
     * array of doubles for the probabilities. Each category and probability pair
     * represents a unique discrete probability. This is in line with the UncertML
     * syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param categories an array of Strings representing the category of n discrete
     * probabilities.
     * @param probabilities an array of doubles representing the probability of an
     * event occurring for n discrete probabilities.
     */
    public DiscreteProbability(String[] categories, double[] probabilities) {
        this(Arrays.asList(categories), Arrays.asList(ArrayUtils.toObject(probabilities)));
    }

    /**
     * Constructor that takes a <code>List</code> of Strings as categories or events and an
     * array of doubles for the probabilities. Each category and probability pair
     * represents a unique discrete probability. This is in line with the UncertML
     * syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param categories a <code>List</code> of Strings representing the category of n discrete
     * probabilities.
     * @param probabilities a <code>List</code> of doubles representing the probability of an
     * event occurring for n discrete probabilities.
     */
    public DiscreteProbability(List<String> categories, List<Double> probabilities) {
        Validate.notNull(categories);
        Validate.notNull(probabilities);
        Validate.noNullElements(categories);
        Validate.noNullElements(probabilities);

        Validate.allListsEqualLength(new List<?>[]{categories, probabilities});

        Validate.allElementsBetween(probabilities, 0, 1);

        this.categories = new ArrayList<String>(categories);
        this.probability = new ArrayList<Double>(probabilities);
    }

    /**
     * 
     * @return a <code>List</code> of Strings representing the category of each
     * discrete probability represented by this object.
     */
    public List<String> getCategory() {
        return categories;
    }

    /**
     * 
     * @return a <code>List</code> of doubles representing the probability of an
     * event occurring for each discrete probability represented by this object.
     */
    public List<Double> getProbability() {
        return probability;
    }

}
