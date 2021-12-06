package com.biltabs.harish;

import java.util.Arrays;
import java.util.Scanner;

public class practise {
	
	
	
//	public static void sort(int b[],int size) {
//		int temp=0;
//		for(int i=0;i<b.length;i++) {
//			for(int j=1;j<b.length;j++) {
//				if(b[j-1]>b[j]) {
//					temp=b[j-1];
//					b[j-1]=b[j];
//					b[j]=temp;
//				}
//			}
//		}
//	}

	public static void main(String args[]) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Size of array1 ");
		int si=s.nextInt();
		
		System.out.println("Enter Size of array2 ");
		int size=s.nextInt();
		
		int a1[]=new int[si];
		int a2[]=new int[size];
		int a3[]=new int[si+size];
		
		int ab=0;
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		System.out.println("Enter Elements in array 1 ");
		for(int i=0;i<si;i++) {
			a1[i]=s.nextInt();
		}
		
		System.out.println("Enter Elements in array 2 ");
		for(int i=0;i<size;i++) {
			a2[i]=s.nextInt();
		}
		
		for(int i=0;i<si;i++) {
			a3[i]=a1[i];
			ab++;
		}
		
		for(int i=ab,j=0;i<size+si;i++,j++) {
			
			a3[i]=a2[j];
			
		}
		
		Arrays.sort(a3);
		for(int i=0;i<a3.length;i++) {
//			if(a3[i]!=0)
			System.out.println(a3[i]+" ");
		}
	}
}

