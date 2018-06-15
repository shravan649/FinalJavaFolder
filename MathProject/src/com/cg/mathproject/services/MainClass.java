package com.cg.mathproject.services;

public class MainClass {

	public static void main(String[] args) {
		MathServices mathServices=new MathServicesImpl();
		System.out.println(mathServices.add(1, 1));

	}

}
