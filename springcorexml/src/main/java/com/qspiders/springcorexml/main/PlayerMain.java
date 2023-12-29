package com.qspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspiders.springcorexml.bean.Player;

public class PlayerMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("player_config.xml");
		Player player1 = (Player) applicationContext.getBean("player1");
		Player player2 = (Player) applicationContext.getBean("player1");
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
