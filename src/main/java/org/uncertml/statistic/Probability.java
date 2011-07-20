package org.uncertml.statistic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import org.uncertml.util.Validate;

/**
 * Class that represents a continuous probability statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Probability}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Probability extends ContinuousStatistic implements IStatistic {

    private List<ProbabilityConstraint> constraints;

    /**
     * Constructs a probability statistic from a single constraint and value.
     * 
     * @see org.uncertml.statistic.ProbabilityConstraint
     * 
     * @param constraint the probability constraint of this statistic.
     * @param value the value of this probability statistic.
     */
    public Probability(ProbabilityConstraint constraint, double value) {
        this(Arrays.asList(constraint), Arrays.asList(value));
    }

    /**
     * Constructor that takes an array of probability constraints and doubles as values.
     * Each double represents a single probability statistic. This is in line with
     * the UncertML syntax whereby a collection of types can be represented by a
     * single entity.
     * 
     * @param constraints the constraints that each probability statistic represented 
     * by this object must satisfy.
     * @param values an array of doubles representing the value of n probability
     * statistics.
     */
    public Probability(ProbabilityConstraint[] constraints, double[] values) {
        this(Arrays.asList(constraints), Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single probability constraint and an array of doubles as values.
     * Each double represents a single probability statistic. This is in line with
     * the UncertML syntax whereby a collection of types can be represented by a
     * single entity.
     * 
     * @param constraint the constraint that each probability statistic represented 
     * by this object must satisfy.
     * @param values an array of doubles representing the value of n probability
     * statistics.
     */
    public Probability(ProbabilityConstraint constraint, double[] values) {
        this(constraint, Arrays.asList(ArrayUtils.toObject(values)));
    }

    /**
     * Constructor that takes a single probability constraint and a <code>List</code> of doubles as values.
     * Each double represents a single probability statistic. This is in line with
     * the UncertML syntax whereby a collection of types can be represented by a
     * single entity.
     * 
     * @param constraint the constraint that each probability statistic represented 
     * by this object must satisfy.
     * @param values a <code>List</code> of doubles representing the value of n probability
     * statistics.
     */
    public Probability(ProbabilityConstraint constraint, List<Double> values) {
        this(Arrays.asList(constraint), values);
    }

    /**
     * Constructor that takes a <code>List</code> of probability constraints and doubles as values.
     * Each double represents a single probability statistic. This is in line with
     * the UncertML syntax whereby a collection of types can be represented by a
     * single entity.
     * 
     * @param constraints the constraints that each probability statistic represented 
     * by this object must satisfy.
     * @param values a <code>List</code> of doubles representing the value of n probability
     * statistics.
     */
    public Probability(List<ProbabilityConstraint> constraints, List<Double> values) {
        super(values);
        this.constraints = new ArrayList<ProbabilityConstraint>(constraints);
        Validate.notNull(constraints);
        Validate.noNullElements(constraints);

        Validate.allElementsBetween(values, 0, 1);

        Validate.isTrue(constraints.size() <= 2);

        boolean isGreaterThan = false;
        boolean isLessThan = false;

        // validate constraints
        for (ProbabilityConstraint c : constraints) {
            switch (c.getType()) {
                case GREATER_OR_EQUAL:
                    if (isGreaterThan) {
                        throw new IllegalArgumentException("Cannot have both GREATER_THAN and GREATER_OR_EQUAL constraints");
                    }
                    isGreaterThan = true;
                    break;
                case GREATER_THAN:
                    if (isGreaterThan) {
                        throw new IllegalArgumentException("Cannot have both GREATER_THAN and GREATER_OR_EQUAL constraints");
                    }
                    isGreaterThan = true;
                    break;
                case LESS_THAN:
                    if (isLessThan) {
                        throw new IllegalArgumentException("Cannot have both LESS_THAN and LESS_OR_EQUAL constraints");
                    }
                    isLessThan = true;
                    break;

                case LESS_OR_EQUAL:
                    if (isLessThan) {
                        throw new IllegalArgumentException("Cannot have both LESS_THAN and LESS_OR_EQUAL constraints");
                    }
                    isLessThan = true;
                    break;
            }
        }
    }

    /**
     * Constructor that takes a <code>List</code> of constraints and a single value.
     * 
     * @param constraints the constraints that this probability statistic must satisfy.
     * @param value the value of the probability statistic.
     */
    public Probability(List<ProbabilityConstraint> constraints, double value) {
        this(constraints, Arrays.asList(value));
    }

    /**
     * Constructor that takes an array of constraints and a single value.
     * 
     * @param constraints the constraints that this probability statistic must satisfy.
     * @param value the value of the probability statistic.
     */
    public Probability(ProbabilityConstraint[] constraints, double value) {
        this(Arrays.asList(constraints), value);
    }

    /**
     * 
     * @return The list of constraints placed on the probability statistics represented
     * by this object.
     */
    public List<ProbabilityConstraint> getConstraints() {
        return constraints;
    }

}
