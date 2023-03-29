package com.test4;

public class Studentt {
	
	int id;
	String name;
	float marks;
	static int Studentcount;
	
	{
		Studentcount++;
	}
	
	Studentt()
	{
		
	}
	Studentt(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	Studentt(int id,String name,float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
		
	}

