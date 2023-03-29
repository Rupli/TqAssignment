package com.testpaper10;

import java.util.ArrayList;
import java.util.Collections;

public class ShipmentTest {
	
	public static void main(String[] args) {
		ArrayList <Shipment> slist = new ArrayList<>();
		slist.add(new Shipment(1,"Nisha",new Address("Pimpri","Pune","MH"),new MyDate("5-02-23")));
		slist.add(new Shipment(2,"namita",new Address("Kasarwadi","Abad","MH"),new MyDate("1-02-23")));
		slist.add(new Shipment(5,"jagruti",new Address("CityPride","Nashik","MH"),new MyDate("4-02-23")));
		slist.add(new Shipment(3,"Rupali",new Address("DY Patil","Bombay","MH"),new MyDate("2-02-23")));
		slist.add(new Shipment(4,"Nisha",new Address("KrantiChowk","Abad","MH"),new MyDate("3-02-23")));
		

		for(Shipment s : slist)
		{
			System.out.println(s);
		}
		
		//Collections.sort(slist,new CityComparator());
	Collections.sort(slist,new DateComparator());
		
		System.out.println("_______________________________");
		
		for(Shipment s : slist)
		{
			System.out.println(s);
		}
	}

}
