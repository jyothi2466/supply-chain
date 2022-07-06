package com.supplier.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

public class SupplierModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7170349110684004938L;
	@NotNull(message = "Supplier Guid should not be null")
	@Size(min=2, max=40)
	private String supplierGuid;

	@NotNull(message = "company Name should not be null")
	@Size(min=2, max=20)
	private String companyName;

	@NotNull(message = "Mandantory")
	@Size(min=2, max=12)
	private String registrationNumber;

	@NumberFormat
	@Size(min=4, max=10)
	private String supplierCode;

	public SupplierModel() {

	}

	public String getSupplierGuid() {
		return supplierGuid;
	}

	public void setSupplierGuid(String supplierGuid) {
		this.supplierGuid = supplierGuid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

}
