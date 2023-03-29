package com.test4;

public class Author 
{

	private int authorid;
	private String authorname;
	private Book bk;
	
	public Author()
	{
		
	}
	public Author(int authorid,String authorname,Book book)
	{
		this.authorid=authorid;
		this.authorname=authorname;
		this.bk=bk;
	}
	
	public void setAuthorid(int authorid)
	{
		this.authorid=authorid;
	}
	
	public int getAuthorid()
	{
		return authorid;
	}
	
	public void setBk(String Book)
	{
		this.bk=bk;
	}
	
	public Book getBook()
	{
		return bk;
	}
	public void setAuthorname(String name)
	{
		this.authorname=authorname;
	}
	
	public String getAuthorname()
	{
		return authorname;
	}
	
	public String toString()
	{
		return "authorid" + authorid + "authorname" + authorname + "book" + bk;
	}
	
	
	
	
	
	
	
}
