import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr [] = new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.print(array11(arr,0));
      }
  public static int array11(int arr [],int start)
  { 
    
    if(start>arr.length-1)
    {
      return 0;
    }
    while(arr[start]==11)
    {
        return 1 + array11(arr,start+1);
    }
    return array11(arr, start + 1);
  }      

}
