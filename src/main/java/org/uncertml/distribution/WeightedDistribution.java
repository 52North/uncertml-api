package org.uncertml.distribution;

/**
 * A class representing a constituent distribution of a <code>MixtureModel</code>.
 * Each <code>WeightedDistribution</code> contains a <code>IDistribution</code>
 * and a weight.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class WeightedDistribution {

    private double weight;
    private IDistribution distribution;

    /**
     * Constructs a <code>WeightedDistribution</code> from a given weight and 
     * distribution.
     * 
     * @param weight the assigned weight of a distribution. A Weight ranges from
     * <code>0</code> to <code>1</code>.
     * @param distribution The UncertML distribution.
     */
    public WeightedDistribution(double weight, IDistribution distribution) {
        this.weight = weight;
        this.distribution = distribution;
    }

    /**
     * 
     * @return underlying distribution of the <code>WeightedDistribution</code>
     */
    public IDistribution getDistribution() {
        return distribution;
    }

    /**
     * 
     * @return the relative weight of the distribution.
     */
    public double getWeight() {
        return weight;
    }

}
