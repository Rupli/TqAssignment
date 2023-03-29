package com.EmployeeTest;
import java.util.Scanner;
import com.Test2.Employee;
	
public class EmployeeTest 
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
	Employee ep1 =new Employee();
	Employee ep2 =new Employee(2.3f);
	Employee ep3 =new Employee(11 , "ritu" , 22500.5f,2.5f,27);
	Employee ep4 =new Employee();
	System.out.println("=======================");
	System.out.println("id " + ep1.id +""+ "expirience");
	System.out.println("name "+ ep1.name +"sallary "+ ep1.sallary);	
	
	
System.out.println("=============================");	
	
 System.out.println(ep2);
 System.out.println(ep3);
 

}
}
