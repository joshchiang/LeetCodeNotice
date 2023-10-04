package leetcode.solution.num;

import java.util.*;

public class P_26_RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 2 };

		P_26_RemoveDuplicatesfromSortedArray solution = new P_26_RemoveDuplicatesfromSortedArray();

		solution.removeDuplicates(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ,");
		}

	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int current = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[current]) {
				nums[++current] = nums[i];
			}
		}

		return current + 1;
	}

	public int removeDuplicatesMy(int[] nums) {

		int point = 0;

		Set<Integer> key2 = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (!key2.contains(nums[i])) {
				key2.add(nums[i]);
				nums[point] = nums[i];
				point++;
			}
		}

		return point;
	}

}
