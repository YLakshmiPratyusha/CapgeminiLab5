package com.cg.eis.DAO;

import javax.naming.InvalidNameException;

import com.cg.eis.exception.InvalidAgeexception;
import com.cg.eis.exception.InvalidSalaryexception;

public interface EmployeeDAO {
	
	
	void checkEmployee(String name,int age,int salary) throws InvalidNameException,InvalidAgeexception,InvalidSalaryexception;


}