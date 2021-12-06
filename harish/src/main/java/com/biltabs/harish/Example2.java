package com.biltabs.harish;

import java.util.Scanner;

public class Example2 {

	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		int smin=0;
		System.out.println("Enter size of array");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("enter "+s+" elements");
		int min=sc.nextInt();
		for(int i=1;i<s;i++) {
			arr[i]=sc.nextInt();	
			
			
			if(arr[i]<min) {
				smin=min;
				min=arr[i];
			}
			else if(smin>arr[i]) {
				smin=arr[i];
			}
		}
		System.out.println(min+" "+smin);
		}
		
}

