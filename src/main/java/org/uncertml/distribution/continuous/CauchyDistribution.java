package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class representing the Cauchy distribution with parameters location and scale.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Cauchy}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CauchyDistribution implements IContinuousDistribution {

    private List<Double> location;
    private List<Double> scale;

    /**
     * Constructor that takes a single location and scale parameter.
     * 
     * @param location the location parameter
     * @param scale the scale parameter
     */
    public CauchyDistribution(double location, double scale) {
        this(new double[]{location}, new double[]{scale});
    }

    /**
     * Constructor that takes an array of doubles for location and scale parameters.
     * Each location and scale pair represents a unique Cauchy distribution. This is 
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. Both arrays must be of equal length and 
     * contain no null elements.
     * 
     * @param location an array of doubles representing the location parameter of n
     * Cauchy distributions.
     * @param scale an array of doubles representing the scale parameter of n 
     * Cauchy distributions.
     */
    public CauchyDistribution(double[] location, double[] scale) {
        this(Arrays.asList(ArrayUtils.toObject(location)), Arrays.asList(ArrayUtils.toObject(scale)));
    }

    /**
     * Constructor that takes a list of doubles for location and scale parameters.
     * Each location and scale pair represents a unique Cauchy distribution. This is 
     * in line with the UncertML syntax whereby a collection of types can be 
     * represented by a single entity. Both lists must be of equal length and 
     * contain no null elements.
     * 
     * @param location a list of doubles representing the location parameter of n
     * Cauchy distributions.
     * @param scale a list of doubles representing the scale parameter of n 
     * Cauchy distributions.
     */
    public CauchyDistribution(List<Double> location, List<Double> scale) {
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
     * @return the location parameter of each Cauchy distributions represented
     * by this object.
     */
    public List<Double> getLocation() {
        return location;
    }

    /**
     * @return the scale parameter of each Cauchy distributions represented
     * by this object.
     */
    public List<Double> getScale() {
        return scale;
    }

}
