package collections;

import java.security.DomainCombiner;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {
	public static void main(String[] args) {
	
		LinkedHashSet h = new LinkedHashSet();

		h.add('z');
		h.add('a');
		h.add('f');
		h.add('v');
		h.add(null);
		h.add(10);
		System.out.println(h.add('z'));
		System.out.println(h);
	}
}
