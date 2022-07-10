package com.supplychain.order.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the line_item database table.
 * 
 */
@Entity
@Table(name="line_item",schema="order_schema")
@NamedQuery(name="LineItem.findAll", query="SELECT l FROM LineItem l")
public class LineItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="line_item_guid")
	private String lineItemGuid;

	@Column(name="offer_price")
	private double offerPrice;

	@Column(name="product_code")
	private String productCode;

	private Integer quantity;

	@Column(name="total_price")
	private double totalPrice;

	@Column(name="unit_price")
	private double unitPrice;

	//bi-directional many-to-one association to Order
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="order_guid")
	private Order order;

	public LineItem() {
	}

	public String getLineItemGuid() {
		return this.lineItemGuid;
	}

	public void setLineItemGuid(String lineItemGuid) {
		this.lineItemGuid = lineItemGuid;
	}

	public double getOfferPrice() {
		return this.offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}