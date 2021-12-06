package SortingAlgorithm;

public class QuickSort2 {
	
	public int partition(int a[],int l,int h) {
		
		System.out.println(l);
		int pivot=a[l];
		int p1=l+1;
		int temp,i;
		
		for(i=l+1;i<=h;i++)
        {

        if(a[i]<pivot)
            {
                if(i!=p1)
              {
                    temp=a[p1];
                    a[p1]=a[i];
                    a[i]=temp;
              }
                p1++;
            }
        }
		
		a[l]=a[p1-1];
		a[p1-1]=pivot;
		
		return p1-1;
	}
	

	public void sort(int a[],int l,int h) {
		
		if(l<h) {
			int p=partition(a, l, h);
			
			partition(a, l, p-1);
			partition(a, p+1, h);
		}
		
	}
	
	public static void main(String args[]) {
		
		int arr[]= {89,78,23,35,56,75,25,2};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		new QuickSort2().sort(arr, 0, arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
