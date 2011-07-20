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
public class CategoricalMode implements IStatistic {

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
