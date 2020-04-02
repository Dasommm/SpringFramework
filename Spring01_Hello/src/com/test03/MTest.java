package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//옛날 방식 
		//1.
		///Resource res = new FileSystemResources("src/com/test03/beans.xml");
		
		//2.
		//Resource res = new ClassPathResource("com/test03/beans.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
		
		//3.
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		MessageBean bean = (MessageBean) factory.getBean("korean");	//beans.xml에서 만든 객체를 데려와서 사용하고 있다.
		bean.sayHello("스프링");
		//기존에는 사용하는 곳에서 객체를 생성하고 사용을 했었는데,
		//Spring에서는 beans.xml(spring 설정파일:Spring Ioc Container : ApplicationContext)에서 만든 객체를 가져와서 여기에서 사용만한다. => 결합도를 느슨하게 해준다.
		
		bean = (MessageBean) factory.getBean("english");
		bean.sayHello("spring");
				
	}
}

		/*
		 * 1. applicationContext 와 ClassPathXmlApplicationContext
		 * BeanFactory <- ApplicationContext <- ClassPathXmlApplicationContext
		 * 스프링의 applicationContext 객체는 스프링 컨테이너의 인스턴스 이다. : 해당 path에 있는 xml에 있는 객체들을 가져와서 사용할거다.
		 * 스프링은 ApplicationContext의 몇가지 기본 구현을 제공한다.
		 * 그 중 ClassPathXmlApplicationContext는 Xml형식의 독립형 어플리케이션에 적합하다.
		 * (지정된 Classpath에서 xml(beans.xml)파일을 읽어서 객체 생성(bean tag의 애들))
		 * 
		 * 2. content, context, container
		 * content : 기능, 내용, ...
		 * context : 기능을 구현하기 위한 정보, 설정,...
		 * container : 담는 그릇 
		 * ex) serlvet의 container는 tomcat(서버)
		 * Spring ioc container는 무엇일까?
		 * 
		 * */


















