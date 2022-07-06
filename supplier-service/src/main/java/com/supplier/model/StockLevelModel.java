package com.supplier.model;

import java.io.Serializable;

public class StockLevelModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2528617618703983811L;

	private String stockLevelGuid;

	private Long bufferStock;

	private Long maxStock;

	private Long reorderStock;

	private WarehouseProductModel warehouseProductModel;

	public StockLevelModel() {

	}

	public String getStockLevelGuid() {
		return stockLevelGuid;
	}

	public void setStockLevelGuid(String stockLevelGuid) {
		this.stockLevelGuid = stockLevelGuid;
	}

	public WarehouseProductModel getWarehouseProductModel() {
		return warehouseProductModel;
	}

	public void setWarehouseProductModel(WarehouseProductModel warehouseProductModel) {
		this.warehouseProductModel = warehouseProductModel;
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

}
