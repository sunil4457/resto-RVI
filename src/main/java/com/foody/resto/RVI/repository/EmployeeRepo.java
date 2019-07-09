package com.foody.resto.RVI.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foody.resto.RVI.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
