package com.qspiders.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.qspiders.springcoreannotation.bean.Student;

public class StudentConfig {
	
	@Bean(name="student")
	public Student getStudent() {
		return new Student();
		
}
}