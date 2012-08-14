package org.uncertml.statistic;

import java.util.List;

/**
 * Class representing a coefficient of variation statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/CoefficientOfVariation}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CoefficientOfVariation extends ContinuousStatistic {

    /**
     * Constructor that takes a single value, representing a single coefficient of variation
     * statistic.
     * 
     * @param value the value of the coefficient of variation statistic.
     */
    public CoefficientOfVariation(double value) {
        super(value);
    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single coefficient of variation statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * coefficient of variation statistics.
     */
    public CoefficientOfVariation(double[] values) {
        super(values);
    }

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single coefficient of variation statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * coefficient of variation statistics.
     */
    public CoefficientOfVariation(List<Double> values) {
        super(values);
    }
    
}
