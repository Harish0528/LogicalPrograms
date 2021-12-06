package SortingAlgorithm;

public class InsertionSort {

	public static void main(String args[]) {
		int arr[]= {3,5,7,1,17,2,6};
		int key=0;
		
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			for(int j=i-1;j>=0;j--) {
				if(key<arr[j]) {
					arr[j+1]=arr[j];
					arr[j]=key;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
