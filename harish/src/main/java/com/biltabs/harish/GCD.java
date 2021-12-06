package com.biltabs.harish;

import java.util.Scanner;

public class GCD {
	  public static void main(String[] args) {

	    int size = 0;
	    int arr[] = null;
	    int result = 0;
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Enter total numbers: ");
	    size = scan.nextInt();
	    
	    arr = new int[size];
	    
	    System.out.println("Enter numbers: ");
	    for(int i=0; i<size; i++) {
	      arr[i] = scan.nextInt();
	    }
	    
	    result = arr[0];
	    
	    for(int i=1; i<size; i++) {
	      result = findHCF(result, arr[i]);
	    }

	    System.out.println("GCD = " + result);
	  }

	
	  public static int findHCF(int num1, int num2) {
	    while (num2 > 0) {
	      if (num1 > num2)
	        num1 = num1 - num2;
	      else
	        num2 = num2 - num1;
	    }
	    return num1;
	  }
	}