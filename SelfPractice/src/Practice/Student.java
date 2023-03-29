package Practice;

public class Student {
	private int id;
	private String name;
	private float marks[];
	private Course course;

	public Student() {
		super();
	}

	public Student(int id, String name, float marks[], Course course) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float[] getMarks() 
	{
		return marks;
	}
   
	public void setMarks(float [] marks)
	{
	     this.marks=marks;
	     
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
		return "studentId:" + id + name + marks + course; 
	}

}
