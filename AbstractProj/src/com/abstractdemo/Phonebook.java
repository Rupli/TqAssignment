package com.abstractdemo;
//You have to build a phone book. The phone book has the name and 
//contact of a person. This is an openly accessible book so it should be 
//designed accordingly.
//Public

public abstract class Phonebook
{

  public abstract void name();
	
  public abstract void contact();
  
  
  void display()
  {
	  System.out.println("phone book details");
	  
  }


public String toString() 
{
	return  "Phonebook " + "display " ;
}
  
  
  
  
  
  
}
