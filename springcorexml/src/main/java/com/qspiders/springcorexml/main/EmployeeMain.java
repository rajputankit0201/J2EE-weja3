package com.qspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspiders.springcorexml.bean.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee_config.xml");
		
		Employee employee = applicationContext.getBean(Employee.class);
		System.out.println(employee);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
