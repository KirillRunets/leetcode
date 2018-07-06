package by.runets.linkedlist.util.singly;


import by.runets.linkedlist.util.generic.List;
import by.runets.linkedlist.util.singly.impl.LinkedList.Node;

public class Solution {
	
	public Node getIntersection (Node first, Node second) {
		Node currentFirst = first;
		Node currentSecond = second;
		
		Node intersections = null;
		while (currentFirst != null && currentSecond != null) {
			if (currentFirst.value < currentSecond.value) {
				currentFirst = currentFirst.next;
			} else if (currentFirst.value > currentSecond.value) {
				currentSecond = currentSecond.next;
			} else {
				
				currentFirst = currentFirst.next;
				currentSecond = currentSecond.next;
			}
		}
		
	/*	while (currentSecond != null && currentFirst != null) {
			if (currentFirst.value < currentSecond.value) {
				currentFirst = currentFirst.next;
			} else if (currentFirst.value > currentSecond.value) {
				currentSecond = currentSecond.next;
			} else {
				
				currentFirst = currentFirst.next;
				currentSecond = currentSecond.next;
			}
		}*/
		return intersections;
	}
	
	public void push (Node node, int value) {
		
	}
	
}
