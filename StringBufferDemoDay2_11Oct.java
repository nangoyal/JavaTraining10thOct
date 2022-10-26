package capgTraining;

public class StringBufferDemoDay2_11Oct {
	public static void main(String args[]) {
//		String Buffer is mutable string
		StringBuffer sb1 = new StringBuffer("muskan");
		StringBuffer sb2 = new StringBuffer("tumsehi");
		StringBuffer sb3 = sb1;
		StringBuffer sb4 = new StringBuffer();
		
		System.out.println(sb1);
		System.out.println(sb2);
        System.out.println(sb3);
        
        System.out.println();
//        Comparison
        System.out.println(sb1==sb2); //false
        System.out.println(sb2==sb3); //false
        System.out.println(sb1==sb3); //true
        System.out.println(sb3==sb4); //false
        
        System.out.println(sb1.equals(sb3)); //true
        
//        Length
        System.out.println(sb1.length()); //6
        System.out.println(sb1.capacity()); //22
//        (oldcapacity*2)+2 
        System.out.println(sb4.capacity()); //16
		
        sb4.append("nandini abhi pdle");
        System.out.println(sb4.length()); //17
        System.out.println(sb4.capacity()); //34
//		ABHI MUJHE CAPACITY MAI DOUBT HAI THODA
	}

}
