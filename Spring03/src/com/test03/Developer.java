package com.test03;

import com.test02.Emp;

public class Developer extends Emp {

	private String dept;
	
	public Developer() {
		
	}
	
	public Developer(String name, int salary) {
		super(name, salary);
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString()+", 부서 : "+dept;
	}
}
