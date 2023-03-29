package com.string;

public class Frequncy {

	public static int countchar(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')

				count++;
		}

		return count;

	}

	public static void main(String[] args) {

		String s1 = "abcdef";

		char[] ch = s1.toCharArray();

		System.out.println(s1);
		int count= countchar(s1);
		System.out.println("number of charecter " + count);

	}

}
