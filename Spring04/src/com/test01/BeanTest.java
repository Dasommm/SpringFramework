package com.test01;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanTest {
	
	private MyClass myclass;

	public BeanTest() {
		System.out.println("기본생성자");
	}
	
	public BeanTest(Date date) {
		System.out.println("파라미터 1개 생성자(Date date) : "+date);
	}
	
	public void setMyclass(MyClass myclass) {
		this.myclass = myclass;
		System.out.println("setMyclass(MyClass myclass) 호출");
	}
	
	public void setDate(Date date) {
		System.out.println("setDate(Date date) 호출");
	}
	
	public void setNumber(int i) {
		System.out.println("setNumber(int i) 호출 :"+i);
	}
	
	public void setArray(String[] arr) {
		System.out.println("setArray(String[] arr) 호출 : ");
		for(String str : arr) {
			System.out.println(str);
		}
	}
	
	public void setList(List<String> list) {
		System.out.println("setList(List<String> list) 호출 :");
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	public void setMyset(Set<String> set) {
		System.out.println("setMyset(Set<String> set) 호출");
		for(String str : set) {
			System.out.println(str);
		}
	}
	public void setMap(Map<String, String> map) {
		System.out.println("setMap(Map<String, String> map) 호출");
		Collection<String> values = map.values();
		
		for(String value:values) {
			System.out.println(value);
		}
	}
	
	public void setScore(List<Score> score) {
		System.out.println("setScore(List<Score> score) 호출");
		for(Score sc : score) {
			System.out.println(sc);
		}
	}
}
