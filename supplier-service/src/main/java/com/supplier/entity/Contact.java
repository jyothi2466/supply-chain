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
 * The persistent class for the contact database table.
 * 
 */
@Entity
@Table(name = "contact", schema = "supplier_schema")
@NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "contact_guid")
	private String contactGuid;

	private String value;

	// uni-directional many-to-one association to ContactType
	@ManyToOne
	@JoinColumn(name = "contact_type_id")
	private ContactType contactType;

	// bi-directional many-to-one association to Warehouse
	@ManyToOne
	@JoinColumn(name = "warehouse_guid")
	private Warehouse warehouse;

	public Contact() {
	}

	public String getContactGuid() {
		return this.contactGuid;
	}

	public void setContactGuid(String contactGuid) {
		this.contactGuid = contactGuid;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ContactType getContactType() {
		return this.contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

}