package com.supplychain.order.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8777308582701613554L;

	@NotNull(message = "Order Guid should not be null")
	private String orderGuid;

	@DateTimeFormat
	private Timestamp actualDeliveryDate;

	@NotNull(message = "created By should not be null")
	@NotEmpty
	private String createdBy;

	@NotNull(message = "created Date should not be null")
	private Timestamp createdDate;

	private Timestamp estimatedDeliveryDate;

	private String priority;

	private double shipmentPrice;

	private double totalItemPrice;

	private double totalOfferPrice;

	private double totalOrderPrice;

	@NotNull(message = "Number of days in transit should not be null")
	private Integer transitDays;

	@Valid
	@NotNull(message = "Line Items should not be null")
	private List<LineItemModel> lineItemModels;

	private List<OrderStoreSupplierModel> orderStoreSupplierModels;

	@NotNull(message = "Payment method should not be null")
	private Integer paymentMethodId;

	@NotNull(message = "order status should must not be null")
	private Integer statusId;

	public OrderModel() {
	}

	public String getOrderGuid() {
		return orderGuid;
	}

	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}

	public Timestamp getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(Timestamp actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Timestamp estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public double getShipmentPrice() {
		return shipmentPrice;
	}

	public void setShipmentPrice(double shipmentPrice) {
		this.shipmentPrice = shipmentPrice;
	}

	public double getTotalItemPrice() {
		return totalItemPrice;
	}

	public void setTotalItemPrice(double totalItemPrice) {
		this.totalItemPrice = totalItemPrice;
	}

	public double getTotalOfferPrice() {
		return totalOfferPrice;
	}

	public void setTotalOfferPrice(double totalOfferPrice) {
		this.totalOfferPrice = totalOfferPrice;
	}

	public double getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public void setTotalOrderPrice(double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}

	public Integer getTransitDays() {
		return transitDays;
	}

	public void setTransitDays(Integer transitDays) {
		this.transitDays = transitDays;
	}

	public List<LineItemModel> getLineItemModels() {
		return lineItemModels;
	}

	public void setLineItemModels(List<LineItemModel> lineItemModels) {
		this.lineItemModels = lineItemModels;
	}

	public List<OrderStoreSupplierModel> getOrderStoreSupplierModels() {
		return orderStoreSupplierModels;
	}

	public void setOrderStoreSupplierModels(List<OrderStoreSupplierModel> orderStoreSupplierModels) {
		this.orderStoreSupplierModels = orderStoreSupplierModels;
	}

	public Integer getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

}
