package com.demo;

public class Singles extends Single {
	

	
	
	void display() {
		
		
		System.out.println("subclass method");
	}

	public static void main(String[] args) {
		Singles s1 = new Singles();
 
		s1.display();
		
	}
}