package com.supplier.model;

import java.io.Serializable;
import java.util.List;

import com.supplier.entity.ContactType;
import com.supplier.entity.Warehouse;

public class ContactModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5196942917373179267L;

	private String contactId;

	private String value;

	private ContactType contactType;

	private List<Warehouse> warehouses;

	public ContactModel() {

	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public List<Warehouse> getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(List<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}

}
