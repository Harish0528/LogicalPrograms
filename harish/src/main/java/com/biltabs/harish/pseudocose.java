package com.biltabs.harish;

import java.util.Scanner;

public class pseudocose {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int ps,is,es;
		double total,perps=0,peris=0,peres=0;
		
		System.out.println("Enter project score");
		ps=sc.nextInt();
		System.out.println("Enter External score");
		es=sc.nextInt();
		System.out.println("Enter Internal score");
		is=sc.nextInt();
		
		if(ps>=70) {
			perps=((70*ps)/100);
		}
		if(es>=70) {
			peres=((20*ps)/100);
		}
		if(is>=70) {
			peris=((10*ps)/100);
		}

		total=perps+peres+peris;
		
		if(ps<70) {
			System.out.println("Your failed in Project		Score is: "+ps+"/100");
		}
		if(es<70) {
			System.out.println("Your failed in External		Score is: "+es+"/100");
		}
		if(is<70) {
			System.out.println("Your failed in Internal		Score is: "+is+"/100");
		}
		
		if(ps>=70&&is>=70&&es>=70) {
			
			if(total>=90) {
				System.out.println("Your grade is A");
			}
			else if(total>=80) {
				System.out.println("Your grade is B");
			}
			else if(total>=70) {
				System.out.println("Your grade is C");
			}
			else if(total<70) {
				System.out.println("Your grade is F(failed)");
			}
		}
	}

}
