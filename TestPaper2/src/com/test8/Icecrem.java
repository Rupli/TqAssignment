package com.test8;

import java.util.ArrayList;
import java.util.List;

public class Icecrem {
//program to create a set of 3 ice cream objects. Assign value to
//each variable by using getter setters. All fields in ice cream class are private. Accept values from user. Class 

	private int price;
	private String scoopsize;
	private String flavour;

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getScoopsize() {
		return scoopsize;
	}

	public void setScoopsize(String scoopsize) {
		this.scoopsize = scoopsize;
	}

	

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public void getFlavour() {
		this.flavour = flavour;
	} 

	@Override
	public String toString() {
		return "price [price=" + price + ", scoopsize=" + scoopsize + ", icecremeflavour=" + flavour + "]";
	}

	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}

	}

}
