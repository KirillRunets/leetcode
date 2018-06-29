package by.runets.linkedlist.util;

public interface List<T> {
	boolean addAtHead (T value);
	
	boolean add (int index, T value);
	
	boolean addAtTail (T value);
	
	void remove (int index);
	
	void remove ();
	
	void print ();
}