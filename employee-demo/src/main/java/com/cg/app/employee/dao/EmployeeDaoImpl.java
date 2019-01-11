package com.cg.app.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pojo.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public Employee createNewAccount(Employee employee) {
		jdbctemplate.update("INSERT into employee_db values(?,?,?)" ,new Object[] {
				employee.getEmpId(),employee.getEmpName(),employee.getSalary()
		});
		return null;
	}

}
