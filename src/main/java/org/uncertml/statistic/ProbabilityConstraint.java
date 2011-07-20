package org.uncertml.statistic;

/**
 * Class representing a constraint on a continuous probability. A constraint
 * consists of a type (i.e., greater than, less than etc) and a value.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class ProbabilityConstraint {

    private ConstraintType type;
    private double value;

    /**
     * Constructs a constraint from a <code>ConstraintType</code> and value.
     * 
     * @param type the constraint type, e.g. less than.
     * @param value the value that the constraint must satisfy.
     */
    public ProbabilityConstraint(ConstraintType type, double value) {
        this.type = type;
        this.value = value;
    }

    /**
     * 
     * @return the constraint type, e.g. less than.
     */
    public ConstraintType getType() {
        return type;
    }

    /**
     * 
     * @return the value the constraint must satisfy.
     */
    public double getValue() {
        return value;
    }

}
