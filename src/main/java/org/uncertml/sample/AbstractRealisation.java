package org.uncertml.sample;

import org.uncertml.IUncertainty;

/**
 * Abstract class for realisations within UncertML.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Realisation}
 * 
 * @see org.uncertml.sample.RandomSample
 * @see org.uncertml.sample.SystematicSample
 * @see org.uncertml.sample.UnknownSample
 * 
 * @author Richard Jones
 * @version 2.0
 */
public class AbstractRealisation implements IUncertainty {
	
    private String id;
    private double weight;
    
    public AbstractRealisation(double weight) {
        this(weight, null);
    }
    
    public AbstractRealisation(double weight, String id) {
        this.id = id;
        this.weight = weight;
    }
    
    /**
     * 
     * @return the unique identifier of this realisation.
     */
    public String getId() {
        return id;
    }
    
    /**
     * 
     * @return the weight of this realisation.
     */
    public double getWeight() {
        return weight;
    }
}
