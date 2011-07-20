package org.uncertml.distribution.multivariate;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a multinomial distribution with parameters number of trials
 * and probabilities.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Multinomial}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class MultinomialDistribution implements IMultivariateDistribution {

    private int numberOfTrials;
    private List<Double> probabilities;

    /**
     * Constructor taking a single number of trials and an array of doubles for
     * the probabilities.
     * 
     * @param numberOfTrials the number of trials parameter.
     * @param probabilities an array of doubles representing the probabilities parameter.
     */
    public MultinomialDistribution(int numberOfTrials, double[] probabilities) {
        this(numberOfTrials, Arrays.asList(ArrayUtils.toObject(probabilities)));
    }

    /**
     * Constructor taking a single number of trials and a list of doubles for
     * the probabilities.
     * 
     * @param numberOfTrials the number of trials parameter.
     * @param probabilities a list of doubles representing the probabilities parameter.
     */
    public MultinomialDistribution(int numberOfTrials, List<Double> probabilities) {

        Validate.notNull(probabilities);
        Validate.allElementsBetween(probabilities, 0, 1);

        this.numberOfTrials = numberOfTrials;
        this.probabilities = probabilities;
    }

    /**
     * 
     * @return the number of trials parameter.
     */
    public int getNumberOfTrials() {
        return numberOfTrials;
    }

    /**
     * 
     * @return the probabilities parameter.
     */
    public List<Double> getProbabilities() {
        return probabilities;
    }
}
