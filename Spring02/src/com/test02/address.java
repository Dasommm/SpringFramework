package com.test02;

public class address {

	private String name;
	private String addr;
	private String phone;
	
	public address() {
		this.name = "솜";
		this.addr = "강동구";
		this.phone="3004-6470";
		
	}
	
	public address(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	public String toString() {
		return "이름 : "+name+" \t 주소 : "+addr+"\t 번호 : "+phone;
	}

}
