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
