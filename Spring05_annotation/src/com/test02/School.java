package com.test02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {
	
	//@Autowired  ///autowire = "default"로 실행, constructor가 없으면 byType으로.. 거의 byType이라고 생각하면 된다. 
	//@Qualifier("hong") 	//홍이라는 이름을 가진 객체 하나만 데려오고 싶다 
	@Resource(name="lee") ////////Resource는 byName -> byType으로 동작
	private Student student;
	
	private int grade;
	
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}


	public School(Student student, int grade) {
		super();
		this.student = student;
		this.grade = grade;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return student + ", grade=" + grade ;
	}
	
	

}
