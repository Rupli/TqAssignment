package com.test5;

public class Car 
{
	private int modelno;
	private Machine m;
	
		
	
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public Machine getM() {
		return m;
	}
	public void setM(Machine m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Car [modelno=" + modelno + ", m=" + m + "]";
	}

	
	
	
	
}
