package leetcode.solution.num;

public class P_69_Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2147395600;
		P_69_Sqrt test = new P_69_Sqrt();

		System.out.println(":" + test.mySqrt(n));

	}

	public int mySqrt(int x) {
//		double result1 =Math.pow(x, 0.5);
		if (x <= 1) {
			return x;
		}

		long left = 1;
		long right = x;

		while (left <= right) {
			long mid = left + (right - left) / 2;
			long square = mid * mid;

			if (square == x) {
				return (int) mid;
			} else if (square < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return (int) right;
	}

	// ------
	public int mySqrt_2(int x) {
		if (x <= 1) {
			return x;
		}

		return binarySearch(1, x, x);
	}

	private int binarySearch(long left, long right, int x) {
		if (left <= right) {
			long mid = left + (right - left) / 2;
			long square = mid * mid;

			if (square == x) {
				return (int) mid;
			} else if (square < x) {
				return binarySearch(mid + 1, right, x);
			} else {
				return binarySearch(left, mid - 1, x);
			}
		}

		return (int) right; // 返回结果的整数部分
	}

}
