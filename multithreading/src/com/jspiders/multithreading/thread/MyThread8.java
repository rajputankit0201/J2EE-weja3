package com.jspiders.multithreading.thread;

public class MyThread8 extends Thread {
		
	@Override
	public void run() {
		String str = "Hello world!!";
		char [] charArray = str.toCharArray();
		for( int i =0;i < charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
  
}
