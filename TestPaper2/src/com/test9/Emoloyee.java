package com.test9;

import java.util.Objects;



public class Emoloyee {

	private int id;
	private String name;
	private float salary;
	private Department department;
	
	
	public Emoloyee()
	{
		
	}

	public Emoloyee(int id, float salary,  String name,Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department=department;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emoloyee other = (Emoloyee) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}

	@Override
	public String toString() {
		return "Emoloyee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	
	
	

}
