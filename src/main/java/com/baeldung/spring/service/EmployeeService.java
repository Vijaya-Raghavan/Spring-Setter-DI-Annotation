package com.baeldung.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.spring.dao.IEmployeeDAO;

@Service
public class EmployeeService {
	
	private IEmployeeDAO employeeDAO;
	
	@Autowired
	public void setEmployeeDAO(IEmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public void printEmployeeMessage() {
		System.out.println(employeeDAO.getMessage());
	}
	
}
