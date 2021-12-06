package com.biltabs.harish;

import java.util.Scanner;

public class Queue {
	
	int f=0,r=-1,c=-1;
    static int size;
    static Scanner s = new Scanner(System.in);
    int Que[] = new int[size];

    static {
    	System.out.println("Enter size:");
        int size=s.nextInt();
        Queue q = new Queue();
        q.size=size;
    }

	
	void add(int val) {
		
//		System.out.println(Que.length);
		if(r==Que.length-1) {
			System.out.println("\nQueue is Full");
		}
		else {
			Que[++r]=val;
			c++;
			System.out.println("\nElements in Queue :");
			print();
		}
	}
	
	void remove() {
		
		if(c==-1) {
			System.out.println("\nQueue is Empty");
		}
		else {
			c--;
			System.out.println("\nremoved element in "+Que[0]);
			for(int i=0;i<r;i++) {
				Que[i]=Que[i+1];
			}
			r--;
			print();
		}
	}
	
	void print() {
		for(int i=0;i<=r;i++) {
			if(Que[i]!=0)
			System.out.print(Que[i]+" ");
		}
	}

	public static void main(String args[]) {
		
		Queue q=new Queue();
		 int ch;
	        while(true){
	            System.out.println("\nEnter your choice:");
	            System.out.println("1.insert");
	            System.out.println("2.remove");
	            System.out.print("3.Quit:");
	            ch=s.nextInt();

	            switch(ch){
	                case 1: System.out.println("Enter an Element:");
	                    int elnt=s.nextInt();
	                    q.add(elnt);
	                    break;

	                case 2: 
	                	q.remove();
	                    break;
	                   
	                case 3: System.exit(1);
	                
	                default: System.out.println("Invalid Choice.");
	            }
	        }
	}
}