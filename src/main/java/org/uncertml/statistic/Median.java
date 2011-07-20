package org.uncertml.statistic;

import java.util.List;

/**
 * Class representing a median statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Median}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Median extends ContinuousStatistic implements IStatistic {

    /**
     * Constructor that takes a single value, representing a single median
     * statistic.
     * 
     * @param value the value of the median statistic.
     */
    public Median(double value) {
        super(value);
    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single median statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * median statistics.
     */
    public Median(double[] values) {
        super(values);
    }

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single median statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * median statistics.
     */
    public Median(List<Double> values) {
        super(values);
    }
}
