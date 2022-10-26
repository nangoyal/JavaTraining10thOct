package capgTraining;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//Comparable is an interface present in java.lang package.

public class ComparableDay7_18Oct {
	
	public static void main(String[] args) {
		
		EmployeeDay6_17Oct emp1 = new EmployeeDay6_17Oct(103,"Ram");
		EmployeeDay6_17Oct emp2 = new EmployeeDay6_17Oct(102,"Sam");
		EmployeeDay6_17Oct emp3 = new EmployeeDay6_17Oct(101,"Mani");
		
		ArrayList<String> al = new ArrayList<>();
		ArrayList<Integer>al2 = new ArrayList<>();
		al.add("aa");
		al.add("cc");
		al.add("bb");
		al.add("xx");	
		System.out.println(al);    //[aa, cc, bb, xx]
		
//		Collection provides methods to work on Collection objects.
//		Collection.sort() method:::
		Collections.sort(al);      //---->By default it will sort all the elements in ascending order.
//		sorted ArrayList:::
		System.out.println(al);    //[aa, bb, cc, xx]
		
//		Integer i = 10;     ///Wrapper class object
//		String str = "Hello";
		
		al2.add(2001);
		al2.add(173);
		al2.add(300);
		al2.add(292);
		System.out.println(al2);   //---->[2001, 173, 300, 292]
	    Collections.sort(al2);
	    System.out.println(al2);   //---->[173, 292, 300, 2001]
	    
	    List<EmployeeDay6_17Oct> empLst = new ArrayList<>();
	    empLst.add(emp1);
	    empLst.add(emp2);
	    empLst.add(emp3);
	    System.out.println(empLst);  //[EmployeeDay6_17Oct [empId=103, empName=Ram, salary=0.0], EmployeeDay6_17Oct [empId=102, empName=Sam, salary=0.0], EmployeeDay6_17Oct [empId=101, empName=Mani, salary=0.0]]
	    
//	    To sort elements from the user-defined class objects and on some variable basis ---you need to implement Comparable interface with compareTo() method in that class.
//		Use Comparable Interface to Compare the employee objects on the basis of Id in DAY7 Comparable class.
//	    implements Comparable<EmployeeDay6_17Oct>
//		@Override
//		public int compareTo(EmployeeDay6_17Oct o) {
//			if(this.empId>o.empId) {
//				return 1;
//			}  else if(this.empId<o.empId) {
//				return -1;
//			}  else {
//				return 0;
//			}
//			---->either use ternary operator or if-else statement :::: return this.empId>o.empId?100:this.empId<o.empId?-100:0;
//		}
	
	    Collections.sort(empLst);
	    System.out.println(empLst);  //[EmployeeDay6_17Oct [empId=101, empName=Mani, salary=0.0], EmployeeDay6_17Oct [empId=102, empName=Sam, salary=0.0], EmployeeDay6_17Oct [empId=103, empName=Ram, salary=0.0]]
        
	    
	    
	    
	    
	}

}
