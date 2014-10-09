package com.banqtech.ormlite.entity;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class Tickets {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	int ticketType;
	@DatabaseField
	int ticketId;
	@DatabaseField
	String person;
	@DatabaseField
	String customer;
	@DatabaseField
	int status;
	@DatabaseField
	String billNo;
	@DatabaseField
	Date beginDate;
	@DatabaseField
	Date endDate;
	@DatabaseField
	int side;
	
	public Tickets() {
		// TODO Auto-generated constructor stub
	}

	public Tickets(String id, int ticketType, int ticketId, String person,
			String customer, int status, String billNo, Date beginDate,
			Date endDate, int side) {
		super();
		this.id = id;
		this.ticketType = ticketType;
		this.ticketId = ticketId;
		this.person = person;
		this.customer = customer;
		this.status = status;
		this.billNo = billNo;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.side = side;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTicketType() {
		return ticketType;
	}

	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Tickets [id=" + id + ", ticketType=" + ticketType
				+ ", ticketId=" + ticketId + ", person=" + person
				+ ", customer=" + customer + ", status=" + status + ", billNo="
				+ billNo + ", beginDate=" + beginDate + ", endDate=" + endDate
				+ ", side=" + side + "]";
	}

}
