package com.supplier.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the warehouse_product database table.
 * 
 */
@Entity
@Table(name="warehouse_product",schema="supplier_schema")
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

	@Column(name = "warehouse_guid")
	private String warehouseGuid;

	// bi-directional many-to-one association to Inventory
	@OneToMany(mappedBy = "warehouseProduct")
	private List<Inventory> inventories;

	// bi-directional many-to-one association to Offer
	@OneToMany(mappedBy = "warehouseProduct")
	private List<Offer> offers;

	// bi-directional many-to-one association to StockLevel
	@SuppressWarnings("rawtypes")
	@OneToMany(mappedBy = "warehouseProduct")	
	private List<StockLevel> stockLevels;

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

	public String getWarehouseGuid() {
		return this.warehouseGuid;
	}

	public void setWarehouseGuid(String warehouseGuid) {
		this.warehouseGuid = warehouseGuid;
	}

	public List<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public Inventory addInventory(Inventory inventory) {
		getInventories().add(inventory);
		inventory.setWarehouseProduct(this);

		return inventory;
	}

	public Inventory removeInventory(Inventory inventory) {
		getInventories().remove(inventory);
		inventory.setWarehouseProduct(null);

		return inventory;
	}

	public List<Offer> getOffers() {
		return this.offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public Offer addOffer(Offer offer) {
		getOffers().add(offer);
		offer.setWarehouseProduct(this);

		return offer;
	}

	public Offer removeOffer(Offer offer) {
		getOffers().remove(offer);
		offer.setWarehouseProduct(null);

		return offer;
	}

	@SuppressWarnings("rawtypes")
	public List<StockLevel> getStockLevels() {
		return this.stockLevels;
	}

	public void setStockLevels(@SuppressWarnings("rawtypes") List<StockLevel> stockLevels) {
		this.stockLevels = stockLevels;
	}

	public StockLevel<?> addStockLevel(StockLevel<?> stockLevel) {
		getStockLevels().add(stockLevel);
		stockLevel.setWarehouseProduct(this);

		return stockLevel;
	}

	public StockLevel<?> removeStockLevel(StockLevel<?> stockLevel) {
		getStockLevels().remove(stockLevel);
		stockLevel.setWarehouseProduct(null);

		return stockLevel;
	}

}