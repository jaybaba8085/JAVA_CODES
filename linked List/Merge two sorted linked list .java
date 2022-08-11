import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    static class Node{
      int data;
      Node next;

      Node(int data, Node next)
      {
        this.data=data;
        this.next=next;
      }
    }

  static Node addNode(Node tail, int data)
  {
    Node newNode = new Node(data, null);
    tail.next=newNode;
    return newNode;
  }

  static void printList(Node head)
  {
    Node current=head;
    while(current!=null)
      {
        System.out.print(current.data+" ");
        current=current.next;
      }
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc=new Scanner(System.in);

      int m=sc.nextInt();

      Node l1=new Node(-1,null);
      Node l2=new Node(-1,null);

      Node tail1=l1;
      Node tail2=l2;

      for(int i=1;i<=m;i++)
        {
          int input=sc.nextInt();
          tail1=addNode(tail1, input);
        }

      int n=sc.nextInt();

      for(int i=1;i<=n;i++)
        {
          int input=sc.nextInt();
          tail2=addNode(tail2,input);
        }

      // printList(l1.next);
      // System.out.println();
      // printList(l2.next);

      Node ans=new Node(-1,null);
      Node tans=ans;

      Node pointer1=l1.next;
      Node pointer2=l2.next;

      while(pointer1!=null && pointer2!=null)
        {
          if(pointer1.data<pointer2.data)
          {
            ans.next=pointer1;
            pointer1=pointer1.next;
            ans=ans.next;
          }
          else
          {
            ans.next=pointer2;
            pointer2=pointer2.next;
            ans=ans.next;
          }
        }

      while(pointer1!=null)
        {
          ans.next=pointer1;
          pointer1=pointer1.next;
          ans=ans.next;
        }

      while(pointer2!=null)
        {
          ans.next=pointer2;
          pointer2=pointer2.next;
          ans=ans.next;
        }

      tans=tans.next;

      printList(tans);
      
	}
}



//methode 2


// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class Main
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		//your code here
//       Scanner sc = new  Scanner(System.in);
//       int n = sc.nextInt();
//       int a[] =new int[n];
//       for(int i=0;i<n;++i)
//         {
//           a[i]= sc.nextInt();
//         }
//       int m= sc.nextInt();
//       int b[]=new int[m];
//       int c[]=new int[n+m];
//        for(int i=0;i<m;++i)
//         {
//           b[i]= sc.nextInt();
//           c[i+n]= b[i];
//         } 
//        for(int i=0;i<n;++i)
//         {
//           c[i] = a[i];
//         }
//      for(int i=0;i<n+m;++i){
//          int j = i-1;
//        while (j>-1 && c[j+1]<c[j])
//          {
//          int temp = c[j];
//          c[j] = c[j+1];
//          c[j+1] = temp;
//          j--;
//      }
//        }
      
//      for(int i=0;i<n+m;++i)
//         {
//           System.out.print(c[i] + " ");
//         }      
//       }
// }
