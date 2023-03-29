package com.test5;

public class Machine
{
	private String machineType;
	private Engine e;
	
	
	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Machine [machineType=" + machineType + ", e=" + e + "]";
	}
	
	

}
