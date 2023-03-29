package com.demo;

public class One {

	protected int num;
	
	public One()
	{
		
	}
	
	public One(int n)
	{
		this.num=num;
		
	}

	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public String toString()
	{
		return "data:" + " " + num;
	}
	
}
	class Two extends One{
		
	private String school;
   
	public Two()
	{
		
	}
	
	public Two(String school)
	{
		this.school=school;
	}
	
	public void Display()
	{
		System.out.println(num+school);
	}
	public void setSchool(String school)
	{
		this.school=school;
	}
	public String getSchool()
	{
		return school;
	}
	public String toString()
	{
		return "data:" + " " + school;
	}
	
	class DemoTest {
		public static void main(String [] args)
		{
		One o = new One();
		o.setNum(2);
		
		
		Two t = new Two();
		t.setNum(5);
		t.setSchool("primary school");
		
		System.out.println(o.getNum());
		System.out.println(t.getNum() + t.getSchool());
	}
	
	
	
	}
	}
