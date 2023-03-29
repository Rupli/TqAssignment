package com.demo;
// employee has company id that is Eid
public class EmployeeCoint 
{
	private int id;
	private String nameEmp;
	private static String compName = "SoftLink";	
	private  long salary;
    
    
    //constructer
    
    public EmployeeCoint()
    {
      super();	
    }
	public EmployeeCoint(int id , String name,String compName,long salary)
	{
		this.id=id;
		this .nameEmp=nameEmp;
		this .compName=compName;
		this.salary=salary;
		
	}
	//getter setter :=
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	// name
	public String getNameEmp() {
		return nameEmp;
	}
	public void setNameEmp(String nameEmp) {
		this.nameEmp = nameEmp;
	}
	public static String getCompName() {
		return compName;
	}
	public static void setCompName(String compName) {
		EmployeeCoint.compName = compName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary=salary;
	}
	public String toString()
	{
	return "id" + id +"compName"+ "salary"+salary+ "nameEmp"+nameEmp ;
	
	
	
	
	
	
}
}