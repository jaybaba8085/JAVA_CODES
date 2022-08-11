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
}

public class Main{
  
	public static void main (String[] args) throws java.lang.Exception	{
		//your code here
      Scanner sc =new Scanner(System.in);
      int m= sc.nextInt();
       int n= sc.nextInt();
      LinkedList list1 = new LinkedList();          
       for(int i=0;i<m;i++)    {
        int   z= sc.nextInt();
          list1.addNode(z);
        }     
        LinkedList list2 = new LinkedList();         
       for(int i=0;i<n;i++)    {
        int   p= sc.nextInt();
          list2.addNode(p);
        } 
      
       Node curr1 = list1.head;
       Node curr2 = list2.head;     
      if(m !=n){ System.out.print(0);}
     else{
     boolean flag = true;
     for (int i=0;i<n;i++)
       {
           if (curr1.data != curr2.data)
           {  
             flag =false;
             break;
           }
         curr1= curr1.next;
         curr2 = curr2.next;
       }
     if(flag ==false) { System.out.print(0); }
     else{ System.out.print(1);}
   }
      
    }
}
