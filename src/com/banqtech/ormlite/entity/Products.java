package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Products {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String reference;
	@DatabaseField
	String code;
	@DatabaseField
	String codeType;
	@DatabaseField
	String name;
	@DatabaseField
	double priceBuy;
	@DatabaseField
	double priceSell;
	@DatabaseField
	String category;
	@DatabaseField
	String taxCat;
	@DatabaseField
	String attributeset_Id;
	@DatabaseField
	double stockCost;
	@DatabaseField
	double stockVolume;
	@DatabaseField
	String image;
	@DatabaseField
	boolean isCom;
	@DatabaseField
	boolean isScale;
	@DatabaseField
	double dimension;
	@DatabaseField
	String uom_Id;
	@DatabaseField
	boolean isProcessed;
	@DatabaseField
	boolean isProduced;
	@DatabaseField
	String attributes;
	@DatabaseField
	int side;
	
	public Products(String id, String reference, String code, String codeType,
			String name, double priceBuy, double priceSell, String category,
			String taxCat, String attributeset_Id, double stockCost,
			double stockVolume, String image, boolean isCom, boolean isScale,
			double dimension, String uom_Id, boolean isProcessed,
			boolean isProduced, String attributes, int side) {
		super();
		this.id = id;
		this.reference = reference;
		this.code = code;
		this.codeType = codeType;
		this.name = name;
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
		this.category = category;
		this.taxCat = taxCat;
		this.attributeset_Id = attributeset_Id;
		this.stockCost = stockCost;
		this.stockVolume = stockVolume;
		this.image = image;
		this.isCom = isCom;
		this.isScale = isScale;
		this.dimension = dimension;
		this.uom_Id = uom_Id;
		this.isProcessed = isProcessed;
		this.isProduced = isProduced;
		this.attributes = attributes;
		this.side = side;
	}

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(double priceBuy) {
		this.priceBuy = priceBuy;
	}

	public double getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(double priceSell) {
		this.priceSell = priceSell;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTaxCat() {
		return taxCat;
	}

	public void setTaxCat(String taxCat) {
		this.taxCat = taxCat;
	}

	public String getAttributeset_Id() {
		return attributeset_Id;
	}

	public void setAttributeset_Id(String attributeset_Id) {
		this.attributeset_Id = attributeset_Id;
	}

	public double getStockCost() {
		return stockCost;
	}

	public void setStockCost(double stockCost) {
		this.stockCost = stockCost;
	}

	public double getStockVolume() {
		return stockVolume;
	}

	public void setStockVolume(double stockVolume) {
		this.stockVolume = stockVolume;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isCom() {
		return isCom;
	}

	public void setCom(boolean isCom) {
		this.isCom = isCom;
	}

	public boolean isScale() {
		return isScale;
	}

	public void setScale(boolean isScale) {
		this.isScale = isScale;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public String getUom_Id() {
		return uom_Id;
	}

	public void setUom_Id(String uom_Id) {
		this.uom_Id = uom_Id;
	}

	public boolean isProcessed() {
		return isProcessed;
	}

	public void setProcessed(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public boolean isProduced() {
		return isProduced;
	}

	public void setProduced(boolean isProduced) {
		this.isProduced = isProduced;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", reference=" + reference + ", code="
				+ code + ", codeType=" + codeType + ", name=" + name
				+ ", priceBuy=" + priceBuy + ", priceSell=" + priceSell
				+ ", category=" + category + ", taxCat=" + taxCat
				+ ", attributeset_Id=" + attributeset_Id + ", stockCost="
				+ stockCost + ", stockVolume=" + stockVolume + ", image="
				+ image + ", isCom=" + isCom + ", isScale=" + isScale
				+ ", dimension=" + dimension + ", uom_Id=" + uom_Id
				+ ", isProcessed=" + isProcessed + ", isProduced=" + isProduced
				+ ", attributes=" + attributes + ", side=" + side + "]";
	}
	
}
