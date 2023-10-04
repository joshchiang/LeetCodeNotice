package leetcode.solution.num;

public class P_20_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(":" + isValidB2("()[]{}"));

	}

	public static boolean isValidB2(String s) {

		String los = "";

		for (char ch : s.toCharArray()) {
			los += ch;
			if (los.endsWith("()") || los.endsWith("{}") || los.endsWith("[]")) {
				los = los.substring(0, los.length() - 2);
			}

		}
		if (los.length() == 0) {
			return true;
		}
		return false;

	}

	public static boolean isValidB(String s) {

		String[] sa = s.split("");
		String los = "";

		for (String a : sa) {
			los += a;
			if (los.endsWith("()") || los.endsWith("{}") || los.endsWith("[]")) {
				los = los.substring(0, los.length() - 2);
			}
		}

		if (los.length() == 0) {
			return true;
		}

		return false;

	}

	public boolean isValid(String s) {

		int i = -1;
		char[] stack = new char[s.length()];
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[')
				stack[++i] = ch;
			else {
				if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}')
						|| (stack[i] == '[' && ch == ']')))
					i--;
				else
					return false;
			}
		}
		return i == -1;

	}
}
