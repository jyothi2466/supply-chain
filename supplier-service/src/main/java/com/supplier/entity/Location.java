package com.supplier.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the location database table.
 * 
 */
@Entity
@Table(name="location",schema="supplier_schema")
@NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "location_guid")
	private String locationGuid;

	private String area;

	@Column(name = "location_code")
	private String locationCode;

	// bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name = "address_guid")
	private Address address;

	// bi-directional many-to-one association to Warehouse
	@OneToMany(mappedBy = "location")
	private List<Warehouse> warehouses;

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

	public List<Warehouse> getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(List<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}

	public Warehouse addWarehous(Warehouse warehouse) {
		getWarehouses().add(warehouse);
		warehouse.setLocation(this);

		return warehouse;
	}

	public Warehouse removeWarehous(Warehouse warehouse) {
		getWarehouses().remove(warehouse);
		warehouse.setLocation(null);

		return warehouse;
	}

}