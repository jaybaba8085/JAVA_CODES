import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
  int data;
  Node next;
  Node(int data)
  {
     this.data=data;
    this.next=null;
       }
}
class LinkedList
  {
    Node head;
    void addNode(int data)   // insert At Tail rule
    {
      Node newNode = new Node(data);
      if(head == null)
      {   head = newNode; return;    }
      Node current = head;
      while(current.next !=null)
        {
          current = current.next;
        }
      current.next = newNode;
    }
  }

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc =new Scanner(System.in);
      int n= sc.nextInt();
      LinkedList list = new LinkedList();
      for(int i=0;i<n;i++)
        {
          int x = sc.nextInt();
          list.addNode(x);
        }
   
      int k= sc.nextInt();

      if(k ==0)
      {
        list.head= list.head.next;
      }
      else
      {
        Node curr =list.head;
        for(int i=1;i<k;i++)
          {
             curr = curr.next;
           }
        curr.next= curr.next.next;
      }
      Node h=list.head;
      while( h != null)
        {
          System.out.print(h.data +" ");
            h = h.next;
        }
  
  }      
}
