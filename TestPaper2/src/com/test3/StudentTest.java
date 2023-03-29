package com.test3;



public class StudentTest {

	public static void main(String [] args)
	{
		
	Student s1= new Student(1,"rutvi",22 ,79f);
	
	Student s2= new Student (2,"rupali",26,97f);
	
	Student s3= new Student (3,"riya",28,97f);
	
	System.out.println(s1);
	
	System.out.println(s2);	
	
	System.out.println(s3);	
	
	System.out.println("student register " + Student.studentcount );
	}
	

}
