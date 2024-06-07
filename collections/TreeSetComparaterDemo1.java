package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparaterDemo1 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparater());

		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("xx");
		t.add("ABCD");
		t.add("A");

		System.out.println(t);
	}
}

class MyComparater implements Comparator {

	@Override
	public int compare(Object o11, Object o22) {

		String o1 =o11.toString();
		String o2 =o22.toString();
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else {
			return o1.compareTo(o2);
		}
	}
}
