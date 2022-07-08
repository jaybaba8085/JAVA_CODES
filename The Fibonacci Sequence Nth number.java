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
      int x=0;
      int y=1;
      int z=0;
      int arr[] = new int[n+2];
      for(int i=0;i<n;i++)
        {   z=x+y;
            arr[i+2] =z;
            x=y;
            y=z ;     
          }
      System.out.print(arr[n]);
	}
}
