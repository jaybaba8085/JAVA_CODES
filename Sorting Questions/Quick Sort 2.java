import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      qs(arr,0,arr.length-1);
    }

  public static void print(int arr[],int l,int r) //  l=start =0; r== end ==n-1
  {
    for(int i=l;i<=r;i++)
      {
        System.out.print(arr[i]+" ");
      }
    System.out.println();
  }
  public static void qs(int arr[],int l,int r)
  { 
    if(l>=r)return;
    if(l<r)
    {
    int pIndex = partition(arr,l,r);
      qs(arr ,l,pIndex-1);      
      qs(arr,pIndex+1,r);
      print(arr,l,r);
    }
  }
  public static int partition(int [] arr,int l,int r)
  {
    int p = arr[l]; //p=pivot element
    int freq =1;
    int res[]=new int[r+1];
    int j=l;
    int index =0;
    
    
       for(int i=l+1;i<=r;i++)
         {
           if(arr[i]<p) res[j++]=arr[i];
           else if(arr[i]==p) freq++;
           }
         while(freq-->0)res[j++]=p;
            index=j-1;
            for(int i=l+1;i<=r;i++)
              {
                if(arr[i]>p)res[j++]=arr[i];
                } 
          for(int i=l;i<=r;i++)
            {
             // System.out.print(res[i]+" ");
              arr[i] = res[i];
            }
  //  System.out.println();
    return index;

    }
}
