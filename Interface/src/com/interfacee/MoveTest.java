package com.interfacee;

class Nexoncar implements Movable
{

	public void move()
	{
		
		System.out.println(speed + "speed of car moving");
	}
	
	void display()
	{
		System.out.println("model v10");
	}
	
	
}

  public class MoveTest 
  {
	  public static void main(String [] args)
	  {
		  
	  Nexoncar n = new Nexoncar();
		n.display();	  
        n.move();
}

  }















