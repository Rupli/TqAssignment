package com.test5;

public class Super {
	void property() {
		System.out.println("parent class property+ money");
	}

	class Sub extends Super
	{
		
			//super.property(); call superclass
				
		void property()
		{
			super.property();
			System.out.println("sub class property+ car");//override
		}
		
		
	}
}
