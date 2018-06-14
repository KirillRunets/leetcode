package by.runets.linkedlist.domain;

public class Node <T> {
	private T value;
	private Node<T> prev;
	private Node<T> next;
	
	public Node (T value, Node<T> prev, Node<T> next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	public T getValue () {
		return value;
	}
	
	public void setValue (T value) {
		this.value = value;
	}
	
	public Node<T> getPrev () {
		return prev;
	}
	
	public void setPrev (Node<T> prev) {
		this.prev = prev;
	}
	
	public Node<T> getNext () {
		return next;
	}
	
	public void setNext (Node<T> next) {
		this.next = next;
	}
	
	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Node<?> node = (Node<?>) o;
		
		if (value != null ? !value.equals(node.value) : node.value != null) return false;
		if (prev != null ? !prev.equals(node.prev) : node.prev != null) return false;
		return next != null ? next.equals(node.next) : node.next == null;
		
	}
	
	@Override
	public int hashCode () {
		int result = value != null ? value.hashCode() : 0;
		result = 31 * result + (prev != null ? prev.hashCode() : 0);
		result = 31 * result + (next != null ? next.hashCode() : 0);
		return result;
	}
	
	@Override
	public String toString () {
		return "Node{" +
				"value=" + value +
				", prev=" + prev +
				", next=" + next +
				'}';
	}
}
