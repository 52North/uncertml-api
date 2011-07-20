package org.uncertml.statistic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a range statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Range}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Range implements IStatistic {

    private List<Double> lower;
    private List<Double> upper;

    /**
     * Constructs a range statistic from a single lower and upper bound.
     * 
     * @param lower the lower bound of the range statistic.
     * @param upper the upper bound of the range statistic.
     */
    public Range(double lower, double upper) {
        this(new double[]{lower}, new double[]{upper});
    }

    /**
     * Constructor that takes an array of doubles for lower and upper bounds. Each
     * lower and upper pair represents a single range statistic. This is in line
     * with the UncertML syntax whereby a collection of types can be represented
     * by a single entity. The arrays must be of equal length.
     * 
     * @param lower the lower bound of n range statistics.
     * @param upper the upper bound of n range statistics.
     */
    public Range(double[] lower, double[] upper) {
        this(Arrays.asList(ArrayUtils.toObject(lower)), Arrays.asList(ArrayUtils.toObject(upper)));
    }

    /**
     * Constructor that takes a <code>List</code> of doubles for lower and upper bounds. Each
     * lower and upper pair represents a single range statistic. This is in line
     * with the UncertML syntax whereby a collection of types can be represented
     * by a single entity. The arrays must be of equal length.
     * 
     * @param lower the lower bound of n range statistics.
     * @param upper the upper bound of n range statistics.
     */
    public Range(List<Double> lower, List<Double> upper) {
        Validate.notNull(lower);
        Validate.notNull(upper);
        Validate.noNullElements(lower);
        Validate.noNullElements(upper);

        Validate.allListsEqualLength(new List<?>[]{lower, upper});

        for (int i = 0; i < lower.size(); i++) {
            if (upper.get(i) < lower.get(i)) {
                // invalid
                throw new IllegalStateException("Upper bound cannot be lower then lower bound");
            }
        }

        this.lower = new ArrayList<Double>(lower);
        this.upper = new ArrayList<Double>(upper);
    }

    /**
     * 
     * @return the lower bound for all range statistics represented by this object.
     */
    public List<Double> getLower() {
        return lower;
    }

    /**
     * 
     * @return the upper bound for all range statistics represented by this object.
     */
    public List<Double> getUpper() {
        return upper;
    }

}
