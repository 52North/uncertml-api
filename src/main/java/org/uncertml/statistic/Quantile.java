package org.uncertml.statistic;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a quantile. A quantile is the most general representation of
 * the *tiles.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Quantile}
 * 
 * @see org.uncertml.statistic.quantile
 * @see org.uncertml.statistic.Percentile
 * @see org.uncertml.statistic.Quartile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Quantile extends ContinuousStatistic implements IStatistic {

    private double level;

    /**
     * Constructor that takes a single level and value, representing a single quantile
     * statistic.
     * 
     * @param level the level of the quantile, 0 - 1.
     * @param value the value of the quantile statistic.
     */
    public Quantile(double level, double value) {
        this(level, new double[]{value});
    }

    /**
     * Constructs a quantile from a specified level and an array of doubles.
     * Each double represents a single quantile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double value representing the level of each quantile represented by
     * this object. Must be in the range 0 - 1.
     * @param values an array of doubles representing the value of n
     * quantile statistics - each with the same level.
     */
    public Quantile(double level, double[] values) {
        this(level, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructs a quantile from a specified level and a <code>List</code> of doubles.
     * Each double represents a single quantile statistic. This is in line with the
     * UncertML syntax whereby a collection of types can be represented by a single entity.
     * 
     * @param level a double value representing the level of each quantile represented by
     * this object. Must be in the range 0 - 1.
     * @param values a <code>List</code> of doubles representing the value of n
     * quantile statistics - each with the same level.
     */
    public Quantile(double level, List<Double> values) {
        super(values);
        Validate.isTrue((level >= 0 && level <= 1.0), "The level of a quantile must be between 0 and 1");
        this.level = level;
    }

    /**
     * 
     * @return the level of a quantile in the range 0 - 1.
     */
    public double getLevel() {
        return level;
    }

}
