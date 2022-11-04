package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.dao.EmployeeDaoImpltn;
import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Skill;

public class EmployeeServiceImpltn implements IntfEmployeeService{

//	to call the method from Dao pkg need to create an object.
	EmployeeDaoImpltn empDao  = new EmployeeDaoImpltn();
	
	@Override
	public Employee addEmployee(Employee emp) {
		System.out.println("Service:" +emp);
		return empDao.addEmployee(emp);
//		whatever input the method is taking in Service pkg ...pass it to Daomethod here.
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		
		return empDao.deleteEmployeeById(empId);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		
		return empDao.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		
		return empDao.getEmployeeByName(name);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empDao.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		
		return empDao.updateEmployee(empId, emp);
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		
		return empDao.updateEmployeeName(empId, newName);
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		
		return empDao.updateEmployeeSalary(empId, newSalary);
	}

	@Override
	public Employee updateEmployeeDepartment(String dpName) {
		
		Employee emp = empDao.updateEmployeeDepartment(dpName);
		return emp;
//		either way you can write direct return or like that.
	}

	@Override
	public Employee updateEmployeeSkills(int empId, List<Skill> skills) {
		
		return empDao.updateEmployeeSkills(empId, skills);
	}

}
