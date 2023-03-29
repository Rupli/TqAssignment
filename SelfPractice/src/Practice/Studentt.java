package Practice;

public class Studentt {

	public static void main(String[] args) {
		
		Course cs = new  Course(1,"java");

		Course cs1 = new  Course(2,"c");

		Course cs2 = new  Course(3,"python");
		
		Student s = new Student (1,"rupali", null, cs);
		
		System.out.println(s);
		
	}

}
