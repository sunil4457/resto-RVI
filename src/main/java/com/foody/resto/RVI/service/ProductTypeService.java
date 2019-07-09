
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.ProductType;

@Service
public interface ProductTypeService {
	public ProductType getById(int id);

	public void save(ProductType productType);

	public void update(ProductType productType);

	public void delete(ProductType productType);

	public List<ProductType> getAllProductType();

}
