package com.test8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfCount {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter digit");
		
		int digit =sc.nextInt();
		 List<Integer> numbers = new ArrayList<>();

	       

	        int sum = 0;

	        for (int number : numbers){
	            sum += number;
	        }

	        System.out.println(sum);
	    }

	}


