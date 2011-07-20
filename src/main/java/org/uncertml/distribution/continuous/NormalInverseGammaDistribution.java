package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing the normal inverse gamma distribution with mean, variance 
 * scaling, shape and scale parameters.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/NormalInverseGamma}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class NormalInverseGammaDistribution implements IContinuousDistribution {

    private List<Double> mean;
    private List<Double> varianceScaling;
    private List<Double> shape;
    private List<Double> scale;

    /**
     * Constructor that takes a single mean, variance scaling, shape and scale
     * parameter.
     * 
     * @param mean the mean parameter.
     * @param varianceScaling the variance scaling parameter.
     * @param shape the shape parameter.
     * @param scale the scale parameter.
     */
    public NormalInverseGammaDistribution(double mean, double varianceScaling, double shape, double scale) {
        this(new double[]{mean}, new double[]{varianceScaling}, new double[]{shape}, new double[]{scale});
    }

    /**
     * Constructor that takes an array of doubles for the mean, variance scaling
     * shape and scale parameters. Each shape and scale pair represents a unique 
     * normal inverse gamma distribution. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity. 
     * The arrays must be of equal length.
     * 
     * @param mean an array of doubles representing the mean parameter of n normal
     * inverse gamma distributions.
     * @param varianceScaling an array of doubles representing the variance scaling
     * parameter of n normal inverse gamma distributions.
     * @param shape an array of doubles representing the shape parameter of n
     * normal inverse gamma distributions.
     * @param scale an array of doubles representing the scale parameter of n
     * normal inverse gamma distributions.
     */
    public NormalInverseGammaDistribution(double[] mean, double[] varianceScaling, double[] shape, double[] scale) {
        this(Arrays.asList(ArrayUtils.toObject(mean)), Arrays.asList(ArrayUtils.toObject(varianceScaling)), Arrays.asList(ArrayUtils.toObject(shape)), Arrays.asList(ArrayUtils.toObject(scale)));
    }

    /**
     * Constructor that takes a list of doubles for the mean, variance scaling
     * shape and scale parameters. Each shape and scale pair represents a unique 
     * normal inverse gamma distribution. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity. 
     * The lists must be of equal length and must not contain any null elements.
     * 
     * @param mean a list of doubles representing the mean parameter of n normal
     * inverse gamma distributions.
     * @param varianceScaling a list of doubles representing the variance scaling
     * parameter of n normal inverse gamma distributions.
     * @param shape a list of doubles representing the shape parameter of n
     * normal inverse gamma distributions.
     * @param scale a list of doubles representing the scale parameter of n
     * normal inverse gamma distributions.
     */
    public NormalInverseGammaDistribution(List<Double> mean, List<Double> varianceScaling,
            List<Double> shape, List<Double> scale) {
        Validate.notNull(mean);
        Validate.notNull(varianceScaling);
        Validate.notNull(shape);
        Validate.notNull(scale);
        Validate.noNullElements(mean);
        Validate.noNullElements(varianceScaling);
        Validate.noNullElements(shape);
        Validate.noNullElements(scale);
        Validate.allElementsGreaterThan(varianceScaling, 0.0);
        Validate.allElementsGreaterThan(shape, 0.0);
        Validate.allElementsGreaterThan(scale, 0.0);
        Validate.allListsEqualLength(new List<?>[]{mean, varianceScaling, shape, scale});

        this.mean = new ArrayList<Double>(mean);
        this.varianceScaling = new ArrayList<Double>(varianceScaling);
        this.shape = new ArrayList<Double>(shape);
        this.scale = new ArrayList<Double>(scale);
    }

    /**
     * 
     * @return the scale parameter of each normal inverse gamma distribution
     * represented by this object.
     */
    public List<Double> getScale() {
        return scale;
    }

    /**
     * 
     * @return the shape parameter of each normal inverse gamma distribution
     * represented by this object.
     */
    public List<Double> getShape() {
        return shape;
    }

    /**
     * 
     * @return the variance scaling parameter of each normal inverse gamma distribution
     * represented by this object.
     */
    public List<Double> getVarianceScaling() {
        return varianceScaling;
    }

    /**
     * 
     * @return the mean parameter of each normal inverse gamma distribution represented
     * by this object.
     */
    public List<Double> getMean() {
        return this.mean;
    }

}
