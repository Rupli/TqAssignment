package com.SwitchStatemment;

import java.util.Scanner;

public class VowelorConsont 

{

public static void main(String[] args)

{

Scanner sc =new Scanner(System.in);	

System.out.println("enter charecter");

char charect = sc.next().charAt(0);

switch(charect) {

case 'a':System.out.println("this is vowel");
case 'e':System.out.println("this is vowel");
case 'o':System.out.println("this is vowel");	
case 'u':System.out.println("this is vowel");
case 'A':System.out.println("this is vowel");
case 'E':System.out.println("this is vowel");
case 'I':System.out.println("this is vowel");
case 'O':System.out.println("this is vowel");
case 'U':System.out.println("this is vowel");

break;

default:System.out.println("this is consonant");
	
	}

}
}