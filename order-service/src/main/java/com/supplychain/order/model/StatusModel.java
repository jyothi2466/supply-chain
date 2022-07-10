package com.supplychain.order.model;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.supplychain.order.entities.Order;

public class StatusModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5636566047525253236L;

	@NotNull(message = "Please provide Status Id")
	private Integer statusId;

	@NotNull(message = "Please provide Description")
	private String description;

	private List<Order> orders;

	public StatusModel() {
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
