package com.supplier.model;

import java.io.Serializable;
import java.util.Date;

public class WarehouseProductModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5115925885281074179L;

	private String wpGuid;

	private Long availableQuantity;

	private Date expiryDate;

	private Date manufactureDate;

	private String productGuid;

	private double ptr;

	private double unitPrice;

	private Date updateDate;

	private String warehouseId;

	private InventoryModel inventoryModel;

	private OfferModel offerModel;

	private StockLevelModel stockLevelModel;

	public WarehouseProductModel() {

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

	public String getWpGuid() {
		return wpGuid;
	}

	public void setWpGuid(String wpGuid) {
		this.wpGuid = wpGuid;
	}

	public InventoryModel getInventoryModel() {
		return inventoryModel;
	}

	public void setInventoryModel(InventoryModel inventoryModel) {
		this.inventoryModel = inventoryModel;
	}

	public OfferModel getOfferModel() {
		return offerModel;
	}

	public void setOfferModel(OfferModel offerModel) {
		this.offerModel = offerModel;
	}

	public StockLevelModel getStockLevelModel() {
		return stockLevelModel;
	}

	public void setStockLevelModel(StockLevelModel stockLevelModel) {
		this.stockLevelModel = stockLevelModel;
	}
}