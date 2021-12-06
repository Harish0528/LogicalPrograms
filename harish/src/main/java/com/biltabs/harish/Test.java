package com.biltabs.harish;

class Test
{
    public static void main (String[] args) 
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        int a=1;
        
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]==arr2[i]) {
        		a=2;
        	}
        	else {
        		break;
        	}
        }
        if(a==2) {
        	System.out.println("same");
        }
        else {
        	System.out.println("not same");
        }
    }
}