package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a continuous uniform distribution with minimum and maximum
 * parameters.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Uniform}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UniformDistribution implements IContinuousDistribution {

    private List<Double> minimum;
    private List<Double> maximum;

    /**
     * Constructor that takes a single minimum and maximum parameter.
     * 
     * @param minimum the minimum parameter.
     * @param maximum the maximum parameter.
     */
    public UniformDistribution(double minimum, double maximum) {
        this(new double[]{minimum}, new double[]{maximum});
    }

    /**
     * Constructor that takes an array of doubles for the minimum and maximum parameters.
     * Each minimum and maximum pair represents a unique uniform distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param minimum an array of doubles representing the minimum parameter of n
     * uniform distributions.
     * @param maximum an array of doubles representing the maximum parameter of n
     * uniform distributions.
     */
    public UniformDistribution(double[] minimum, double[] maximum) {
        this(Arrays.asList(ArrayUtils.toObject(minimum)), Arrays.asList(ArrayUtils.toObject(maximum)));
    }

    /**
     * Constructor that takes a list of doubles for the minimum and maximum parameters.
     * Each minimum and maximum pair represents a unique uniform distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The lists must be of equal length and
     * must not contain any null elements.
     * 
     * @param minimum a list of doubles representing the minimum parameter of n
     * uniform distributions.
     * @param maximum a list of doubles representing the maximum parameter of n
     * uniform distributions.
     */
    public UniformDistribution(List<Double> minimum, List<Double> maximum) {
        Validate.notNull(minimum);
        Validate.notNull(maximum);
        Validate.noNullElements(minimum);
        Validate.noNullElements(maximum);

        Validate.allListsEqualLength(new List<?>[]{minimum, maximum});

        for (int i = 0; i < minimum.size(); i++) {
            if (maximum.get(i) < minimum.get(i)) {
                // max less than min
                throw new IllegalStateException("Maximum value (" + maximum.get(i) + ") less than minimum (" + minimum.get(i) + ")");
            }
        }

        this.minimum = new ArrayList<Double>(minimum);
        this.maximum = new ArrayList<Double>(maximum);
    }

    /**
     * 
     * @return the maximum parameter of each uniform distribution represented by
     * this object.
     */
    public List<Double> getMaximum() {
        return maximum;
    }

    /**
     * 
     * @return the minimum parameter of each uniform distribution represented by
     * this object.
     */
    public List<Double> getMinimum() {
        return minimum;
    }

}
