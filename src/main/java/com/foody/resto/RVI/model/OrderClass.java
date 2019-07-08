package com.foody.resto.RVI.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class OrderClass {
@Id
private int foodId;
@OneToOne(targetEntity=OrderFoods.class, fetch = FetchType.EAGER)
@JoinColumn(name = "orderId")
private OrderFoods orderId;
private String quantity;
public int getFoodId() {
	return foodId;
}
public void setFoodId(int foodId) {
	this.foodId = foodId;
}
public OrderFoods getOrderId() {
	return orderId;
}
public void setOrderId(OrderFoods orderId) {
	this.orderId = orderId;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + foodId;
	result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
	result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
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
	OrderClass other = (OrderClass) obj;
	if (foodId != other.foodId)
		return false;
	if (orderId == null) {
		if (other.orderId != null)
			return false;
	} else if (!orderId.equals(other.orderId))
		return false;
	if (quantity == null) {
		if (other.quantity != null)
			return false;
	} else if (!quantity.equals(other.quantity))
		return false;
	return true;
}

}
