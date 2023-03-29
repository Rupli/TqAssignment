package com.test8;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String str[]= {"shreya","rudra"
				,"aveer","prem"};
		
		// array to arraylist 
		
		//Arrays.asList
		
		List al= Arrays.asList(str);
		System.out.println(al);
	}

}
