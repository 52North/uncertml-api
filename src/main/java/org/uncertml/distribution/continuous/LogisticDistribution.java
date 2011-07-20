package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing a logistic distribution with parameters location and scale.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Logistic}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class LogisticDistribution implements IContinuousDistribution {

    private List<Double> location;
    private List<Double> scale;

    /**
     * Constructor that takes a single location and scale parameter.
     * 
     * @param location the location parameter.
     * @param scale the scale parameter.
     */
    public LogisticDistribution(double location, double scale) {
        this(new double[]{location}, new double[]{scale});
    }

    /**
     * Constructor that takes an array of doubles for the location and scale parameters.
     * Each location and scale pair represents a unique logistic distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The arrays must be of equal length.
     * 
     * @param location an array of doubles representing the location parameter of n
     * logistic distributions.
     * @param scale an array of doubles representing the scale parameter of n
     * logistic distributions.
     */
    public LogisticDistribution(double[] location, double[] scale) {
        this(Arrays.asList(ArrayUtils.toObject(location)), Arrays.asList(ArrayUtils.toObject(scale)));
    }

    /**
     * Constructor that takes a list of doubles for the location and scale parameters.
     * Each location and scale pair represents a unique logistic distribution.
     * This is in line with the UncertML syntax whereby a collection of types can
     * be represented by a single entity. The lists must be of equal length and
     * must not contain any null elements.
     * 
     * @param location a list of doubles representing the location parameter of n
     * logistic distributions.
     * @param scale a list of doubles representing the scale parameter of n
     * logistic distributions.
     */
    public LogisticDistribution(List<Double> location, List<Double> scale) {
        Validate.notNull(location);
        Validate.notNull(scale);
        Validate.noNullElements(location);
        Validate.noNullElements(scale);
        Validate.allElementsGreaterThan(scale, 0.0);
        Validate.allListsEqualLength(new List<?>[]{location, scale});
        this.location = new ArrayList<Double>(location);
        this.scale = new ArrayList<Double>(scale);
    }

    /**
     * 
     * @return the location parameter of each logistic distribution represented
     * by this object.
     */
    public List<Double> getLocation() {
        return location;
    }

    /**
     * 
     * @return the scale parameter of each logistic distribution represented by
     * this object.
     */
    public List<Double> getScale() {
        return scale;
    }

}
