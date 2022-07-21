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
       int p = arr[0]; // p = pivot
       int freq =1;
       int res[]=new int[n];
       int j=0;
      for(int i=1;i<n;++i)
        {
          if(arr[i]<p)
          {
            res[j++]=arr[i];
          }
          else if(arr[i]==p)
          {
            freq++;
          }
          }
          while(freq-->0)
            {
              res[j++]=p;
            }
          for(int i=1;i<n;i++)
            {
               if(arr[i]>p)
               {
                 res[j++]=arr[i];
                }            
              }
           for(int i=0;i<n;i++)
             {
               System.out.print(res[i]+" ");
             }  
  }      
}
