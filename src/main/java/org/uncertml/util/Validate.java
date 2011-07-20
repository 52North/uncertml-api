package org.uncertml.util;

import java.util.Collection;
import java.util.List;

/**
 * Utility class that contains static validation methods. Extends the Apache commons
 * Validate class.
 * 
 * @see org.apache.commons.lang.Validate
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Validate extends org.apache.commons.lang.Validate {

    /**
     * Method that ensures all elements of a <code>List</code> are between 2 specified values.
     * 
     * @param values the list to validate.
     * @param lower the lowest value allowed.
     * @param upper the highest value allowed.
     */
    public static void allElementsBetween(List<Double> values, double lower, double upper) {
        allElementsBetween(values, lower, upper, "All values must be between " + lower + " and " + upper);
    }

    /**
     * Method that ensures all elements of a <code>List</code> are between 2 specified values.
     * The user can specify a custom error message.
     * 
     * @param values the list to validate.
     * @param lower the lowest value allowed.
     * @param upper the highest value allowed.
     * @param message a custom message to include in the IllegalArguementException
     * when the validation fails.
     */
    public static void allElementsBetween(List<Double> values, double lower, double upper, String message) {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) < lower || values.get(i) > upper) {
                throw new IllegalArgumentException(message + ". Found: " + values.get(i));
            }
        }
    }

    /**
     * Method that ensures all supplied lists contain the same amount of elements.
     * A custom error message can be passed.
     * 
     * @param lists an array of List objects to validate.
     * @param message a custom error message to include in the IllegalArgumentException
     * when the validation fails
     */
    public static void allListsEqualLength(List<?>[] lists, String message) {
        List<?> previousList = null;
        for (List<?> l : lists) {
            if (previousList == null) {
                previousList = l;
            }
            if (l.size() != previousList.size()) {
                throw new IllegalArgumentException(message);
            }
        }
    }

    /**
     * Method that ensures all supplied lists contain the same amount of elements.
     * 
     * @param lists an array of List objects to validate.
     */
    public static void allListsEqualLength(List<?>[] lists) {
        allListsEqualLength(lists, "All parameters must have the same number of elements.");
    }

    /**
     * Method that ensures all elements of a <code>Collection</code> are greater than
     * a specified value.
     * 
     * @param values the collection to validate.
     * @param threshold the value allowed of which all elements must be greater than.
     */
    public static void allElementsGreaterThan(Collection<Integer> values, int threshold) {
        allElementsGreaterThan(values, threshold, "All values must be greater than " + threshold);
    }

    /**
     * Method that ensures all elements of a <code>Collection</code> are greater than
     * a specified value.
     * A custom error message can be supplied.
     * 
     * @param values the collection to validate.
     * @param threshold the value allowed of which all elements must be greater than.
     * @param message a custom error message to include in the IllegalArgumentException
     * when the validation fails
     */
    public static void allElementsGreaterThan(Collection<Integer> values, int threshold, String message) {
        for (int i : values) {
            if (i <= threshold) {
                throw new IllegalArgumentException(message);
            }
        }
    }

    /**
     * Method that ensures all elements of a <code>Collection</code> are greater than
     * a specified value.
     * 
     * @param values the collection to validate.
     * @param threshold the value allowed of which all elements must be greater than.
     */
    public static void allElementsGreaterThan(Collection<Double> values, double threshold) {
        allElementsGreaterThan(values, threshold, "All values must be greater than " + threshold);
    }

    /**
     * Method that ensures all elements of a <code>Collection</code> are greater than
     * a specified value.
     * A custom error message can be supplied.
     * 
     * @param values the collection to validate.
     * @param threshold the value allowed of which all elements must be greater than.
     * @param message a custom error message to include in the IllegalArgumentException
     * when the validation fails
     */
    public static void allElementsGreaterThan(Collection<Double> values, double threshold, String message) {
        for (double i : values) {
            if (i < threshold) {
                throw new IllegalArgumentException(message);
            }
        }
    }

}
