package capgTraining;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.*;

import lab5_nandini.Employee;
//Set(I)
//duplicates are not allowed.
//insertion order not maintained
//methods are not synchronized
//null values allowed
//Underlying data structures HashTable
//       HashSet(C)
//       LinkedHashSet(C)
//       SortedSet();
//              NavigableSet(I)
//              TreeSet(C)

public class SetDemoDay6_17Oct {
	public static void main(String[] args) {
		
		Set<String> st = new HashSet();
//		HashSet don't maintain insertion order.
		st.add("aaj");
		st.add("ka");
		st.add("din");
		st.add("accha");
		st.add("Hai");
		st.add("aaj");
		st.add(null);
		
		System.out.println(st);
		
		System.out.println();
		
		Set<Integer> st2 = new HashSet<>();
		st2.add(100);
		st2.add(50);
		st2.add(90);
		st2.add(12);
		st2.add(null);  //HashSet and LinkedHashSet both allows null value.
		st2.add(12);    //Duplicates are not allowed in HashSet as well as in LinkedHashSet.
		st2.add(50);
//		HashSet don't maintain insertion order.		
		System.out.println(st2);
		
		System.out.println();
		
		Set<String> lHS= new LinkedHashSet<>();
		lHS.add("aaj");
		lHS.add("ka");
		lHS.add("din");
		lHS.add("accha");
		lHS.add("Hai");
		lHS.add("aaj");
		lHS.add(null);   //HashSet and LinkedHashSet both allows null value.
		
		System.out.println(lHS);
//		LinkedHashSet maintain insertion order.
		
		Set<Integer> hS1 = new LinkedHashSet<>();
		hS1 .add(100);
		hS1 .add(50);
		hS1 .add(90);
		hS1 .add(12);
		hS1.add(null);   //HashSet and LinkedHashSet both allows null value.
		hS1.add(12);     //Duplicates are not allowed in HashSet as well as in LinkedHashSet.
		hS1.add(50);
		
		System.out.println(hS1);
		
		
		System.out.println("TreeSet");	
//		TreeSet used for storing the values in a particular order of sorting.
//		null values are not allowed---null values can not be compared to any other value in sorting --It will throw NullPointerException.
		Set<Integer>ts = new TreeSet<>();
		ts.add(112);
		ts.add(28);
		ts.add(2828);
//		ts.add(null);  //will throw NullPointerException
		ts.add(56);
		
		System.out.println(ts);  //sorting and printing the values in ascending order.
//		[28, 56, 112, 2828]
		
		Set<Character>nandini = new TreeSet<>();
		nandini.add('n');
		nandini.add('a');
		nandini.add('n');
		nandini.add('d');
		nandini.add('i');
		nandini.add('n');
		nandini.add('i');
		
		System.out.println(nandini);
//		[a, d, i, n]----removed duplicates and sorted the characters in alphabetic order.
		
//		System.out.println(nandini.get);
//		CAN'T USE GET METHOD 
		
//		to read the elements can use for loop or Iterator.
//		USING for loop:
		for(Character c:nandini) {
			System.out.print(c+" ");
		}
		
		System.out.println();  //a d i n
			
//		USING Iterator:
		Iterator itr = nandini.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();  //a d i n
		
//		Search
		System.out.println(nandini.contains('y'));  //false
		
		Set<Character>behan = new TreeSet<>();
		behan.add('s');
		behan.add('n');
		behan.add('e');
		behan.add('h');
		behan.add('a');
		
		System.out.println(behan);
//		[a, e, h, n, s]
		
		
//		METHOD to add two TreeSet--->TreeSet1addAll(TreeSet2)
//		addAll method to add two TreeSet
		System.out.println("Before adding : ");
		System.out.println(nandini);
		nandini.addAll(behan);
		System.out.println("After adding : ");
		System.out.println(nandini);  //[a, d, e, h, i, n, s]
		
//		remove
//		System.out.println(nandini.remove(2)); //----> remove won't work as insertion order can't be maintain so we can't remove element Indexwise
//		---------> value wise you can remove
		nandini.remove('n');
		System.out.println(nandini);  //[a, d, e, h, i, s]
		
//		removeAll method
		nandini.removeAll(behan);
		System.out.println(nandini);  //[d, i]
		
//	Convert array to list obj.
		int[] intArr = {10,20,40};
	    List<Integer> nandu = new ArrayList<>();
	    for(int i:intArr) {
	    	nandu.add(i);
	    }
	    
	    System.out.println(nandu);        //[10, 20, 40]
	    System.out.println(nandu.size()); //3
	    
//	    Array.asList() method to convert Array to List.
//	    int[] pari = {15,3,239,92};
//	    List<Integer> sneha = Arrays.asList(pari);  //Constructor you need to make
	    
//	    Convert Set to Array USING toArray() metod---->
//	    int[] objArr = behan.toArray();   --->will generate error as toArray() method return object type that can not be stored in int array.
	    Object[] objArr = ts.toArray();  //Use Object class object to store the returned value from toArray() method.
	    int[] intArr2 = new int[objArr.length];
	    for(int i=0;i<objArr.length;i++) {
	    	int num = (Integer)objArr[i];
	    	intArr2[i] = num;
	    }
	    
//	   Converting String to Primitive data type sing parseInt() ,parseFloat()-----
//	    String to float/int 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Float value");
	    String str =sc.next();     //if entered 2.3f
        System.out.println(str);  //2.3f
        float f = Float.parseFloat(str);
        System.out.println(f);   //2.3
        
//        higher to lower ---need typecasting ---to not loose data
        int f1 = (int)Float.parseFloat(str);
        System.out.println(f1);     //2
	    
//        Storing Custom-Objects --need to override hashcode() and equals() Employee object to Set
        EmployeeDay6_17Oct emp1 = new EmployeeDay6_17Oct(121,"Sita");
		EmployeeDay6_17Oct emp2 = new EmployeeDay6_17Oct(122,"Ram");
		EmployeeDay6_17Oct emp3 = new EmployeeDay6_17Oct(122,"Ram");
		EmployeeDay6_17Oct emp4 = new EmployeeDay6_17Oct(123,"Lakshman");
		EmployeeDay6_17Oct emp5 = emp1;
		
		HashSet<EmployeeDay6_17Oct>hs2= new HashSet<>();
		hs2.add(emp1);
		hs2.add(emp2);
		hs2.add(emp3);
		hs2.add(emp4);
		hs2.add(emp5);
		
		System.out.println(hs2.size());   //4 --->Duplication are not allowed --but it will allow emp2 and emp3 cause ---BECAUSE THERE ARE SEPARATE OBJECT FOR THE VALUES.---but won't allow emp5 as it is duplicate of emp1.
//	IMPORTANT HASHCODE:::	3----after overriding hashcode in Employee class
		System.out.println(hs2);         //[EmployeeDay6_17Oct [empId=122, empName=Ram, salary=0.0], EmployeeDay6_17Oct [empId=121, empName=Sita, salary=0.0], EmployeeDay6_17Oct [empId=123, empName=Lakshman, salary=0.0]]
        
		ArrayList<EmployeeDay6_17Oct> al = new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		System.out.println(al.size());   //5--->Duplicates are allowed so emp5 and emp1 both will contribute in size.(cause they are pointing to the same object).
		System.out.println(al);          //[EmployeeDay6_17Oct [empId=122, empName=Ram, salary=0.0], EmployeeDay6_17Oct [empId=121, empName=Sita, salary=0.0], EmployeeDay6_17Oct [empId=123, empName=Lakshman, salary=0.0]]
		
//        HASHCODE---> hashcode();
//		What is the use of hashcode()--
//		Based on address of Object ,hashcode will be generated.
		System.out.println(emp1.hashCode());  //32017212--->random address
		System.out.println(emp2.hashCode());  //1121454968
		System.out.println(emp3.hashCode());  //1006485584
		System.out.println(emp4.hashCode());  //466505482
		System.out.println(emp5.hashCode());  //32017212
		
//		NOTICE: same hashcode for emp1 and emp5.
//		Using (Overriding) equals() method to based on properties (hashcode) of object 
//		In Employee class create equals method
		
	}
}
