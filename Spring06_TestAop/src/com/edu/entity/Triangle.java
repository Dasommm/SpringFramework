package com.edu.entity;

public class Triangle extends Shape {
	
	public Triangle() {
	}

	public Triangle(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	public void viewSize() {
		System.out.println(getTitle() + "의 넓이 : " + (getWidth() * getHeight())/2);
	}

}
