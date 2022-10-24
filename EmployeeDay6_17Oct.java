package capgTraining;

import java.util.Objects;

public class EmployeeDay6_17Oct {
		int empId;
		String empName;	
		double salary;
			
		
	    public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
	    public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
	public EmployeeDay6_17Oct() {}
	public EmployeeDay6_17Oct(int empId,String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public EmployeeDay6_17Oct(double salary) {
		this.salary = salary;
	}

	
//	go to ---> Source----->Generate toString()........To CONVERT WRAPPER OBJECT TO STRING
	@Override
	public String toString() {
		return "EmployeeDay6_17Oct [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
//	//	go to ---> Source----->Generate hashcode() and equals()......
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, salary);
//		based on empId,empName and salary I HAVE Generated hashcode....select whichever properties you want for in source section.
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDay6_17Oct other = (EmployeeDay6_17Oct) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
  
	
}
