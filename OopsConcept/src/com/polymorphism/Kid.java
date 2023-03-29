package com.polymorphism;
//WAP to create a class Kid with method readBook() and another method readBook () with 2
//parameters. The method readBook here is over-loaded (same method name but different
//parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
//BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

public class Kid {
	
	String name;
	int age;
	
    
    void readBook()
    {
    	
    }
    
    void readBook(String na,int age)
    {
    	
    	this.name=name;
    	this.age=age;
    	
    	System.out.println("kid details");
    }
	
	}


