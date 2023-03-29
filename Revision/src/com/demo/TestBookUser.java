package com.demo;

import java.util.Scanner;

public class TestBookUser {
	static Scanner sc = new Scanner(System.in);

	public static void getdetails(Book b) {
		System.out.println("enter id");
		b.setId(sc.nextInt());

		System.out.println("enter name");
		b.setName(sc.next());

		System.out.println("enter price");
		b.setPrice(sc.nextFloat());

		System.out.println("enter totalbook");
		b.setTotalbook(sc.nextInt());

		System.out.println("enter author");
		b.setAuthor(new Author());

		System.out.println("author name");
		b.getAuthor().setName(sc.next());

		System.out.println("author id");
		b.getAuthor().setId(sc.nextInt());

	}

	public static void main(String[] args) {

		Book[] b1 = new Book[2];

		for (int i = 0; i < 2; i++) {
			b1[i] = new Book();
			getdetails(b1[i]);
			System.out.println(b1[i]);
		}

	}

}
