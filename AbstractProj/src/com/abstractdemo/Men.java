package com.abstractdemo;

public abstract class Men {

	int age;
	abstract void workingStatus();
	
	public Men()
	{
		age=age;
		System.out.println("this is abstract men class");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString ()
	{
		return "Men Details" + "age" + age;
	}
	
	
}
