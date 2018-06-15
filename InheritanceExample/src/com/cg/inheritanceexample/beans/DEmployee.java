package com.cg.inheritanceexample.beans;

public final class DEmployee extends PEmployee{
	private int incentive,projects;	

	public DEmployee() {
		super();
	}

	
	public DEmployee(int employeeId, int basicSalary, String firstName, String lastName,int projects, int incentive) {
		super(employeeId, basicSalary, firstName, lastName);
		this.incentive=incentive;
		this.projects=projects;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public int getProjects() {
		return projects;
	}

	public void setProjects(int projects) {
		this.projects = projects;
	}
	public void calculateSalary(){
//		super.calculateSalary();
		this.setTotalSalary(this.getTotalSalary()+(this.incentive*this.projects));
	}

}

