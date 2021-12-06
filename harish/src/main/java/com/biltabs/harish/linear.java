package com.biltabs.harish;
import java.util.Scanner;
public class linear {
	
public static void main (String args[]) {
	int ar[]= {5,6,8,3,2};
	int a=0;
	Scanner s =new Scanner(System.in);
	System.out.println("Enter Element");
	int n=s.nextInt();
	for(int i=0;i<ar.length;i++) {
		if(n==ar[i]) {
			System.out.println("Element index position is " + i);
			a=0;
			break;
		}
		else {
			a=1;
		}
	}
	if(a==1) {
	System.out.println("Elementr not found");
	}
}
}
