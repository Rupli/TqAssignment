package com.test3;

import java.util.Scanner;

public class Car {
	
	
		
	

int carid;
String brand;
int modelnum;
float price;
String fuel;

  void details(int carid,String brand,int modelnum)
{
carid=carid;
brand=brand;
modelnum=modelnum;
	
}
 void details(int card,String brand,int modelnum,float p)
{
card=carid;
brand=brand;
modelnum=modelnum;
price = price;	
}
 void details(int carid,String brand,int modelnum,float p,String f)
{
carid=carid;
brand=brand;
modelnum=modelnum;
price=price;
fuel=fuel;
}

 public static void main(String [] args)
	{
	 Scanner sc = new Scanner(System.in);

	 
	 
 Car c1 = new Car();
 System.out.println("enter carid");
 int carid= sc.nextInt();
 
 System.out.println("enter brand");
 String brand= sc.next();
 
 System.out.println("enter carmodelnumid");
 int carmodelnumid= sc.nextInt();
 
 System.out.println(carid +" " + " "+ brand+ " "+ carmodelnumid);
 System.out.println("===================================================");
 
 Car c2 = new Car();
 System.out.println("enter carid");
 int card= sc.nextInt();
 
 System.out.println("enter brand");
 String brnd= sc.next();
 
 System.out.println("enter carmodelnumd");
 int carmodelnumd= sc.nextInt();
 
 System.out.println("enter price");
 int price= sc.nextInt();
 System.out.println(card +" " + " "+ brnd+ " "+ carmodelnumd +""+price);
 System.out.println("===================================================");
 
 Car c3 = new Car();
 System.out.println("enter carid");
 int cariid= sc.nextInt();
 
 System.out.println("enter brand");
 String braand= sc.next();
 
 System.out.println("enter carmodelnumd");
 int carmodelnomd= sc.nextInt();
 
 System.out.println("enter price");
 int pricce= sc.nextInt();
 
 System.out.println("enter fual");
 String fuel= sc.next();
 System.out.println(cariid +" " + " "+ braand+ " "+ carmodelnumd +""+pricce+ ""+ fuel);
}


}





