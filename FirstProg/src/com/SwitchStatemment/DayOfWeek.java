package com.SwitchStatemment;

import java.util.Scanner;

public class DayOfWeek {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);	

System.out.println("enter day");

int day = sc.nextInt();

switch(day) {

case 1:System.out.println("Monday");

break;

case 2:System.out.println("Thuesday");

break;

case 3:System.out.println("Wensday");

break;

case 4:System.out.println("thursday");

break;

case 5:System.out.println("friday");

break;

case 6:System.out.println("saturday");

break;

case 7:System.out.println("Sunday");
break;

default:System.out.println("wrong user input");

}
	}

}
