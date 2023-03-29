package com.loop;

public class FindOddNum

{
public static void main(String args[])
{
	
int i;
int sum=0;

for (i=1;i<=10;i++) {
	if(i%3==0) {
		sum=sum+i;
		System.out.println(sum);
	}
}

}

}
