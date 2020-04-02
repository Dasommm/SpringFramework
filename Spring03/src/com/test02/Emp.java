package com.test02;

public class Emp {
	
	private String name;
	private int salary;
	
	public Emp() {
		this.name = "솜";
		this.salary = 4000;
		
	}

	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 월급 : " + salary ;
	}
	
	

}
