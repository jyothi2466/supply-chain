package com.supplier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the warehouse database table.
 * 
 */
@Entity
@Table(name="warehouse",schema="supplier_schema")
@NamedQuery(name = "Warehouse.findAll", query = "SELECT w FROM Warehouse w")
public class Warehouse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "warehouse_guid")
	private String warehouseGuid;

	private String name;

	@Column(name = "warehouse_code")
	private String warehouseCode;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "contact_guid")
	private Contact contact;

	// bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name = "location_guid")
	private Location location;

	public Warehouse() {
	}

	public String getWarehouseGuid() {
		return this.warehouseGuid;
	}

	public void setWarehouseGuid(String warehouseGuid) {
		this.warehouseGuid = warehouseGuid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}