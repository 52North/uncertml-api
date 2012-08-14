package org.uncertml.statistic;

import java.util.List;

/**
 * Class representing a mode statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Mode}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Mode extends ContinuousStatistic {

    /**
     * Constructor that takes a single value, representing a single mode
     * statistic.
     * 
     * @param value the value of the mode statistic.
     */
    public Mode(double value) {
        super(value);
    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single mode statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * mode statistics.
     */
    public Mode(double[] values) {
        super(values);
    }

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single mode statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * mode statistics.
     */
    public Mode(List<Double> values) {
        super(values);
    }

}
