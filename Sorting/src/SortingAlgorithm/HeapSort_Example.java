package SortingAlgorithm;

import java.util.Arrays;

public class HeapSort_Example {

	public static void main(String[] args) {
     		//Creating object for HeapSort class
    		HeapSort_Example hs = new HeapSort_Example();
     		// declaring and initilizing array variable
    		int[] arr = {3,54,67,12,90,33};
     		// calling sort() method with object
    		hs.sort(arr);
    		System.out.println("Sorted array- " + Arrays.toString(arr));
  	}
  	// defining a method called sort(int arr[])  
  	private void sort(int[] arr){
    		// finding number of elements in the given array
    		int n = arr.length;
    
     		// finding starting point to call heapify() method and constructing max heap
    		for(int i = (n-1)/2; i >=0; i--){
      			heapify(arr, n, i);
    		}
    		System.out.println("heapified array- " + Arrays.toString(arr));
    		for(int i = n-1; i >= 0; i--){
     			// calling swap() and heapify() methods 
      			swap(arr, i, 0);
      			heapify(arr, i, 0);
    		}
  	}
 
  	// defining heapify method()   
  	private void heapify(int[] numArr, int index, int i){
    		// Declaring root, lc and rc and inititilizing values
    		int rootIndex = i;
    		int lc = 2*i + 1;
    		int rc = 2*i + 2;
    		// comparing lc with root and changing root pointer
    		if(lc < index && numArr[lc] > numArr[rootIndex])
        	rootIndex = lc;
    		// comparing rc with root and changing root pointer    
    		if(rc < index && numArr[rc] > numArr[rootIndex])
        	rootIndex = rc;
    		// Swapping root element with last node
    		if(rootIndex != i){
      			swap(numArr, rootIndex, i);
      			heapify(numArr, index, rootIndex);
    		}
  	}
   	// creating a swap() method 
  	private void swap(int[] numArr, int index, int li){
    		int temp = numArr[li];
    		numArr[li] = numArr[index];
    		numArr[index] = temp;
  	}
}
