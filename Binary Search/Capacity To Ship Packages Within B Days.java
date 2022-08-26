import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
       public  static long shipWithinDays(int[] weights, int days)
  {      
             int n=weights.length;
            long min = -1;
           long max = 0;
           long res = -1;
             for(int i=0;i<n;i++)
                {
                    min = Math.max(min,weights[i]);
                    max+=weights[i];
            }
            while(min<=max)
            {
                    long mid = min + (max-min)/2;
                    if(isFeasible(weights,days,mid))
                    {
                            res = mid;
                            max = mid-1;
                    }
                    else
                    {
                            min = mid+1;
                    }
            }
        return res;
    }
    public static boolean isFeasible(int a[],int k, long res)
  {        
               int Day = 1;
              long sum = 0;
            for(int i=0; i<a.length; i++)
            {      
                     sum += a[i];
                    if(sum>res)
                    {
                           Day++;
                            sum = a[i];
                    }
            }
            return Day<=k;
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		 //your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]= new int [n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int b=sc.nextInt(); 
      System.out.print(shipWithinDays(arr,b));
      System.out.println();
	}
}
