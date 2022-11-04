package NandiniSpringCore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("prototype")
public class Student {
         private int rollNo;
         private String name;
         @Autowired  //Dependency Injection - Field Injection
         private List<Course> course;
         
        public Student() {}
		public Student(int rollNo, String name) {
			super();
			this.rollNo = rollNo;
			this.name = name;
		}
	
//		@Autowired - Constructor Injection
		public Student(int rollNo, String name, List<Course> course) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.course = course;
		}
		
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Course> getCourse() {
			return course;
		}
		
//		@Autowired --Setter Injection 
		public void setCourse(List<Course> course) {
			this.course = course;
		}
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
		}
		
		
        
}
