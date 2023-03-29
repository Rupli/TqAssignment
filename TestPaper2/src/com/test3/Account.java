package com.test3;

public class Account {

	int accid;
	String name;
	float balance;
	String bankname;
	String pancard;
	
	Account ac = new Account();
	
	Account()
	{
		
	}
	
	Account(int acc,String n,float bal,String bname,String pan)
	{
		this.accid=accid;
		this.name=name;
		this.balance=balance;
		this.bankname=bankname;
		this.pancard=pancard;
		
	}
	
	public void setAccid(int aacid)
	{
		this.accid=accid;
	}
	
	public int get()
	{
		return accid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setBalance(float balance)
	{
		this.balance=balance;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	public void setBankname(String bankname)
	{
		this.bankname=bankname;
	}
	
	public String getBankname()
	{
		return bankname;
	}
	public void setPancard(String pancard)
	{
		this.pancard=pancard;
	}
	
	public String getPancard()
	{
		return pancard;
	}
}










//Create a Account class having accid, name, balance, bankname, pan card. Create constructors and getter setters