package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing the F distribution with parameters denominator and numerator.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/F}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class FDistribution implements IContinuousDistribution {

    private List<Integer> denominator;
    private List<Integer> numerator;

    /**
     * Constructor that takes a single denominator and numerator parameter.
     * 
     * @param denominator the denominator parameter
     * @param numerator the numerator parameter
     */
    public FDistribution(int denominator, int numerator) {
        this(new int[]{denominator}, new int[]{numerator});
    }

    /**
     * Constructor that takes an array of integers for denominator and numerator
     * parameters. Each denominator and numerator pair represents a unique F 
     * distribution. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity. Both arrays must be of 
     * equal length and contain no null elements.
     * 
     * @param denominator an array of integers representing the denominator 
     * parameters of n F distributions.
     * @param numerator an array of doubles representing the numerator parameters 
     * of n F distributions.
     */
    public FDistribution(int[] denominator, int[] numerator) {
        this(Arrays.asList(ArrayUtils.toObject(denominator)), Arrays.asList(ArrayUtils.toObject(numerator)));
    }

    /**
     * Constructor that takes a list of integers for denominator and numerator
     * parameters. Each denominator and numerator pair represents a unique F 
     * distribution. This is in line with the UncertML syntax whereby a collection
     * of types can be represented by a single entity. Both lists must be of 
     * equal length and contain no null elements.
     * 
     * @param denominator a list of integers representing the denominator 
     * parameters of n F distributions.
     * @param numerator a list of doubles representing the numerator parameters 
     * of n F distributions.
     */
    public FDistribution(List<Integer> denominator, List<Integer> numerator) {
        Validate.notNull(denominator);
        Validate.notNull(numerator);
        Validate.noNullElements(denominator);
        Validate.noNullElements(numerator);
        Validate.allListsEqualLength(new List<?>[]{denominator, numerator});
        this.denominator = new ArrayList<Integer>(denominator);
        this.numerator = new ArrayList<Integer>(numerator);
    }

    /**
     * 
     * @return the denominator parameter of each F distribution represented by
     * this object
     */
    public List<Integer> getDenominator() {
        return denominator;
    }

    /**
     * 
     * @return the numerator parameter of each F distribution represented by
     * this object.
     */
    public List<Integer> getNumerator() {
        return numerator;
    }

    
}
