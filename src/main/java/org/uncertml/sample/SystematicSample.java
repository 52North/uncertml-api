package org.uncertml.sample;

import java.util.List;

/**
 * Class representing a systematic sample comprising a set of realisations.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/SystematicSample}
 * 
 * @see org.uncertml.sample.AbstractSample
 * @see org.uncertml.sample.Realisation
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class SystematicSample extends AbstractSample {

    public SystematicSample(Realisation[] realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public SystematicSample(Realisation[] realisations) {
        super(realisations);
    }

    public SystematicSample(List<Realisation> realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public SystematicSample(List<Realisation> realisations) {
        super(realisations);
    }

}
