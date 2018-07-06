package by.runets.linkedlist.util.singly.impl;

import by.runets.linkedlist.util.singly.List;

public class LinkedList implements List<Integer> {
	private Node first;
	private Node last;
	
	@Override
	public void addAtHead (Integer value) {
		final Node newNode = new Node(value, new Node());
		if (first == null) {
			first = newNode;
			last = first;
		} else {
			newNode.next = first;
			first = newNode.next;
		}
	}
	
	@Override
	public void add (int index, Integer value) {
	}
	
	@Override
	public void addAtTail (Integer value) {
		final Node newNode = new Node(value, new Node());
		if (last == null) {
			first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	@Override
	public void remove (int index) {
		
	}
	
	@Override
	public void remove () {
		
	}
	
	@Override
	public void print () {
		while (first != null) {
			System.out.println(first);
			first = first.next;
		}
	}
	
	@Override
	public Integer get (int index) {
		return 0;
	}
	
	@Override
	public String toString () {
		return "LinkedList{" +
				"first=" + first +
				", last=" + last +
				'}';
	}
	
	public static class Node {
		public int value;
		public Node next;
		
		public Node () {
		}
		
		public Node (int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public int getValue () {
			return value;
		}
		
		public void setValue (int value) {
			this.value = value;
		}
		
		public Node getNext () {
			return next;
		}
		
		public void setNext (Node next) {
			this.next = next;
		}
		
		@Override
		public String toString () {
			return "Node{" +
					"value=" + value +
					", next=" + next +
					'}';
		}
	}
}
