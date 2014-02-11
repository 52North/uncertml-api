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


/**
 * Abstract class for realisations within UncertML.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Realisation}
 * 
 * @see org.uncertml.sample.RandomSample
 * @see org.uncertml.sample.SystematicSample
 * @see org.uncertml.sample.UnknownSample
 * 
 * @author Richard Jones
 * @version 2.0
 */
public abstract class AbstractRealisation implements ISample {
	
    private String id;
    private double weight;
    
    public AbstractRealisation(double weight) {
        this(weight, null);
    }
    
    public AbstractRealisation(double weight, String id) {
        this.id = id;
        this.weight = weight;
    }
    
    /**
     * 
     * @return the unique identifier of this realisation.
     */
    public String getId() {
        return id;
    }
    
    /**
     * 
     * @return the weight of this realisation.
     */
    public double getWeight() {
        return weight;
    }
}
