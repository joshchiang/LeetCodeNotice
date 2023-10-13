package leetcode.solution.num;

public class P_28_FindtheIndexoftheFirstOccurrenceinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String haystack = "hello", needle = "ll";
//		String haystack = "leetcode", needle = "leeto";

//		String haystack = "mississippi", needle = "issipi";
		String haystack = "mississippi", needle = "sipp";

		P_28_FindtheIndexoftheFirstOccurrenceinaString t = new P_28_FindtheIndexoftheFirstOccurrenceinaString();

		System.out.println("test:" + t.strStr(haystack, needle));

	}

	public int strStr(String haystack, String needle) {

		if (haystack.length() < needle.length()) {
			return -1;
		}

		int index = -1;
		int needStart = 0;

		char[] haystackC = haystack.toCharArray();
		char[] needleC = needle.toCharArray();

		int displacement = 0;
		for (int i = 0; i < haystack.length(); i++) {
//
//			System.out.println(
//					"test:" + index + "-" + i + "- " + ":" + haystackC[i] + ":" + needStart + ":" + needleC[needStart]);

			if (haystackC[i] == needleC[needStart]) {

				if (needStart == 0) {
					index = i;
				}

//				System.out.println("displacement:" + index + ":needle.length()" + needle.length() + ":" + needStart);

				if (needle.length() - 1 == needStart) {
					return index;
				}
				needStart++;

			} else {
				if (needStart != 0) {
					needStart = 0;
				}
				if (index != -1) {

					i = displacement;
					displacement += index - 1;
				}
				index = -1;
			}

		}

		if (index != -1 && needle.length() - 1 == needStart) {
			return index + displacement;
		}
		return -1;
	}

	public int strStrChatGPT(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0; // 如果 needle 为空字符串，则返回 0
		}

		int hayLen = haystack.length();
		int needleLen = needle.length();

		if (hayLen < needleLen) {
			return -1; // 如果 haystack 的长度小于 needle 的长度，则不可能找到 needle
		}

		for (int i = 0; i <= hayLen - needleLen; i++) {
			if (haystack.substring(i, i + needleLen).equals(needle)) {
				return i; // 找到匹配的子字符串，返回其起始位置
			}
		}

		return -1; // 在 haystack 中未找到 needle
	}

	public int strStrLANS_F(String haystack, String needle) {
		// String s1 = haystack;
		// String s2 = needle;

		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			int j = 0;
			while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
				j++;

				if (j == needle.length()) {

					return i;
				}
			}
		}
		return -1;
	}

	public int strStrLANS_M(String haystack, String needle) {
		if (haystack.length() < needle.length()) {
			return -1;
		}
		int ans = 0;
		int count = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0) && count == 0) {
				ans = i;
				int j = i;
				while (j < haystack.length() && haystack.charAt(j) == needle.charAt(count)) {
					count++;
					j++;
					if (count == needle.length()) {
						return ans;
					}
				}
				count = 0;
			}
		}
		return -1;
	}

	public int strStrN(String haystack, String needle) {
		int back = haystack.indexOf(needle);
		return back;
	}

}
