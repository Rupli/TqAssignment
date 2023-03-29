package com.test3;

public class Employee {

	int id;
	String name;
	float sallary;
	float expirince;
	int age;
	String role;
	
	
   void	displayEmployee(String name,float sallary,float expirince)
  {
	  name=name;
	  sallary=sallary;
	  expirince=expirince;
  }
	
   void	displayEmployee(String name,float sallary,float expirince,int age,String role)
  {
	  name=name;
	  sallary=sallary;
	  expirince=expirince;
	  age=age;
	  role=role;
	  
  }
  
  public static void main(String [] args)
  {
	  Employee e1 =new Employee();
	 e1.displayEmployee("TATA", 234322f, 2.3f, 33, "ran");
	 System.out.println(e1);
	 
	 
  }

	
	
	
	
	
}
