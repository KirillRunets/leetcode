package by.runets.linkedlist.util.impl;

import by.runets.linkedlist.domain.Node;
import by.runets.linkedlist.util.List;

public class LinkedList<T, K> implements List<T, K> {
	@Override
	public boolean addAtHead (T value) {
		return false;
	}
	
	@Override
	public boolean add (K index, T value) {
		return false;
		
	}
	
	@Override
	public boolean addAtTail (T value) {
		return false;
		
	}
	
	@Override
	public void remove (K index) {
		
	}
	
	@Override
	public Node<T> get (T value) {
		return null;
	}
}
