package com.supplier.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the warehouse database table.
 * 
 */
@Entity
@Table(name = "warehouse", schema = "supplier_schema")
@NamedQuery(name = "Warehouse.findAll", query = "SELECT w FROM Warehouse w")
public class Warehouse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "warehouse_guid")
	private String warehouseGuid;

	private String name;

	@Column(name = "warehouse_code")
	private String warehouseCode;

	// bi-directional many-to-one association to Supplier
	@OneToOne
	@JoinColumn(name = "supplier_guid")
	private Supplier supplier;

	// bi-directional one-to-many association to Contact
	@OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Contact> contacts;

	// uni-directional one-to-many association to Location
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}