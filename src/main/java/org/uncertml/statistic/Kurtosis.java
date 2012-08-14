package org.uncertml.statistic;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a kurtosis statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Kurtosis}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Kurtosis extends ContinuousStatistic {

    /**
     * Constructor that takes a single value, representing a single kurtosis
     * statistic.
     * 
     * @param value the value of the kurtosis statistic.
     */
    public Kurtosis(double value) {
        this(new double[]{value});

    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single kurtosis statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * kurtosis statistics.
     */
    public Kurtosis(double[] values) {
        this(Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single kurtosis statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * kurtosis statistics.
     */
    public Kurtosis(List<Double> values) {
        super(values);
        Validate.allElementsBetween(values, -2, Double.POSITIVE_INFINITY);
    }

}
