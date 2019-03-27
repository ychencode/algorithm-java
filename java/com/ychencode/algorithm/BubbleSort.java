package com.ychencode.algorithm;

public class BubbleSort {

	public static void bubbleSort(int[] arrays) {
		int j = 0;
		boolean swap = true;
		while (swap) {
			swap = false;
			j++;
			for(int i = 0; i < arrays.length - j; i++) {
				if (arrays[i] > arrays[i + 1]) {
					swap(arrays, i, i + 1);
					swap = true;
				}
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
		bubbleSort(arrays);
		for (Integer item : arrays) {
			System.out.print(item + " ");
		}
	}
}
