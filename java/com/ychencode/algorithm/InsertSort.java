package com.ychencode.algorithm;

/**
 * @author: ychencode
 * @data: 2019-03-28 15:00
 */
public class InsertSort {
	
	public static void insertSort(int [] arrays) {
		int i, j, newValue;
		for (i = 1; i < arrays.length; i++) {
			newValue = arrays[i];
			j = i;
			while (j > 0 && arrays[j - 1] > newValue) {
				arrays[j] = arrays[j - 1];
				j--;
			}
			arrays[j] = newValue;
		}
	}

	public static void main(String[] args) {
		int[] arrays = new int[]{1, 12, 5, 26, 7, 14, 3, 7, 2};
		insertSort(arrays);
		for (Integer item : arrays) {
			System.out.print(item + " ");
		}
	}
}
