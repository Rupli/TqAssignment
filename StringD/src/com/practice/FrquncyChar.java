package com.practice;

import java.util.Scanner;

public class FrquncyChar {
	public static void freqncyof(String str) {
		int count = 1;

		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if ((ch[i] == ' ') || (ch[i] == '\0')) {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if ((ch[i]) == (ch[j]))

					count++;
	}
			System.out.println(ch[i] + "" + count);
		}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");

		String s = sc.next();
		freqncyof(s);
	}

}
