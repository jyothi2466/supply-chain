package com.supplychain.order.model;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.supplychain.order.entities.Order;

public class PaymentMethodModel implements Serializable {

	private static final long serialVersionUID = 7752787736530969829L;

	@NotNull(message = "Please select payment method")
	private Integer paymentMethodId;

	@NotNull(message = "Please provide description")
	private String description;

	private List<Order> orders;

	public PaymentMethodModel() {
	}

	public Integer getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
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
