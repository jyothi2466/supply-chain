package com.supplier.model;

import java.io.Serializable;

import com.supplier.entity.Contact;
import com.supplier.entity.Location;

public class WarehouseModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2924903407885671750L;

	private String warehouseGuid;

	private String name;

	private String warehouseCode;

	private Contact contact;

	private Location location;

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

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
