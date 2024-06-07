package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {

		System.out.println("Array List :-");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(6);
		arrayList.add(5);
		System.out.println(arrayList);
		

		System.out.println("Linked List :-");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(4);
		linkedList.add(3);
		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(6);
		linkedList.add(5);
		System.out.println(linkedList);
		
		System.out.println("Vector :-");
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(1);
		vector.add(2);
		vector.add(4);
		vector.add(3);
		vector.add(2);
		vector.add(1);
		vector.add(6);
		vector.add(5);
		System.out.println(vector);

		System.out.println("Stack List :-");
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(4);
		stack.add(3);
		stack.add(2);
		stack.add(1);
		stack.add(6);
		stack.add(5);
		System.out.println(stack);

		System.out.println("HashSet List :-");
		HashSet<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(1);
		hashSet.add(6);
		hashSet.add(5);
		System.out.println(hashSet);

		System.out.println("LinkedHashSet List :-");
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();

		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(4);
		linkedHashSet.add(3);
		linkedHashSet.add(2);
		linkedHashSet.add(1);
		linkedHashSet.add(6);
		linkedHashSet.add(5);
		System.out.println(linkedHashSet);

		System.out.println("TreeHashSet List :-");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(6);
		treeSet.add(5);
		System.out.println(treeSet);
		

		System.out.println("Priority Queue List :-");
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(3);

		priorityQueue.add(1);
		priorityQueue.add(2);
		priorityQueue.add(4);
		priorityQueue.add(3);
		priorityQueue.add(2);
		priorityQueue.add(1);
		priorityQueue.add(6);
		priorityQueue.add(5);
		
		System.out.println(priorityQueue);
	}
}
