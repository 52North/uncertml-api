package org.uncertml.statistic;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a moment statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Moment}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Moment extends ContinuousStatistic implements IStatistic {

    private int order;

    /**
     * Constructor that takes a single integer order and a <code>List</code> of
     * doubles for the value of a moment statistic. Each value represents a single
     * moment statistic. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity.
     * 
     * @param order the order of the moment, e.g. 1st order.
     * @param values a <code>List</code> of doubles representing the value of n
     * moment statistics.
     */
    public Moment(int order, List<Double> values) {
        super(values);
        Validate.isTrue(order > 0);
        this.order = order;
    }

    /**
     * Constructor that takes a single integer order and an array of
     * doubles for the value of a moment statistic. Each value represents a single
     * moment statistic. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity.
     * 
     * @param order the order of the moment, e.g. 1st order.
     * @param values an array of doubles representing the value of n
     * moment statistics.
     */
    public Moment(int order, double[] values) {
        this(order, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single integer order and double value of a moment
     * statistic.
     * 
     * @param order the order of the moment, e.g. 1st order.
     * @param value the value of the moment.
     */
    public Moment(int order, double value) {
        this(order, new double[]{value});
    }

    /**
     * 
     * @return the order of the moment, e.g. 1st order.
     */
    public int getOrder() {
        return order;
    }

}
