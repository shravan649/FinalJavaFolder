package com.cg.project.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Associate {
@Id
private int associateId;
private String firstName,lastName,mobileNo;
private int salary;
public Associate(){}
public Associate(int associateId, String firstName, String lastName, String mobileNo, int salary) {
	super();
	this.associateId = associateId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNo = mobileNo;
	this.salary = salary;
}
public int getAssociateId() {
	return associateId;
}
public void setAssociateId(int associateId) {
	this.associateId = associateId;
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
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}


}
