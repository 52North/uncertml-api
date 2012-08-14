package org.uncertml.statistic;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

/**
 * Class representing a centred moment statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/CentredMoment}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CentredMoment extends Moment {

    /**
     * Constructor that takes a single integer order and double value of a centred moment
     * statistic.
     * 
     * @param order the order of the centred moment, e.g. 1st order.
     * @param value the value of the centred moment.
     */
    public CentredMoment(int order, double value) {
        this(order, new double[]{value});
    }

    /**
     * Constructor that takes a single integer order and an array of
     * doubles for the value of a centred moment statistic. Each value represents a single
     * centred moment statistic. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity.
     * 
     * @param order the order of the centred moment, e.g. 1st order.
     * @param values an array of doubles representing the value of n
     * centred moment statistics.
     */
    public CentredMoment(int order, double[] values) {
        this(order, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single integer order and a <code>List</code> of
     * doubles for the value of a centred moment statistic. Each value represents a single
     * centred moment statistic. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity.
     * 
     * @param order the order of the centred moment, e.g. 1st order.
     * @param values a <code>List</code> of doubles representing the value of n
     * centred moment statistics.
     */
    public CentredMoment(int order, List<Double> values) {
        super(order, values);
    }

}
