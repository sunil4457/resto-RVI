package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import com.foody.resto.RVI.model.ProductType;
import com.foody.resto.RVI.repository.ProductTypeRepo;
import com.foody.resto.RVI.service.ProductTypeService;
@Configuration
public class ProductTypeServiceImpl implements ProductTypeService {
	@Autowired
	private ProductTypeRepo productTypeRepo;

	@Override
	public ProductType getById(int id) {
		return productTypeRepo.findById(id).get();
	}

	@Override
	public void save(ProductType productType) {
		productTypeRepo.save(productType);
	}

	@Override
	public void update(ProductType productType) {
		productTypeRepo.save(productType);
	}

	@Override
	public void delete(ProductType productType) {
		productTypeRepo.delete(productType);
	}

	@Override
	public List<ProductType> getAllProductType() {
		return (List<ProductType>) productTypeRepo.findAll();
	}

}
