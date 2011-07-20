package org.uncertml.sample;

import java.util.List;

/**
 * Class representing an unknown sample comprising a set of realisations.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/UnknownSample}
 * 
 * @see org.uncertml.sample.AbstractSample
 * @see org.uncertml.sample.Realisation
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UnknownSample extends AbstractSample {

    public UnknownSample(Realisation[] realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public UnknownSample(Realisation[] realisations) {
        super(realisations);
    }

    public UnknownSample(List<Realisation> realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public UnknownSample(List<Realisation> realisations) {
        super(realisations);
    }

}
