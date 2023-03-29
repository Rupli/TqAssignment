package com.SwitchStatemment;

import java.util.Scanner;

public class StringType {
	
public static void main (String args[])
{
	
Scanner sc = new Scanner(System.in);	

System.out.println("enter branch");

String branch = sc.next();

switch(branch) {

case "Computer","computer":System.out.println("above 80% computer branch");
break;

case "IT","iT":System.out.println("above 70% IT branch");
break;

case "Electronics","electronics":System.out.println("above 60% electronics branch");
break;

case "Mechanical","mechanical":System.out.println("above 50% mechanical branch");
break;

case "Chemical","chemical":System.out.println("above 50% chemical branch");
break;

default:System.out.println("branch is not available");


}
	

}
}