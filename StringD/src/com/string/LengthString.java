package com.string;

public class LengthString {

	public static void lengthofS(String[] str) {
		String temp;

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() == str[j].length()) {
					if ((str[i].compareTo(str[j])) > 1) {
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				} else {
					if (str[i].length() > str[j].length()) {
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		String[] lang = { "c,go,java,python.asp.net,angular" };
        
		//lengthofS(str);
	}

}
