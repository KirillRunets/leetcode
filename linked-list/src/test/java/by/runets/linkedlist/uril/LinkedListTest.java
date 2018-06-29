package by.runets.linkedlist.uril;

import by.runets.linkedlist.util.List;
import by.runets.linkedlist.util.impl.LinkedList;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	private List<Integer> expected;
	
	@Before
	public void setUp () {
		
		expected = new LinkedList<>();
		expected.add(0, 0);
		expected.add(1, 1);
		expected.add(2, 2);
		expected.add(3, 3);
		expected.add(4, 4);
	}
	
	@Test
	public void testAddAtHead () {
		expected.print();
	}
	
	@Test
	public void testAddAtTail () {
		
	}
	
	@Test
	public void testDelete () {
		expected.remove();
		expected.remove();
		expected.remove();
		expected.print();
	}
}
