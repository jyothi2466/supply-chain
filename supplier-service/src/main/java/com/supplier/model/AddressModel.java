package com.supplier.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class AddressModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2888079326440057175L;

	@NotNull(message = "should not be null")
	private String addressGuid;

	@NotNull(message = "should not be null")
	private String addressLine1;

	@NotNull(message = "should not be null")
	private String addressLine2;

	@NotNull(message = "should not be null")
	private String city;

	@NotNull(message = "should not be null")
	private String country;

	@NotNull(message = "should not be null")
	private String postalCode;

	@NotNull(message = "should not be null")
	private String state;

	/*
	 * @NotNull(message = "should not be null") private LocationModel locationModel;
	 */

	public AddressModel() {

	}

	public String getAddressGuid() {
		return addressGuid;
	}

	public void setAddressGuid(String addressGuid) {
		this.addressGuid = addressGuid;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/*
	 * public LocationModel getLocationModel() { return locationModel; }
	 * 
	 * public void setLocationModel(LocationModel locationModel) {
	 * this.locationModel = locationModel; }
	 */

}
