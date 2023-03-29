package Practice;

public class Practice1 {
	
	private int a;
	private String name;
	private float marks;
	
	public Practice1()
	{
		System.out.println("constructor");
	}
	
	public Practice1(int a, String name)
	{
		this.a=a;
		this.name=name;
		System.out.println("parameterised cons");
	}
	
	public Practice1(int a, String name,float marks)
	{
		this(a,name);
		this.marks=marks;
		System.out.println("const chaining");
	}
	
	static void display()
	{
		System.out.println("display static method");
	}

	public void setA(int a)
	{
		this.a=a;
	}
	
	public int get()
	{
		return a;
		
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
	public float getMarks()
	{
		return marks;
	}
	

	public String toString()
	{
		return "id "+ a + name + marks; 
	}
	
	
	public static void main(String [] args)
	{
		//System.out.println(new Practice1(1,"rupali",66f));//annaoumos obj
		
	//display();
		
	}
}

	
	
	
	
	
	
	
	