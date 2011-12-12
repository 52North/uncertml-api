package org.uncertml.sample;

import java.util.List;

/**
 * Class representing a random sample comprising a set of realisations.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/RandomSample}
 * 
 * @see org.uncertml.sample.AbstractSample
 * @see org.uncertml.sample.AbstractRealisation
 * @see org.uncertml.sample.CategoricalRealisation
 * @see org.uncertml.sample.ContinuousRealisation
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class RandomSample extends AbstractSample {

    public RandomSample(AbstractRealisation[] realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public RandomSample(AbstractRealisation[] realisations) {
        super(realisations);
    }

    public RandomSample(List<AbstractRealisation> realisations, String samplingMethodDescription) {
        super(realisations, samplingMethodDescription);
    }

    public RandomSample(List<AbstractRealisation> realisations) {
        super(realisations);
    }
}
