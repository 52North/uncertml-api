package org.uncertml.exception;

/**
 * Super class for UncertML IO exceptions.
 * 
 * @author Christian Autermann
 * @since 2.0.6
 * 
 */
public class UncertaintyException extends Exception {
	private static final long serialVersionUID = 1699722036716359418L;

	public UncertaintyException(Throwable cause) {
		super(cause);
	}

	public UncertaintyException(String message, Throwable cause) {
		super(message, cause);
	}

	public UncertaintyException(String message) {
		super(message);
	}

	public UncertaintyException() {}

}
