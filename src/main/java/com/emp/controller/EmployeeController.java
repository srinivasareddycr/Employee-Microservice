package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	
	@Autowired
	 private IEmployeeService employeeService;
	
	@GetMapping("/{eId}")
	public Employee getEmployees(@PathVariable("eId") Long eId)
	{
		Employee employee =this.employeeService.getEmployee(eId);
		return employee;
	}
	

}
