package com.cg.mobilebilling.bean;

public class Customer {
private int customerId,mobileNo,adharNo;
private String firstName,lastName,dateOfBirth,emailId,pancardNo;
private PostPaidAccount postPaidAccount[];
private Address address;

public Customer(){}

public Customer(int customerId, int mobileNo, int adharNo, String firstName, String lastName, String dateOfBirth,
		String emailId, String pancardNo, PostPaidAccount[] postPaidAccount, Address address) {
	super();
	this.customerId = customerId;
	this.mobileNo = mobileNo;
	this.adharNo = adharNo;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.emailId = emailId;
	this.pancardNo = pancardNo;
	this.postPaidAccount = postPaidAccount;
	this.address = address;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public int getMobileNo() {
	return mobileNo;
}

public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}

public int getAdharNo() {
	return adharNo;
}

public void setAdharNo(int adharNo) {
	this.adharNo = adharNo;
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

public String getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPancardNo() {
	return pancardNo;
}

public void setPancardNo(String pancardNo) {
	this.pancardNo = pancardNo;
}

public PostPaidAccount[] getPostPaidAccount() {
	return postPaidAccount;
}

public void setPostPaidAccount(PostPaidAccount[] postPaidAccount) {
	this.postPaidAccount = postPaidAccount;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}


	
}
