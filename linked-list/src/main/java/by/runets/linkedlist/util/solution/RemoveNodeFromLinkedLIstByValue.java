package by.runets.linkedlist.util.solution;

public class RemoveNodeFromLinkedLIstByValue {
	static class ListNode {
		int val;
		ListNode next;
		
		ListNode (int x) {
			val = x;
		}
		
		@Override
		public String toString () {
			return "ListNode{" +
					"val=" + val +
					", next=" + next +
					'}';
		}
	}
	
	public ListNode removeElements (ListNode head, int val) {
		if (head == null) {
			return head;
		}
		
		ListNode current = head;
		ListNode prev = null;
		
		while (current != null) {
			if (current.val == val && prev == null) {
				current = current.next;
				head = current;
			} else if (current.val == val) {
				current = current.next;
				prev.next = current;
			} else {
				prev = current;
				current = current.next;
			}
		}
		return head;
	}
	
	public static void main (String[] args) {
		ListNode node = new ListNode(0);
		node.next = new ListNode(1);
		node.next.next = new ListNode(1);
		node.next.next.next = new ListNode(3);
		
		
		System.out.println(new RemoveNodeFromLinkedLIstByValue().removeElements(node, 1));
	}
}
