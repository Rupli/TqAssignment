package com.polymorphism;
//Create a class BigKid which extends Kid created above. Implement readBook() differently in

//BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

public class Bigkid extends Kid

{
	int id;
	String schoolname;

	void readBook(int id, String schoolname)

	{
		this.id = id;

		this.schoolname = schoolname;

		System.out.println("big kid details");
	}

	public static void main(String[] args) {

		Kid k = new Bigkid();
		k.readBook("rutvi", 10);
	}
}
