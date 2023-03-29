package com.test8;

import java.util.ArrayList;

public class SearchElement {
	
	
	public static void main(String [] args)
	{
		ArrayList <String> list=new ArrayList <> ();
		
		list.add("rupali");
		list.add("neha");
		list.add("riya");
		list.add("nia");
		list.add("pranali");
		
		if(list.contains("rupali"))
		{
			System.out.println("found element");
		}
		else 
		{
			System.out.println("not found element");
		}
		
		
		
		
	}
	
	
	
	
	
	
	

}
