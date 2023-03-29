package com.Corejava;

import java.util.Scanner;

public class EnhancedSwitch {
	
	public static void main (String args[])
	
	{

	Scanner sc = new Scanner(System.in);

	System.out.println ("enter course");
	
	String course =sc.next();

	
	switch(course) {
	
	case "java" , "c" , "cpp" -> System.out.println ("programming course");
	
	case "sql" , "oracle"  -> System.out.println ("programming course");
	
	default -> System.out.println ("course not available here");
	
	}
	
	
}

}