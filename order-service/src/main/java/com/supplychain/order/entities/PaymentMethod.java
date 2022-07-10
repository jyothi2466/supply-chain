package com.supplychain.order.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the payment_method database table.
 * 
 */
@Entity
@Table(name = "payment_method", schema = "order_schema")
@NamedQuery(name = "PaymentMethod.findAll", query = "SELECT p FROM PaymentMethod p")
public class PaymentMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "payment_method_id")
	private Integer paymentMethodId;

	private String description;

//	//bi-directional many-to-one association to Order
//	@OneToMany(mappedBy="paymentMethod")
//	private List<Order> orders;

	public PaymentMethod() {
	}

	public Integer getPaymentMethodId() {
		return this.paymentMethodId;
	}

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
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

//	public Order addOrder(Order order) {
//		getOrders().add(order);
//		order.setPaymentMethod(this);
//
//		return order;
//	}
//
//	public Order removeOrder(Order order) {
//		getOrders().remove(order);
//		order.setPaymentMethod(null);
//
//		return order;
//	}

}