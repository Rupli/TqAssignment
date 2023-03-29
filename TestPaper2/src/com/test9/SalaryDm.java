package com.test9;

import java.util.Comparator;

public class SalaryDm implements Comparator <Emoloyee>
{

	@Override
	public int compare(Emoloyee o1, Emoloyee o2) {
		if(o1.getSalary()== o2.getSalary())
		
		return 0;
	
		else if(o1.getSalary()> 10000)
		{
			return 1;
		}
		
		else 
			return -1;
		
	}
}
