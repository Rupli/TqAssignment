package com.test3;

public class Student {

	private int sid;
	private String name;
	private int age;
	private float marks;
    static int studentcount=0; 
    
    {
    	studentcount++;
    }
	public Student() {
		System.out.println("default constructer");
	}

	public Student(int id, String name, int age, float m) {
		this.sid = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		System.out.println("parameterised constructer");
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}

	
	public String toString() {
		return "Student sid=" + sid + ", name=" + name + ", age=" + age + ", marks=" + marks + "";
	}
	
	
}

