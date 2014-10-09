package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class OrderTicket {
	@DatabaseField
	int ticketId;
	@DatabaseField
	int ticketNumber;
	@DatabaseField
	String date;
	@DatabaseField
	String time;
	
	public OrderTicket() {
		// TODO Auto-generated constructor stub
	}

	public OrderTicket(int ticketId, int ticketNumber, String date, String time) {
		super();
		this.ticketId = ticketId;
		this.ticketNumber = ticketNumber;
		this.date = date;
		this.time = time;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "OrderTicket [ticketId=" + ticketId + ", ticketNumber="
				+ ticketNumber + ", date=" + date + ", time=" + time + "]";
	}

}
