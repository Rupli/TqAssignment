package com.student;

import com.course.Course;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private Course course;

	public Student()
	{
		
	}
	public Student(int id,String name,int age,Course course)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.course=course;
		
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
	
	public void setAge()
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setCourse(Course course)
	{
		this.course=course;
	}
	public Course getCourse()
	{
		return course;
	}
	
	
	public String toString ()
	{
		return "id" +id + "name:"+ name + "age :" + age + "course:" + course;
	}
}
