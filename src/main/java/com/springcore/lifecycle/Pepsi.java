package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private int price;

	public int getPrice() {
		return price;
	}
	

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//Init
		System.out.println("initialize pepsi");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		System.out.println("destroy pepsi");
	}
	
}
