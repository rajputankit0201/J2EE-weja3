package com.qspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspiders.springcorexml.bean.Company;

public class CompanyMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("company_config.xml");
		
		Company company = (Company) applicationContext.getBean("company");
		System.out.println(company);
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
