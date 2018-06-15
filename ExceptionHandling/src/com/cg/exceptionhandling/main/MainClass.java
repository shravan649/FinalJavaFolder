package com.cg.exceptionhandling.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter no.");
			int n1=scanner.nextInt();
			System.out.println("Enter no.");
			int n2=scanner.nextInt();
			System.out.println(n1/n2);
		} catch (InputMismatchException e) {
			System.out.println("check the i/p correctly");
		}
		catch (ArithmeticException e) {
			System.out.println("mention correct inputs");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("cannot divide by zero");
		}
	}	
		
		

	

}
