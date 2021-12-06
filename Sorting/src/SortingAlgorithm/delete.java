package SortingAlgorithm;

public class delete {

	public static void main(String args[]) {
		int arr[]= {2,2,4,2,3};
		int n=arr.length;
		int x=2;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
			for(int j=i+1;j<arr.length;j++) {
				arr[j-1]=arr[j];
			}
			i--;
			n--;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
