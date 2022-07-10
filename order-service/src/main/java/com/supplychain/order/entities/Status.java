package com.supplychain.order.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@Table(name = "status", schema = "order_schema")
@NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "status_id")
	private Integer statusId;

	private String description;

//	//bi-directional many-to-one association to Order
//	@OneToMany(mappedBy="status")
//	private List<Order> orders;

	public Status() {
	}

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public List<Order> getOrders() {
//		return this.orders;
//	}
//
//	public void setOrders(List<Order> orders) {
//		this.orders = orders;
//	}

}