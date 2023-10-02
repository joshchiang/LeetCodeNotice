package leetcode.solution.num;

public class P_1480_RunningSumof1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] { 1, 2, 3, 4 };
		runningSum(nums);

	}

	public static int[] runningSum(int[] nums) {

		int[] retNums = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			
			if (i == 0) {
				retNums[i] += nums[i];
			} else {
				retNums[i] = retNums[i-1] +nums[i] ;
			}
		}

		return retNums;

	}

}
