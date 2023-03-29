package Practice;
import java.util.Scanner;

public class Primenum {
//prime num divide by 1 and itself
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int number=sc.nextInt();
boolean flag=true;
if(number==0 && number==1) {
	System.out.println("this is not prime number");
}
else 
		for (int i=2;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println(number+"not a prime number");
				flag =false;
				break;//come out of loop
			}
		}
if(flag) {
	System.out.println(number+" prime number");
}
		
	}

}
