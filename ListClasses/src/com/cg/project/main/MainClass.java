package com.cg.project.main;
import java.util.ArrayList;
import java.util.Collections;
import com.cg.project.beans.Customer;
public class MainClass {
	public static void main(String[] args) {
//		ArrayList<Customer>customerList=new ArrayList<>();
//		customerList.add(new Customer(111, "shravan", "kumar"));
//		customerList.add(new Customer(112, "Chitraksh", "s"));
//		customerList.add(new Customer(113, "usha", "s"));
//		Customer customerToBeSearch=new Customer(111, "shravan", "kumar");
//		System.out.println(customerList.contains(customerToBeSearch));
//		Collections.sort(customerList);
//		for (Customer customer : customerList) {
//			System.out.println(customer);
			//		Collections.sort(customerList,new CustomerComparator);
			//		for (Customer customer : customerList)
			//			System.out.println(customer);
	ArrayList<String> strList=new ArrayList<>();
	strList.add("Mushroom");
	strList.add("Biryani");
	strList.add("super");
	iterateOnList(strList);
	ArrayList<Integer>intList=new ArrayList<>();
	intList.add(101);
	intList.add(102);
	intList.add(103);
	iterateOnList(intList);
	ArrayList<Object>objList=new ArrayList<>();
	
	public static void iterateOnList(ArrayList<?>elements){
		for (Object object : elements) {
			System.out.println(object);
		}
	}
	}
}