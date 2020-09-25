package com.si.dsi.payment.payment.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Date date;

	private Boolean isPaid;

	private Boolean isConfirmed;
	
	private Date expirateDate;
	
	private Boolean paidFull;
	
	private String requester;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Boolean getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Date getExpirateDate() {
		return expirateDate;
	}

	public void setExpirateDate(Date expirateDate) {
		this.expirateDate = expirateDate;
	}

	public Boolean getPaidFull() {
		return paidFull;
	}

	public void setPaidFull(Boolean paidFull) {
		this.paidFull = paidFull;
	}

	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}
}
