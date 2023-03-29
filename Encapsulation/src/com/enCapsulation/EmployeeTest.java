package com.enCapsulation;
import java.util.Scanner;
public class EmployeeTest 
{
	public static void main(String args[])
	{
	Employee e1= new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter details: ");
		
	e1.setEmpid(sc.nextInt());
	System.out.println("enter account number:");
	
	e1.setName(sc.next());
	System.out.println("enter name");
	
	e1.setSallary(sc.nextDouble());
	System.out.println("enter sallary:");
	
	System.out.println("--------------------------------");
	
	System.out.println(" empid " + e1.getEmpid());
	System.out.println(" Name " + e1.getName());
	System.out.println(" salaray " + e1.getSallary());
	
	}

}
