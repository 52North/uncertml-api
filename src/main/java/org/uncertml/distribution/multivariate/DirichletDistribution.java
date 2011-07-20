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
