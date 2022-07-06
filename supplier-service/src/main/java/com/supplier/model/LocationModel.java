package com.supplier.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class LocationModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4123375607486138703L;

	@NotNull(message = "should not be null")
	private String locationGuid;

	@NotNull(message = "should not be null")
	private String area;

	@NotNull(message = "should not be null")
	private String locationCode;

	@NotNull(message = "should not be null")
	private AddressModel addressModel;

	public LocationModel() {
	}

	public String getLocationGuid() {
		return locationGuid;
	}

	public void setLocationGuid(String locationGuid) {
		this.locationGuid = locationGuid;
	}

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

}
