package com.supplier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the contact_type database table.
 * 
 */
@Entity
@Table(name = "contact_type", schema = "supplier_schema")
@NamedQuery(name = "ContactType.findAll", query = "SELECT c FROM ContactType c")
public class ContactType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "contact_type_id")
	private Integer contactTypeId;

	private String name;

	public ContactType() {
	}

	public Integer getContactTypeId() {
		return this.contactTypeId;
	}

	public void setContactTypeId(Integer contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}