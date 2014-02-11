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
package org.uncertml.distribution.multivariate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing a Dirichlet distribution with concentration parameter.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Dirichlet}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class DirichletDistribution implements IMultivariateDistribution {

    private List<Double> concentration;

    /**
     * Constructor that takes a single concentration parameter.
     * 
     * @param concentration the concentration parameter.
     */
    public DirichletDistribution(double concentration) {
        this(new double[]{concentration});
    }

    /**
     * Constructor that takes an array of doubles for the concentration parameter.
     * 
     * @param concentration an array of doubles representing the concentration
     * parameter.
     */
    public DirichletDistribution(double[] concentration) {
        this(Arrays.asList(ArrayUtils.toObject(concentration)));
    }

    /**
     * Constructor that takes a list of doubles for the concentration parameter.
     * 
     * @param concentration a list of doubles representing the concentration
     * parameter.
     */
    public DirichletDistribution(List<Double> concentration) {
        Validate.notNull(concentration);
        Validate.noNullElements(concentration);
        Validate.allElementsGreaterThan(concentration, 0.0);

        this.concentration = new ArrayList<Double>(concentration);
    }

    /**
     * 
     * @return the concentration parameter.
     */
    public List<Double> getConcentration() {
        return concentration;
    }

}
