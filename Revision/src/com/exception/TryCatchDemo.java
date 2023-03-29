package com.exception;

public class TryCatchDemo {

	public static void main(String[] args) {

		int i = 10;
		int b = 0;
		int c;
		try {
			c = i / b;
			System.out.println(c);

		}

		catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
