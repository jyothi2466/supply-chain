package com.supplychain.order.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name = "orders", schema = "order_schema")
@NamedQuery(name = "Order.findAll", query = "SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "order_guid")
	private String orderGuid;

	@Column(name = "actual_delivery_date")
	private Timestamp actualDeliveryDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "estimated_delivery_date")
	private Timestamp estimatedDeliveryDate;

	private String priority;

	@Column(name = "shipment_price")
	private double shipmentPrice;

	@Column(name = "total_item_price")
	private double totalItemPrice;

	@Column(name = "total_offer_price")
	private double totalOfferPrice;

	@Column(name = "total_order_price")
	private double totalOrderPrice;

	@Column(name = "transit_days")
	private Integer transitDays;

	// bi-directional many-to-one association to LineItem
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<LineItem> lineItems;

	// bi-directional many-to-one association to OrderStoreSupplier
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<OrderStoreSupplier> orderStoreSuppliers;

	// uni-directional many-to-one association to PaymentMethod
	@ManyToOne
	@JoinColumn(name = "payment_method_id")
	private PaymentMethod paymentMethod;

	// bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;

	// bi-directional many-to-one association to OrderStoreSupplier
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<History> histories;

	public Order() {
	}

	public String getOrderGuid() {
		return this.orderGuid;
	}

	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}

	public Timestamp getActualDeliveryDate() {
		return this.actualDeliveryDate;
	}

	public void setActualDeliveryDate(Timestamp actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getEstimatedDeliveryDate() {
		return this.estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Timestamp estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public double getShipmentPrice() {
		return this.shipmentPrice;
	}

	public void setShipmentPrice(double shipmentPrice) {
		this.shipmentPrice = shipmentPrice;
	}

	public double getTotalItemPrice() {
		return this.totalItemPrice;
	}

	public void setTotalItemPrice(double totalItemPrice) {
		this.totalItemPrice = totalItemPrice;
	}

	public double getTotalOfferPrice() {
		return this.totalOfferPrice;
	}

	public void setTotalOfferPrice(double totalOfferPrice) {
		this.totalOfferPrice = totalOfferPrice;
	}

	public double getTotalOrderPrice() {
		return this.totalOrderPrice;
	}

	public void setTotalOrderPrice(double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}

	public Integer getTransitDays() {
		return this.transitDays;
	}

	public void setTransitDays(Integer transitDays) {
		this.transitDays = transitDays;
	}

	public List<LineItem> getLineItems() {
		return this.lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public LineItem addLineItem(LineItem lineItem) {
		getLineItems().add(lineItem);
		lineItem.setOrder(this);

		return lineItem;
	}

	public LineItem removeLineItem(LineItem lineItem) {
		getLineItems().remove(lineItem);
		lineItem.setOrder(null);

		return lineItem;
	}

	public List<OrderStoreSupplier> getOrderStoreSuppliers() {
		return this.orderStoreSuppliers;
	}

	public void setOrderStoreSuppliers(List<OrderStoreSupplier> orderStoreSuppliers) {
		this.orderStoreSuppliers = orderStoreSuppliers;
	}

	public OrderStoreSupplier addOrderStoreSupplier(OrderStoreSupplier orderStoreSupplier) {
		getOrderStoreSuppliers().add(orderStoreSupplier);
		orderStoreSupplier.setOrder(this);

		return orderStoreSupplier;
	}

	public OrderStoreSupplier removeOrderStoreSupplier(OrderStoreSupplier orderStoreSupplier) {
		getOrderStoreSuppliers().remove(orderStoreSupplier);
		orderStoreSupplier.setOrder(null);

		return orderStoreSupplier;
	}

	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<History> getHistories() {
		return histories;
	}

	public void setHistories(List<History> histories) {
		this.histories = histories;
	}

}