package org.uncertml.distribution.multivariate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.statistic.CovarianceMatrix;
import org.uncertml.util.Validate;

/**
 * Class representing a multivariate normal distribution with parameters mean and
 * covariance matrix.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/MultivariateNormal}
 * 
 * @see org.uncertml.statistic.CovarianceMatrix
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class MultivariateNormalDistribution implements IMultivariateDistribution {

    private List<Double> mean;
    private CovarianceMatrix covarianceMatrix;

    /**
     * Constructor that takes an array of doubles representing the mean parameters
     * and a covariance matrix. Each mean parameter represents a marginal normal
     * distribution. The covariance matrix should contain n^2 elements where n is
     * the size of the array.
     * 
     * @param mean an array of doubles representing the mean parameter of n marginal
     * distributions.
     * @param covarianceMatrix a covariance matrix.
     */
    public MultivariateNormalDistribution(double[] mean, CovarianceMatrix covarianceMatrix) {
        this(Arrays.asList(ArrayUtils.toObject(mean)), covarianceMatrix);
    }

    /**
     * Constructor that takes a list of doubles representing the mean parameters
     * and a covariance matrix. Each mean parameter represents a marginal normal
     * distribution. The covariance matrix should contain n^2 elements where n is
     * the size of the list. The list should not contain any null elements.
     * 
     * @param mean a list of doubles representing the mean parameter of n marginal
     * distributions.
     * @param covarianceMatrix a covariance matrix.
     */
    public MultivariateNormalDistribution(List<Double> mean, CovarianceMatrix covarianceMatrix) {
        Validate.notNull(mean);
        Validate.notNull(covarianceMatrix);
        Validate.noNullElements(mean);

        if (mean.size() != covarianceMatrix.getDimension()) {
            // illegal state
            throw new IllegalStateException("Covariance matrix dimension should equate to number of means. Found: " + mean.size() + " means but " + covarianceMatrix.getDimension() + " dimensions in covariance matrix");
        }

        if (Math.pow(mean.size(), 2) != covarianceMatrix.getValues().size()) {
            // illegal state
            throw new IllegalStateException("Covariance matrix should have n^2 values. Found: " + mean.size() + " and " + covarianceMatrix.getValues().size());
        }

        this.mean = new ArrayList<Double>(mean);
        this.covarianceMatrix = covarianceMatrix;
    }

    /**
     * 
     * @return the covariance matrix.
     * @see org.uncertml.statistic.CovarianceMatrix
     */
    public CovarianceMatrix getCovarianceMatrix() {
        return covarianceMatrix;
    }

    /**
     * 
     * @return the mean parameter of each marginal distribution represented by
     * this multivariate distribution.
     */
    public List<Double> getMean() {
        return this.mean;
    }

}
