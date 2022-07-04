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
 * The persistent class for the contact database table.
 * 
 */
@Entity
@Table(name="contact",schema="supplier_schema")
@NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "contact_guid")
	private String contactGuid;

	private String value;

	// bi-directional many-to-one association to ContactType
	@ManyToOne
	@JoinColumn(name = "contact_type_id")
	private ContactType contactType;

	// bi-directional many-to-one association to Warehouse
	@OneToMany(mappedBy = "contact")
	private List<Warehouse> warehouses;

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

	public List<Warehouse> getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(List<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}

	public Warehouse addWarehous(Warehouse warehouse) {
		getWarehouses().add(warehouse);
		warehouse.setContact(this);

		return warehouse;
	}

	public Warehouse removeWarehous(Warehouse warehouse) {
		getWarehouses().remove(warehouse);
		warehouse.setContact(null);

		return warehouse;
	}

}