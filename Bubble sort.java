import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[]a=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int count=0;
      int x=0;
      for(int i=0;i<n-1;i++)
      {            
        for(int j=0;j<n-1-i;j++)
        {
          if(a[j]>a[j+1])
          {
             count++;
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
               x=1;
          }
        }
      }
      if(x==0)
      {
      System.out.println("Array is sorted in 0 swaps.");
      }
      else
      {
      System.out.println("Array is sorted in "+count+ " swaps.");
      }
       System.out.println("First Element: "+a[0]);
       System.out.println("Last Element: "+a[n-1]);
      }
}
