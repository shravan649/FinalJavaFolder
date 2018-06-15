package com.cg.project.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.project.beans.Associate;
public class MainClass {
	public static void main(String[] args) {
		ApplicationContext  applicationContext =new ClassPathXmlApplicationContext("projectbeans.xml");
		Associate associate1=(Associate) applicationContext.getBean("associate");
		Associate associate2=(Associate) applicationContext.getBean("associate");
		if(associate1==associate2)
			System.out.println("same ref.");
		else
			System.out.println("not same ref.");
		if(associate1.equals(associate2))
			System.out.println("same data");
		else
			System.out.println("not same data");
	}
}