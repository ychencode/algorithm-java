package com.ychencode.algorithm;

/**
 * @author: ychencode
 * @data 2019-03-28 14:15
 */
public class SelectSort {

	public static void selectSort(int[] arrays) {
		int i, j, minIndex;
		int n = arrays.length;
		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++) {
				if (arrays[j] < arrays[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(arrays, minIndex, i);
			}
		}
	}

	private static void swap(int[] arrays, int i, int j) {
		int tmp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arrays = new int[]{1, 12, 5, 26, 7, 14, 3, 7, 2};
		selectSort(arrays);
		for (Integer item : arrays) {
			System.out.print(item + " ");
		}
	}
}
