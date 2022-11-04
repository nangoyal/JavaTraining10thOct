package NandiniSpringCore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
//		Employee emp1 = new Employee(1001,"Ram");
//		
////		other way of setter injection ::: intializing and declaring values here.
//		Employee emp2 = new Employee();   //if will try to access id and name would be 0 and null;
//		
////		GETTERS SETTERS USE
////		To initialize the values call setter method..
//		emp2.setEmpId(1002);
//		emp2.setEmpName("Sam");
//		
////		get method
//		System.out.println(emp1.getEmpName());  //Ram
//		System.out.println(emp2.getEmpName());  //		Sam
//		
//		Address addr1 = new Address(2001,"Chennai","TamilNadu");
//		
//		Address addr2 = new Address();
//		addr2.setAddrId(3001);
//		addr2.setCity("Agra");
//		addr2.setState("UttarPradesh");
//		
//		System.out.println(addr1.getCity());  //Chennai
//		System.out.println(addr2.getState());   //UttarPradesh
		
		
//		Now we aren't gonna use new keyword .....just ask Container to provide the objects by using provided configurations by you.
//		Before asking we need to add configuration in the XML file.
		
//	BEFORE SPRING WE USED TO DO LIKE IT.	
//		Address addr = new Address(1020,"Lucknow","U.P.");
//		Employee emp = new Employee(67126,"Kshitiz",addr);
		
//		Create BeanFactory Container
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
//		deprecated ---ignore---future mai won't available.
		
//		Get bean from BeanFactory
		Employee emp1 = (Employee)factory.getBean("empBean1");
//		Print details 
		System.out.println(emp1.getEmpId());  //1001
		System.out.println(emp1.getEmpName());  //Ram
		
		
//		now creating object emp2 using empBean2 configuration..
		Employee emp2 = (Employee)factory.getBean("empBean2");
		
		System.out.println(emp2.getEmpId());  //2981
		System.out.println(emp2.getEmpName());  //Seeta
		
//		Get Address object from container
		Address addr1 = (Address)factory.getBean("addrBean1");
		Address addr2 = (Address)factory.getBean("addrBean2");
		Address addr3 = (Address)factory.getBean("addrBean3");
		
		System.out.println(addr1.getCity());  //Agra
		System.out.println(addr2.getCity());  //Gurgaon
		System.out.println(addr3.getState());  //TamilNadu
		
//		before spring we used to create object like this
//		Address addr = new Address(102,"Agra","U.P.");
//		Employee emp = new Employee(46728,"Nandini",addr);
		
//		AFTER INJECTING addrBean1 to empBean1
		Employee emp3 = (Employee)factory.getBean("empBean1");
		System.out.println(emp3.getEmpName()); //Ram
		System.out.println(emp3.getAddress()); //Address [addrId=786, city=Agra, state=UttarPradesh]
		System.out.println(emp3.getAddress().getCity()); //Agra
		System.out.println(emp3.getContactNos());  //[9999911111, 9999911112, 9999911113]
		
//		Setter Injection
//		create ApplicationContext container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetterInjection.xml");
		
		Employee emp4 = (Employee)context.getBean("empBean1");
		Address addr4 = (Address)context.getBean("addrBean1");
		
		System.out.println(emp4.getEmpName());   //Ram
		System.out.println(emp4.getAddress());   //Address [addrId=2005, city=Hyderabad, state=Telangana]
		System.out.println(addr4.getCity());      //Hyderabad
		
//		Singleton/prototype example
		Employee emp5 = (Employee)factory.getBean("empBean1");
		Employee emp6 = (Employee)factory.getBean("empBean1");
		
//		QUE????? how you can identify here whether the factor is giving separate object or same object here.
//		USING Hashcode ,,,,budddyy!!
		
//		COMPARE THE HASHCODES
		System.out.println(emp5.hashCode());
		System.out.println(emp6.hashCode());
//		what to use .equal or ==
//		== is ref comparison
		System.out.println(emp5 == emp6);
//		true-for scope ="singleton" and false for scope = "prototype" ...same hashcodes

//		AnnotationBasedConfigurations
		System.out.println("Anotation Based Configuration");
		System.out.println("-----------------------------");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContextAnnotationConfig.xml");
        
		Student stu1 = context2.getBean("student",Student.class);
		Student stu2 = context2.getBean("student",Student.class);
		
		System.out.println("Before update ======");
		System.out.println(stu1.getName()); //null  
		System.out.println(stu2.getName());  //null
		System.out.println();
//		TO INITIALIZE THE VALUES USING set method
		stu1.setRollNo(100);
		stu1.setName("Ridhhi");
		
		stu2.setRollNo(200);
		stu2.setName("Bhavya");
		
		System.out.println("After update ======");
		System.out.println(stu1.getName());  //Bhavya-Singleton--Riddhi-Prototype
		System.out.println(stu2.getName());  //Bhavya
//		be default -Singleton scope
//		use @Scope("prototype") annotation here 
		System.out.println(stu1.getRollNo()); //200-Singleton---100-Prototype
		System.out.println(stu2.getRollNo());  //200
		System.out.println("Student2 courses: " +stu2.getCourse());  //null--without adding @Autowired
		                                       //after adding @Autowired (used to add dependencies)--[Course [courseId=0, courseName=null]]
		
		
		System.out.println("Inside the Course");
		Course course = context2.getBean("myCourse",Course.class);
		System.out.println(course.getCourseName()); //null
		
//		Employee emp7 = context2.getBean("employee",Employee.class);
//		System.out.println(emp7);
		
		course.setCourseId(2022);
		course.setCourseName("JAVA");
		
		List<Course> courses = new ArrayList<>();
		courses.add(course);
		stu2.setCourse(courses);
		
		System.out.println();
		
		System.out.println(stu2.getCourse());  //[Course [courseId=2022, courseName=JAVA]]
		
//		Java based configuration //No xml
//		JavaBased Config example
		AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext(AppConfig.class);
		Student stu3 = context3.getBean("student", Student.class);
		System.out.println(stu3);  //Student [rollNo=0, name=null, course=[Course [courseId=0, courseName=null], Course [courseId=0, courseName=null]]]

		
		
	}

}
