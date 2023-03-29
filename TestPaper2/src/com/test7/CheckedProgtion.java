package com.test7;

public class CheckedProgtion {
	void firstMethod() {
		throw new java.io.IOException("device error");
	}

	void secondMethod() {
		firstMethod();
	}

	void thirdMethod() {
		try {
			secondMethod();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}
  public static void main(String[]args)
  {
	  CheckedProgtion c1 = new CheckedProgtion();
	  c1.thirdMethod();
	  System.out.println("normal flow");
  }
}
