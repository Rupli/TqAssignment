package com.Test2;

public class Student {

	 int id;
	 String name;
	private float marks;

	public Student()
	{
		System.out.println("default constructer");
	}
	
	public Student(int id, String name,float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	//getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name)
	{ 
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setMarks(float marks)
	{ 
		this.marks=marks;
	}
	public float getMarks(float Marks)
	{
		return Marks;
	}
	public String toString()
	{
		return "student details : " + id + " "+""+name+""+ ""+ marks;
	}
	
}
// id, name, marks (private). Create getter , setters and toString method. Create a Student test class in which create 3 objects . Take the input from the user and then display the details of all the students