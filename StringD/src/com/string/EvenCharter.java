package com.string;

public class EvenCharter {

	public static void Evenmethod(String str) 
	{
		for (int i = 0; i < str.length(); i++) 
		{
			if (i % 2 == 0) {
				System.out.println(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		//conver String to  charecter array
		
		String s = "java class";
		char [] ch= s.toCharArray();
		Evenmethod(s);
		
		System.out.println(s);

	}
}
