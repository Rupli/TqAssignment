package com.string;

public class ReplaceVovel {

	
		
	public static void replacevowels(String str) {

		str = str.toLowerCase();
		for (int i = 0; i < str.length() ; i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

		str=str.replace(str.charAt(i), '$');
			}
		}
		System.out.println(str);

	}

	public static void main(String[] args) {

		String str = "My name is rupali akuskar";

		replacevowels(str);

	}

	}


 