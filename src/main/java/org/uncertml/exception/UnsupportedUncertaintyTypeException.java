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
package org.uncertml.exception;

/**
 * Exception for any unsupported uncertainty types found while parsing or encoding.
 * Typical causes are malformed XML or JSON encodings.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UnsupportedUncertaintyTypeException extends UncertaintyException {
	private static final long serialVersionUID = 218854110740288606L;

	public UnsupportedUncertaintyTypeException(Throwable cause) {
        super(cause);
    }

    public UnsupportedUncertaintyTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedUncertaintyTypeException(String message) {
        super(message);
    }

    public UnsupportedUncertaintyTypeException() {
    }
	
}
