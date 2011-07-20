package org.uncertml.distribution.discrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing a discrete uniform distribution with number of classes parameter.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class DiscreteUniformDistribution implements IDiscreteDistribution {

    private List<Integer> numberOfClasses;

    /**
     * Constructor that takes a single number of classes parameter.
     * 
     * @param numberOfClasses the number of classes parameter. 
     */
    public DiscreteUniformDistribution(int numberOfClasses) {
        this(new int[]{numberOfClasses});
    }

    /**
     * Constructor that takes an array of integers for the number of classes parameter.
     * Each number of classes represents a unique uniform distribution. This is
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity.
     * 
     * @param numberOfClasses an array of integers representing the number of 
     * classes parameter of n uniform distributions.
     */
    public DiscreteUniformDistribution(int[] numberOfClasses) {
        this(Arrays.asList(ArrayUtils.toObject(numberOfClasses)));
    }

    /**
     * Constructor that takes a list of integers for the number of classes parameter.
     * Each number of classes represents a unique uniform distribution. This is
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. The list must not contain any null elements.
     * 
     * @param numberOfClasses a list of integers representing the number of 
     * classes parameter of n uniform distributions.
     */
    public DiscreteUniformDistribution(List<Integer> numberOfClasses) {
        Validate.notNull(numberOfClasses);
        Validate.noNullElements(numberOfClasses);
        Validate.allElementsGreaterThan(numberOfClasses, 0);
        this.numberOfClasses = new ArrayList<Integer>(numberOfClasses);
    }

    /**
     * 
     * @return the number of classes parameter of each uniform distribution represented
     * by this object.
     */
    public List<Integer> getNumberOfClasses() {
        return numberOfClasses;
    }

}
