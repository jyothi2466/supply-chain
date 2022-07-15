package com.supplier.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the warehouse_product database table.
 * 
 */
@Entity
@Table(name = "warehouse_product", schema = "supplier_schema")
@NamedQuery(name = "WarehouseProduct.findAll", query = "SELECT w FROM WarehouseProduct w")
public class WarehouseProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "wp_guid")
	private String wpGuid;

	@Column(name = "available_quantity")
	private Long availableQuantity;

	@Temporal(TemporalType.DATE)
	@Column(name = "expiry_date")
	private Date expiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "manufacture_date")
	private Date manufactureDate;

	@Column(name = "product_guid")
	private String productGuid;

	private double ptr;

	@Column(name = "unit_price")
	private double unitPrice;

	@Temporal(TemporalType.DATE)
	@Column(name = "update_date")
	private Date updateDate;

	@OneToOne
	@JoinColumn(name = "warehouse_guid")
	private Warehouse warehouse;

	// bi-directional many-to-one association to Inventory
	@ManyToOne
	@JoinColumn(name = "inventory_guid")
	private Inventory inventory;

	// bi-directional many-to-one association to Offer
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "offer_guid")
	private Offer offer;

	// bi-directional one-to-one association to StockLevel
	@SuppressWarnings("rawtypes")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "stock_level_guid")
	private StockLevel stockLevel;

	public WarehouseProduct() {
	}

	public String getWpGuid() {
		return this.wpGuid;
	}

	public void setWpGuid(String wpGuid) {
		this.wpGuid = wpGuid;
	}

	public Long getAvailableQuantity() {
		return this.availableQuantity;
	}

	public void setAvailableQuantity(Long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getProductGuid() {
		return this.productGuid;
	}

	public void setProductGuid(String productGuid) {
		this.productGuid = productGuid;
	}

	public double getPtr() {
		return this.ptr;
	}

	public void setPtr(double ptr) {
		this.ptr = ptr;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public StockLevel getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(StockLevel stockLevel) {
		this.stockLevel = stockLevel;
	}

}