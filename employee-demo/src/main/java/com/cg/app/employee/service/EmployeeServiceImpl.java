package com.cg.app.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.employee.dao.EmployeeDao;

import pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public void createNewAccount(Employee employee) {
		
		
		dao.createNewAccount(employee);
		
	}
	
}
