package com.override;

 class AnimalTest {

	 void sound()
		{
			System.out.println("No sound");
		}
		

	}
	 
	 class Dog extends AnimalTest
	 {
		 void sound()
			{
				System.out.println("Bark");
			}
		 
	 }
	 
	 class Cat extends AnimalTest
	 {
		 void sound()
			{
				System.out.println("Meoww");
			}
		 
	 }


	class Test
	{
		public static void main(String args[])
		{
			AnimalTest a;
			 a= new Dog();
			a.sound();
			
			 a= new Cat();
			a.sound();
			
		}

	}