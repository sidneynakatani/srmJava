package com.srmasset.srmtest.exception;

public class SrmValidationException extends RuntimeException {
	
	private static final long serialVersionUID = -4318179934880376094L;

	public SrmValidationException() {
		
	}
	
	public SrmValidationException(String message) {
		super(message);
	}

}
