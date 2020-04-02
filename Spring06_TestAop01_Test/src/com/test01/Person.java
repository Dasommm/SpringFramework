package com.test01;

public class Person implements Human {
	
	private String name;
	private String job;
	
	public void Person() {
		
	}

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob(String job) {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String sayName(String name) {
		// TODO Auto-generated method stub
		System.out.println("나의 이름은" +name+" 입니다.");
		return "나의 이름은" +name+" 입니다.";
	}

	@Override
	public String sayJob(String job) {
		// TODO Auto-generated method stub
		System.out.println("나의 직업은" + job+" 입니다.");
		return "나의 직업은" + job+" 입니다.";
	}


}
