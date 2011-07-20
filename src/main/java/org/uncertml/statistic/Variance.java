package org.uncertml.statistic;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a variance statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Variance}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Variance extends ContinuousStatistic implements IStatistic {

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single variance statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * variance statistics.
     */
    public Variance(List<Double> values) {
        super(values);
        Validate.allElementsGreaterThan(values, 0);
    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single variance statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * variance statistics.
     */
    public Variance(double[] values) {
        this(Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single value, representing a single variance
     * statistic.
     * 
     * @param value the value of the variance statistic.
     */
    public Variance(double value) {
        this(new double[]{value});
    }

}
