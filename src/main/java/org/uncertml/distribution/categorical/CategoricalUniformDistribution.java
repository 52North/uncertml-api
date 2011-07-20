package org.uncertml.distribution.categorical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a uniform distribution of categorical values. Also called a
 * Categorical distribution, it represents the result of a random event that can take
 * on one of k outcomes.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CategoricalUniformDistribution implements ICategoricalDistribution {

    private List<Integer> numberOfClasses;

    /**
     * Constructor that takes a number representing the number of outcomes. The
     * probabilities can be inferred as it is uniformly distributed.
     * 
     * @param numberOfClasses the number of possible classes or categories of the
     * distribution.
     */
    public CategoricalUniformDistribution(int numberOfClasses) {
        this(new int[]{numberOfClasses});
    }

    /**
     * Constructor that takes an array of integers, each representing a unique
     * <code>CategoricalUniformDistribution</code>. This is in line with the UncertML
     * syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param numberOfClasses an array of integers representing the number of
     * classes for each unique categorical distribution.
     */
    public CategoricalUniformDistribution(int[] numberOfClasses) {
        this(Arrays.asList(ArrayUtils.toObject(numberOfClasses)));
    }

    /**
     * Constructor that takes a <code>List</code> of integers, each representing
     * a unique <code>CategoricalUniformDistribution</code>. This is in line with 
     * the UncertML syntax whereby a collection of types can be represented by a
     * single entity.
     * 
     * @param numberOfClasses a <code>List</code> of integers representing the 
     * number of classes for each unique categorical distribution.
     */
    public CategoricalUniformDistribution(List<Integer> numberOfClasses) {
        Validate.notNull(numberOfClasses, "Number of classes cannot be empty");
        Validate.noNullElements(numberOfClasses);
        Validate.allElementsGreaterThan(numberOfClasses, 0);
        this.numberOfClasses = new ArrayList<Integer>(numberOfClasses);
    }

    /**
     * 
     * @return a <code>List</code> of integers representing the number of classes
     * for each of the categorical distributions represented by the object.
     */
    public List<Integer> getNumberOfClasses() {
        return numberOfClasses;
    }

}
