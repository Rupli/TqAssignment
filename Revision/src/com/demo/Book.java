package com.demo;

public class Book 
{
	private int id;
	private String name;
	private float price;
	private int totalbook;
	private Author author;
	
	public Book()
	{
		
	}
	
	public Book(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Book(int id,String name,float price,int totalbook,Author author)
	{
		this(id,name);
		this.price=price;
		this.totalbook=totalbook;
		this.author=author;
	}
	
	public void setId(int id)
	{
		this.id=id;
		}
	
	public int getId()
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price) 
	{
		this.price = price;
	}

	public int getTotalbook()
	{
		return totalbook;
	}

	public void setTotalbook(int totalbook)
	{
		this.totalbook = totalbook;
	}

	public Author getAuthor() 
	{
		return author;
	}

	public void setAuthor(Author author) 
	{
		this.author = author;
	}

	
	public String toString() 
	{
		return "id" + id + ", name=" + name + ", price=" + price + ", totalbook=" + totalbook + ", Author=" + author;
	}
	
	
	
	
	

}
