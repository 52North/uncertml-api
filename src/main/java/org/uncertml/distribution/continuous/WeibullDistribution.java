package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing a Weibull distribution with parameters scale and shape.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Weibull}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class WeibullDistribution implements IContinuousDistribution {

    private List<Double> scale;
    private List<Double> shape;

    /**
     * Constructor that takes a single scale and shape parameter.
     * 
     * @param scale the scale parameter.
     * @param shape the shape parameter.
     */
    public WeibullDistribution(double scale, double shape) {
        this(new double[]{scale}, new double[]{shape});

    }

    /**
     * Constructor that takes an array of doubles for the scale and shape parameters.
     * Each scale and shape pair represents a unique Weibull distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param scale an array of doubles representing the scale parameter of n
     * Weibull distributions.
     * @param shape an array of doubles representing the shape parameter of n
     * Weibull distributions.
     */
    public WeibullDistribution(double[] scale, double[] shape) {
        this(Arrays.asList(ArrayUtils.toObject(scale)), Arrays.asList(ArrayUtils.toObject(shape)));
    }

    /**
     * Constructor that takes a list of doubles for the scale and shape parameters.
     * Each scale and shape pair represents a unique Weibull distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The lists must be of equal length and
     * must not contain any null elements.
     * 
     * @param scale a list of doubles representing the scale parameter of n
     * Weibull distributions.
     * @param shape a list of doubles representing the shape parameter of n
     * Weibull distributions.
     */
    public WeibullDistribution(List<Double> scale, List<Double> shape) {

        Validate.notNull(shape);
        Validate.notNull(scale);

        Validate.noNullElements(shape);
        Validate.noNullElements(scale);

        Validate.allElementsGreaterThan(shape, 0.0);
        Validate.allElementsGreaterThan(scale, 0.0);

        Validate.allListsEqualLength(new List<?>[]{scale, shape});

        this.shape = new ArrayList<Double>(shape);
        this.scale = new ArrayList<Double>(scale);
    }

    /**
     * 
     * @return the scale parameter of each Weibull distribution represented 
     * by this object.
     */
    public List<Double> getScale() {
        return scale;
    }

    /**
     * 
     * @return the shape parameter of each Weibull distribution represented
     * by this object.
     */
    public List<Double> getShape() {
        return shape;
    }

}
