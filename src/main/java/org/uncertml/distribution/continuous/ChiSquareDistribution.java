package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing the chi-square distribution with parameter degrees of freedom.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/ChiSquare}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class ChiSquareDistribution implements IContinuousDistribution {

    private List<Integer> degreesOfFreedom;

    /**
     * Constructor that takes a single degrees of freedom parameter.
     * 
     * @param degreesOfFreedom the degrees of freedom parameter.
     */
    public ChiSquareDistribution(int degreesOfFreedom) {
        this(new int[]{degreesOfFreedom});
    }

    /**
     * Constructor that takes an array of integers for degrees of freedom parameters.
     * Each degrees of freedom represents a unique chi-square distribution. This
     * is in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. The array must not contain any null elements.
     * 
     * @param degreesOfFreedom an array of integers representing the degrees of
     * freedom parameters of n chi-square distributions.
     */
    public ChiSquareDistribution(int[] degreesOfFreedom) {
        this(Arrays.asList(ArrayUtils.toObject(degreesOfFreedom)));
    }

    /**
     * Constructor that takes a list of integers for degrees of freedom parameters.
     * Each degrees of freedom represents a unique chi-square distribution. This
     * is in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. The list must not contain any null elements.
     * 
     * @param degreesOfFreedom a list of integers representing the degrees of
     * freedom parameters of n chi-square distributions.
     */
    public ChiSquareDistribution(List<Integer> degreesOfFreedom) {
        Validate.notNull(degreesOfFreedom);
        Validate.noNullElements(degreesOfFreedom);
        Validate.allElementsGreaterThan(degreesOfFreedom, 0);
        this.degreesOfFreedom = new ArrayList<Integer>(degreesOfFreedom);
    }

    /**
     * @return the degrees of freedom parameter of each chi-square distributions
     * represented by this object.
     */
    public List<Integer> getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

}
