package com.supplier.exception;

import java.util.List;

public class ErrorResponse {

	private String status;
	private String statusCode;
	private List<String> details;

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(String status, String statusCode, List<String> details) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.details = details;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

}
