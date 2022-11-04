package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Skill;

public interface IntfEmployeeService {
	
      //	abstract methods
//	  based on requirement define methods and give name accordingly.
//	returnType methodName(inputs);
	Employee addEmployee(Employee emp);
	Employee deleteEmployeeById(int empId);
	Employee getEmployeeById(int empId);
	List<Employee> getEmployeeByName(String name);  ////person with same name cab be there.
	List<Employee> getAllEmployee();  //to collect information of all Employees ,create a list.
	Employee updateEmployee(int empId, Employee emp);
	Employee updateEmployeeName(int empId, String newName);
	Employee updateEmployeeSalary(int empId, double newSalary);
	Employee updateEmployeeDepartment(String dpName);

	Employee updateEmployeeSkills(int empId, List<Skill> skills);
}
