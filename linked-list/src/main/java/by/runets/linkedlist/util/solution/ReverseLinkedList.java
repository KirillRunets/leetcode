package by.runets.linkedlist.util.solution;

public class ReverseLinkedList {
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		
		@Override
		public String toString () {
			return "ListNode{" +
					"val=" + val +
					", next=" + next +
					'}';
		}
	}
	public ListNode reverseList (ListNode head) {
		if (head == null) {
			return head;
		}
		
		ListNode next = null;
		ListNode current = head;
		ListNode prev = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
		
	
	
	public static void main (String[] args) {
		ListNode node = new ListNode(0);
		node.next = new ListNode(1);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		
		System.out.println(new ReverseLinkedList().reverseList(node));
	}
}
