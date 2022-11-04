package com.jpa.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jpa.demo.entity.Address;
import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Login;
import com.jpa.demo.entity.Skill;
import com.jpa.demo.service.EmployeeServiceImpltn;
import com.jpa.demo.service.IntfEmployeeService;
import com.jpa.demo.service.IntfSkillService;
import com.jpa.demo.service.SkillServiceImpltn;


//JPA - Java Persistence API - Specification

public class MyApp {
	
	public static void main(String[] args) {
		
//		creating object for Service implementation.
//		either 
//		EmployeeServiceImpltn empService  = new EmployeeServiceImpltn();
//		OR
		IntfEmployeeService empService = new EmployeeServiceImpltn();
//		to call skillService implementations --creating an object of it
		IntfSkillService skillService = new SkillServiceImpltn();
		
//		do {
		Scanner sc = new Scanner(System.in);
//		to get input from user --using Scanner class---to make user interact through console to application
		System.out.println("Select any one of the below option:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Get Employee by Id");
		System.out.println("4. Get All Employees");
		System.out.println("5. Get Employee by Name");
		System.out.println("6. Update Employee");
		System.out.println("7. Update Employee Name");
		System.out.println("8. Delete Employee by Id");
		System.out.println("9. Add Employee Address");
		System.out.println("10. Add Skill");
		System.out.println("11. Add employee skills (Basically mapping)");
		
		
		int optionSelected = sc.nextInt();
		
		switch(optionSelected) {
		case 1:
//			System.out.println("Enter employee id");
//			int empId = sc.nextInt();
			System.out.println("Enter employee name");
			String name = sc.next();
			System.out.println("Enter employee salary");
			double salary = sc.nextDouble();
			Employee emp = new Employee(name, salary); 
			
//			Get login details after adding Login entity for Has-A-Relationship
			System.out.println("Enter Employee email address: ");
			String email = sc.next();
			System.out.println("Enter Employee password: ");
			String password = sc.next();
			
//			Create login object using email & password
			Login login = new Login(email,password);
//			Create emp object
//			Employee empObj = new Employee(name,salary,login);
			
//		Get Address details for OneToMany relation between employee & address
			System.out.println("Enter number of addresses to be added: ");
			int numAddr = sc.nextInt();
			List<Address>addrList = new ArrayList<>();
			for(int i=0;i<numAddr;i++) {
				System.out.println("Enter city name: ");
				String city = sc.next();
				
				System.out.println("Enter state name: ");
				String state = sc.next();
				
				Address addr = new Address(city,state);
//				add addr obj to addressList
				addrList.add(addr);
			}
//			create emp object
			Employee empObj = new Employee(name,salary,login,addrList);
			
//			Call service addEmployee() method to add emp to db
			Employee newEmp = empService.addEmployee(empObj);
			System.out.println("New Employee: " +newEmp);
			break;
			
		case 2:
			break;
		case 3:
			System.out.println("Enter employee id: ");
			int empId = sc.nextInt();
			Employee emp1 = empService.getEmployeeById(empId);
			System.out.println(emp1);
			break;
		case 4:
//			to get all employees information--see the method is having no input in Service Impltn
			List<Employee> employees =empService.getAllEmployee();
//			Iterating using for-each loop
			for(Employee empInfo : employees) {
				System.out.println(empInfo);
			}
			break;
		case 5:
			System.out.println("Enter Employee Name: ");
			String empName = sc.next();
			List<Employee>emps = empService.getEmployeeByName(empName);
//			To print all these employees using for-each loop here.
			for(Employee e: emps) {
				System.out.println(e);
			}
			
			break;
		case 6:  //6. Update Employee
//			Get emp details from end user.
			System.out.println("Enter employee id : ");
			int id = sc.nextInt();
			System.out.println("Enter new employee name: ");
			String nm = sc.next();
			System.out.println("Enter new employee salary: ");
			double sal = sc.nextDouble();
//			create emp obj
			Employee emp2 = new Employee(id,nm,sal);
//			call service method to update db
			Employee updateEmployee = empService.updateEmployee(id, emp2);
			System.out.println(updateEmployee);
			break;
		case 7:  //7. Update Employee Name
//			Get Id
			System.out.println("Enter employee id : ");
			int id1 = sc.nextInt();
//			Get name
			System.out.println("Enter new employee name: ");
			String eName1 = sc.next();
			
//			call service method to update the name alone
			Employee emp3 = empService.updateEmployeeName(id1, eName1);
			System.out.println(emp3.getEmpName() + " updated name successfully!");
			
			break;
		case 8:
//			Get emp id
			System.out.println("Enter Employee Id to be removed: ");
			int empLId = sc.nextInt();
//			Call service method to delete employee
			Employee delEmp1 = empService.deleteEmployeeById(empLId);
//			printing which employee is deleted by showing it's name.
			System.out.println(delEmp1.getEmpName() + " deleted successfully!");
			break;
			
		case 10:
			System.out.println("Enter skill name: ");
			String skillName = sc.next();
//			skillService.addSkill(skillName);  //it won't work bro..see your input is string and the actual input in method is an object yar.
			Skill skill = new Skill(skillName);
			Skill newSkill = skillService.addSkill(skill);
			System.out.println(newSkill.getSkillName()+ " Added successfully!");	
			break;
			
		case 11:
			System.out.println("Enter employee id: ");
			int eId = sc.nextInt();
			System.out.println("Enter no. of skills to be added: ");
			int numSk = sc.nextInt();
			
			List<Skill> skillList = new ArrayList<>();
 			for(int i=0;i<numSk;i++) {
				System.out.println("Enter skill id from below : ");
				System.out.println("17. JAVA");
				System.out.println("18. Hockey");
				System.out.println("19. Python");
				System.out.println("20. PostgreSQL");
				int selectedSkillId =sc.nextInt();
				Skill selectedSkill = skillService.getSkillById(selectedSkillId);
				skillList.add(selectedSkill);
			}
 			
 			Employee empWithSkills = empService.updateEmployeeSkills(eId, skillList);
 			System.out.println(empWithSkills);
 			
 			break;
			
		default :
			System.out.println("Enter any value between 1 to 6");
		}
//		empDao method will return null here. As method in Dao returning null.
		sc.close();
//		} while(true);
		
	}

}
