package com.demo;

// Heirarchical inheritance
class RBI {

	float intrest=0.0f;
	void rateOfIntrest()
	{
		System.out.println("rateOfIntrest of RBI=0.0");
	}

	public RBI() 
	{
		System.out.println("default constructer");

	}

	public RBI(float intrest) {
		this.intrest = intrest;
		System.out.println(intrest);

	}
	
}
	
	
	class Hdfc extends RBI
	{
		float intrest=9.0f;
		void rateOfIntrest ()
		{
			System.out.println(intrest);
		}
		
		public Hdfc ()
		{
			System.out.println("default constructer");
		}
		
		public Hdfc (float intrest)
		{
			this.intrest=intrest;
			System.out.println(intrest);
		}
	}	
		class SBI extends RBI
		{
			float intrest = 10.0f;
			
			void rateOfIntrest ()
			{
				System.out.println("sbi rateof intrest:" +intrest);
			}
			public SBI ()
			{
				System.out.println("default constructer");
			}
			
			public SBI (float rateOfIntrest)
			{
				this.intrest=intrest;
				System.out.println(intrest);
			}
		
	}
	
	
	
	public class Bank {
		public static void main(String [] args)
		{
			RBI r = new RBI();
			r.rateOfIntrest();
			
			SBI s = new SBI();
			s.rateOfIntrest();
			
			Hdfc h = new Hdfc();
			h.rateOfIntrest();
			
			RBI r1 = new SBI();
			r1.rateOfIntrest();
		
	}

	
}
