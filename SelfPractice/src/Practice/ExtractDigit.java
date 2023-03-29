package Practice;
//
import java.util.Scanner;
public class ExtractDigit {

	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int number=sc.nextInt();


while(number!=0) {
	System.out.println(number%10);
	number/=10;
}

sc.close();
}

	

}
	


