package com.interfacee;

public class Practice implements Showable , Disable,Movable{

	public void show ()
	{
		
		System.out.println("show");
	}
	
	public void display()
	{
		
		System.out.println("display");
	}
	
	public void move()
	{
		System.out.println("movable");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Practice p =new Practice();
         p.show();
         p.display();
	}

}
