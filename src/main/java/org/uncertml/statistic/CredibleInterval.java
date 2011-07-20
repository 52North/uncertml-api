package org.uncertml.statistic;

/**
 * Class representing a credible interval statistic. A credible interval is comprised
 * of two quantiles, an upper and lower bound.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/CredibleInterval}
 * 
 * @see org.uncertml.statistic.Quantile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CredibleInterval implements IStatistic {

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
    public CredibleInterval(Quantile lower, Quantile upper) {
        this.lower = lower;
        this.upper = upper;
    }

    /**
     * 
     * @return the lower bound of the credible interval.
     */
    public Quantile getLower() {
        return lower;
    }

    /**
     * 
     * @return the upper bound of the credible interval.
     */
    public Quantile getUpper() {
        return upper;
    }

}
