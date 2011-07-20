package org.uncertml.exception;

/**
 * Exception for any unsupported uncertainty types found while parsing or encoding.
 * Typical causes are malformed XML or JSON encodings.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UnsupportedUncertaintyTypeException extends Exception {

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
