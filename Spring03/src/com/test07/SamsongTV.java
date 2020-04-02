package com.test07;

public class SamsongTV implements TV {
	
	public SamsongTV() {
		System.out.println("samsong 생성자 생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("samsongTV powerOn");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("samsongTV powerOff");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("samsongTV volumeUp");

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("samsongTV volumeDown");

	}

}
