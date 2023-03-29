package com.Test2;
import java.util.Scanner;
public class StudentTest 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student s1=new Student();
		Student s2=new Student(121,"rupali",23.4f);
		Student s3=new Student(191,"priya",11.9f);
System.out.println("==================================");		
		
      //custmer 1

		System.out.println("enter id");
	    s1.setId(sc.nextInt());
	    
	    System.out.println("enter name");
	    s1.setName(sc.next());
	    
	    System.out.println("enter marks");
	    s1.setMarks(sc.nextFloat());
	    
	    //custmer 2
	    
	    System.out.println("enter id");
	    s2.setId(sc.nextInt());
	    
	    System.out.println("enter name");
	    s2.setName(sc.next());
	    
	    System.out.println("enter marks");
	    s2.setMarks(sc.nextFloat());
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	

}
