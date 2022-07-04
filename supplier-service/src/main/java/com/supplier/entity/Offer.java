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
 * The persistent class for the offer database table.
 * 
 */
@Entity
@Table(name = "offer", schema = "supplier_schema")
@NamedQuery(name = "Offer.findAll", query = "SELECT o FROM Offer o")
public class Offer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "offer_guid")
	private String offerGuid;
	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date")
	private Date endDate;
	private Integer percentage;

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date startDate;

	// bi-directional many-to-one association to WarehouseProduct
	@ManyToOne
	@JoinColumn(name = "wp_guid")
	private WarehouseProduct warehouseProduct;

	public Offer() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOfferGuid() {
		return this.offerGuid;
	}

	public void setOfferGuid(String offerGuid) {
		this.offerGuid = offerGuid;
	}

	public Integer getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public WarehouseProduct getWarehouseProduct() {
		return this.warehouseProduct;
	}

	public void setWarehouseProduct(WarehouseProduct warehouseProduct) {
		this.warehouseProduct = warehouseProduct;
	}

}