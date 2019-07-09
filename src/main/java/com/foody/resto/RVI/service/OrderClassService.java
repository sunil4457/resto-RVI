
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.OrderClass;

@Service
public interface OrderClassService {
	public OrderClass getById(int id);

	public void save(OrderClass orderClass);

	public void update(OrderClass orderClass);

	public void delete(OrderClass orderClass);

	public List<OrderClass> getAllOrderClass();

}
