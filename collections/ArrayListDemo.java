package collections;

import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Attendance> al = new ArrayList<>();
		al.add(new Attendance("Nitin", "PECM28", "Nitin@gmail.com", 9767066384l));
		al.add(new Attendance("Akash", "PECM28", "Akash@gmail.com", 9767066384l));
		al.add(new Attendance("Pravin", "PECM28", "Nitin@gmail.com", 9767066384l));
		al.add(new Attendance("Nand", "PECM28", "Nitin@gmail.com", 9767066384l));

		System.out.println(checkemail(al, "Akash@gmail.com"));

		ArrayList arrayList = new ArrayList();
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("10");
		arrayList.add("100");
		arrayList.add("-1000");
//		String  str = (String) arrayList.get(3);
//		System.out.println();
//		ListIterator listIterator =arrayList.listIterator(arrayList.size());
//		
//		while (listIterator.hasPrevious()) {
//		int integer =(Integer)	listIterator.previous();
//		System.out.println(integer);
//		}
//		
		ArrayList<Boolean> arrayList2 = new ArrayList<>();
		arrayList2.add(true);
		arrayList2.add(false);
		arrayList2.add(true);
		arrayList2.add(true);
		arrayList2.add(false);
		arrayList2.add(true);
		Collections.sort(arrayList2);
		System.out.println(arrayList2);
	
		;
		System.out.println(Collections.max(arrayList));
		
		
		System.out.println(Collections.min(arrayList));
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		Collections.reverse(arrayList);
		System.out.println(arrayList);

		Collections.rotate(arrayList,2);
		System.out.println(arrayList);
		
		Collections.shuffle(arrayList);
		System.out.println("shuffle:-"+arrayList);
		Collections.shuffle(arrayList);
		System.out.println("shuffle:-"+arrayList);
		Collections.shuffle(arrayList);
		System.out.println("shuffle:-"+arrayList);
		
		Collections.swap(arrayList,1,2);
		System.out.println("SWAP "+arrayList);
		
		System.out.println("Frequency:-"+Collections.frequency(arrayList, "1"));
		
		System.out.println("binary Search :-"+Collections.binarySearch(arrayList, "10"));
	}

	public static ArrayList<Attendance> checkemail(ArrayList<Attendance> al, String email) {
		ArrayList<Attendance> filter = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			Attendance attendance = (Attendance) al.get(i);
			if (attendance.email.equals(email)) {
				filter.add(al.get(i));
			}
		}

		return filter;
	}
}