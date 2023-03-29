package Practice;

import java.util.Scanner;

//ex 121 when we do reverse numner number should be same like original num revesr=reverse/*10+rem
public class palidrone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();

		int originalnum = number;
		int reverse = 0;
		int reminder;
		
		while(number!=0) {
			
		reminder=number%10;
		reverse=(reverse*10)+reminder;
number/=10;
		}
		if(originalnum ==reverse ) {
		System.out.println(" this is palindrome");
		}
		else {
			System.out.println("this is not palindome");
		
	}
sc.close();
}
}
