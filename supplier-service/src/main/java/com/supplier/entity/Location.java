package com.supplier.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the location database table.
 * 
 */
@Entity
@Table(name = "location", schema = "supplier_schema")
@NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "location_guid")
	private String locationGuid;

	private String area;

	@Column(name = "location_code")
	private String locationCode;

	// uni-directional one-to-one association to Address
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_guid")
	private Address address;

	public Location() {
	}

	public String getLocationGuid() {
		return this.locationGuid;
	}

	public void setLocationGuid(String locationGuid) {
		this.locationGuid = locationGuid;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Location [locationGuid=" + locationGuid + ", area=" + area + ", locationCode=" + locationCode
				+ ", address=" + address + "]";
	}

}