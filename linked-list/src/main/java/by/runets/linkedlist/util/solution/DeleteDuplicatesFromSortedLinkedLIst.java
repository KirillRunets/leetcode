package by.runets.linkedlist.util.solution;

public class DeleteDuplicatesFromSortedLinkedLIst {
	public static class ListNode {
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
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode current = head;
		while (current.next != null) {
			ListNode node = current.next;
			if (node.val == current.val) {
				current.next = node.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
	
	public static void main (String[] args) {
		ListNode first = new ListNode(1);
		first.next = new ListNode(2);
		first.next.next = new ListNode(2);
		first.next.next.next = new ListNode(3);
		first.next.next.next.next = new ListNode(3);
		
		System.out.println(new DeleteDuplicatesFromSortedLinkedLIst().deleteDuplicates(first));
	}
}
