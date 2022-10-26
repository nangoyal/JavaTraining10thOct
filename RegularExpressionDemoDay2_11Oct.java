//Day2 : Regular Expressions: -MetaCharacters and Quantifiers in JAVA 
package capgTraining;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemoDay2_11Oct {
     public static void main(String[] args) {
    	 
//  case1:
//    	 Using compile() method and Pattern class Object
    String str = "999.2.300.1";
    Pattern p = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");
    
//    (Why we are using two backslash here ??)
//        
//    Invoke match operation over the pattern.
    Matcher m = p.matcher(str);
//    Now to answer whether it is matching or not.
    System.out.println(m.matches()); //true
    System.out.println(m.group());    //999.2.300.1
    System.out.println(m.group(1));
    System.out.println(m.group(2));
    System.out.println(m.group(3));
    System.out.println(m.group(4));
    
    
//  case2:
//           
    boolean b2 = Pattern.compile(".s").matcher("@s").matches();
    System.out.println(b2); //true
   
     
//  case3:
    boolean b3 = Pattern.matches("mrs?\\.","mr");
    System.out.println(b3); //false
    
    String contactNo = "124 2651616";
//    System.out.println(Pattern.matches("(\\d{3})\\s{1}(\\d{7})", contactNo)); //true
     
    Pattern p1 = Pattern.compile("(\\d{3})\\s{1}(\\d{7})");
    Matcher m1 = p1.matcher(contactNo);
    System.out.println(m1.matches()); //true
    System.out.println(m1.group());
    System.out.println(m1.group(1)); //124
    System.out.println(m1.group(2)); //2651616
    
//    equal() operator
    if(m1.group(1).equals("124")) {
    	System.out.println("std code is not matching");
    }
//    OR
//    GENERATING ERROR IDK Why?????
//    if(Integer.parseInt(m1.group(1)!=124)) {
//    	System.out.println("std code is not matching");
//    }
//     
     }  
}


//Practice:
//flyingreturn.base@airindia.in
//star.retros@airindia.in
//1860 233 1407
//020-26231407
//0930 hrs - 1730 hrs
// MTNL/BSNL
// +91 124 2671889 (International call rates applicable)
// either Mr or Mrs.
