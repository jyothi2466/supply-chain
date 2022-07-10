package com.supplychain.order.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="order_store_supplier",schema="order_schema")
@NamedQuery(name="OrderStoreSupplier.findAll", query="SELECT o FROM OrderStoreSupplier o")
public class OrderStoreSupplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oss_guid")
	private String ossGuid;

	@Column(name="store_code")
	private String storeCode;

	@Column(name="supplier_code")
	private String supplierCode;

	//bi-directional many-to-one association to Order
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="order_guid")
	private Order order;

	public OrderStoreSupplier() {
	}

	public String getOssGuid() {
		return this.ossGuid;
	}

	public void setOssGuid(String ossGuid) {
		this.ossGuid = ossGuid;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}