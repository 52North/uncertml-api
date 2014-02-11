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

import org.uncertml.statistic.CovarianceMatrix;
import org.uncertml.util.Validate;

/**
 * Class representing a multivariate Student T distribution with parameters
 * mean, covariance matrix and degrees of freedom.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/MultivariateStudentT}
 * 
 * @see org.uncertml.statistic.CovarianceMatrix
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class MultivariateStudentTDistribution implements IMultivariateDistribution {

    private List<Double> mean;
    private CovarianceMatrix covarianceMatrix;
    private List<Integer> degreesOfFreedom;

    /**
     * Constructor that takes an array of doubles for the mean parameter, a covariance
     * matrix and an array of integers for the degrees of freedom parameter. Each
     * mean and degrees of freedom pair represents a marginal distribution. The 
     * arrays must be of equal length and the covariance matrix must contain n^2
     * values where n is the length of the arrays.
     * 
     * @param mean an array of doubles representing the mean parameter of n marginal
     * Student T distributions.
     * @param covarianceMatrix a covariance matrix.
     * @param degreesOfFreedom an array of integers representing the degrees of
     * freedom of n marginal Student T distributions.
     */
    public MultivariateStudentTDistribution(double[] mean, CovarianceMatrix covarianceMatrix, int[] degreesOfFreedom) {
        this(Arrays.asList(ArrayUtils.toObject(mean)), covarianceMatrix, Arrays.asList(ArrayUtils.toObject(degreesOfFreedom)));
    }

    /**
     * Constructor that takes a list of doubles for the mean parameter, a covariance
     * matrix and a list of integers for the degrees of freedom parameter. Each
     * mean and degrees of freedom pair represents a marginal distribution. The 
     * lists must be of equal length and the covariance matrix must contain n^2
     * values where n is the length of the lists. The lists must not contain any
     * null elements.
     * 
     * @param mean a list of doubles representing the mean parameter of n marginal
     * Student T distributions.
     * @param covarianceMatrix a covariance matrix.
     * @param degreesOfFreedom a list of integers representing the degrees of
     * freedom of n marginal Student T distributions.
     */
    public MultivariateStudentTDistribution(List<Double> mean, CovarianceMatrix covarianceMatrix, List<Integer> degreesOfFreedom) {

        Validate.notNull(mean);
        Validate.notNull(covarianceMatrix);
        Validate.notNull(degreesOfFreedom);
        Validate.noNullElements(mean);
        Validate.noNullElements(degreesOfFreedom);

        Validate.allElementsGreaterThan(degreesOfFreedom, 0);

        Validate.allListsEqualLength(new List<?>[]{mean, degreesOfFreedom});

        if (mean.size() != covarianceMatrix.getDimension()) {
            // illegal state
            throw new IllegalStateException("Covariance matrix dimension should equate to number of means. Found: " + mean.size() + " means but " + covarianceMatrix.getDimension() + " dimensions in covariance matrix");
        }

        if (Math.pow(mean.size(), 2) != covarianceMatrix.getValues().size()) {
            // illegal state
            throw new IllegalStateException("Covariance matrix should have n^2 values. Found: " + mean.size() + " and " + covarianceMatrix.getValues().size());
        }

        this.mean = new ArrayList<Double>(mean);
        this.covarianceMatrix = covarianceMatrix;
        this.degreesOfFreedom = new ArrayList<Integer>(degreesOfFreedom);
    }

    /**
     * 
     * @return the covariance matrix.
     * @see org.uncertml.statistic.CovarianceMatrix
     */
    public CovarianceMatrix getCovarianceMatrix() {
        return covarianceMatrix;
    }

    /**
     * 
     * @return the degrees of freedom parameter of each marginal distribution 
     * represented by this multivariate distribution.
     */
    public List<Integer> getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

    /**
     * 
     * @return the mean parameter of each marginal distribution represented by this
     * multivariate distribution.
     */
    public List<Double> getMean() {
        return this.mean;
    }

}
