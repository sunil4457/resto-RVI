package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.foody.resto.RVI.model.Employee;
import com.foody.resto.RVI.repository.EmployeeRepo;
import com.foody.resto.RVI.service.EmployeeService;
@Configuration
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee getById(int id) {
		Optional<Employee> emp = employeeRepo.findById(id);
		return emp.get();
	}

	@Override
	public void save(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeRepo.save(employee);

	}

	@Override
	public void delete(Employee employee) {
		employeeRepo.delete(employee);

	}

	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeRepo.findAll();
	}

}
