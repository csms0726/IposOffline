package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Resources {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	int resType;
	@DatabaseField
	String content;
	
	public Resources() {
		// TODO Auto-generated constructor stub
	}

	public Resources(String id, String name, int resType, String content) {
		super();
		this.id = id;
		this.name = name;
		this.resType = resType;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResType() {
		return resType;
	}

	public void setResType(int resType) {
		this.resType = resType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Resources [id=" + id + ", name=" + name + ", resType="
				+ resType + ", content=" + content + "]";
	}
	
}
