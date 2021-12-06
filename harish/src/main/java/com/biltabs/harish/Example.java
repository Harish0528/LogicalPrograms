package com.biltabs.harish;


import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;


public class Example {

		public static void main(String[] args) {
			
			Scanner s= new Scanner(System.in);
			
			int count = 0,con=0,let=0,sp=0;
			System.out.println("Enter a String");
			String str= s.nextLine();
			String rev[]=str.split(" ");
			String rw="";
			
			System.out.println("Reverse String:");
			for(int i=0;i<rev.length;i++) {
				for(int j=rev[i].length()-1;j>=0;j--) {
				rw=rw+rev[i].charAt(j);
			}
				rw+=" ";
			}
			System.out.print(rw);
			
			System.out.println("\nNumber of letters and vowles in a word:");
			for(int i=0;i<rev.length;i++) {
				System.out.println("\n"+rev[i]+":"+rev[i].length()+rw);
				for(int j=0;j<rev[i].length();j++) {
					char ch=rev[i].charAt(j);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					let++;
					}
					else {
						con++;	
					}
				}
				System.out.println("Vowels:"+let);
				let=0;
				con=0;
			}
			
		
//			for(int i=0;i<str.length();i++) {
//				char ch=str.charAt(i);
//				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
//					count++;
//				}
//				else {
//					con++;
//				}
//			}
			
			System.out.println("\nNumber of Vowles in a word:"+count);
			System.out.println("Number of Consonants in a word:"+con);
			
			}
}
				
