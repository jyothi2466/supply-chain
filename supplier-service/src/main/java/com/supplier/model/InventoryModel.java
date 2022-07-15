package com.supplier.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class InventoryModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8713827580514837524L;

	private String inventoryGuid;

	private Date inventoryDate;

	private String inventoryType;

	private double totalPrice;

	private Integer totalUnits;

	private List<WarehouseProductModel> warehouseProductModels;

	public InventoryModel() {

	}

	public String getInventoryGuid() {
		return inventoryGuid;
	}

	public void setInventoryGuid(String inventoryGuid) {
		this.inventoryGuid = inventoryGuid;
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

	public List<WarehouseProductModel> getWarehouseProductModels() {
		return warehouseProductModels;
	}

	public void setWarehouseProductModels(List<WarehouseProductModel> warehouseProductModels) {
		this.warehouseProductModels = warehouseProductModels;
	}

}
