package com.cg.inheritanceexample.beans;

public class PEmployee extends Employee {
	private int hra,ta,da;
	public PEmployee(){
		super();
	}
	public PEmployee(int employeeId, int basicSalary, String firstName, String lastName) {
		super(employeeId, basicSalary, firstName, lastName);
		
	}
	public PEmployee(int employeeId, int basicSalary, String firstName, String lastName,int hra, int ta, int da) {
		super(employeeId, basicSalary, firstName, lastName);
		this.hra = hra;
		this.ta = ta;
		this.da = da;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	
	@Override
	public void calculateSalary() {
			this.hra=this.getBasicSalary()*10/100;
			this.da=this.getBasicSalary()*5/100;
			this.ta=this.getBasicSalary()*2/100;
			this.setTotalSalary(this.getBasicSalary()+da+hra+ta);
		
	}
	@Override
	public String toString() {
		return super.toString()+"PEmployee [hra=" + hra + ", ta=" + ta + ", da=" + da + "]";
	}
	
}
