package by.runets.linkedlist.util.ordinary.impl;


import by.runets.linkedlist.util.ordinary.List;

public class LinkedList implements List {
	private int size;
	private Node first;
	private Node last;
	
	@Override
	public void addAtHead (int value) {
		Node newNode = new Node(value, null, null);
		if (first == null) {
			first = newNode;
			last = first;
		} else {
			newNode.next = first;
			first.prev = newNode;
		}
		++size;
	}
	
	@Override
	public void add (int index, int value) {
		if (index < 0 || index > size) {
			return;
		}
		
		int count = 0;
		Node newNode = new Node(value, null, null);
		Node current = first;
		
		if (index == 0) {
			addAtHead(value);
		} else if (index == size) {
			addAtTail(value);
		}
		
		if (first != null && last != null) {
			while (current != last) {
				current = current.next;
				++count;
				if (count == index) {
					newNode.prev = current;
					newNode.next = current.next;
					if (current.next != null) {
						current.next.prev = newNode;
					}
					current.next = newNode;
				}
			}
		}
	}
	
	@Override
	public void addAtTail (int value) {
		Node newNode = new Node(value, null, null);
		if (last != null) {
			newNode.prev = last;
			last.next = newNode;
			last = newNode;
			++size;
		}
	}
	
	@Override
	public void remove (int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + " bigger then list size: " + size);
		}
		int count = 0;
		Node current = first;
		while (current != last) {
			if (count == index) {
				Node newPrev = current.prev;
				Node newNext = current.next;
				
				if (current.next != null) {
					current.next.prev = newPrev;
				}
				
				current.prev.next = newNext;
			}
			current = current.next;
			count++;
		}
	}
	
	@Override
	public void remove () {
		first = first.next;
	}
	
	@Override
	public void print () {
		
	}
	
	@Override
	public int get (int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + " bigger then list size: " + size);
		}
		
		int count = 0;
		Node current = first;
		while (current != last && count != index) {
			current = current.next;
			count++;
		}
		return current.value;
	}
	public boolean hasCycle (Node head) {
		Node node = head;
		while (true) {
			head = head.next;
			if (node == head) {
				return true;
			}
		}
	}
	

	
	class Node {
		int value;
		Node prev;
		Node next;
		
		Node (int value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
		
		@Override
		public String toString () {
			return "Node{" +
					"value=" + value +
					'}';
		}
	}
}
