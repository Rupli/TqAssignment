package com.test4;

public class GameTest extends Game
{
	void rule()
	{
		System.out.println("game rule");
	}
	void tenis()
	{
		System.out.println("football game details ");
}
	void Carome()
	{
		System.out.println("Basketball game details ");
	}
	
   public GameTest()
   {
	   super();
	   System.out.println("game test");
   }
	
   public static void main(String[] ags)
   {
	   GameTest g = new GameTest();
	   g.Carome();
	   g.tenis();
	   g.rule();
   }
	
	
	

	
}