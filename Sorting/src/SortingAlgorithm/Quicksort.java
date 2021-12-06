package SortingAlgorithm;

public class Quicksort {

    public int partition (int a[],int low,int high)
    {

//        int pivot = a[low];
//       int temp=0;
//        int i = low;
//        int j=high; 
        int pivot=a[low],p1=low+1,i,temp;

        for(i=low+1;i<=high;i++)
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

                a[low]=a[p1-1];
                a[p1-1]=pivot;

        return p1-1;
    }

    public void sort(int arr[],int l,int h) {


        if(l<h) {
        int p=partition(arr,l,h);

        sort(arr,l,p);
        sort(arr,p+1,h);
        }
    }


public static void main(String args[]) {



    int arr[]= {8,1,4,7,3,2,7,5};

    new Quicksort().sort(arr,0,arr.length-1);


    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }

}
}