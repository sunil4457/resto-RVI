package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.ProductStyle;
import com.foody.resto.RVI.repository.ProductStyleRepo;
import com.foody.resto.RVI.service.ProductStyleService;
@Configuration
public class ProductStyleServiceImpl implements  ProductStyleService {
	@Autowired
	private ProductStyleRepo productStyleRepo;
	
	@Override
	public ProductStyle getById(int id) {
		return productStyleRepo.findById(id).get();
	}

	@Override
	public void save(ProductStyle productStyle) {
		productStyleRepo.save(productStyle);		
	}

	@Override
	public void update(ProductStyle productStyle) {
		productStyleRepo.save(productStyle);		
	}

	@Override
	public void delete(ProductStyle productStyle) {
		productStyleRepo.delete(productStyle);		
	}

	@Override
	public List<ProductStyle> getAllProductStyle() {
		return (List<ProductStyle>) productStyleRepo.findAll();
	}

}
