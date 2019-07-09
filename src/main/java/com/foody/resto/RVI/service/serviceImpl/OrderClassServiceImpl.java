package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.foody.resto.RVI.model.OrderClass;
import com.foody.resto.RVI.repository.OrderClassRepo;
import com.foody.resto.RVI.service.OrderClassService;
@Configuration
public class OrderClassServiceImpl implements OrderClassService {

	@Autowired
	private OrderClassRepo orderClassRepo;

	@Override
	public OrderClass getById(int id) {
		// TODO Auto-generated method stub
		return orderClassRepo.findById(id).get();
	}

	@Override
	public void save(OrderClass orderClass) {
		orderClassRepo.save(orderClass);
	}

	@Override
	public void update(OrderClass orderClass) {
		orderClassRepo.save(orderClass);

	}

	@Override
	public void delete(OrderClass orderClass) {
		orderClassRepo.delete(orderClass);

	}

	@Override
	public List<OrderClass> getAllOrderClass() {

		return (List<OrderClass>) orderClassRepo.findAll();
	}

}
