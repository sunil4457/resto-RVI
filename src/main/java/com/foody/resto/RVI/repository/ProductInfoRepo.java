package com.foody.resto.RVI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foody.resto.RVI.model.Employee;
import com.foody.resto.RVI.model.ProductInfo;

@Repository
public interface ProductInfoRepo extends CrudRepository<ProductInfo, Integer> {

}
