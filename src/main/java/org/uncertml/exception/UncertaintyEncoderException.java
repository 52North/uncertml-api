package org.uncertml.exception;

/**
 * Class representing an encoding exception. This class wraps all common encoding
 * exceptions into a single encoding exception.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class UncertaintyEncoderException extends Exception {

    
    public UncertaintyEncoderException(Throwable cause) {
        super(cause);
    }

    public UncertaintyEncoderException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncertaintyEncoderException(String message) {
        super(message);
    }

}
