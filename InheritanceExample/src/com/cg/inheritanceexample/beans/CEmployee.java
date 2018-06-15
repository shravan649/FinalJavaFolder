package com.cg.inheritanceexample.beans;

public final class CEmployee extends Employee {
	private int hrs,variablepay;
	public CEmployee(){
		super();
	}
	public CEmployee(int employeeId, int basicSalary, String firstName, String lastName) {
		super(employeeId, basicSalary, firstName, lastName);

	}
	public CEmployee(int employeeId, int basicSalary, String firstName, String lastName,int hrs, int variablepay) {
		super(employeeId, basicSalary, firstName, lastName);
		this.hrs = hrs;
		this.variablepay = variablepay;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getVariablepay() {
		return variablepay;
	}
	public void setVariablepay(int variablepay) {
		this.variablepay = variablepay;
	}
	public void signContract(){
		System.out.println("contract signed");
	}
	@Override
	public void calculateSalary() {
		variablepay=this.hrs*5000;
		setTotalSalary(getVariablepay());
		
	}
	@Override
	public String toString() {
		return super.toString()+ "CEmployee [hrs=" + hrs + ", variablepay=" + variablepay + "]";
	}
	
}
