package leetcode.solution.num;

import java.util.ArrayList;

public class P_88_MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
//		int m = 3, n = 3;

		int[] nums1 = { 1 }, nums2 = {};
		int m = 1, n = 0;

		merge_o(nums1, m, nums2, n);

	}

	public static void merge_o(int[] nums1, int m, int[] nums2, int n) {

		int size = m + n;
		int[] result = new int[size];
		int n1 = 0, n2 = 0;

		for (int i = 0; i < size; i++) {

			if (0 != nums1[n1]) { // nums1 has value

				if (nums1[n1] < nums2[n2]) {
					result[i] = nums1[n1];
					n1++;
				} else {
					result[i] = nums2[n2];
					n2++;
				}

			} else {// nums1 == 0
				n1++;

				if (0 != nums2[n2]) {
					result[i] = nums2[n2];
					n2++;
				}
			}
		}

		nums1 = result;

		System.out.print("Merged Array: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	public static void merg_chat(int[] nums1, int m, int[] nums2, int n) {
		int index1 = m - 1; // Index of last element in nums1
		int index2 = n - 1; // Index of last element in nums2
		int mergeIndex = m + n - 1; // Index to merge elements into nums1

		// Merge elements from nums1 and nums2 starting from the end
		while (index1 >= 0 && index2 >= 0) {
			if (nums1[index1] > nums2[index2]) {
				nums1[mergeIndex] = nums1[index1];
				index1--;
			} else {
				nums1[mergeIndex] = nums2[index2];
				index2--;
			}
			mergeIndex--;
		}

		// If there are remaining elements in nums2, copy them into nums1
		while (index2 >= 0) {
			nums1[mergeIndex] = nums2[index2];
			index2--;
			mergeIndex--;
		}
	}

	// ----------
	private void swap(int nums1[], int nums2[], int i, int j) {
		if (nums1[i] > nums2[j]) {
			int t = nums1[i];
			nums1[i] = nums2[j];
			nums2[j] = t;
		}
	}

	public void merge_swap(int[] nums1, int n, int[] nums2, int m) {

		int len = n + m;
		int gap = (len / 2) + (len % 2);

		while (gap > 0) {
			int left = 0;
			int right = left + gap;

			while (right < len) {
				// one pointer lies in arr1 and another lies in arr2
				if (left < n && right >= n) {
					swap(nums1, nums2, left, right - n);
				}
				// both lies in second array
				else if (left >= n) {
					swap(nums2, nums2, left - n, right - n);
				}
				// both lies in first array
				else {
					swap(nums1, nums1, left, right);
				}
				left++;
				right++;
			}
			if (gap == 1)
				break;
			gap = (gap / 2) + (gap % 2);
		}
		// now nums1 contains first part
		// nums2 contains second part
		int i = n, j = 0;
		while (j < m) {
			nums1[i] = nums2[j];
			i++;
			j++;
		}
	}

	// -------
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		System.out.println("merge");

		ArrayList<Integer> arr = new ArrayList<>();
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				// System.out.println(nums1[i]);
				arr.add(nums1[i]);
				i++;
			} else {

				arr.add(nums2[j]);
				j++;
			}
		}

		if (j == n) {
			for (int a = i; a < m; a++) {
				arr.add(nums1[a]);
			}
		} else {
			for (int a = j; a < n; a++) {
				arr.add(nums2[a]);
			}
		}
		for (int a = 0; a < (m + n); a++) {
			nums1[a] = arr.get(a);
		}
	}

}
