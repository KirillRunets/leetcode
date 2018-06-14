package by.runets.linkedlist.util;

import by.runets.linkedlist.domain.Node;

public interface List<T, K> {
	boolean addAtHead (T value);
	
	boolean add (K index, T value);
	
	boolean addAtTail (T value);
	
	
	void remove (K index);
	
	Node<T> get (T value);
}