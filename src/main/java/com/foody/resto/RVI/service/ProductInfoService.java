
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.ProductInfo;

@Service
public interface ProductInfoService {
	public ProductInfo getById(int id);

	public void save(ProductInfo productInfo);

	public void update(ProductInfo productInfo);

	public void delete(ProductInfo productInfo);

	public List<ProductInfo> getAllProductInfo();

}
