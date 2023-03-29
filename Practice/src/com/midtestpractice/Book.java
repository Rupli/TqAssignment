package com.midtestpractice;

public class Book {

	private int bid;
	private String name;
	private float price;
	private Author author;
	
	
//	Book(int id,String name,float prize,Author author)
//	{
//		this.id=id;
//		this.name=name;
//		this.price=price;
//		this.author=author;
//	}
	public void setBid(int bid)
	{
		this.bid=bid;
	}
	public int getBid()
	{
		return bid;
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
	
	public void setAuthor(Author author)
	{
		this.author=author;
	}
	public Author getAuthor()
	{
		return author;
	}
	
	public String toString() {
		return "Book [id=" + bid + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
	
	
	
}
