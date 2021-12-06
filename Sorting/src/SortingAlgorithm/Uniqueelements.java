package SortingAlgorithm;

import java.util.Scanner;

public class Uniqueelements {

	public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);
      
       System.out.println("enter size");
       int size=scan.nextInt();
       
       int arr[]=new int[size];
       
       System.out.println("enter elements");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=scan.nextInt();
       }
       int count=0;
       //System.out.println("unique elements");
       for(int i=0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    		   
       		if(arr[i]==arr[j]) {
       			count++;
       			arr[j]=0;
       		}
    	   }
    	   if(count==0 && arr[i]!=0) {
    		   System.out.println("unique element"+arr[i]);
    	   }
    	   else if(arr[i]!=0 && arr[i]>0){
    		   System.out.println("duplicate element"+arr[i]);
    	   }
    	   count=0;
       	}
	}

}
