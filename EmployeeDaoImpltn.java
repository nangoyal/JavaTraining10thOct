package com.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Skill;

public class EmployeeDaoImpltn implements IntfEmployeeDao{

	@Override
	public Employee addEmployee(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		System.out.println(emp);
		em.getTransaction().begin();   //required only when want to insert or update something.
		System.out.println(emp);
		em.persist(emp);
		
		em.getTransaction().commit();  //required only when want to insert or update something.
		
		return emp;           //return as a success response.
//		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		
		em.getTransaction().begin();
		
//		Get emp by id
		Employee emp = em.find(Employee.class, empId);
		
//		remove employee
		em.remove(emp);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		return emp;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		
//		Get emp by ID
		Employee emp = em.find(Employee.class, empId);
		
		em.close();
		emf.close();
		return emp;
	}

	@Override
	public List<Employee> getEmployeeByName(String empName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		
//		List<Employee>empList = em.createQuery("select e from Employee e.name = name").getResultList();
//		OR
		Query q = em.createQuery("select e from Employee e.empName=:name");  //JPQL QUERY INSTEAD OF SQL QUERY.
		q.setParameter("name", empName);
		List<Employee> empList = q.getResultList();
		
		em.close();
		emf.close();
		
		return empList;
	
	}

	@Override
	public List<Employee> getAllEmployee() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		
//		List<Employee>empList = em.createQuery("select e from Employee e").getResultList();
//		OR
		Query query = em.createQuery("select e from Employee e");  //JPQL QUERY INSTEAD OF SQL QUERY.
		List<Employee> empList = query.getResultList();
		
		em.close();
		emf.close();
		return empList;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		
//		Get emp by id----dbEmp is response from db
		Employee dbEmp = em.find(Employee.class, empId);
		System.out.println("Before Update " + dbEmp);
		
//		update dbEmp details by refering emp obj
		dbEmp.setEmpName(emp.getEmpName());
		System.out.println("After Update " + dbEmp);
		
//		merge ---use for modifying data we have already 
		em.getTransaction().begin();
		Employee updatedEmp = em.merge(dbEmp);
		em.getTransaction().commit();

//		close
		em.close();
		emf.close();
		
		return dbEmp;
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		
//		Get emp by id----dbEmp is response from db
		Employee dbEmp = em.find(Employee.class, empId);
		
//		update employee name
		dbEmp.setEmpName(newName);
		
//		update emp details in db
		em.getTransaction().begin();
		em.merge(dbEmp);
		em.getTransaction().commit();
		
//		close
		em.close();
		emf.close();
		
//	return updated emp obj	
		return dbEmp;
		
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		
		return null;
	}

	@Override
	public Employee updateEmployeeDepartment(String dpName) {
		
		return null;
	}

	public Employee updateEmployeeSkills(int empId, List<Skill> skills) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
	
//		Get emp by id
		Employee dbEmp = em.find(Employee.class, empId);
		
//		update emp skills
//		for(Skill skill : skills) {
//		dbEmp.getSkill().add(skill);
//		}
//		instead of using for loop ,u can use addAll method
		dbEmp.getSkill().addAll(skills);
		
//		merge
		em.getTransaction().begin();
	    em.merge(dbEmp);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		return dbEmp;
		
	}

}
