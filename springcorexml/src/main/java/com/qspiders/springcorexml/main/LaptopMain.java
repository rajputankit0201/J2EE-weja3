package com.qspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspiders.springcorexml.bean.Laptop;

public class LaptopMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("laptop_config.xml");
		
		Laptop laptop = (Laptop)applicationContext.getBean(Laptop.class);
		System.out.println(laptop);
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
