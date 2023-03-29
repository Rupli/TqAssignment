package Practice;
import java.util.Scanner;
public class ExractDigitt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rem, sum=0;
		System.out.println("enter number");
		int number=sc.nextInt();


		while(number!=0) {
			rem=number%10;
			number/=10;
			sum=rem+sum;
		}
		System.out.println(sum);

		sc.close();
		}
	}
	

