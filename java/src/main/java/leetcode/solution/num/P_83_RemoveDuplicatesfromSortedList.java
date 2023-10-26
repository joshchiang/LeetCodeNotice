package leetcode.solution.num;

import leetcode.solution.num.item.ListNode;

public class P_83_RemoveDuplicatesfromSortedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
//		ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(2)));
		ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(1)));
		P_83_RemoveDuplicatesfromSortedList test = new P_83_RemoveDuplicatesfromSortedList();

		ListNode result = test.deleteDuplicatesMy(l1);

		while (result != null) {
			System.out.print(result.val);
			if (result.next != null) {
				System.out.print(" -> ");
			}
			result = result.next;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;

		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}

	public ListNode deleteDuplicatesMy(ListNode head) {

		if (null == head) {
			return head;
		}

		if (null == head.next) {
			return head.next;
		}

		if (head.val == head.next.val) {

			head.next = deleteDuplicatesMy(head.next.next);

		} else {
			head = deleteDuplicatesMy(head.next);
		}
		return head;
	}

}
