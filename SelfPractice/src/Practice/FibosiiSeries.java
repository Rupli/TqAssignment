package Practice;

import java.util.Scanner;

public class FibosiiSeries {

	public static void main(String[] args) {
		
		int n ,a=0,b=1,c=0;
		Scanner sc = new Scanner(System.in);
         System.out.println("enter n");
		 n=sc.nextInt();
		 System.out.print(a + " " + b);
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(""+c);
			
		}
		
		
	}

}
