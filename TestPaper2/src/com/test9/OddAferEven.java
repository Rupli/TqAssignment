package com.test9;

import java.util.Arrays;

public class OddAferEven {

	public static void shiftOddAfterEven(int[] arr) {
		int temp;
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			while (arr[i] % 2 == 0 && i < j) {
				i++;
			}
			while (arr[j] % 2 != 0 && i < j) {
				j--;
			}
			if (i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		shiftOddAfterEven(arr);
		System.out.println(Arrays.toString(arr));

	}

}
