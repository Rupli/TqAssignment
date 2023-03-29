package com.interfacee;

public interface Teacher {

	default void display()
	{
		System.out.println("i am teacher");
	}
}
