package org.uncertml.distribution.discrete;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a Bernoulli distribution with probability parameter.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Bernoulli}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class BernoulliDistribution implements IDiscreteDistribution {

    private List<Double> probabilities;

    /**
     * Constructor that takes a single probability parameter.
     * 
     * @param probability the probability parameter.
     */
    public BernoulliDistribution(double probability) {
        this(new double[]{probability});
    }

    /**
     * Constructor that takes an array of doubles for probability parameters. Each probability
     * represents a unique Bernoulli distribution. This is in line with the 
     * UncertML syntax whereby a collection of types can be represented by a single
     * entity.
     * 
     * @param probability an array of doubles representing the probability parameter of n
     * Bernoulli distributions.
     */
    public BernoulliDistribution(double[] probabilities) {
        this(Arrays.asList(ArrayUtils.toObject(probabilities)));
    }

    /**
     * Constructor that takes a list of doubles for probability parameters. Each probability
     * represents a unique Bernoulli distribution. This is in line with the 
     * UncertML syntax whereby a collection of types can be represented by a single
     * entity. The list must not contain any null elements.
     * 
     * @param probability a list of doubles representing the probability parameter of n
     * probability distributions.
     */
    public BernoulliDistribution(List<Double> probabilities) {

        Validate.notNull(probabilities);
        Validate.noNullElements(probabilities);

        Validate.allElementsBetween(probabilities, 0, 1);

        this.probabilities = probabilities;
    }

    /**
     * 
     * @return the probability parameter of each Bernoulli distribution represented
     * by this object.
     */
    public List<Double> getProbabilities() {
        return probabilities;
    }

}
