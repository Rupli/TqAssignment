package com.abstractdemo;

public abstract class Wifi {
	String username;
	String password;

	protected abstract void getaccessed();
    
	protected abstract void details();
	
	public Wifi()
	{
		
	}
	public Wifi(String username,String password)
	{
		this.username=username;
		this.password=password;
		System.out.println("WiFi details");
	}

	@Override
	public String toString() {
		return "Wifi usename=" + username + ", password=" + password ;
	}
	
	
	
	
}
