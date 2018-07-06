package by.runets.linkedlist.util.solution;

public class MergeTwoSortedList {
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
	
	public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l2.next, l1);
			return l2;
		}
	}
	
	public static void main (String[] args) {
		ListNode first = new ListNode(1);
		first.next = new ListNode(2);
		first.next.next = new ListNode(4);
		
		ListNode second = new ListNode(1);
		second.next = new ListNode(3);
		second.next.next = new ListNode(4);
		
		
		System.out.println(new MergeTwoSortedList().mergeTwoLists(first, second));
	}
}
