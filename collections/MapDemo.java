package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(45, "Dany");
		hashMap.put(45, "Dyaneshwer");
		hashMap.put(5, "Akashay");
		hashMap.putIfAbsent(5, "Shivam");
		hashMap.put(1, "Nitin");
		hashMap.put(22, "Nand");
		hashMap.put(3, "Pravin");
		
		
		System.out.println(hashMap);
		
		for (Integer integer : hashMap.keySet()) {
			System.out.println(integer+" ");   
		}
		for (String value : hashMap.values()) {
			System.out.println(value+" ");   
		}
		
		System.out.println(hashMap.keySet());   // {1,2,3,4,5}
		System.out.println(hashMap.values());   // {Nitin, NandKumar, Pravin, Dany, Akashay}
		System.out.println(hashMap.isEmpty());   // false
		System.out.println(hashMap.size());       // 5
//		hashMap.clear();
		System.out.println(hashMap.replace(4, "Amol"));
		System.out.println(hashMap);
		System.out.println(hashMap.remove(3));
		System.out.println(hashMap);
		System.out.println(hashMap.containsKey(1));
		System.out.println(hashMap.containsValue("NandKumar"));
		
		TreeMap<Integer, String> treemap = new TreeMap<>(); 
		
		treemap.put(1, "Akash");
		treemap.put(20, "Vaibhav");
		treemap.put(33, "Sachin");
		treemap.put(15, "Shubh");
		treemap.put(45, "Lakshit");
		
		System.out.println(treemap);
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(1));
		
		
		
	}
}