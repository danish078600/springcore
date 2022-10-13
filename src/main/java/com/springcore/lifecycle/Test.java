package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Product p=(Product) context.getBean("product");
		System.out.println(p);
		context.registerShutdownHook();
	}

}
