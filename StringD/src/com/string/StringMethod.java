package com.string;

public class StringMethod {

	public static void main(String[] args) {
		String s1= "course";
		String s2="course";
		String s3="java";
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		
		System.out.println("======================================");
		
		String s= new String("course");
        System.out.println(s1==s);//compare refrence
        System.out.println(s1.equals(s));//compare value
        
        System.out.println();
        
	}

}
