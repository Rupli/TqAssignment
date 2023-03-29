package com.practice;

import java.util.Arrays;

public class SortingString {
	public static void sortS(String[] s) {
		String temp;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if ((s[i].compareTo(s[j])) > 1)

				{
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		String[] sub = { "math", "science", "english", "history", "bio" };
		sortS(sub);

	}

}
