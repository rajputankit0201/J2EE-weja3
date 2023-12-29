package com.qspiders.springcoreannotation.bean;


import org.springframework.beans.factory.annotation.Value;
import lombok.Data;

@Data
public class Student {
	
	@Value("1")
	private int id;
	@Value("Ankit")
	private String name;
	@Value("ankit@gmail.com")
	private String email;
	@Value("26")
	private byte age;

}
