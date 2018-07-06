package by.runets.linkedlist.uril;

import by.runets.linkedlist.util.singly.List;
import by.runets.linkedlist.util.singly.Solution;
import by.runets.linkedlist.util.singly.impl.LinkedList;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	private Solution solution = new Solution();
	private List<Integer> list;
	
	@Before
	public void setUp () {
		list = new LinkedList();
		list.addAtHead(1);
		list.addAtTail(2);
		list.addAtTail(3);
		list.addAtTail(4);
	}
	
	@Test
	public void testAddAtHead () {
		System.out.println(list);
	}
	
	@Test
	public void testAddAtTail () {
		
	}
	
	@Test
	public void testDelete () {
/*
		solution.getIntersection(node1, node2).print();
*/
	}
}
