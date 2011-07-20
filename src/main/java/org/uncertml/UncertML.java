package org.uncertml;

import java.util.HashMap;

/**
 * A class with static helper methods to generate UncertML URLs.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UncertML {

    public static final String BASE_URI = "http://www.uncertml.org/";
    public static final String DISTRIBUTION_URI = BASE_URI + "distributions/";
    public static final String STATISTIC_URI = BASE_URI + "statistics/";
    public static final String SAMPLE_URI = BASE_URI + "samples/";
    // Map of class names to urls for special cases
    private static HashMap<String, String> SPECIAL_CASES = null;

    /**
     * A method that returns the UncertML URL for a given class.
     * @param inputClass The UncertML class to generate a URL for.
     * @return A <code>String</code> representation of an UncertML URL.
     */
    public static String getURI(Class inputClass) {
        loadSpecialCases();
        StringBuilder URL = new StringBuilder();

        String packageName = inputClass.getPackage().getName();
        String className = inputClass.getSimpleName();

        // check for special cases.
        if (SPECIAL_CASES.containsKey(className)) {
            return SPECIAL_CASES.get(className);
        }

        if (packageName.contains("org.uncertml.distribution")) {
            URL.append(DISTRIBUTION_URI);
            // process the class name - remove Distribution
            className = className.replace("Distribution", "");
        } else if (packageName.contains("org.uncertml.statistic")) {
            URL.append(STATISTIC_URI);
        } else if (packageName.contains("org.uncertml.sample")) {
            URL.append(SAMPLE_URI);
            // process class name - remove Sample
            className = className.replace("Sample", "");
        } else {
            // not an identified class, return null
            return null;
        }
        URL.append(sluggify(className));

        return URL.toString();
    }

    /**
     * Helper method that converts simple class names to a URL-friendly format.
     * For example, <code>ChiSquareDistribution</code> is converted to 
     * <code>chi-square</code>
     * 
     * @param input The class name, as a <code>String</code> to convert.
     * @return A <code>String</code> representation of a URL-friendly class name.
     */
    private static String sluggify(String input) {
        StringBuilder result = new StringBuilder();
        char[] characters = input.toCharArray();
        // first char should always be lower case
        characters[0] = Character.toLowerCase(characters[0]);
        for (char c : characters) {
            // if character is upper case (new word)
            if (Character.isUpperCase(c)) {
                // insert hypen
                result.append("-");
                // convert to lower case
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * Helper method that populates a <code>HashMap</code> with special case URLs
     * that cannot be inferred directly from the class name.
     */
    private static void loadSpecialCases() {
        if (SPECIAL_CASES == null) {
            SPECIAL_CASES = new HashMap<String, String>();
            SPECIAL_CASES.put("CategoricalUniformDistribution", DISTRIBUTION_URI + "uniform");
            SPECIAL_CASES.put("DiscreteUniformDistribution", DISTRIBUTION_URI + "uniform");
            SPECIAL_CASES.put("CategoricalMode", STATISTIC_URI + "mode");
        }
    }

}
