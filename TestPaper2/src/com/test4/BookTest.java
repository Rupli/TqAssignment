package com.test4;

public class BookTest {

	public static void main(String[] args) {

		Author a = new Author(1, "ravi", new Book(1, "Abc", 121f));
		
		Author a1 = new Author(1, "yash", new Book(2, "bmc", 131f));
		
		Author a2 = new Author(1, "priyank", new Book(3,"xyz", 871f));
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);

	}

}
