package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing the gamma distribution with parameters shape and scale.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Gamma}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class GammaDistribution implements IContinuousDistribution {

    private List<Double> shape;
    private List<Double> scale;

    /**
     * Constructor that takes a single shape and scale parameter.
     * 
     * @param shape the shape parameter
     * @param scale the scale parameter
     */
    public GammaDistribution(double shape, double scale) {
        this(new double[]{shape}, new double[]{scale});
    }

    /**
     * Constructor that takes an array of doubles for shape and scale parameters.
     * Each shape and scale pair represents a unique gamma distribution. This is 
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. Both arrays must be of equal length and 
     * contain no null elements.
     * 
     * @param shape an array of doubles representing the shape parameter of n
     * gamma distributions.
     * @param scale an array of doubles representing the scale parameter of n 
     * gamma distributions.
     */
    public GammaDistribution(double[] shape, double[] scale) {
        this(Arrays.asList(ArrayUtils.toObject(shape)), Arrays.asList(ArrayUtils.toObject(scale)));
    }

    /**
     * Constructor that takes a list of doubles for shape and scale parameters.
     * Each shape and scale pair represents a unique gamma distribution. This is 
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. Both lists must be of equal length and 
     * contain no null elements.
     * 
     * @param shape a list of doubles representing the shape parameter of n
     * gamma distributions.
     * @param scale a list of doubles representing the scale parameter of n 
     * gamma distributions.
     */
    public GammaDistribution(List<Double> shape, List<Double> scale) {
        Validate.notNull(shape);
        Validate.notNull(scale);
        Validate.noNullElements(shape);
        Validate.noNullElements(scale);
        Validate.allElementsGreaterThan(shape, 0.0);
        Validate.allElementsGreaterThan(scale, 0.0);
        Validate.allListsEqualLength(new List<?>[]{shape, scale});
        this.shape = new ArrayList<Double>(shape);
        this.scale = new ArrayList<Double>(scale);
    }

    /**
     * 
     * @return the scale parameter of each gamma distribution represented by this
     * object.
     */
    public List<Double> getScale() {
        return scale;
    }

    /**
     * 
     * @return the shape parameter of each gamma distribution represented by this
     * object.
     */
    public List<Double> getShape() {
        return shape;
    }

}
