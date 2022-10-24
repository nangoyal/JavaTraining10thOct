package capgTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;


public class ListDemoDay6_17Oct {
	public static void main(String args[]) {
		
		new ArrayList();
		List a1 = new ArrayList(); //Do use LIST ----taaki sari classes you can use
//		FOR HETEROGENOUS DATA TYPES ---use collections object
//		FOR HOMOGENEOUS DATA TYPES --- use Generics (Templates)---specify the data type ---speceic data type you can keep by mentioning it.
//		ArrayList al2 = new ArrayList();
		a1.add(Integer.valueOf(10));
		a1.add(20);  //
		a1.add("Hello");
		a1.add(false);
		a1.add(10.22f);
		a1.add(10.22f);  //Duplicates are allowed
		a1.add(null);  //null values are allowed
		System.out.println(a1);  //[10, 20, Hello, false, 10.22, 10.22, null]
		System.out.println(a1.size()); //7
		
//		Read Element
		System.out.println(a1.get(2)); //"Hello"
		
//		length
		System.out.println(a1.size()); //7

//		iterate
//		USING THE LOOP
		for(int i=0;i<a1.size();i++)
		{
			System.out.print(a1.get(i)+" "); //10 20 Hello false 10.22 10.22 null 
		}
		 
		System.out.println();
//		USING iterator()
		
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {    //hasNext method 
			System.out.print(itr.next()+" ");  //10 20 Hello false 10.22 10.22 null 
		}
		
		System.out.println();
		
//		ListIterator---left to right

		ListIterator listItr = a1.listIterator();
		while(listItr.hasNext())     
		{
			System.out.print(listItr.next()+" "); //10 20 Hello false 10.22 10.22 null 
		}
		
		System.out.println();
		
//		hasPrevious() method ----Back to front --Left to right -----Method helps to read elements in reverse order
		while(listItr.hasPrevious()) {
			System.out.print(listItr.previous()+" ");  //null 10.22 10.22 false Hello 20 10
		}
		
		System.out.println();
		
//		GENERICS
//		HOMOGENEOUS data types 
//		Only one particular data type values you can store.
		List<Double> al3 = new ArrayList<>();
		al3.add(15.23);
//		al3.add(10);----not double ---compiler error
		
		List<String> al4 = new ArrayList<>();
		al4.add("nandini");
		al4.add("pari");
	
//	Iterate
		System.out.println();
		for(Double nan: al3) {
			System.out.println(nan);  //15.23
		}
		
		System.out.println();
		for(String go:al4)
		{
			System.out.println(go);  //nandini
//			pari
		}
		
		List<EmployeeDay6_17Oct> al5 = new ArrayList<>();
		EmployeeDay6_17Oct emp1 = new EmployeeDay6_17Oct(121,"Sita");
		EmployeeDay6_17Oct emp2 = new EmployeeDay6_17Oct(122,"Ram");
		al5.add(emp2);
		al5.add(emp2);
		al5.add(new EmployeeDay6_17Oct(121,"Sita"));
		al5.add(new EmployeeDay6_17Oct(122,"Arjun"));
		
		System.out.println(al5);  //IT WILL PRINT SOME HASHCODE
//		[capgTraining.EmployeeDay6_17Oct@6b143ee9, capgTraining.EmployeeDay6_17Oct@6b143ee9, capgTraining.EmployeeDay6_17Oct@1936f0f5, capgTraining.EmployeeDay6_17Oct@6615435c]
		
//      to Print the values ----Convert wrapper class to String
//		use toString() method in Employee class
//		Output: //		[EmployeeDay6_17Oct [empId=122, empName=Ram, salary=0.0], EmployeeDay6_17Oct [empId=122, empName=Ram, salary=0.0], EmployeeDay6_17Oct [empId=121, empName=Sita, salary=0.0], EmployeeDay6_17Oct [empId=122, empName=Arjun, salary=0.0]]
		
		Iterator itr2 = al5.iterator();
		while(itr2.hasNext())
		{
//		next method here will return object not Employee.
//	    By default all classes are child for object class.
//		Typecast object to the product (Employee).
//		Here we are trying to store child to parent....that's why compiler will produce error here.
//	Converting Object to Employee....we are using typecasting here
		EmployeeDay6_17Oct emp = (EmployeeDay6_17Oct)itr2.next();    
		System.out.println(emp.empId + " " +emp.empName);   //122 Ram
                                                           //		    122 Ram
                                                         //		    121 Sita
                                                           //		    122 Arjun
		}
		
//		EXPLORE VARIOUS METHODS IN ARRAYLIST ------------>
		a1.addAll(al4);    //to add one list to another
	    System.out.println();
//		a1.contains(al4);    //contains() method to check whether it is present or not.
	    System.out.println(a1);   //[10, 20, Hello, false, 10.22, 10.22, null, nandini, pari]
		
		
//		FOR-EACH to iterate 
	    a1.remove(2);
		System.out.println(a1); //[10, 20, false, 10.22, 10.22, null, nandini, pari]
		
//		get and set method
		
	}
	

}
