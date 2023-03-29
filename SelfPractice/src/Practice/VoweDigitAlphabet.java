package Practice;

import java.util.Scanner;

//vowel,digit,consonant or special charecter 
public class VoweDigitAlphabet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter charecter");
		char charecter = sc.next().charAt(0);

//		System.out.println("enter digit");
//		int digit = sc.nextInt();

		switch (charecter) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'U':
			System.out.println(charecter + " this is vovel");
			break;
		default:
			System.out.println(charecter + " is consonant");
			break;
		}

		System.out.println();
		System.out.println("enter digit");
		int digit = sc.nextInt();
     
		switch (digit) {
		
		case 0,1,2,3,4,5,6,7,8,9:
			System.out.println("this is digit");
		break;
		
		default :System.out.println("special charecter");
		break;
		}
	}

}
