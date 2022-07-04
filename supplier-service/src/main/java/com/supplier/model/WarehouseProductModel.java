package com.supplier.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.supplier.entity.Inventory;
import com.supplier.entity.Offer;
import com.supplier.entity.StockLevel;

public class WarehouseProductModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5115925885281074179L;

	private String wpId;

	private Long availableQuantity;

	private Date expiryDate;

	private Date manufactureDate;

	private String productGuid;

	private double ptr;

	private double unitPrice;

	private Date updateDate;

	private String warehouseId;

	private List<Inventory> inventories;

	private List<Offer> offers;

	@SuppressWarnings("rawtypes")
	private List<StockLevel> stockLevels;

	public WarehouseProductModel() {

	}

	public String getWpId() {
		return wpId;
	}

	public void setWpId(String wpId) {
		this.wpId = wpId;
	}

	public Long getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getProductGuid() {
		return productGuid;
	}

	public void setProductGuid(String productGuid) {
		this.productGuid = productGuid;
	}

	public double getPtr() {
		return ptr;
	}

	public void setPtr(double ptr) {
		this.ptr = ptr;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public List<Inventory> getInventories() {
		return inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	@SuppressWarnings("rawtypes")
	public List<StockLevel> getStockLevels() {
		return stockLevels;
	}

	@SuppressWarnings("rawtypes")
	public void setStockLevels(List<StockLevel> stockLevels) {
		this.stockLevels = stockLevels;
	}

}
