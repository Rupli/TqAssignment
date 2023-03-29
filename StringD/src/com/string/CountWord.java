package com.string;

public class CountWord {

	public static int countword(String str) {
		int ct = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				ct++;
		}

		return ct;
	}

	public static void main(String[] args) {

		String s1 = "This is a text file. I am reading a book";
		int count = countword(s1);
		System.out.println(s1);
		System.out.println("Number of words:" + count);

	}

}
