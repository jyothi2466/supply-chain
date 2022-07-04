package com.supplier.model;

import java.io.Serializable;
import java.util.List;

import com.supplier.entity.Contact;

public class ContactTypeModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5484956124405698939L;

	private Integer contactTypeId;

	private String name;

	private List<Contact> contacts;

	public ContactTypeModel() {

	}

	public Integer getContactTypeId() {
		return contactTypeId;
	}

	public void setContactTypeId(Integer contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
