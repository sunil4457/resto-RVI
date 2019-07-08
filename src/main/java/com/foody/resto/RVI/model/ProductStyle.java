package com.foody.resto.RVI.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ProductStyle {
	@Id
	private int productStyleId;
	private String name;
	
	private String image;
	private boolean visible;
	@OneToMany(targetEntity=ProductInfo.class,mappedBy="productStyle", fetch = FetchType.EAGER)
	private List<ProductInfo> product;

	public int getProductStyleId() {
		return productStyleId;
	}

	public void setProductStyleId(int productStyleId) {
		this.productStyleId = productStyleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean getVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public List<ProductInfo> getProduct() {
		return product;
	}

	public void setProduct(List<ProductInfo> product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + productStyleId;
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
		ProductStyle other = (ProductStyle) obj;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (productStyleId != other.productStyleId)
			return false;
		if (visible != other.visible)
			return false;
		return true;
	}

}
