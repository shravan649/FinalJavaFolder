package com.cg.inheritanceexample.beans;

public final class SalesManager extends PEmployee {
	private int salesAmt;
	private int commission;
	public SalesManager() {
		super();
		}
		public SalesManager(int employeeId, int basicSalary, String firstName, String lastName, int ta, int da,
		int hra,int salesAmt) {
		super(employeeId, basicSalary, firstName, lastName, ta, da, hra);
		this.salesAmt=salesAmt;
		}
		public double getCommission() {
		return commission;
		}
		public void setCommission(int commission) {
		this.commission = commission;
		}
		public int getSalesAmt() {
		return salesAmt;
		}
		public void setSalesAmt(int salesAmt) {
		this.salesAmt = salesAmt;
		}
		public void doSales(){
			System.out.println("do sales");
		}
		public void calculateSalary(){
			super.calculateSalary();
			commission=1*salesAmt/100;
			this.setTotalSalary(getTotalSalary()+commission);
		}
		@Override
		public String toString() {
			return super.toString()+"SalesManager [salesAmt=" + salesAmt + ", commission=" + commission + "]";
		}

}
