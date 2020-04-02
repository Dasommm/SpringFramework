package com.test03;

import com.test02.Emp;

public class Engineer extends Emp {

	private String dept;
	
	public Engineer() {
		
	}
	
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	
	public void setDept(String dept) {
		this.dept = dept;
		
	}
	
	public String toString() {
		return super.toString()+", 부서 :"+dept;
	}
	
}
