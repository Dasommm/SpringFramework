package com.test01;

public class MessageBeanImpl implements MessageBean {

	private String fruit;
	private int cost;
	
	
	public MessageBeanImpl () {
		this.fruit = "banana";
		this.cost = 5000;
		
	}

	public MessageBeanImpl(String fruit, int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("과일이름:"+fruit+"\t 가격:"+cost);
		
	}
	
}
