package leetcode.solution.num;

public class P58_LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";

		P58_LengthofLastWord test = new P58_LengthofLastWord();

		System.out.print("t:" + test.lengthOfLastWord(s));

	}

	public int lengthOfLastWord(String s) {

		int c = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) != ' ') {
				c++;
			} else {
				if (c > 0) {
					return c;
				}
			}
		}

		return c;
	}

	public int lengthOfLastWord_b(String s) {

		int si = 0;
		boolean f = false;

		for (char c : s.toCharArray()) {

			if (c != ' ') {

				if (!f) {
					si = 0;
				}
				f = true;

				si++;
			} else {
				f = false;
			}

		}

		return si;
	}
}
