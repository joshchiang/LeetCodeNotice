package leetcode.solution.num;

public class P66_PlusOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] digits = { 9 };

		P66_PlusOne test = new P66_PlusOne();

		int[] add = test.plusOne(digits);
		for (int c : add) {
			System.out.print("c:" + c);
		}

	}

	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;

	}

	public int[] plusOneB(int[] digits) {
		int i = 0;
		int l = digits.length - 1;

		for (i = l; i >= 0; i--) {
			int k = digits[i] + 1;

			if (k < 10) {
				digits[i] = k;
				return digits;
			} else {
				digits[i] = 0;
			}

		}

		int[] addD = new int[digits.length + 1];
		addD[0] = 1;

		return addD;
	}

}
