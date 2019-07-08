package com.foody.resto.RVI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class ProductInfo {
	@Id
	private int productInfoId;
	private String code;
	private String name;
	private String model;
	private Float marketPrice;
	private String description;
	private Float sellPrice;
	private boolean visible;
	@ManyToOne(targetEntity=ProductStyle.class, fetch = FetchType.EAGER)
	private ProductStyle productStyle;
	private Date createDate;
	private String image;

	public int getProductInfoId() {
		return productInfoId;
	}

	public void setProductInfoId(int productInfoId) {
		this.productInfoId = productInfoId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Float getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Float marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Float sellPrice) {
		this.sellPrice = sellPrice;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public ProductStyle getProductType() {
		return productStyle;
	}

	public void setProductStyle(ProductStyle productStyle) {
		this.productStyle = productStyle;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((marketPrice == null) ? 0 : marketPrice.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + productInfoId;
		result = prime * result + ((productStyle == null) ? 0 : productStyle.hashCode());
		result = prime * result + ((sellPrice == null) ? 0 : sellPrice.hashCode());
		result = prime * result + (visible ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductInfo other = (ProductInfo) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (marketPrice == null) {
			if (other.marketPrice != null)
				return false;
		} else if (!marketPrice.equals(other.marketPrice))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (productInfoId != other.productInfoId)
			return false;
		if (productStyle == null) {
			if (other.productStyle != null)
				return false;
		} else if (!productStyle.equals(other.productStyle))
			return false;
		if (sellPrice == null) {
			if (other.sellPrice != null)
				return false;
		} else if (!sellPrice.equals(other.sellPrice))
			return false;
		if (visible != other.visible)
			return false;
		return true;
	}

}
