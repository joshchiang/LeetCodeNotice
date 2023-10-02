package leetcode.solution.num;

import leetcode.solution.num.item.ListNode;

public class P_002_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

		ListNode l2 = new ListNode(5, new ListNode(4, new ListNode(6)));

		P_002_AddTwoNumbers solution = new P_002_AddTwoNumbers();

		ListNode result = solution.addTwoNumbers(l1, l2);

		System.out.println("test:" + result);

		while (result != null) {
			System.out.print(result.val);
			if (result.next != null) {
				System.out.print(" -> ");
			}
			result = result.next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		System.out.println("addTwoNumbers dummy:" + dummy.val);

//		ListNode current = dummy;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = carry + x + y;

			carry = sum / 10;
			dummy = new ListNode(dummy.val, new ListNode(sum % 10));

//			 current.next = new ListNode(sum % 10);
//	         current = current.next;

			System.out.println("addTwoNumbers dummy:" + dummy.val);

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		if (carry > 0) {
			dummy.next = new ListNode(carry);
		}

//		return dummy.next;
		return dummy;

	}

	public ListNode addTwoNumbersBase(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode ptr = result;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int sum = carry + 0;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			sum = sum % 10;

			ptr.next = new ListNode(sum);
			System.out.println("addTwoNumbers dummy:" + ptr.next);
			ptr = ptr.next;

			System.out.println("addTwoNumbers dummy:" + ptr);
		}

		if (carry == 1) {
			ptr.next = new ListNode(1);
		}

		return result.next;
	}

}
