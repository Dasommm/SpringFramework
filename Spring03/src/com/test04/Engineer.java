package com.test04;

public class Engineer {
	
	private Emp emp;
	private String dept;
	
	public Engineer() {
		
	}
	
	public Engineer(Emp emp, String dept) {
		this.emp = emp;
		this.dept = dept;
		
	}
	
	public String toString() {
		return emp+", 부서 : "+dept;
	}

}
