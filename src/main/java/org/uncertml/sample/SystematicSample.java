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
