package com.jpa.demo.entity;

public class Department {
	
//	fields 
	private long deptId;
	private String deptName;
	
//	constructors
	public Department() {}
	public Department(long deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
//	Getters and Setters
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
//	toString() method
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	

}
