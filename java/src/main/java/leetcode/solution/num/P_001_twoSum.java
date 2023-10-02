package leetcode.solution.num;

import java.util.HashMap;

public class P_001_twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] { 3, 2, 4 };
		int target = 6;

		for (int check : twoSum(nums, target)) {

			System.out.println("check:" + check);

		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int foundNum = target - nums[i];

			if (map.containsKey(foundNum)) {
				return new int[] { map.get(foundNum), i };
			}

			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two sum solution");
	}

	
}
