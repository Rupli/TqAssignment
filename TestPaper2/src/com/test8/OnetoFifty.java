package com.test8;

import java.util.ArrayList;
import java.util.Iterator;

public class OnetoFifty {
//WAP to add 1 to 50 numbers in arrayList and print only even numbers (using iterator) 
	public static void evenNum(ArrayList<Integer> all) {

		for (int i = 1; i <= 50; i++) {
			if ((i) % 2 == 0) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		Iterator itr= al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr);
			}
			evenNum(al);
	}
}
