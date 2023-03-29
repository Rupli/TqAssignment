package com.test5;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		
		Car cr = new Car();
		Machine mn = new Machine();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter num");
		cr.setModelno(sc.nextInt());
		
		
		System.out.println(cr.toString());
		
		System.out.println(mn.toString());
		
		
		
		
		
		
		
		
		
		
		
	}

}
