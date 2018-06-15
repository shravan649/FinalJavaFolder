package com.cg.project.services;

import org.springframework.stereotype.Component;

//@Component("greetingServices")
public class GreetingServicesNewImpl implements GreetingServices {
	public  GreetingServicesNewImpl() {
		System.out.println("greetingServicesNewImpl");
	}
	@Override
	public void sayHello(String personName) {
		System.out.println("hi" +personName);
	}
	@Override
	public void sayBye(String personName) {
		System.out.println("bye" +personName);
	}
}