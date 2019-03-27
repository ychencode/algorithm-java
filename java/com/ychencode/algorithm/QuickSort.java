package com.ychencode.algorithm;

/**
 * @author: ychencode
 * @date 2019-03-27 11:22
 */
public class QuickSort {
	
	public static void quickSort(int[] arrays, int left, int rigth) {
		int index = partition(arrays, left, rigth);
		if (left < index - 1) {
			quickSort(arrays, left, index - 1);
		}
		if (index < rigth) {
			quickSort(arrays, index, rigth);
		}
	}
	
	private static int partition(int[] arrays, int left, int right) {
		int i = left, j = right;
		int pivot = arrays[(left + right) / 2];
		while (i <= j) {
			while (arrays[i] < pivot) {
				i++;
			}
			while (arrays[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(arrays, i, j);
				i++;
				j--;
			}
		}
		return i;
	}
	
	private static void swap(int[] arrays, int i, int j) {
		int tmp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = tmp;
	}
	
	
	public static void main(String[] args) {
		int[] arrays = new int[]{1, 12, 5, 26, 7, 14, 3, 7, 2};
		int left = 0, right = arrays.length - 1;
		quickSort(arrays, left, right);
		for (Integer item : arrays) {
			System.out.print(item + " ");
		}
	}
}
