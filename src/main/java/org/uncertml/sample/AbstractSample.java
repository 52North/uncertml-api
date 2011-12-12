package org.uncertml.sample;

import java.util.Arrays;
import java.util.List;

import org.uncertml.util.Validate;

/**
 * Abstract class for samples within UncertML.
 * 
 * @see org.uncertml.sample.RandomSample
 * @see org.uncertml.sample.SystematicSample
 * @see org.uncertml.sample.UnknownSample
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public abstract class AbstractSample implements ISample {

    private String samplingMethodDescription;
    private List<AbstractRealisation> realisations;

    /**
     * Constructor that takes a <code>List</code> of realisations.
     * 
     * @see org.uncertml.sample.AbstractRealisation
     * @see org.uncertml.sample.CategoricalRealisation
     * @see org.uncertml.sample.ContinuousRealisation
     *  
     * @param realisations a list of <code>Realisation</code> objects.
     */
    public AbstractSample(List<AbstractRealisation> realisations) {
        this(realisations, null);
    }

    /**
     * Constructor that takes a <code>List</code> of realisations and a sampling
     * method description.
     * 
     * @see org.uncertml.sample.AbstractRealisation
     * @see org.uncertml.sample.CategoricalRealisation
     * @see org.uncertml.sample.ContinuousRealisation
     * 
     * @param realisations a list of <code>Realisation</code> objects.
     * @param samplingMethodDescription a String detailing the sampling method
     * used to generate the realisations within the sample.
     */
    public AbstractSample(List<AbstractRealisation> realisations, String samplingMethodDescription) {
        Validate.noNullElements(realisations);

        this.realisations = realisations;
        this.samplingMethodDescription = samplingMethodDescription;
    }

    /**
     * Constructor that takes an array of realisations.
	 *
     * @see org.uncertml.sample.AbstractRealisation
     * @see org.uncertml.sample.CategoricalRealisation
     * @see org.uncertml.sample.ContinuousRealisation
     * 
     * @param realisations an array of <code>Realisation</code> objects.
     */
    public AbstractSample(AbstractRealisation[] realisations) {
        this(Arrays.asList(realisations));
    }

    /**
     * Constructor that takes an array of realisations and a sampling
     * method description.
     * 
     * @see org.uncertml.sample.AbstractRealisation
     * 
     * @param realisations an array of <code>Realisation</code> objects.
     * @param samplingMethodDescription a String detailing the sampling method
     * used to generate the realisations within the sample.
     */
    public AbstractSample(AbstractRealisation[] realisations, String samplingMethodDescription) {
        this(Arrays.asList(realisations), samplingMethodDescription);
    }

    /**
     * 
     * @return the realisations contained within this sample.
     */
    public List<AbstractRealisation> getRealisations() {
        return realisations;
    }

    /**
     * 
     * @return the description of the sampling method used to generate the realisations.
     * Returns null if the sampling method descriptions is unknown.
     */
    public String getSamplingMethodDescription() {
        return samplingMethodDescription;
    }
    
}
