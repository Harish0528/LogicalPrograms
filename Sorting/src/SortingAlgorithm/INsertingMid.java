package SortingAlgorithm;

public class INsertingMid {

	public static void main(String args[]) {
		
		int arr[]= {1,2,3,4,2,3,0};
		int n=arr.length;
		int x=10;
		
		int mid=(0+(arr.length-1))/2;
		
		for(int i=0;i<arr.length;i++) {
			if(i==mid) {
				for(int j=arr.length-1;j>=i;j--) {
					arr[j]=arr[j-1];
				}
				arr[mid]=x;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
