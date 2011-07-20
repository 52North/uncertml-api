package org.uncertml.distribution.multivariate;

import org.apache.commons.lang.Validate;
import org.uncertml.statistic.CovarianceMatrix;

/**
 * Class representing the Wishart distribution with parameters degrees of freedom
 * and scale matrix.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Wishart}
 * 
 * @see org.uncertml.statistic.CovarianceMatrix
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class WishartDistribution implements IMultivariateDistribution {

    private double degreesOfFreedom;
    private CovarianceMatrix scaleMatrix;

    /**
     * Constructor that takes a single degrees of freedom parameter and scale
     * matrix.
     * 
     * @param degreesOfFreedom the degrees of freedom parameter.
     * @param scaleMatrix a scale matrix.
     */
    public WishartDistribution(double degreesOfFreedom, CovarianceMatrix scaleMatrix) {
        this.degreesOfFreedom = degreesOfFreedom;
        this.scaleMatrix = scaleMatrix;

        Validate.notNull(degreesOfFreedom);
        Validate.notNull(scaleMatrix);

        if (Math.pow(scaleMatrix.getDimension(), 2) != scaleMatrix.getValues().size()) {
            // illegal state
            throw new IllegalStateException("Scale matrix should have n^2 values.");
        }

    }

    /**
     * 
     * @return the degrees of freedom parameter.
     */
    public double getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

    /**
     * 
     * @return the scale matrix parameter.
     * @see org.uncertml.statistic.CovarianceMatrix
     */
    public CovarianceMatrix getScaleMatrix() {
        return scaleMatrix;
    }

}
