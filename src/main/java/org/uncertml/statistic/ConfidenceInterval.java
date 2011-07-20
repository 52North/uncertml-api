package org.uncertml.statistic;

/**
 * Class representing a confidence interval statistic. A confidence interval is comprised
 * of two quantiles, an upper and lower bound.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/ConfidenceInterval}
 * 
 * @see org.uncertml.statistic.Quantile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class ConfidenceInterval implements IStatistic {

    private Quantile lower;
    private Quantile upper;

    /**
     * Constructor that takes a lower and upper bound, represented as quantiles.
     * 
     * @see org.uncertml.statistic.Quantile
     * 
     * @param lower the lower bound, represented as a <code>Quantile</code>.
     * @param upper the upper bound, represented as a <code>Quantile</code>.
     */
    public ConfidenceInterval(Quantile lower, Quantile upper) {
        this.lower = lower;
        this.upper = upper;
    }

    /**
     * 
     * @return the lower bound of the confidence interval.
     */
    public Quantile getLower() {
        return lower;
    }

    /**
     * 
     * @return the upper bound of the confidence interval.
     */
    public Quantile getUpper() {
        return upper;
    }

}
