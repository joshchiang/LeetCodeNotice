package leetcode.solution.num;

public class P_014_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = { "a" };

		System.out.println("t:" + longestCommonPrefix(strs));

		;

	}

	public static String longestCommonPrefixB(String[] strs) {

		if (strs.length == 1)
			return strs[0];

		String rStr = "";

		int il = strs[0].length();
		int jl = strs.length;

		for (int i = 0; i < il; i++) {

			char t = strs[0].charAt(i);

			for (int j = 1; j < jl; j++) {

				int tl = strs[j].length();

				if (tl < il) {
					il = tl;
				}
				if (i < tl) {
					if (t == strs[j].charAt(i)) {

						if (j == jl - 1) {
							rStr += t;
						}
					} else {
						return rStr;
					}
				}

			}
		}

		return rStr;
	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0)
			return "";

		if (strs.length == 1)
			return strs[0];

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {

			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

}
