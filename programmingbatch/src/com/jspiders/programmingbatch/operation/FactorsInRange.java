package com.jspiders.programmingbatch.operation;

import java.util.Scanner;

public class FactorsInRange {
		
	public static void main(String[] args) {
		
					try (Scanner sc = new Scanner(System.in)) {
						System.out.println("Enter the start range");
						int start=sc.nextInt();
						System.out.println("Enter the end range");
						int end=sc.nextInt();
						
						for(int i=start;i<=end;i++) {
							System.out.print(i + ": ");
							for(int j=1;j<=i;j++) {
									if (i%j==0)
									{
										System.out.print(j+" ");
									}
								}
								System.out.println();
							}
					}
					}
	}

