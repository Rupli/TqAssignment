package com.logical;

import java.util.Scanner;

public class CountWord {

	public static int countwords(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String s = "welcome in java world";
        System.out.println(s);
        int count= countwords(s);;
       
        System.out.println("number of count:"+ count);
	}

}