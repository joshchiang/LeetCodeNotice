package leetcode.solution.num;

public class P35_SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P35_SearchInsertPosition test = new P35_SearchInsertPosition();

		int[] nums = { 1, 3, 5, 6 };
		int target = 7;

		System.out.println("tt:" + test.searchInsert(nums, target));
	}

	public int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[i] > target) {
				return i;
			}

		}
		return nums.length;
	}

}
