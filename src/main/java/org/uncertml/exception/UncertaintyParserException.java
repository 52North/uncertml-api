package org.uncertml.exception;

/**
 * Class representing a parsing exception. This class wraps all common parsing exceptions
 * into a single encoding exception.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UncertaintyParserException extends UncertaintyException {
	private static final long serialVersionUID = -77603656670033925L;

	public UncertaintyParserException(Throwable cause) {
        super(cause);
    }

    public UncertaintyParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncertaintyParserException(String message) {
        super(message);
    }

    public UncertaintyParserException() {
    }

    

}
