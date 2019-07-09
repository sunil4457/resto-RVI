package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.foody.resto.RVI.model.OrderFoods;
import com.foody.resto.RVI.repository.OrderFoodsRepo;
import com.foody.resto.RVI.service.OrderFoodsService;
@Configuration
public class OrderFoodsServiceImpl implements OrderFoodsService {

	@Autowired
	private OrderFoodsRepo orderFoodsRepo;

	@Override
	public OrderFoods getById(int id) {
		return orderFoodsRepo.findById(id).get();
	}

	@Override
	public void save(OrderFoods orderFoods) {
		orderFoodsRepo.save(orderFoods);
	}

	@Override
	public void update(OrderFoods orderFoods) {
		orderFoodsRepo.save(orderFoods);
	}

	@Override
	public void delete(OrderFoods orderFoods) {
		orderFoodsRepo.delete(orderFoods);
	}

	@Override
	public List<OrderFoods> getAllOrderFoods() {
		return (List<OrderFoods>) orderFoodsRepo.findAll();
	}

}
