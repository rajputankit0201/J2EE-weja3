package com.jspiders.multithreading.resource;

public class Paratha {
	
	private int availableParatha;
	
	public synchronized void orderParatha(int numberOfParatha) {
		
		if(numberOfParatha > availableParatha) {
			System.out.println(numberOfParatha +" Paratha not available. please wait for sometime..");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			availableParatha -=numberOfParatha;
			System.out.println("Order for " + numberOfParatha + " paratha is successful");
		}
	}
	 public synchronized void preparedParatha(int numberOfParatha) {
		 
		System.out.println(numberOfParatha + " Parathas are getting prepared");
		availableParatha += numberOfParatha;
		System.out.println(availableParatha + " Paratha are available");
		notify();
	}
}
