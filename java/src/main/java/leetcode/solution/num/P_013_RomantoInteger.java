package leetcode.solution.num;

import java.util.HashMap;

public class P_013_RomantoInteger {

	public static void main(String[] args) {
		romanToInt("LVIII");
	}

	public static int romanToInt(String s) {

		HashMap<Character, Integer> rMap = new HashMap<Character, Integer>();
		rMap.put("I".charAt(0), 1);
		rMap.put("V".charAt(0), 5);
		rMap.put("X".charAt(0), 10);
		rMap.put("L".charAt(0), 50);
		rMap.put("C".charAt(0), 100);
		rMap.put("D".charAt(0), 500);
		rMap.put("M".charAt(0), 1000);

		int n = s.length();
		int count = rMap.get(s.charAt(n - 1));

		for (int i = n - 2; i >= 0; i--) {

			if (rMap.get(s.charAt(i)) < rMap.get(s.charAt(i + 1))) {
				count -= rMap.get(s.charAt(i));
			} else {
				count += rMap.get(s.charAt(i));
			}
		}

		System.out.println(count);

		return count;
	}

	public static int romanToIntB(String s) {
		String mStr = s.toUpperCase();
		int countNum = 0;
		int chechNum = 0;
		int num = 0;

		for (int i = 0; i < mStr.length(); i++) {

			switch (s.charAt(i)) {
			case 'I':
				num = 1;
				break;
			case 'V':
				num = 5;
				break;
			case 'X':
				num = 10;
				break;
			case 'L':
				num = 50;
				break;
			case 'C':
				num = 100;
				break;
			case 'D':
				num = 500;
				break;
			case 'M':
				num = 1000;
				break;
			}

			if (chechNum >= num) {
				countNum += num;
			} else {
				countNum = countNum - (2 * chechNum) + num;
			}

			chechNum = num;

		}

		return countNum;
	}
}
