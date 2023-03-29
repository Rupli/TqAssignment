package com.test8;

import java.util.ArrayList;

public class ArraylstToArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("rakesh");
		al.add("aman");
		al.add("yashashvi");

		Object[] objects = al.toArray();

		// printing object

		for (Object ob : al) {
			System.out.println(ob + "");
		}

	}

}
