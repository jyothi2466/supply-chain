package com.supplier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the stock_level database table.
 * 
 */
@Entity
@Table(name="stock_level",schema="supplier_schema")
@NamedQuery(name = "StockLevel.findAll", query = "SELECT s FROM StockLevel s")
public class StockLevel<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "stock_level_guid")
	private String stockLevelGuid;

	@Column(name = "buffer_stock")
	private Long bufferStock;

	@Column(name = "max_stock")
	private Long maxStock;

	@Column(name = "reorder_stock")
	private Long reorderStock;

	// bi-directional many-to-one association to WarehouseProduct
	@ManyToOne
	@JoinColumn(name = "wp_guid")
	private WarehouseProduct warehouseProduct;

	public StockLevel() {
	}

	public String getStockLevelGuid() {
		return this.stockLevelGuid;
	}

	public void setStockLevelGuid(String stockLevelGuid) {
		this.stockLevelGuid = stockLevelGuid;
	}

	public Long getBufferStock() {
		return this.bufferStock;
	}

	public void setBufferStock(Long bufferStock) {
		this.bufferStock = bufferStock;
	}

	public Long getMaxStock() {
		return this.maxStock;
	}

	public void setMaxStock(Long maxStock) {
		this.maxStock = maxStock;
	}

	public Long getReorderStock() {
		return this.reorderStock;
	}

	public void setReorderStock(Long reorderStock) {
		this.reorderStock = reorderStock;
	}

	public WarehouseProduct getWarehouseProduct() {
		return this.warehouseProduct;
	}

	public void setWarehouseProduct(WarehouseProduct warehouseProduct) {
		this.warehouseProduct = warehouseProduct;
	}

}