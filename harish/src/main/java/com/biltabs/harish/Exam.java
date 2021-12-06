package com.biltabs.harish;

import java.util.Scanner;

public class Exam {

	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Size of array1 ");
		int si=s.nextInt();
		
		int a1[]=new int[si];
		
		System.out.println("Enter Elements in array 1 ");
		for(int i=0;i<si;i++) {
			a1[i]=s.nextInt();
			
		}
		
		for(int i=a1.length-1;i>=0;i--) {
			System.out.print(a1[i]+" ");
		}
		
	}
}
