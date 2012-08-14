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
