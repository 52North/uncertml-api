package org.uncertml.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class JSONTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(JSONDistributionTestCase.class);
		suite.addTestSuite(JSONSampleTestCase.class);
		suite.addTestSuite(JSONStatisticTestCase.class);
		return suite;
	}
	
}
