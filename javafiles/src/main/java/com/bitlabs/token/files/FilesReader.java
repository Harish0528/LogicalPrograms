package com.bitlabs.token.files;

import java.io.FileReader;
import java.io.FileWriter;

public class FilesReader {

	public static void main(String args[]) {
	try {
		FileReader fr=new FileReader("D://harish/Files/input.txt");

		int ch=0;
		String arr[]=
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
			
		}
//		fr.close();
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
