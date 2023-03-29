package com.abstractdemo;

public abstract class  Locker {

	private float money;
	private String jwellary;
	private int pincode;
	
	 abstract void  details();
	
	public Locker()
	{
		
	}
	public Locker(float money,String jwellary,int pincode)
	{
		this.money=money;
		this.jwellary=jwellary;
		this.pincode=pincode;
		System.out.println("locker details");
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getJwellary() {
		return jwellary;
	}
	public void setJwellary(String jwellary) {
		this.jwellary = jwellary;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String toString() {
		return "Locker money=" + money + ", jwellary=" + jwellary + ", pincode=" + pincode + "";
	}
	
	
	
	
	
	
	
}
