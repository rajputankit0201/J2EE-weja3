package com.jspiders.filehandling.operations;

import java.io.File;

public class DeleteFIle {

	public static void main(String[] args) {
		
		File file = new File("F:/J2EE/filehandling/test1.txt");
		if (file.exists()) {
			
			file.delete();
			System.out.println("File is deleted.");
			
		} else {
			System.out.println("File does not exists.");

		}
	}
}
