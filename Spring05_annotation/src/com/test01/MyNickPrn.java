package com.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyNickPrn {	//<bean id="myNickPrn...>생성 첫글자는 소문자

	@Autowired
	private Nickname nickname; // 같은 타입의 객체(Nickname)를 찾아서 넣어준다. 

	public Nickname getNickname() {
		return nickname;
	}

	public void setNickname(Nickname nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "별명은" + nickname + "입니다";
	}
	
	
}
