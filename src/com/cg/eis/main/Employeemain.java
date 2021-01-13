package com.cg.eis.main;
import java.util.Scanner;

import javax.naming.InvalidNameException;

import com.cg.eis.DAOImpl.EmployeeDAOImpl;
import com.cg.eis.domain.Employee;
import com.cg.eis.exception.InvalidAgeexception;
import com.cg.eis.exception.InvalidSalaryexception;

public class Employeemain {
	public static void main(String[] args) throws InvalidNameException, InvalidAgeexception, InvalidSalaryexception {
		Scanner sc=new Scanner(System.in);
		Employee empl=new Employee();
		EmployeeDAOImpl employee=new EmployeeDAOImpl();
		System.out.println("Enter Your name:");
		String name=sc.nextLine();
		empl.setName(name);
		System.out.println("Enter Your age:");
		empl.setAge(sc.nextInt());
		System.out.println("Enter Your Salary:");
		empl.setSalary(sc.nextInt());
		

		try
		{
			
			employee.checkEmployee(empl.getName(),empl.getAge(),empl.getSalary())  ;
		}
		catch(InvalidNameException e)
		{
		System.out.println(e.getMessage());
     	}
		catch(InvalidAgeexception e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSalaryexception e)
		{
			System.out.println(e.getMessage());
		}
		}


}