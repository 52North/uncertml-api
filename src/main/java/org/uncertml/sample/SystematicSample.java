package org.uncertml.sample;

import java.util.List;

/**
 * Class representing a systematic sample comprising a set of realisations.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/SystematicSample}
 * 
 * @see org.uncertml.sample.AbstractSample
 * @see org.uncertml.sample.AbstractRealisation
 * @see org.uncertml.sample.CategoricalRealisation
 * @see org.uncertml.sample.ContinuousRealisation
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class SystematicSample extends AbstractSample {

    public SystematicSample(AbstractRealisation[] realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public SystematicSample(AbstractRealisation[] realisations) {
        super(realisations);
    }

    public SystematicSample(List<AbstractRealisation> realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public SystematicSample(List<AbstractRealisation> realisations) {
        super(realisations);
    }

}
