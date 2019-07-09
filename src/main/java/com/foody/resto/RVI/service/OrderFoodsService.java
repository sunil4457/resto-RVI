
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.OrderFoods;

@Service
public interface OrderFoodsService {
	public OrderFoods getById(int id);

	public void save(OrderFoods orderFoods);

	public void update(OrderFoods orderFoods);

	public void delete(OrderFoods orderFoods);

	public List<OrderFoods> getAllOrderFoods();

}
