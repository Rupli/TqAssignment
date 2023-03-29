package com.testpaper10;

//Create List<Shipment>in which sorting is done according cities and if two order have same cities than according to shipment date(Ascending)
//Shipment class (int shipId, String Cust_name, Address addr, MyDate shipDate)
//Address class (String addr, String City, String State)
public class MyDate {
	
	private String date;

	public MyDate() {
	}

	public MyDate(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}

}
