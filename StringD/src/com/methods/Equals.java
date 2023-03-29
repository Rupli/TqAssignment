package com.methods;

public class Equals {

	public static void main(String[] args) {
		
		//== oprator compare refrance and .euals method refer value
		
		String s1 = new String("java");
		
		String s2= new String ("java");
		
		System.out.println(s1==s2); //false
		
		System.out.println(s1.equals(s2));
		
		System.out.println("///////////// StringBuffer///////////////////");
		/// StringBuffer 
		
		StringBuffer sb = new StringBuffer("javaProgram");
		
		StringBuffer sb1 = new StringBuffer("javaprogram");
		
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));

	}

}
