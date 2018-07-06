package by.runets.linkedlist.util.singly;

public interface List<T> {
	void addAtHead (T value);
	
	void add (int index, T value);
	
	void addAtTail (T value);
	
	void remove (int index);
	
	void remove ();
	
	void print ();
	
	T get (int index);
}