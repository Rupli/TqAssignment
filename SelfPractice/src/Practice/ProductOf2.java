package Practice;

import java.util.Scanner;

public class ProductOf2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter num");
		int num = sc.nextInt();
		int a = 33;
		int b = 88;
		int c = 22;

		if (num > a && num > c) {
			System.out.println("num is greater  ");
		}
		if (b > a ||b > num) {
			System.out.println(" B is greater");
		} else
			System.out.println("c is greter");
	}

}
