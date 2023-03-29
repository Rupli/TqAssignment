package com.test5;

public class Engine {

	private String engineType;
	private int price;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", price=" + price + "]";
	}
	
}
