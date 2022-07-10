package com.supplychain.order.model;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LineItemModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8289194613630646984L;

	@NotNull(message = "Line Item Guid should not be null")
	private String lineItemGuid;

	private double offerPrice;

	@NotNull(message = "Product Code should not be null")
	@NotEmpty
	private String productCode;

	@NotNull
	@NotEmpty(message = "Quantity should not be null or empty")
	private Integer quantity;

	private double totalPrice;

	private double unitPrice;

	public LineItemModel() {
	}

	public String getLineItemGuid() {
		return lineItemGuid;
	}

	public void setLineItemGuid(String lineItemGuid) {
		this.lineItemGuid = lineItemGuid;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void  setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
