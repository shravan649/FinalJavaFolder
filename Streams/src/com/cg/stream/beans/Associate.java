package com.cg.stream.beans;
import java.io.Serializable;
public class Associate implements Serializable {
	private int associateId,basicSalary;
	//private transient int basicSalary;
	private String firstName,lastName;
	public Associate(){}
	public Associate(int associateId, int basicSalary, String firstName, String lastName) {
		super();
		this.associateId = associateId;
		this.basicSalary = basicSalary;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
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
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", basicSalary=" + basicSalary + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
}