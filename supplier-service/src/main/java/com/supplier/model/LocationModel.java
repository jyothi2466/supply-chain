package com.supplier.model;

import java.io.Serializable;

import com.supplier.entity.Address;
import com.supplier.entity.Warehouse;

public class LocationModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4123375607486138703L;

	private String locationId;

	private String area;

	private String locationCode;

	private Address address;

	private Warehouse warehouse;

	public LocationModel() {
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

}
