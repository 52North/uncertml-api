package org.uncertml.distribution.discrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing a binomial distribution with parameters number of trials
 * and probability of success.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Binomial}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class BinomialDistribution implements IDiscreteDistribution {

    private List<Integer> numberOfTrials;
    private List<Double> probabilityOfSuccess;

    /**
     * Constructor that takes a single number of trials and probability of success
     * parameter.
     * 
     * @param numberOfTrials the number of trials parameter.
     * @param probabilityOfSuccess the probability of success parameter.
     */
    public BinomialDistribution(int numberOfTrials, double probabilityOfSuccess) {
        this(new int[]{numberOfTrials}, new double[]{probabilityOfSuccess});
    }

    /**
     * Constructor that takes an array of integers for the number of trials and 
     * an array of doubles for the probability of success parameters.
     * Each number of trials and probability of success pair represents a unique binomial distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param numberOfTrials an array of integers representing the number of trials parameter of n
     * binomial distributions.
     * @param probabilityOfSuccess an array of doubles representing the probability of success parameter of n
     * binomial distributions.
     */
    public BinomialDistribution(int[] numberOfTrials, double[] probabilityOfSuccess) {
        this(Arrays.asList(ArrayUtils.toObject(numberOfTrials)), Arrays.asList(ArrayUtils.toObject(probabilityOfSuccess)));
    }

    /**
     * Constructor that takes a list of integers for the number of trials and a 
     * list of doubles for the probability of success parameters.
     * Each number of trials and probability of success pair represents a unique binomial distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param numberOfTrials a list of integers representing the number of trials parameter of n
     * binomial distributions.
     * @param probabilityOfSuccess a list of doubles representing the probability of success parameter of n
     * binomial distributions.
     */
    public BinomialDistribution(List<Integer> numberOfTrials, List<Double> probabilityOfSuccess) {
        Validate.notNull(numberOfTrials);
        Validate.notNull(probabilityOfSuccess);
        Validate.noNullElements(numberOfTrials);
        Validate.noNullElements(probabilityOfSuccess);
        Validate.allElementsGreaterThan(numberOfTrials, 0);
        Validate.allElementsBetween(probabilityOfSuccess, 0, 1);
        Validate.allListsEqualLength(new List<?>[]{numberOfTrials, probabilityOfSuccess});
        this.numberOfTrials = new ArrayList<Integer>(numberOfTrials);
        this.probabilityOfSuccess = new ArrayList<Double>(probabilityOfSuccess);
    }

    /**
     * 
     * @return the number of trials parameter of each binomial distribution represented
     * by this object.
     */
    public List<Integer> getNumberOfTrials() {
        return numberOfTrials;
    }

    /**
     * 
     * @return the probability of success parameter of each binomial distribution
     * represented by this object.
     */
    public List<Double> getProbabilityOfSuccess() {
        return probabilityOfSuccess;
    }

}
