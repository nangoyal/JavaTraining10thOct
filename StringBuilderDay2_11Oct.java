package capgTraining;

public class StringBuilderDay2_11Oct {
	public static void main(String args[]) {
		StringBuilder sbd1 = new StringBuilder("nandini");
		StringBuilder sbd2 = new StringBuilder("coding");
		StringBuilder sbd3 = new StringBuilder("Best wali kar");
	    StringBuilder sbd4 = sbd1;
	    
	    System.out.println(sbd1==sbd2); //false
	    System.out.println(sbd1==sbd3); //false
	    
	    System.out.println(sbd1.equals(sbd2)); //false
	    System.out.println(sbd1.equals(sbd4)); //false
	    
	    System.out.println();
	    
	    String str = "Hello World";
	    StringBuilder sbd5 = new StringBuilder(str);
	    System.out.println(sbd5 instanceof StringBuilder);
	    
	    sbd5.reverse();
	    System.out.println(sbd5); //true
	    
	    String revString = new String(sbd5); //dlroW olleH
	    System.out.println(revString instanceof String); //true
	    System.out.println(revString); //dlroW olleH
	    
	}

}
