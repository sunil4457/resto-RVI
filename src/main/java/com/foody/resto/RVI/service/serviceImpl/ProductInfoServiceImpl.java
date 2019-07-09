package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.foody.resto.RVI.model.ProductInfo;
import com.foody.resto.RVI.repository.ProductInfoRepo;
import com.foody.resto.RVI.service.ProductInfoService;
@Configuration
public class ProductInfoServiceImpl implements ProductInfoService {
	@Autowired
	private ProductInfoRepo productInfoRepo;

	@Override
	public ProductInfo getById(int id) {
		return productInfoRepo.findById(id).get();
	}

	@Override
	public void save(ProductInfo productInfo) {
		productInfoRepo.save(productInfo);
	}

	@Override
	public void update(ProductInfo productInfo) {
		productInfoRepo.save(productInfo);
	}

	@Override
	public void delete(ProductInfo productInfo) {
		productInfoRepo.delete(productInfo);
	}

	@Override
	public List<ProductInfo> getAllProductInfo() {
		return (List<ProductInfo>) productInfoRepo.findAll();
	}

}
