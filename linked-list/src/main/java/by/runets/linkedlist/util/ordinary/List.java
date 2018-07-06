package by.runets.linkedlist.util.ordinary;

import by.runets.linkedlist.util.ordinary.impl.LinkedList;

public interface List {
	void addAtHead (int value);
	
	void add (int index, int value);
	
	void addAtTail (int value);
	
	void remove (int index);
	
	void remove ();
	
	void print ();
	
	int get (int index);
	
}