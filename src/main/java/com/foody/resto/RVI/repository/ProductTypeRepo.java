package com.foody.resto.RVI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foody.resto.RVI.model.Employee;
import com.foody.resto.RVI.model.ProductType;

@Repository
public interface ProductTypeRepo extends CrudRepository<ProductType, Integer> {

}
