package leetcode.solution.num;

public class P_009_PalindromeNumber {
	public static void main(String[] args) {

		isPalindrome(-121);
	}

	public static boolean isPalindrome(int x) {

		String str = Integer.toString(x);
		String pStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			pStr += str.charAt(i);
		}
		if (pStr.equals(str)) {
			return true;
		}

		return false;
	}
}
