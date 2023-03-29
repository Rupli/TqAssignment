package Practice;
import java .util.Scanner;
public class StudentGrade {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter marks");
		int ch= sc.nextInt();
		
		
		if(ch>=85) {
			System.out.println("A grade");
		}
		else if(ch>=70) {
			System.out.println("B");
		}
		else if(ch>=55) {
			System.out.println("C");
		}
		else if(ch>=40) {
			System.out.println("D");
	}
		else {
			System.out.println("Fail");
		}

}
}