package com.test5;

import java.util.Scanner;

public class CricketTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cricketer ct= new Cricketer();
		
		System.out.println("enter id");
	      ct.setPlayerid(sc.nextInt());
		
		System.out.println("name");
		ct.setName(sc.next());
		
		System.out.println("enter strikate");
		ct.setStrikate(sc.nextFloat());
		
		System.out.println("enter run");
		ct.setRun(sc.nextInt());

		System.out.println("enter baller or not");
		ct.setIsBaller(sc.nextBoolean());
		
		
		
	}

}
