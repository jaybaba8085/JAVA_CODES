import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
 
  void add(int x)
  {
    Node new_node = new Node(x);
    if(head==null)
    {
      head = new_node;
      head.next =head;
      return;
    }
    Node curr = head;
    while(curr.next != head)
      {
     curr = curr.next;
       }
    curr.next= new_node;
    new_node.next=head;
  }
   void print()
  {
     
    Node curr = head;
    System.out.print(curr.data +" ");
    curr = curr.next;
    while(curr!=head)
      {
        System.out.print(curr.data+ " ");
        curr = curr.next;
      }
     System.out.println();
  }
}
public class Main
{    
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         LinkedList ll =new LinkedList();
         for(int i=0; i<n; i++)
        {
          ll.add(input.nextInt());
        }
       int m = input.nextInt();
       ll.add(m);
       ll.print();
	}
}
