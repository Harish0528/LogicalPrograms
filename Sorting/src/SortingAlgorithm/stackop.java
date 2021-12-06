package SortingAlgorithm;

import java.util.Scanner;

class stackop{
	
    static Scanner sn=new Scanner(System.in);
    static int stk[],top=-1,size,elnt;

    static{
        stackop.create();
    }
        static void create(){
        System.out.println("Enter Size of Stack:");
        size=sn.nextInt();
        
        stk=new int[size];
    
    }
    
    static void push(int elnt){
        if(stackop.isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            stk[++top]=elnt;
        }
    }
    
    static boolean isFull(){
        if(top== size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    static int pop()
    {
        if(stackop.isEmpty()){
            return 0;
        }
        else
            return stk[top--];
    }
    
    static boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    static int peek(){
        if(stackop.isEmpty())
            return 1;
        else
            return stk[top];
        
    }
    
    
    public static void main(String args[]){
        int ch;
        while(true){
            System.out.println("Enter your choice:");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.peek");
            System.out.print("4.Quit:");
            ch=sn.nextInt();

            switch(ch){
                case 1: System.out.println("Enter an Element:");
                    elnt=sn.nextInt();
                    stackop.push(elnt);
                    break;

                case 2: 
                	elnt=stackop.pop();
                    if(elnt==0){
                        System.out.println("Stack is Running Underflow");
                    }
                    else{
                        System.out.println("Popped Element is:"+elnt);
                    }
                    break;
                    
                    case 3:elnt=stackop.peek();
                    if(elnt==1)
                        System.out.println("stack is underflow ");
                    else
                        System.out.println("the peek elements is: "+elnt);
                    break;

                case 4: System.exit(1);
                
                default: System.out.println("Invalid Choice.");
            }
        }
    }
}
