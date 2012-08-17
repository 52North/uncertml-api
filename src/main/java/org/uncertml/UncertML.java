package org.uncertml;

import org.uncertml.distribution.IDistribution;
import org.uncertml.distribution.categorical.ICategoricalDistribution;
import org.uncertml.distribution.continuous.IContinuousDistribution;
import org.uncertml.distribution.discrete.IDiscreteDistribution;
import org.uncertml.distribution.multivariate.IMultivariateDistribution;
import org.uncertml.sample.ISample;
import org.uncertml.statistic.CategoricalStatistic;
import org.uncertml.statistic.ContinuousStatistic;
import org.uncertml.statistic.DiscreteStatistic;
import org.uncertml.statistic.IStatistic;

/**
 * A class with static helper methods to generate UncertML URLs.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UncertML {
	private static final String BASE_URI = "http://www.uncertml.org";
	private static final String SAMPLE_CLASS_POSTFIX = "Sample";
	private static final String DISTRIBUTION_PATH = "/distributions";
    private static final String STATISTIC_PATH = "/statistics";
    private static final String SAMPLE_PATH = "/samples";
    private static final String CATEGORICAL_PATH = "/categorical";
    private static final String CONTINUOUS_PATH = "/continuous";
    private static final String DISCRETE_PATH = "/discrete";
    private static final String MUTLIVARIATE_PATH = "/multivariate";
    private static final String EMPTY_STRING = "";

//    private static final String STATISTIC_POSTFIX = "Statistic";
//    private static final String CATEGORICAL_CLASS_PREFIX = "Categorical";
//    private static final String CONTINUOUS_CLASS_PREFIX = "Continuous";
//    private static final String DISCRETE_CLASS_PREFIX = "Dicrete";
//    private static final String MUTLIVARIATE_CLASS_PREFIX = "Multivariate";
    private static final String DISTRIBUTION_CLASS_POSTFIX = "Distribution";

    /**
     * A method that returns the UncertML URL for a given class.
     * @param inputClass The UncertML class to generate a URL for.
     * @return A <code>String</code> representation of an UncertML URL.
     */
    public static String getURI(Class<?> inputClass) {
        StringBuilder URL = new StringBuilder(BASE_URI);
        String className = inputClass.getSimpleName();
        if (!IUncertainty.class.isAssignableFrom(inputClass)) {
        	return null;
        }
        if (IUncertainty.class.equals(inputClass)) {
        	return URL.toString();
        } else if (IDistribution.class.isAssignableFrom(inputClass)) {
        	URL.append(DISTRIBUTION_PATH);
            if (inputClass.equals(IDistribution.class)){
            	return URL.toString();
            }
            className = className.replace(DISTRIBUTION_CLASS_POSTFIX, EMPTY_STRING);
            if (IContinuousDistribution.class.isAssignableFrom(inputClass)) {
//            	URL.append(CONTINUOUS_PATH);
            	if (IContinuousDistribution.class.equals(inputClass)) {
                	URL.append(CONTINUOUS_PATH);
            		return URL.toString();
            	}
            	
//            	className = className.replace(CONTINUOUS_CLASS_PREFIX, EMPTY_STRING);
            } else if (IDiscreteDistribution.class.isAssignableFrom(inputClass)) {
//            	URL.append(DISCRETE_PATH);
            	if (IDiscreteDistribution.class.equals(inputClass)) {
            		URL.append(DISCRETE_PATH);
            		return URL.toString();
            	}
//            	className = className.replace(DISCRETE_CLASS_PREFIX, EMPTY_STRING);
            } else if (ICategoricalDistribution.class.isAssignableFrom(inputClass)) {
//            	URL.append(CATEGORICAL_PATH);
            	if (ICategoricalDistribution.class.equals(inputClass)) {
            		URL.append(CATEGORICAL_PATH);
            		return URL.toString();
            	}
//            	className = className.replace(CATEGORICAL_CLASS_PREFIX, EMPTY_STRING);
            }
            else if (IMultivariateDistribution.class.isAssignableFrom(inputClass)) {
//            	URL.append(MUTLIVARIATE_PATH);
            	if (IMultivariateDistribution.class.equals(inputClass)) {
            		URL.append(MUTLIVARIATE_PATH);
            		return URL.toString();
            	}
//            	className = className.replace(MUTLIVARIATE_CLASS_PREFIX, EMPTY_STRING);
            }
        } else if (IStatistic.class.isAssignableFrom(inputClass)) {
        	URL.append(STATISTIC_PATH);
        	if (IStatistic.class.equals(inputClass)) {
        		return URL.toString();
        	}
            if (ContinuousStatistic.class.isAssignableFrom(inputClass)) {
//            	URL.append(CONTINUOUS_PATH);
            	if (ContinuousStatistic.class.equals(inputClass)) {
            		URL.append(CONTINUOUS_PATH);
            		return URL.toString();
            	}
//            	className = className.replace(CONTINUOUS_CLASS_PREFIX, EMPTY_STRING);
            }
            if (CategoricalStatistic.class.isAssignableFrom(inputClass)) {
//            	URL.append(CATEGORICAL_PATH);
            	if (CategoricalStatistic.class.equals(inputClass)) {
            		URL.append(CATEGORICAL_PATH);
            		return URL.toString();
            	}
//            	className = className.replace(CATEGORICAL_CLASS_PREFIX, EMPTY_STRING);
            }
            if (DiscreteStatistic.class.isAssignableFrom(inputClass)) {
//            	URL.append(DISCRETE_PATH);
            	if (DiscreteStatistic.class.equals(inputClass)) {
            		URL.append(DISCRETE_PATH);
            		return URL.toString();
            	}
//            	className = className.replace(CATEGORICAL_CLASS_PREFIX, EMPTY_STRING);
            }
//            className = className.replace(STATISTIC_POSTFIX, EMPTY_STRING);
        } else if (ISample.class.isAssignableFrom(inputClass)) {
        	URL.append(SAMPLE_PATH);
            if (ISample.class.equals(inputClass)) {
            	return URL.toString();
            }
            className = className.replace(SAMPLE_CLASS_POSTFIX, EMPTY_STRING);
        }
        
        URL.append("/").append(sluggify(className));

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
}
