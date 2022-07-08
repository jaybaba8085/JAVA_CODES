import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {   
      Scanner Scanner = new Scanner(System.in);
   //   int n = Scanner.nextInt();
      String s[]= Scanner.nextLine().split(" ");
      int n = s.length;
      int arr[] =new int[s.length];
      for(int i =0 ;i <s.length;i++)
      {   
        arr[i] = Integer.parseInt(s[i]);
      }
      
     int sum=0;    
      Arrays.sort(arr);

      if(arr[n-1]>0){
      for(int i=0;i<n;++i){
        if(arr[i]>0)
        {
          sum += arr[i];
        }
        }
      System.out.print(sum);
        }
      if(arr[n-1]<=0)
        {
          System.out.print(arr[n-1]);
        }
      
	}
}
