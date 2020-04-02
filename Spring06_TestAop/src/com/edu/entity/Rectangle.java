package com.edu.entity;

public class Rectangle extends Shape {
	
	public Rectangle() {
	}

	public Rectangle(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	public void viewSize() {
		System.out.println(getTitle() + "의 넓이 : " + (getWidth() * getHeight()));
	}

}
