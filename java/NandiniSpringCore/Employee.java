package NandiniSpringCore;

import java.util.List;

public class Employee {
	
//	Fields
          private int empId;
         private  String empName;
//         to create a relation between Employee and Address
         private Address address;
         private List<String> contactNos;
         
//         Constructors
        public Employee() {}   //default constructor before parameterized one.
		public Employee(int empId, String empName) {
			super();
			this.empId = empId;
			this.empName = empName;
		}
		
//		Adding one more constructor here for newly added address field of Address class.
		public Employee(int empId, String empName, Address address) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.address = address;
		}
		
//		Adding one more constructor here for newly added contactNos;
		public Employee(int empId, String empName, Address address, List<String> contactNos) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.address = address;
			this.contactNos = contactNos;
		}
		
//		Getters and setters
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

//		new getter and setter for address field
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
//		new getters and setters for contactNo field
		public List<String> getContactNos() {
			return contactNos;
		}
		public void setContactNos(List<String> contactNos) {
			this.contactNos = contactNos;
		}
		
//		init/destroy method
		public void initMethod() {
			System.out.println("Init method");
		}
		public void destroMethod() {
			System.out.println("Destroy method");
		}
		
//		to print Employee information use toString() method::
//		@Override
//		public String toString() {
//			return "Employee [empId=" + empId + ", empName=" + empName + "]";
//		}
		
//		Updating toString() method after adding one more field of Address class
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
		}
		
		
		
		
         
         
}
