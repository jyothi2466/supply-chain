package com.supplier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the supplier database table.
 * 
 */
@Entity
@Table(name="supplier",schema="supplier_schema")
@NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "supplier_guid")
	private String supplierGuid;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "registration_number")
	private String registrationNumber;

	@Column(name = "supplier_code")
	private String supplierCode;

	public Supplier() {
	}

	public String getSupplierGuid() {
		return this.supplierGuid;
	}

	public void setSupplierGuid(String supplierGuid) {
		this.supplierGuid = supplierGuid;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

}