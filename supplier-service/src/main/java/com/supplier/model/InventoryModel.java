package com.supplier.model;

import java.io.Serializable;
import java.util.Date;

import com.supplier.entity.WarehouseProduct;

public class InventoryModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8713827580514837524L;

	private String inventoryId;

	private Date inventoryDate;

	private String inventoryType;

	private double totalPrice;

	private Integer totalUnits;

	private WarehouseProduct warehouseProduct;

	public InventoryModel() {

	}

	public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Date getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(Date inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getTotalUnits() {
		return totalUnits;
	}

	public void setTotalUnits(Integer totalUnits) {
		this.totalUnits = totalUnits;
	}

	public WarehouseProduct getWarehouseProduct() {
		return warehouseProduct;
	}

	public void setWarehouseProduct(WarehouseProduct warehouseProduct) {
		this.warehouseProduct = warehouseProduct;
	}

}
