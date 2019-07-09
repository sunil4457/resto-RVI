
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.ProductStyle;

@Service
public interface ProductStyleService {
	public ProductStyle getById(int id);

	public void save(ProductStyle productStyle);

	public void update(ProductStyle productStyle);

	public void delete(ProductStyle productStyle);

	public List<ProductStyle> getAllProductStyle();

}
