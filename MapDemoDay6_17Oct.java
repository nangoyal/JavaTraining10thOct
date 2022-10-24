package capgTraining;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
/*
/*
 *  Map(I) - is not part of Collection
 *   - if you want to store values in the form of 'key' & 'value' pairs
 *   - duplicate keys are not allowed
 *   - duplicate values allowed
 *   - null keys allowed, only once
 *   - null values allowed 
 *  
 *   
 *   Map(I) - SortedMap(I)
 *              - TreeMap(C)
 *                  - insert entries in sorting order
 *          - HashMap(C)
 *              - Won't maintain insertion order
 *          - LinkedHashMap(C)
 *                  - Insertion order maintained 
 *          - HashTable(C) -1.0v - legacy class
 *                         - Thread safe
 *                         - methods are synchronized
 *                         - doesn't allow null key & value
 *                         - performance low
 */

public class MapDemoDay6_17Oct {
	public static void main(String[] args) {
		Map<String,Integer> marks = new HashMap<>();
		
//		insert values
		marks.put("Nandini",15);
		marks.put("Seeta", 90);
		marks.put("Ram", 198);
		marks.put("Aastha",18);
		marks.put("Ram", null);
		marks.put(null, null);
		marks.put(null, null);
		marks.put("Ajay", 90);
//		Duplicate keys are not allowed.
//		Duplicate values are allowed.
//		Duplicate null key & value is allowed.
		
		
		System.out.println(marks);  //{null=null, Seeta=90, Nandini=15, Aastha=18, Ajay=90, Ram=null}

//		TO READ
		System.out.println(marks.get("Aastha")); //18
		
//		OPTION 1:
//		Iterate Map obj
//		To iterate Map Interface need to call entrySet() method that will return Set Object so need to convert Map to Set.
//		Convert Map to Set
//		import java.util.Map.Entry;
		Set<Entry<String,Integer>> setObj = marks.entrySet();
//		entrySet() Method convert map object into set object.
//		getKey() method
//		getValue() method
		for(Entry<String,Integer> el:setObj) {
			System.out.print("Key:" +el.getKey() +" ");
			System.out.println();
			System.out.print("Value:" +el.getValue()  +" ");
//			Key:null Value:null 
//			Key:Seeta Value:90 
//			Key:Nandini Value:15 
//			Key:Aastha Value:18 
//			Key:Ajay Value:90 
//			Key:Ram SValue:null 
		}
		
//		OPTION 2:
		System.out.println();
		
		Iterator<Entry<String,Integer>> itr = setObj.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()+" | ");
		}
//		null=null | 
//		Seeta=90 | 
//	    Nandini=15 | 
//		Aastha=18 | 
//		Ajay=90 | 
//		Ram=null | 
//		
//		Search
		System.out.println();
		System.out.println(marks.containsKey("Nandini")); //true
		System.out.println(marks.containsKey("Ritik")); //false
		System.out.println(marks.containsValue(null));  //true
		
//		remove method
		marks.remove("Nandini");
		System.out.println(marks);  //{null=null, Seeta=90, Aastha=18, Ajay=90, Ram=null}

//		LinkedHashMap
//		Insertion order will be maintained.
		Map<String,Integer>marks1 = new LinkedHashMap<>();
		
//		insert values
		marks1.put("Nandini",15);
		marks1.put("Seeta", 90);
		marks1.put("Ram", 198);
		marks1.put("Aastha",18);
		marks1.put("Ram", null);
		marks1.put(null, null);
		marks1.put(null, null);
		marks1.put("Ajay", 90);
//		Duplicate keys are not allowed.
//		Duplicate values are allowed.
//		Duplicate null key & value is allowed.

		
		System.out.println(marks1);  //

//		TO READ
		System.out.println(marks.get("Aastha")); //
		
//		OPTION 1:
//		Iterate Map obj
//		To iterate Map Interface need to call entrySet() method that will return Set Object so need to convert Map to Set.
//		Convert Map to Set
//		import java.util.Map.Entry;
		Set<Entry<String,Integer>> setObj1 = marks1.entrySet();
//		entrySet() Method convert map object into set object.
//		getKey() method
//		getValue() method
		for(Entry<String,Integer> el:setObj1) {
			System.out.print("Key:" +el.getKey() +" ");
			System.out.println();
			System.out.print("Value:" +el.getValue()  +" ");
//			Key:null Value:null 
//			Key:Seeta Value:90 
//			Key:Nandini Value:15 
//			Key:Aastha Value:18 
//			Key:Ajay Value:90 
//			Key:Ram Value:null 
		}
		
//		OPTION 2:
		System.out.println();
		
		Iterator<Entry<String,Integer>> itr1 = setObj1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next()+" | ");
		}

//		Search
		System.out.println();
		System.out.println(marks1.containsKey("Nandini")); //true
		System.out.println(marks1.containsKey("Ritik")); //false
		System.out.println(marks1.containsValue(null));  //true
		
//		remove
		
//		TreeMap -asc
//		Map<String,Integer>marks = new TreeMap<>();
//		HashTable - null keys/values not allowed.
//		Map<String,Integer>marks = new HashTable<>();
//		HashMap - null keys/values are not allowed.
			
	}

}
