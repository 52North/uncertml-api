/**
 * Copyright 2014 52°North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
