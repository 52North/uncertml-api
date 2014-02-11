/**
 * Copyright 2014 52°North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uncertml.test;


import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.uncertml.IUncertainty;
import org.uncertml.exception.UncertaintyParserException;
import org.uncertml.io.JSONEncoder;
import org.uncertml.io.JSONParser;
import org.uncertml.sample.CategoricalRealisation;
import org.uncertml.sample.ContinuousRealisation;

public class JSONSampleTestCase extends TestCase {
	
	private JSONEncoder je;
	private JSONParser jp;
	
	public void setUp() {
		je = new JSONEncoder();
        jp = new JSONParser();
	}

    public void testCategoricalRealisation() {
        CategoricalRealisation r = new CategoricalRealisation(Arrays.asList(new String[]{ "hello", "howdy", "hello", "hi", "hey"}), 0.5, "an_id");
        Assert.assertTrue(compareJSON(r));
    }
    
    public void testContinuousRealisation() {
        ContinuousRealisation r = new ContinuousRealisation(Arrays.asList(new Double[]{ 1.2, 3.2, 1.5, 2.0 }), 0.5, "an_id");
        Assert.assertTrue(compareJSON(r));
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
