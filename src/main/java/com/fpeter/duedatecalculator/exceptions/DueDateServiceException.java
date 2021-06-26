package com.fpeter.duedatecalculator.exceptions;

@SuppressWarnings("serial")
public class DueDateServiceException extends RuntimeException {

	public DueDateServiceException() {
		super();
	}

	public DueDateServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public DueDateServiceException(String message) {
		super(message);
	}

	public DueDateServiceException(Throwable cause) {
		super(cause);
	}
}
