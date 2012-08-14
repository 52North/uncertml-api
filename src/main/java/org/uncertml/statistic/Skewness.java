package org.uncertml.statistic;

import java.util.List;

/**
 * Class representing a skewness statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Skewness}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Skewness extends ContinuousStatistic {

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single skewness statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * skewness statistics.
     */
    public Skewness(List<Double> values) {
        super(values);
    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single skewness statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * skewness statistics.
     */
    public Skewness(double[] values) {
        super(values);
    }

    /**
     * Constructor that takes a single value, representing a single skewness
     * statistic.
     * 
     * @param value the value of the skewness statistic.
     */
    public Skewness(double value) {
        super(value);
    }

}
