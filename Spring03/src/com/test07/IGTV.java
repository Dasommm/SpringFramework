package com.test07;

public class IGTV implements TV {
	
	public IGTV() {
		System.out.println("IGTV 생성자 생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("IGTV PowerOn");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("IGTV PowerOff");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("IGTV volumeUp");

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("IGTV volumeDown");

	}

}
