package com.bitlabs.token.files;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FilesWriter {

	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
	
	
	try{
	
	FileWriter fw=new FileWriter("D://harish/Files/input.txt");
	
	for(int i=0;i<=100;i++) {
	fw.write('i');
	}
	fw.flush();
	System.out.println("Inserted Sucessfully");
	fw.close();
	
	}
	catch(Exception e){
		System.out.println(e);
	}
	
}
}
