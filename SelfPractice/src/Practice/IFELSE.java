package Practice;

import java.util.Scanner;

public class IFELSE {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();

		if (number > 0) {
			System.out.println("number is positive");
		} else if (number < 0) {
			System.out.println("number is -ve");
		} else if (number == 0) {
			System.out.println("number is zero");
		} else {
			System.out.println("invalid input");
		}
	}

}
