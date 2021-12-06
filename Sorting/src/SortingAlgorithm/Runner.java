package SortingAlgorithm;

class Node {
int data;
Node next;
}

public class Runner{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(40);
        list.insert(66);
        list.insert(75);
        list.show();
    }
}

class LinkedList {
	
    Node head;

public void insert(int data) {

Node node=new Node();
node.data=data;
node.next=null;
if(head==null) {
    head=node;
}
else {
    Node n=head;
    while(n.next!=null) {
        n=n.next;
    }
    n.next=node;
}
}
public void show() {
 Node node=head;
 while(node.next!=null) {
      System.out.println(node.data);
      node=node.next;
 }
 System.out.println(node.data);
}
}