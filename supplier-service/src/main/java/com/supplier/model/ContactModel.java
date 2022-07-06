package com.supplier.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ContactModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5196942917373179267L;

	@NotNull(message = "should not be null")
	private String contactGuid;

	@NotNull(message = "should not be null")
	private String value;

	@NotNull(message = "should not be null")
	private int contactTypeId;

	/*
	 * @NotNull(message = "should not be null") private WarehouseModel
	 * warehouseModel
	 */;

	public ContactModel() {

	}

	public String getContactGuid() {
		return contactGuid;
	}

	public void setContactGuid(String contactGuid) {
		this.contactGuid = contactGuid;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the contactTypeId
	 */
	public int getContactTypeId() {
		return contactTypeId;
	}

	/**
	 * @param contactTypeId the contactTypeId to set
	 */
	public void setContactTypeId(int contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	/*
	 * public WarehouseModel getWarehouseModel() { return warehouseModel; }
	 * 
	 * public void setWarehouseModel(WarehouseModel warehouseModel) {
	 * this.warehouseModel = warehouseModel; }
	 */

}
