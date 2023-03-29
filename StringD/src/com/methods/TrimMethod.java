package com.methods;

public class TrimMethod {

	public static void main(String[] args) {
		String s1= "  Electrical branch  ";
		System.out.println("before trim:"+s1);
		
		System.out.println("after trim:"+ s1.trim());//remove space
		
		System.out.println(s1.length());
		
 System.out.println("====isEmpty()===================================");
 
 System.out.println(s1.isEmpty());
		
System.out.println("============Replace method==========================");

 s1=s1.replace('a', 'z');
 
 System.out.println(s1);

System.out.println("=============replacrALL Method==========================");

s1=s1.replaceAll("brach", "field");
System .out.println(s1);




	}

}
