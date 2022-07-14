package com.supplychain.order.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class OrderStoreSupplierModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2437660121589135134L;

	@NotNull(message = "Order Store Supplier should not be null")
	private String ossGuid;

	@NotNull(message = "Store code should not be null")
	private String storeCode;

	@NotNull(message = "Supplier code should not be null")
	private String supplierCode;

	public OrderStoreSupplierModel() {
	}
 
	public String getOssGuid() {
		return ossGuid;
	}

	public void setOssGuid(String ossGuid) {
		this.ossGuid = ossGuid;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

}
