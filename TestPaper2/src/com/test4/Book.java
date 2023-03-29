package com.test4;
//create a Book class having id, name, price. Create containment of author 
//(id, name, address). Create constructor and getter and setters. 
//Create anonymous author object in book.

public class Book
{
	private int id;
	private String  name;
    private float price;
    
    public Book()
    {
    	System.out.println("daefault constructer");
    }
    
    public Book(int id,String name,float price)
    {
    	this.id=id;
    	this.name=name;
    	this.price=price;
    	
    }
    
    public void setId(int id)
    {
    	this.id=id;
    }
    public int getId()
    {
    	return id;
    }
    
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getName()
    {
    	return name;
    }
    
    public void setPrice(float price)
    {
    	this.price=price;
    }
    
    public float getPrice()
    {
    	return price;
    }

	
	public String toString() {
		return "Book id=" + id + ", name=" + name + ", price=" + price + ""  ;
	}
    
   
    
}
