package com.supplier.exception;

public class SupplierNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7041363517503395052L;

	public SupplierNotFoundException() {

	}

	public SupplierNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public SupplierNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public SupplierNotFoundException(String message) {
		super(message);

	}

	public SupplierNotFoundException(Throwable cause) {
		super(cause);

	}

}
