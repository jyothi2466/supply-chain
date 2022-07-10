package com.supplychain.order.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the history database table.
 * 
 */
@Entity
@Table(name="history",schema="order_schema")
@NamedQuery(name="History.findAll", query="SELECT h FROM History h")
public class History implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="history_guid")
	private String historyGuid;

	@Column(name="order_guid")
	private String orderGuid;

	private String remarks;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	public History() {
	}

	public String getHistoryGuid() {
		return this.historyGuid;
	}

	public void setHistoryGuid(String historyGuid) {
		this.historyGuid = historyGuid;
	}

	public String getOrderGuid() {
		return this.orderGuid;
	}

	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

}