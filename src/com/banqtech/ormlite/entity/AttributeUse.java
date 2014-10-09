package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class AttributeUse {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String attributeSet_Id;
	@DatabaseField
	String attribute_Id;
	@DatabaseField
	int lineNo;
	
	public AttributeUse() {
		// TODO Auto-generated constructor stub
	}

	public AttributeUse(String id, String attributeSet_Id, String attribute_Id,
			int lineNo) {
		super();
		this.id = id;
		this.attributeSet_Id = attributeSet_Id;
		this.attribute_Id = attribute_Id;
		this.lineNo = lineNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttributeSet_Id() {
		return attributeSet_Id;
	}

	public void setAttributeSet_Id(String attributeSet_Id) {
		this.attributeSet_Id = attributeSet_Id;
	}

	public String getAttribute_Id() {
		return attribute_Id;
	}

	public void setAttribute_Id(String attribute_Id) {
		this.attribute_Id = attribute_Id;
	}

	public int getLineNo() {
		return lineNo;
	}

	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}

	@Override
	public String toString() {
		return "AttributeUse []";
	}
	
}
