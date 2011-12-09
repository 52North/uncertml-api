package org.uncertml.sample;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.uncertml.IUncertainty;
import org.uncertml.util.Validate;

/**
 * Class representing a realisation. A realisation is comprised of a set of double
 * values, a String identifier and a double weight value, which is optional. The
 * realisation class is used by all UncertML sample types.
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
public class Realisation implements IUncertainty {

    private List<Double> values;
    private String id;
    private double weight;

    /**
     * Constructor that takes a <code>List</code> of doubles as the values of
     * the realisation.
     * 
     * @param values the numeric values of a single realisation.
     */
    public Realisation(List<Double> values) {
        this(values, Double.NaN, null);
    }

    /**
     * Constructor that takes a <code>List</code> of doubles as the values of
     * the realisation and a weight, used in weighted samples.
     * 
     * @param values the numeric values of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     */
    public Realisation(List<Double> values, double weight) {
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
    public Realisation(List<Double> values, double weight, String id) {
        Validate.noNullElements(values);

        this.values = values;
        this.id = id;
        this.weight = weight;
    }

    /**
     * Constructor that takes an array of doubles as the values of
     * the realisation.
     * 
     * @param values the numeric values of a single realisation.
     */
    public Realisation(double[] values) {
        this(Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes an array of doubles as the values of
     * the realisation and a weight, used in weighted samples.
     * 
     * @param values the numeric values of a single realisation.
     * @param weight the weight of this realisation, between 0 - 1.
     */
    public Realisation(double[] values, double weight) {
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
    public Realisation(double[] values, double weight, String id) {
        this(Arrays.asList(ArrayUtils.toObject(values)), weight, id);
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
     * @return a <code>List</code> of doubles representing the values of this realisation.
     */
    public List<Double> getValues() {
        return values;
    }

    /**
     * 
     * @return the weight of this realisation.
     */
    public double getWeight() {
        return weight;
    }
}
