package org.uncertml.test;


import junit.framework.TestCase;

import org.uncertml.IUncertainty;
import org.uncertml.exception.UncertaintyParserException;
import org.uncertml.io.JSONEncoder;
import org.uncertml.io.JSONParser;

public class JSONSampleTestCase extends TestCase {
	
	private JSONEncoder je;
	private JSONParser jp;
	
	public void setUp() {
		je = new JSONEncoder();
        jp = new JSONParser();
	}

	
	
	private boolean compareJSON(IUncertainty u) {
		try {
			String json = je.encode(u);
			System.out.println(json);
			IUncertainty u2 = jp.parse(json);
			String json2 = je.encode(u2);
			return json.equals(json2);
		}
		catch (UncertaintyParserException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
