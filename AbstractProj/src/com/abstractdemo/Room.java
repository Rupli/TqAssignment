package com.abstractdemo;

public class Room extends Closet {

	
	 void show()
	 {
		 System.out.println("show details");
	 }
	
	 Room()
	 {
		 
	 }
	
	 Room(float door,float space)
	 {
		 this.door=2f;
		 this.space=14f;
		 System.out.println("room");
	 }
	


  public static void main(String [] args)
  {
	 Room rm = new Room(1.2f,32f);
	 rm.show();
	 System.out.println(rm);
	
	
	
}
}
