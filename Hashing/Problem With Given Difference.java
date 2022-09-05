import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int arr[] =new int[n];
      int ans=0;
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int d =sc.nextInt();
      Arrays.sort(arr);
      HashMap<Integer,Integer> hs=new HashMap<>();
      for(int i=n-1;i>=0;i--)
        {
          if( ! hs.containsKey(d+arr[i]))
          {
            hs.put(arr[i],i);
          }
          else
          {
           ans =1;
           break;
          }
        }
      System.out.print(ans);
	}
}
