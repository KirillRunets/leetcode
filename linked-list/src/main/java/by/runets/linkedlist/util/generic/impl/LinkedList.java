package by.runets.linkedlist.util.generic.impl;

import by.runets.linkedlist.util.generic.List;

public class LinkedList<T> implements List<T> {
	private int size;
	private Node<T> first;
	private Node<T> last;
	
	@Override
	public boolean addAtHead (T value) {
		Node<T> newNode = new Node<>(value, null, null);
		if (first == null) {
			first = newNode;
			last = first;
		} else {
			first.prev = newNode;
			newNode.next = first;
		}
		++size;
		return true;
	}
	
	@Override
	public boolean add (int index, T value) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + " bigger then list size: " + size);
		}
		
		int count = 0;
		Node<T> newNode = new Node<>(value, null, null);
		Node<T> current = first;
		
		if (index == 0) {
			return addAtHead(value);
		} else if (index == size) {
			return addAtTail(value);
		}
		
		if (first != null && last != null) {
			while (current != last) {
				current = current.next;
				++count;
				if (count == index) {
					newNode.prev = current;
					newNode.next = current.next;
					
					current.next.prev = newNode;
					current.next = newNode;
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean addAtTail (T value) {
		Node<T> newNode = new Node<>(value, null, null);
		if (last != null) {
			newNode.prev = last;
			last.next = newNode;
			last = newNode;
			++size;
		}
		return true;
		
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
				
				current.next.prev = newPrev;
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
		Node current = first;
		System.out.println(current);
		while (current != last) {
			current = current.next;
			System.out.println(current);
		}
	}
	
	@Override
	public T get (int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + " bigger then list size: " + size);
		}
		
		int count = 0;
		Node current = first;
		while (current != last) {
			if (count == index) {
				return (T) current.value;
			}
			current = current.next;
			count++;
		}
		return null;
	}
	
	
	private class Node<T> {
		T value;
		Node<T> prev;
		Node<T> next;
		
		public Node (T value, Node<T> prev, Node<T> next) {
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
