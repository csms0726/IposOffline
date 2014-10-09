package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class PeopleCash {
	
	@DatabaseField(generatedId=true)
	int id;
	@DatabaseField
	int peopleId;
	@DatabaseField
	int placeId;
	
	public PeopleCash() {
		// TODO Auto-generated constructor stub
	}

	public PeopleCash(int id, int peopleId, int placeId) {
		super();
		this.id = id;
		this.peopleId = peopleId;
		this.placeId = placeId;
	}

	@Override
	public String toString() {
		return "PeopleCash [id=" + id + ", peopleId=" + peopleId + ", placeId="
				+ placeId + "]";
	}
	
}
