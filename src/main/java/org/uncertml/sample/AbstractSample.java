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
    private List<Realisation> realisations;

    /**
     * Constructor that takes a <code>List</code> of realisations.
     * 
     * @see org.uncertml.sample.Realisation
     * 
     * @param realisations a list of <code>Realisation</code> objects.
     */
    public AbstractSample(List<Realisation> realisations) {
        this(realisations, null);
    }

    /**
     * Constructor that takes a <code>List</code> of realisations and a sampling
     * method description.
     * 
     * @see org.uncertml.sample.Realisation
     * 
     * @param realisations a list of <code>Realisation</code> objects.
     * @param samplingMethodDescription a String detailing the sampling method
     * used to generate the realisations within the sample.
     */
    public AbstractSample(List<Realisation> realisations, String samplingMethodDescription) {
        Validate.noNullElements(realisations);

        this.realisations = realisations;
        this.samplingMethodDescription = samplingMethodDescription;
    }

    /**
     * Constructor that takes an array of realisations.
     * 
     * @see org.uncertml.sample.Realisation
     * 
     * @param realisations an array of <code>Realisation</code> objects.
     */
    public AbstractSample(Realisation[] realisations) {
        this(Arrays.asList(realisations));
    }

    /**
     * Constructor that takes an array of realisations and a sampling
     * method description.
     * 
     * @see org.uncertml.sample.Realisation
     * 
     * @param realisations an array of <code>Realisation</code> objects.
     * @param samplingMethodDescription a String detailing the sampling method
     * used to generate the realisations within the sample.
     */
    public AbstractSample(Realisation[] realisations, String samplingMethodDescription) {
        this(Arrays.asList(realisations), samplingMethodDescription);
    }

    /**
     * 
     * @return the realisations contained within this sample.
     */
    public List<Realisation> getRealisations() {
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
