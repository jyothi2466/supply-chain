package com.supplychain.order.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class HistoryModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9091938451867704807L;

	@NotNull(message = "History Guid should not be null")
	private String historyGuid;

	private String remarks;

	@NotNull(message = "Updated By Person should not be null")
	private String updatedBy;

	@DateTimeFormat
	@NotNull(message = "updated Date should not be null")
	private Timestamp updatedDate;

	public HistoryModel() {
	}

	public String getHistoryGuid() {
		return historyGuid;
	}

	public void setHistoryGuid(String historyGuid) {
		this.historyGuid = historyGuid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

}
