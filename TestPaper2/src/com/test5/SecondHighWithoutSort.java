package com.test5;

public class SecondHighWithoutSort {
	public static void secondhigh(int a[]) {
		int highest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > highest) {
				secondhighest = highest;
				highest = a[i];
				}
			if((a[i]<highest) && (a[i]>secondhighest))
			{
				secondhighest=a[i];
			}

		}
		System.out.println(secondhighest);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 6, 4, 2, 9, 5, 1 };
		secondhigh(arr);

	}

}
