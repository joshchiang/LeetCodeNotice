package leetcode.solution.num;

public class P_27_RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;

		P_27_RemoveElement t = new P_27_RemoveElement();

		System.out.println(t.removeElement(nums, val));

	}

	public int removeElement(int[] nums, int val) {
		int co = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[co] = nums[i];
				co++;
			}
		}

		return co++;

	}

}
