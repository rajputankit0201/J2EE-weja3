package com.qspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class User {
	
	@Value("1")
	private long id;
	@Value("Ankit")
	private String name;
	@Value("ankit@gmail.com")
	private String email;
	@Value("Ankit@123")
	private String password;
}
