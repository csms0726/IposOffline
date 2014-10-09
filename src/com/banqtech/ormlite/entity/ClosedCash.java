package com.banqtech.ormlite.entity;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class ClosedCash {
	@DatabaseField(id=true)
	String money;
	@DatabaseField
	String host;
	@DatabaseField
	int hostSequence;
	@DatabaseField
	Date dateStart;
	@DatabaseField
	Date dateEnd;
	@DatabaseField
	int people;
	@DatabaseField
	Double total;
	
	public ClosedCash() {
		// TODO Auto-generated constructor stub
	}

	public ClosedCash(String money, String host, int hostSequence, Date dateStart,
			Date dateEnd, int people, Double total) {
		super();
		this.money = money;
		this.host = host;
		this.hostSequence = hostSequence;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.people = people;
		this.total = total;
	}

	@Override
	public String toString() {
		return "ClosedCash [money=" + money + ", host=" + host
				+ ", hostSequence=" + hostSequence + ", dateStart=" + dateStart
				+ ", dateEnd=" + dateEnd + ", people=" + people + ", total="
				+ total + "]";
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getHostSequence() {
		return hostSequence;
	}

	public void setHostSequence(int hostSequence) {
		this.hostSequence = hostSequence;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}
