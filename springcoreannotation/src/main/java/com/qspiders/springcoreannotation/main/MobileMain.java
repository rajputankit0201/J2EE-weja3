package com.qspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qspiders.springcoreannotation.bean.Mobile;

public class MobileMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.qspiders.springcoreannotation");
		
		Mobile mobile = applicationContext.getBean(Mobile.class);
		System.out.println(mobile);
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
