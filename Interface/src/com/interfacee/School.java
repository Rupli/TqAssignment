package com.interfacee;

public class School implements Student, Teacher
{
	public void display()
	{
		Student.super.display();
		Teacher.super.display();
		System.out.println("this is school");
	}
	public static void main(String [] args)
	{
		School s = new School();
		s.display();
	}

}
