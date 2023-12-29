package com.jspiders.programmingbatch.operation;

public class PrintTheNumber {
		
		public static void main(String[] args) {
			for(int i=1;i<=20;i++) {
				int count=0;
				for(int j=1;j<=i;j++) {
					if (i%j==0) {
						count++;
					}
				}
				if(count==3 || count==5) {
					System.out.println(i);
				}
				System.out.println(i + ":"+count);	
			}
		}
		}
