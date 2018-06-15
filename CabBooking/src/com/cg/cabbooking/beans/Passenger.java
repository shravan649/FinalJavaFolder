package com.cg.cabbooking.beans;

public class Passenger {
	private int mobileNO;
	private String firstName,lastName,emailId;
	public Passenger(){}
	public Passenger(int mobileNO, String firstName, String lastName, String emailId) {
		super();
		this.mobileNO = mobileNO;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public int getMobileNO() {
		return mobileNO;
	}
	public void setMobileNO(int mobileNO) {
		this.mobileNO = mobileNO;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
