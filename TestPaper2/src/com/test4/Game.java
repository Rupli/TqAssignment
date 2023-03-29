package com.test4;

public abstract class Game
{
	abstract void rule();
	
	void tenis()
	{
		System.out.println("tenis game details ");
	}
	void Carome()
	{
		System.out.println("carome game details ");
	}

	public Game()
	{
		
	}
	public Game(int id)
	{
		id=1;
		System.out.println(" "); 
	}
	
}
