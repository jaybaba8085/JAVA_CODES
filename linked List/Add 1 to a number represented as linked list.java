import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
  int data;
  Node next;
  Node(int x)
  {
     data=x;
     next=null;
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

    
    void printLL()  {
      Node current =head;
    while(current !=null){
      System.out.print(current.data +" ");
      current=current.next;
    }
      }
  

     void addOneToLL()  {
        Node  prev = null;
        int carry = 1, sum;
         Node curr = head;
  
        while (curr != null){
            sum = curr.data + carry;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            curr.data = sum;
            prev = curr;
            curr = curr.next;
        }
        if (carry > 0)
            prev.next = new Node(carry);
    }

void reverse()  {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
      head = prev;
    }
  }


public class Main{
  
	public static void main (String[] args) throws java.lang.Exception	{
		//your code here
      Scanner sc =new Scanner(System.in);
      int n= sc.nextInt();
      LinkedList list = new LinkedList();

                                   // for(int i=0;i<n;i++) Don't use that it will return  failed test cases;
     while(n>0)    {
        int   z= n%10;
          list.addNode(z);
          n =n/10;
        }     

      
      list.addOneToLL();
        list.reverse();
      list.printLL();
    }
}

