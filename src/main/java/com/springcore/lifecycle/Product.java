package com.springcore.lifecycle;

public class Product {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) { 
		System.out.println("setting price");
		this.price = price;
	}

	public Product(int price) {
		super();
		
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	public void init() {
		System.out.println("Inside init");
	}
	public void destroy() {
		System.out.println("inside destroy");
	}
}
