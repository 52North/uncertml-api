package org.uncertml.sample;

import java.util.List;

/**
 * Class representing an unknown sample comprising a set of realisations.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/UnknownSample}
 * 
 * @see org.uncertml.sample.AbstractSample
 * @see org.uncertml.sample.AbstractRealisation
 * @see org.uncertml.sample.CategoricalRealisation
 * @see org.uncertml.sample.ContinuousRealisation
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UnknownSample extends AbstractSample {

    public UnknownSample(AbstractRealisation[] realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public UnknownSample(AbstractRealisation[] realisations) {
        super(realisations);
    }

    public UnknownSample(List<AbstractRealisation> realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public UnknownSample(List<AbstractRealisation> realisations) {
        super(realisations);
    }

}
