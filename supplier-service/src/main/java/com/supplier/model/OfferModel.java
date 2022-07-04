package com.supplier.model;

import java.io.Serializable;
import java.util.Date;

import com.supplier.entity.WarehouseProduct;

public class OfferModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1952800633187150198L;

	private String description;

	private Date endDate;

	private String offerId;

	private Integer percentage;

	private Date startDate;

	private WarehouseProduct warehouseProduct;

	public OfferModel() {

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public WarehouseProduct getWarehouseProduct() {
		return warehouseProduct;
	}

	public void setWarehouseProduct(WarehouseProduct warehouseProduct) {
		this.warehouseProduct = warehouseProduct;
	}

}
