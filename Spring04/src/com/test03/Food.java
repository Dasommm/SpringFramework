package com.test03;

public class Food {
	
	private String name;
	private int price;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	
	
	

}
