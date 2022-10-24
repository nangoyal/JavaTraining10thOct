package capgTraining;
import java.util.Scanner;

public class ExceptionHandlingDemoDay4_13Oct {
	
//	    static String str; //null //TO ACCESS VARIABLE str inside Static method --the variable need to be STATIC.
	    String str; //null //non-static
//	
		static EmployeeDay6_17Oct emp; //null
//		MAKE IT STATIC OTHERWISE emp.getSalary() will throw an error like "can not make a static reference to non-static field emp"
		public static void main(String[] args) throws InvalidAgeExceptionDay4_13Oct{
			
			ExceptionHandlingDemoDay4_13Oct ed = new ExceptionHandlingDemoDay4_13Oct();
		
			try{
			String str = "Hello World"; //local variable 
		System.out.println(str.charAt(str.length())); //      StringIndexOutOfBoundsException String index out of range: 11
//		System.out.println(str.charAt(str.length()-1));  //d
		
		
		System.out.println(10/0);  //ArithmeticException : / by zero
		
		int[] intArr = new int[] {10,20,30};
		System.out.println(intArr[intArr.length]);  //ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//	    System.out.println(intArr[intArr.length-1]);  //30
	    
		Integer i = new Integer("abc");  //NumberFormatException: For input string: "abc"
////		Integer is a WRAPPER CLASS HERE --i is wrapper class object.
		System.out.println(i);
		
//			Converting From STRING TO INTEGER
		Integer i1 = new Integer("10");
		System.out.println(i1); //10
////		
		System.out.println(emp.getSalary()); //NullPointerException: Cannot invoke "capgTraining.EmployeeDay6_17Oct.getSalary()" because "capgTraining.ExceptionHandlingDemoDay4_13Oct.emp" is nul
	    emp = new EmployeeDay6_17Oct(50000.00);
	    System.out.println(emp.getSalary());    //50000.0
   
		ed.str = "Nandini";
		System.out.println(ed.str.length());
		
//		System.out.println(ed.str.length()); //11
////		Access non-static variable in static method by creating object of the it's class.
		
		} 
		
		catch(StringIndexOutOfBoundsException e) {
//			METHODS in EXCEPTION CLASS of JAVA.
			e.printStackTrace();		
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch(NullPointerException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}	
//	CASE 2
//		SINGLE CATCH BLOCK FOR ALL EXCEPTIONS USING PIPE OPERATOR
		try {
			System.out.println(10/0);
		} catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException |NumberFormatException | ArithmeticException e ) {
			e.printStackTrace();
		}
//		//		If you will not add ArithmeticException here ...code will terminate there only and will not print "Ootside catch block". 
		
//		CASE3
//		try-catch-finally
		try {
			System.out.println(10/0);
		} catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException |NumberFormatException | ArithmeticException e ) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
		}
		
//		throw/throws example
		try {
		ed.m1();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Outside try block");

		} //main method ends here
//		if you want to create new method --don't define methods inside the main method----Inside the method you can't declare another method.
		

		void m1() throws ArrayIndexOutOfBoundsException{
			 //m1 method calling m2 method.
			try {
				m2(); 
			} catch(ArrayIndexOutOfBoundsException | InvalidAgeExceptionDay4_13Oct e) {
				e.printStackTrace();
			}
		}
		
		void m2() throws ArrayIndexOutOfBoundsException,InvalidAgeExceptionDay4_13Oct{
			m3(); //m1 method calling m2 method.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Age");
			int age = sc.nextInt();
			if(age<5) {
				throw new InvalidAgeExceptionDay4_13Oct("Age should be greater than 10");
			}
			try {
				m3();
			} catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		
//		m3() will throw the exception to it's caller that is m2() here 
		
		void m3() throws ArrayIndexOutOfBoundsException{
			int[] arr = {10,20,30};
			System.out.println(arr[3]); //arr[3] doesn't exist
//			ArrayIndexOutOfBoundsException will occur here.
//			program will terminate at ed.m1()
// 		    with this exception --ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
          }			
}
