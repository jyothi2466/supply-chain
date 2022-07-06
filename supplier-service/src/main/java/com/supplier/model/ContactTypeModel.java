package com.supplier.model;

import java.io.Serializable;

public class ContactTypeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5484956124405698939L;

	private Integer contactTypeId;

	private String name;

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

}
