package com.interfacee;

public interface Disable extends Showable,Movable
{
	void display();
	
	default void get()
	{
		System.out.println("interface disable");
	}

}
