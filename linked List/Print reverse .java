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
    void reverse()
    {
      Node prev =null;
      Node next = null;
      Node curr = head;
      while(curr != null)
        {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
        }
      head= prev; //prev will be head;
    }
    void printLL()
    {
      Node current = head;
      while(current != null)
        { 
         System.out.print(current.data + " ");
          current = current.next;
        }
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
      list.reverse();
      list.printLL();
      
	}
}
