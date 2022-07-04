package com.supplier.model;

import java.io.Serializable;

import com.supplier.entity.WarehouseProduct;

public class StockLevelModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2528617618703983811L;

	private String stockLevelId;

	private Long bufferStock;

	private Long maxStock;

	private Long reorderStock;

	private WarehouseProduct warehouseProduct;

	public StockLevelModel() {

	}

	public String getStockLevelId() {
		return stockLevelId;
	}

	public void setStockLevelId(String stockLevelId) {
		this.stockLevelId = stockLevelId;
	}

	public Long getBufferStock() {
		return bufferStock;
	}

	public void setBufferStock(Long bufferStock) {
		this.bufferStock = bufferStock;
	}

	public Long getMaxStock() {
		return maxStock;
	}

	public void setMaxStock(Long maxStock) {
		this.maxStock = maxStock;
	}

	public Long getReorderStock() {
		return reorderStock;
	}

	public void setReorderStock(Long reorderStock) {
		this.reorderStock = reorderStock;
	}

	public WarehouseProduct getWarehouseProduct() {
		return warehouseProduct;
	}

	public void setWarehouseProduct(WarehouseProduct warehouseProduct) {
		this.warehouseProduct = warehouseProduct;
	}

}
