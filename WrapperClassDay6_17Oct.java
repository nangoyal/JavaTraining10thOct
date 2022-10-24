package capgTraining;

public class WrapperClassDay6_17Oct {
	public static void main(String args[]) {
		int x =10; //Primitive value of Integer type
		
//		valueOf() - primitive to Object
		Integer x1 = Integer.valueOf(x);   //x1 ----object type
		System.out.println(x1.getClass().getName()); //java.lang.Integer
		
//		Autoboxing - primitive to Object
		Integer x2 = 100;        //x2 ----object type
		System.out.println(x2.getClass().getName()); //java.lang.Integer
		
//		xxxValue() - Object to primitive
//		Integer obj
		Integer y1 = new Integer(10);
		Integer y2 = new Integer(100);
		
//	intValue()	
		int y3 = y1.intValue();
		System.out.println(y1); //10
		System.out.println(y3); //10
		
//		AutoUnboxing
		int y4 = y2;
		System.out.println(y2); //100
		System.out.println(y4); //100
		
//		toString() -Converting Wrapper Object to String
		System.out.println(x1.getClass().getName()); //java.lang.Integer
		String str1 =x1.toString();  //java.lang.String
		System.out.println(str1.getClass().getName()); //java.lang.String
	
//		valueOf() - convert String to Wrapper Object
		Integer i1 = Integer.valueOf(str1);
		System.out.println(i1.getClass().getName()); //java.lang.Integer
		
//		valueOf() - primitive to String
		String str2 = String.valueOf(20.02f);
		System.out.println(str2.getClass().getName()); //java.lang.String
		
//		parseXXX() - String to Primitive
//		double d = Double.parseDouble("2000.00"));
		System.out.println();
		
		
		
	}

}
