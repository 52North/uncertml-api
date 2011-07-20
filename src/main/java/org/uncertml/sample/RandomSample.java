package org.uncertml.sample;

import java.util.List;

/**
 * Class representing a random sample comprising a set of realisations.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/RandomSample}
 * 
 * @see org.uncertml.sample.AbstractSample
 * @see org.uncertml.sample.Realisation
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class RandomSample extends AbstractSample {

    public RandomSample(Realisation[] realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public RandomSample(Realisation[] realisations) {
        super(realisations);
    }

    public RandomSample(List<Realisation> realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public RandomSample(List<Realisation> realisations) {
        super(realisations);
    }
}
