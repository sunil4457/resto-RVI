
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.Employee;

@Service
public interface EmployeeService {
	public Employee getById(int id);

	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(Employee employee);

	public List<Employee> getAllEmployee();

}
