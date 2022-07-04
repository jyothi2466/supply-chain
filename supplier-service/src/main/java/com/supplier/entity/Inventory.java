package com.supplier.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the inventory database table.
 * 
 */
@Entity
@Table(name="inventory",schema="supplier_schema")
@NamedQuery(name = "Inventory.findAll", query = "SELECT i FROM Inventory i")
public class Inventory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "inventory_guid")
	private String inventoryGuid;

	@Temporal(TemporalType.DATE)
	@Column(name = "inventory_date")
	private Date inventoryDate;

	@Column(name = "inventory_type")
	private String inventoryType;

	@Column(name = "total_price")
	private double totalPrice;

	@Column(name = "total_units")
	private Integer totalUnits;

	// bi-directional many-to-one association to WarehouseProduct
	@ManyToOne
	@JoinColumn(name = "wp_guid")
	private WarehouseProduct warehouseProduct;

	public Inventory() {
	}

	public String getInventoryGuid() {
		return this.inventoryGuid;
	}

	public void setInventoryGuid(String inventoryGuid) {
		this.inventoryGuid = inventoryGuid;
	}

	public Date getInventoryDate() {
		return this.inventoryDate;
	}

	public void setInventoryDate(Date inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public String getInventoryType() {
		return this.inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getTotalUnits() {
		return this.totalUnits;
	}

	public void setTotalUnits(Integer totalUnits) {
		this.totalUnits = totalUnits;
	}

	public WarehouseProduct getWarehouseProduct() {
		return this.warehouseProduct;
	}

	public void setWarehouseProduct(WarehouseProduct warehouseProduct) {
		this.warehouseProduct = warehouseProduct;
	}

}