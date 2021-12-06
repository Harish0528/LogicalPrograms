package SortingAlgorithm;

import java.util.Scanner;

public class ArraySpecIndex {

	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Size of array: ");
		int si=s.nextInt();
		
		int arr[]= new int[si+1];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter index postion: ");
		int index=s.nextInt();
		System.out.println("Enter value: ");
		int val=s.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(i==index) {
				if(i!=arr.length-1) {
				for(int j=arr.length-1;j>i;j--) {
					arr[j]=arr[j-1];
				}
				}
				arr[index]=val;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
