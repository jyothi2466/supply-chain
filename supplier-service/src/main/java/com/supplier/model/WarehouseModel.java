package com.supplier.model;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class WarehouseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2924903407885671750L;

	@NotNull(message = "should not be null")
	private String warehouseGuid;

	@NotBlank(message = "Name should not be null")
	private String name;

	@NotNull(message = "Mandantory")
	private String warehouseCode;

	@NotNull(message = "should not be null")
	private List<ContactModel> contactModels;

	@NotNull(message = "should not be null")
	private LocationModel locationModel;

	@NotNull(message = "should not be null")
	private String supplierGuid;

	public WarehouseModel() {

	}

	public String getWarehouseGuid() {
		return warehouseGuid;
	}

	public void setWarehouseGuid(String warehouseGuid) {
		this.warehouseGuid = warehouseGuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public List<ContactModel> getContactModels() {
		return contactModels;
	}

	public void setContactModels(List<ContactModel> contactModels) {
		this.contactModels = contactModels;
	}

	public LocationModel getLocationModel() {
		return locationModel;
	}

	public void setLocationModel(LocationModel locationModel) {
		this.locationModel = locationModel;
	}

	

	/**
	 * @return the supplierGuid
	 */
	public String getSupplierGuid() {
		return supplierGuid;
	}

	/**
	 * @param supplierGuid the supplierGuid to set
	 */
	public void setSupplierGuid(String supplierGuid) {
		this.supplierGuid = supplierGuid;
	}

	@Override
	public String toString() {
		return "WarehouseModel [warehouseGuid=" + warehouseGuid + ", name=" + name + ", warehouseCode=" + warehouseCode
				+ ", contactModels=" + contactModels + ", locationModel=" + locationModel + ", getWarehouseGuid()="
				+ getWarehouseGuid() + ", getName()=" + getName() + ", getWarehouseCode()=" + getWarehouseCode()
				+ ", getContactModels()=" + getContactModels() + ", getLocationModel()=" + getLocationModel()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
