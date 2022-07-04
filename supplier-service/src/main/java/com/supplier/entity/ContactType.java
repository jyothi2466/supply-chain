package com.supplier.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the contact_type database table.
 * 
 */
@Entity
@Table(name="contact_type",schema="supplier_schema")
@NamedQuery(name = "ContactType.findAll", query = "SELECT c FROM ContactType c")
public class ContactType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "contact_type_id")
	private Integer contactTypeId;

	private String name;

	// bi-directional many-to-one association to Contact
	@OneToMany(mappedBy = "contactType")
	private List<Contact> contacts;

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

	public List<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public Contact addContact(Contact contact) {
		getContacts().add(contact);
		contact.setContactType(this);

		return contact;
	}

	public Contact removeContact(Contact contact) {
		getContacts().remove(contact);
		contact.setContactType(null);

		return contact;
	}

}