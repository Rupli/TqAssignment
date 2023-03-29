package com.string;

public class StringImmutable
{
	public static void main(String [] args)
	{
		String s = new String("java");
		
		s.concat("program");
		System.out.println(s);// String immutable
	
	
	StringBuffer sb = new StringBuffer("welcome");
	 sb.append("java");
	 System.out.println(sb);//stringBuffer muttable
	
	
	
	//equals (==) operator (ref.equals) method 
	
	String s1= new String ("python");
	String s2=new String("python");
	
	System.out.println(s1==s2);
	
	

}
}