package com.cg.airreservation.beans;

public class Passenger {
	private String name;
	private long mobileNo;
	public Passenger(){}
	public Passenger(String name, long mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
