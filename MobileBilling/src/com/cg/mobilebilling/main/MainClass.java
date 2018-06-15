package com.cg.mobilebilling.main;

import com.cg.mobilebilling.bean.Address;
import com.cg.mobilebilling.bean.Bill;
import com.cg.mobilebilling.bean.Customer;
import com.cg.mobilebilling.bean.Plan;
import com.cg.mobilebilling.bean.PostPaidAccount;

public class MainClass {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setCustomerId(100);
		System.out.println(customer.getCustomerId());
		
		Address address=new Address();
		address.setCity("Vizag");
		System.out.println(address.getCity());

//		Plan plan=new Plan();
//		plan.setPlanID(111);
//		System.out.println(plan.getPlanID());
		
//		PostPaidAccount postPaidAccount=new PostPaidAccount();
//		postPaidAccount.setMobileNo(868191230);
//		System.out.println(postPaidAccount.getMobileNo());
		
		PostPaidAccount postPaidAccount[] =new PostPaidAccount[1];
		Plan plan=new Plan(701, 540, 100, 84, 100, 50, 500, 125, 105, 5, 2, 10, "andhra", "gold");	
        Bill bill[]=new Bill[1];
		bill[0]=new Bill(404, 2, 2, 2, 2, 21, 2, 1, 2, 2, 1, 20, 20, 1);
		PostPaidAccount[0]=new PostPaidAccount(8125858858l,plan,bill);
		 
		Address address2=new Address("vskp", "ap", "india", 530046);
		Customer customer1=new Customer();
		customer1.setCustomerId(100);
		Customer customer2 = new Customer(101,8681,881278930,"shravan","kumar",
		"may 20","shravan.com", "UAHSIHI",postPaidAccount,address);
		System.out.println(customer1.getCustomerId());
		System.out.println(customer2.getCustomerId());
		System.out.println(customer2.getAddress().getCity());
		System.out.println(customer2.getPostPaidAccount()[0].getPlan().getPlanID());
		 
	}

}
