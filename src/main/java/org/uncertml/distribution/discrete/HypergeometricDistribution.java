package org.uncertml.distribution.discrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing a hypergeometric distribution with parameters number of trials,
 * number of successes and population size.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Hypergeometric}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class HypergeometricDistribution implements IDiscreteDistribution {

    private List<Integer> numberOfTrials;
    private List<Integer> numberOfSuccesses;
    private List<Integer> populationSize;

    /**
     * Constructor that takes a single number of trials, number of successes and
     * population size parameter.
     * 
     * @param numberOfTrials the number of trials parameter.
     * @param numberOfSuccesses the number of successes parameter.
     * @param populationSize the population size parameter.
     */
    public HypergeometricDistribution(int numberOfTrials, int numberOfSuccesses, int populationSize) {
        this(new int[]{numberOfTrials}, new int[]{numberOfSuccesses}, new int[]{populationSize});
    }

    /**
     * Constructor that takes an array of integers for the number of trials, 
     * number of successes and population size parameters. Each number of trials,
     * number of successes and population size represents a unique hypergeometric
     * distribution. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity. The arrays must be of equal length.
     * 
     * @param numberOfTrials an array of integers representing the number of trials parameter of n
     * hypergeometric distributions.
     * @param numberOfSuccesses an array of integers representing the number of successes parameter of n
     * hypergeometric distributions.
     * @param populationSize an array of integers representing the population size
     * parameter of n hypergeometric distributions.
     */
    public HypergeometricDistribution(int[] numberOfTrials, int[] numberOfSuccesses, int[] populationSize) {
        this(Arrays.asList(ArrayUtils.toObject(numberOfTrials)), Arrays.asList(ArrayUtils.toObject(numberOfSuccesses)), Arrays.asList(ArrayUtils.toObject(populationSize)));
    }

    /**
     * Constructor that takes a list of integers for the number of trials, 
     * number of successes and population size parameters. Each number of trials,
     * number of successes and population size represents a unique hypergeometric
     * distribution. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity. The lists must be of equal length
     * and must not contain any null elements.
     * 
     * @param numberOfTrials a list of integers representing the number of trials parameter of n
     * hypergeometric distributions.
     * @param numberOfSuccesses a list of integers representing the number of successes parameter of n
     * hypergeometric distributions.
     * @param populationSize a list of integers representing the population size
     * parameter of n hypergeometric distributions.
     */
    public HypergeometricDistribution(List<Integer> numberOfTrials,
            List<Integer> numberOfSuccesses, List<Integer> populationSize) {
        Validate.notNull(numberOfTrials);
        Validate.notNull(numberOfSuccesses);
        Validate.notNull(populationSize);
        Validate.noNullElements(numberOfTrials);
        Validate.noNullElements(numberOfSuccesses);
        Validate.noNullElements(populationSize);
        Validate.allElementsGreaterThan(numberOfTrials, 0);
        Validate.allElementsGreaterThan(numberOfSuccesses, -1);
        Validate.allElementsGreaterThan(populationSize, 0);
        Validate.allListsEqualLength(new List<?>[]{numberOfTrials, numberOfSuccesses, populationSize});

        for (int i = 0; i < numberOfSuccesses.size(); i++) {
            if (numberOfSuccesses.get(i) > numberOfTrials.get(i)) {
                // invalid
                throw new IllegalStateException("Number of successes cannot be greater than number of trials");
            }
        }

        this.numberOfTrials = new ArrayList<Integer>(numberOfTrials);
        this.numberOfSuccesses = new ArrayList<Integer>(numberOfSuccesses);
        this.populationSize = new ArrayList<Integer>(populationSize);
    }

    /**
     * 
     * @return the number of successes parameter for each hypergeometric distribution
     * represented by this object.
     */
    public List<Integer> getNumberOfSuccesses() {
        return numberOfSuccesses;
    }

    /**
     * 
     * @return the number of trials parameter for each hypergeometric distribution
     * represented by this object.
     */
    public List<Integer> getNumberOfTrials() {
        return numberOfTrials;
    }

    /**
     * 
     * @return the population size parameter for each hypergeometric distribution
     * represented by this object.
     */
    public List<Integer> getPopulationSize() {
        return populationSize;
    }

}
