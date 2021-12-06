import java.util.Scanner;

public class Example3 {


		public static void main(String args[]) {
			
			Scanner sc=new Scanner(System.in);
			int size=1;
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			n=n+1;
			int arr[]=new int[n];
			System.out.println("enter "+(n-1)+" elements");
			
			for(int i=0;i<n-1;i++) {
				arr[i]=sc.nextInt();	
			}

	        int key =  3;
	        int index = 3;
	        int j=1;
			for(int i=0;i<n;i++) {
				
				if(i==index) {
					
				while(i+1>n){
					
					arr[n-j]=arr[n-j-1];
					i++;
					j++;
				}
				
			}
			}
			arr[index]=key;
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
	}
}