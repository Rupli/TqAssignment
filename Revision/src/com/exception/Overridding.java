package com.exception;

import java.io.IOException;

class Parent {

	int i = 20;

	void m1() throws IOException {

		System.out.println(i / 2);
	}

}

class Child extends Parent {

	int a = 12;
	int b = 0;
	int c;

	void m1() throws ArithmeticException, IOException {
		System.out.println( a / b);
		throw new IOException("Input error");
	}

}

public class Overridding {

	public static void main(String[] args) throws ArithmeticException,IOException
	{
		
		Child c= new Child();
		c.m1();
		

	}
}