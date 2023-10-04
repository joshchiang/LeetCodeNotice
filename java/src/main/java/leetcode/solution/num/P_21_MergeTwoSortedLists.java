package leetcode.solution.num;

import leetcode.solution.num.item.ListNode;

public class P_21_MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(4, new ListNode(6)));

		P_21_MergeTwoSortedLists solution = new P_21_MergeTwoSortedLists();

		ListNode result = solution.mergeTwoLists(l1, l2);

		while (result != null) {
			System.out.print(result.val);
			if (result.next != null) {
				System.out.print(" -> ");
			}
			result = result.next;
		}

	}
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // 虛擬節點，用於簡化代碼
        ListNode current = dummy; // 用於遍歷合併後的鏈表
        
        while (list1 != null && list2 != null) {
        	
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // 如果其中一個鏈表已經遍歷完，將另一個鏈表的剩餘部分接到合併後的鏈表尾部
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        return dummy.next; // 虛擬節點的下一個節點即為合併後的鏈表的頭節點
    }
	public ListNode mergeTwoLists_leecode(ListNode list1, ListNode list2) {
        if(list1 == null)   return list2;
        if(list2 == null)   return list1;

        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
	

	public ListNode mergeTwoListsMy(ListNode list1, ListNode list2) {

		ListNode listMerage = new ListNode(0);
		ListNode listNext = listMerage;

		while (list1 != null || list2 != null) {

			if (null == list1) {
				listNext.next = new ListNode(list2.val);
				list2 = list2.next;

			} else if (null == list2) {
				listNext.next = new ListNode(list1.val);
				list1 = list1.next;

			} else if (list1.val <= list2.val) {
				listNext.next = new ListNode(list1.val);
				list1 = list1.next;
			} else {
				listNext.next = new ListNode(list2.val);
				list2 = list2.next;
			}

			System.out.println("t 1:" + listNext.val);
			listNext = listNext.next;

		}

		return listMerage;

	}

	public ListNode mergeTwoListsI(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}
