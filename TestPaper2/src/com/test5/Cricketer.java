package com.test5;

public class Cricketer
{
	private int playerid;
	private String name;
	private float strikate;
	private int run;
	private Boolean isBaller;
	
	Cricketer()
	{
		super();
	}
	Cricketer(int playerid,String name,float strikate,int run,Boolean isBaller)
	{
		this.playerid=playerid;
		this.name=name;
		this.strikate=strikate;
		this.run=run;
		this.isBaller=isBaller;
	}
	
	public int getPlayerid()
	{
		return playerid;
	}
	public void setPlayerid(int playerid)
	{
		this.playerid = playerid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
 	{
		this.name = name;
	}
	public float getStrikate() 
	{
		return strikate;
	}
	public void setStrikate(float strikate) 
	{
		this.strikate = strikate;
	}
	public int getRun()
	{
		return run;
	}
	public void setRun(int run)
	{
		this.run = run;
	}
     
	public void setIsBaller(Boolean isBaller)
	{
		this.isBaller=isBaller;
	}
	
	public Boolean getIsBaller()
	{
		return isBaller;
	}
	@Override
	public String toString() {
		return "Cricketer [playerid=" + playerid + ", name=" + name + ", strikate=" + strikate + ", run=" + run
				+ ", isBaller=" + isBaller + "]";
	}
	
	
}
