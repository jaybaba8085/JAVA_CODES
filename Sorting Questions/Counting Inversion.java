import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{  
  public static int ans;
  public static void merge(int arr[],int s,int e)
  {
    int mid = (s+e)/2;
    int i=s;
    int j= mid+1;
    int len = mid+1;
    int brr[]=new int[e+1];
    int k=s;
    while(i<=mid && j<=e)
      {
        if(arr[i]<=arr[j])
        {
          brr[k++]= arr[i++];
        }
        else
        {
          brr[k++]= arr[j++];
          ans+=len-i;
        }
      }
    while(i<=mid)
      {
        brr[k++]=arr[i++];
      }
     while(j<=e)
      {
        brr[k++]=arr[j++];
      }
    for(i=s;i<=e;++i)
      {
        arr[i]=brr[i];
      }
  }
    public static void mergeSort(int arr[],int s,int e)
  {
    if(s>=e)
    {
      return;
      }
    int mid = (s+e)/2;
    mergeSort(arr,s,mid);
    mergeSort(arr,mid+1,e);
    merge(arr,s,e);
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
       Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
        { 
          ans =0;
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
            }
          mergeSort(arr,0,n-1);
          System.out.println(ans);
          }
      
	}
}
