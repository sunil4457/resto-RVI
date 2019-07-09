package com.foody.resto.RVI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foody.resto.RVI.model.Employee;
import com.foody.resto.RVI.service.EmployeeService;

@RestController
public class AppApisController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="/api/addEmployee")
	@ResponseBody
	public Employee saveEmployee(@RequestParam("username") String userName, @RequestParam("password") String passWord) {
		Employee emp = new Employee();
		emp.setUserName(userName);
		emp.setPassWord(passWord);
		employeeService.save(emp);
		return emp;
	}
}
