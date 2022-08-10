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
// creat Linked List And add data 
 class LinkedList{
    Node head;

    void addNode(int data)
    {
     Node newNode = new Node(data);
      if(head == null)
      {    head = newNode;
           return;
      }
      Node current = head;
      while(current.next !=null)
        {
          current = current.next;
        }
      current.next = newNode;
    }
  }

  //slow Faster Methode to find Middle;
public class Main
{
  public static Node find_middle(Node start){
       Node slow = start;
       Node fast=start.next;
       while(slow !=null &&  fast != null)
         {
           fast=fast.next;
           if(fast==null) {    break;    }

           fast = fast.next;
           slow=slow.next;
         }
    return slow;
     }

	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      LinkedList list = new LinkedList();

      for(int i=0;i<n;i++)
        {
          int x=sc.nextInt();
          list.addNode(x);
        }

      Node mid=find_middle(list.head);
      if(n%2==0)
      {  mid = mid.next;  }

      if(mid == list.head){
         if(mid.next==null){
           System.out.println("-1");
          }
        else{
           System.out.print(mid.next.data + " ");
        }
        return;
      }
      
      Node curr = list.head;
      while(curr.next != mid)
        {
          curr = curr.next;
        }
      curr.next = curr.next.next;


      Node h=list.head;
      while(h!=null)
        {
            System.out.print(h.data +" ");
            h= h.next;
        }
      
	}
}
