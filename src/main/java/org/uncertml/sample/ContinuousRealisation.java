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

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.uncertml.util.Validate;

/**
 * Class representing a continuous realisation.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Realisation}
 * 
 * @see org.uncertml.sample.RandomSample
 * @see org.uncertml.sample.SystematicSample
 * @see org.uncertml.sample.UnknownSample
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class ContinuousRealisation extends AbstractRealisation {

    private List<Double> values;
    private URL referenceURL;
    
    /**
     * Constructor that takes a <code>List</code> of strings as the categories of
     * the realisation.
     * 
     * @param referenceURL the reference URL of the realisation
     */
    public ContinuousRealisation(URL referenceURL) {
        this(referenceURL, Double.NaN, null);
    }
    
    /**
     * Constructor that takes a <code>List</code> of strings as the categories of
     * the realisation and a weight, used in weighted samples.
     * 
     * @param referenceURL the reference URL of the realisation
     * @param weight the weight of this realisation, between 0 - 1.
     */
    public ContinuousRealisation(URL referenceURL, double weight) {
        this(referenceURL, weight, null);
    }

    /**
     * Constructor that takes a <code>List</code> of strings as the categories of
     * the realisation, a weight used in weighted samples and an ID.
     * 
     * @param referenceURL the reference URL of the realisation
     * @param weight the weight of this realisation, between 0 - 1.
     * @param id a unique identifier for this realisation. Used to track realisations
     * through processing chains.
     */
    public ContinuousRealisation(URL referenceURL, double weight, String id) {
    	super(weight, id);
        Validate.notNull(referenceURL);        
        this.referenceURL = referenceURL;
    }
    
    /**
     * Constructor that takes a <code>List</code> of doubles as the values of
     * the realisation.
     * 
     * @param values the numeric values of a single realisation.
     */
    public ContinuousRealisation(List<Double> values) {
        this(values, Double.NaN, null);
    }

    /**
     * Constructor that takes a <code>List</code> of doubles as the values of
     * the realisation and a weight, used in weighted samples.
     * 
     * @param values the numeric values of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     */
    public ContinuousRealisation(List<Double> values, double weight) {
        this(values, weight, null);
    }

    /**
     * Constructor that takes a <code>List</code> of doubles as the values of
     * the realisation,a weight used in weighted samples and an ID.
     * 
     * @param values the numeric values of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     * @param id a unique identifier for this realisation. Used to track realisations
     * through processing chains.
     */
    public ContinuousRealisation(List<Double> values, double weight, String id) {
    	super(weight, id);
        Validate.noNullElements(values);
        this.values = values;
    }

    /**
     * Constructor that takes an array of doubles as the values of
     * the realisation.
     * 
     * @param values the numeric values of a single realisation.
     */
    public ContinuousRealisation(double[] values) {
        this(Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes an array of doubles as the values of
     * the realisation and a weight, used in weighted samples.
     * 
     * @param values the numeric values of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     */
    public ContinuousRealisation(double[] values, double weight) {
        this(Arrays.asList(ArrayUtils.toObject(values)), weight);
    }

    /**
     * Constructor that takes an array of doubles as the values of
     * the realisation,a weight used in weighted samples and an ID.
     * 
     * @param values the numeric values of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     * @param id a unique identifier for this realisation. Used to track realisations
     * through processing chains.
     */
    public ContinuousRealisation(double[] values, double weight, String id) {
        this(Arrays.asList(ArrayUtils.toObject(values)), weight, id);
    }

    /**
     * 
     * @return a <code>List</code> of doubles representing the values of this realisation.
     */
    public List<Double> getValues() {
        return values;
    }

	public URL getReferenceURL() {
		return referenceURL;
	}
	
	/**
	 * @ returns boolean if the realisation contains href attribute to a URL
	 */
	public boolean isReferenced(){
		return referenceURL!=null;
	}
		
}
