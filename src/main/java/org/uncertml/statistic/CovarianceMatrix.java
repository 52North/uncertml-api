package org.uncertml.statistic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a covariance matrix.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/CovarianceMatrix}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CovarianceMatrix implements IStatistic {

    private int dimension;
    private List<Double> values;

    /**
     * Constructor that takes a dimension and an array of values. There should be
     * dimension^2 values in the covariance matrix.
     * 
     * @param dimension the dimension of the covariance matrix.
     * @param values the values of the covariance matrix.
     */
    public CovarianceMatrix(int dimension, double[] values) {
        this(dimension, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a dimension and a <code>List</code> of values. There should be
     * dimension^2 values in the covariance matrix.
     * 
     * @param dimension the dimension of the covariance matrix.
     * @param values the values of the covariance matrix.
     */
    public CovarianceMatrix(int dimension, List<Double> values) {

        Validate.notNull(values);
        Validate.noNullElements(values);
        Validate.isTrue(dimension > 0);
        Validate.isTrue(dimension * dimension == values.size(), "There should be n^2 values in the covariance matrix where n is the dimension");


        this.dimension = dimension;
        this.values = new ArrayList<Double>(values);
    }

    /**
     * 
     * @return the dimension of the covariance matrix.
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * 
     * @return the values of the covariance matrix.
     */
    public List<Double> getValues() {
        return values;
    }

}
