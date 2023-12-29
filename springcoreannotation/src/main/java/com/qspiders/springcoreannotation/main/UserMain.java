package com.qspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qspiders.springcoreannotation.bean.User;

public class UserMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.qspiders.springcoreannotation");
		
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
