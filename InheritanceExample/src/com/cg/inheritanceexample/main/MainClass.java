package com.cg.inheritanceexample.main;

import com.cg.inheritanceexample.beans.CEmployee;
import com.cg.inheritanceexample.beans.DEmployee;
import com.cg.inheritanceexample.beans.Employee;
import com.cg.inheritanceexample.beans.PEmployee;
import com.cg.inheritanceexample.beans.SalesManager;

public class MainClass {

	public static void main(String[] args) {
//		Employee employee=new Employee(101, 23000, "Shravan", "Kumar");
//		employee.calculateSalary();
//		System.out.println(employee.toString());
		
		PEmployee employee2=new PEmployee(102, 22000, "Chitraksh", "Singisetti", 200, 500, 500);
		employee2.calculateSalary();
		System.out.println(employee2.toString());
		
		CEmployee employee3=new CEmployee(103, 20000, "pranav", "venkat", 3, 2000);		
		employee3.calculateSalary();
		System.out.println(employee3.toString());
		
		DEmployee employee4=new DEmployee(104, 18000, "sindhu", "k", 4, 4000);		
		employee4.calculateSalary();
		System.out.println(employee4.toString());

		SalesManager employee5=new SalesManager(105, 11111, "venky", "telugu", 200, 500, 500, 1000);		
		employee5.calculateSalary();
		System.out.println(employee5.toString());

		Employee employee6=new PEmployee(102, 22000, "Chitraksh", "Singisetti", 200, 500, 500);
		employee6.calculateSalary();
		System.out.println(employee6.toString());
		
		     
/*		employee=new CEmployee(13,30000,"shravan","s",300,2000);
		CEmployee cemp=(CEmployee)employee;
		cemp.signContract();
		employee.calculateSalary();
		System.out.println(employee);

		 employee=new DEmployee(14,4000,"deepak","m",20,250);
		 DEmployee dev=(DEmployee)employee;
		dev.developProject();
		 employee.calculateSalary();
		 
		employee=new SalesManager(15,1,"mohan","k",5000);
		employee.calculateSalary();
		SalesManager sales=(SalesManager)employee;
		sales.doSales();
		employee.calculateSalary();
		System.out.println(employee);*/
	}
}
