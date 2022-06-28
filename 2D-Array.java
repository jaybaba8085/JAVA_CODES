import java.util.*;
import java.lang.*;
import java.io.*;
//Alternate Manner Matrix Traversal, alternate rows get reversed.

public class Main
{
	public static void main(String[] args) throws java.lang.Exception
	{
		//your code here
      int i;
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int [][]arr = new int[m][n];
      int j;
      for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
            {
              arr[i][j] = sc.nextInt();
             
            }
            
        }
        
         for(int []x:arr)
         {
            for(int y:x)
            {
            System.out.print(y +" ");
            }
            System.out.println();
        }
        
      boolean flag = true;
      for(i=0;i<n;i++)
      {
        if(flag)
       {
          for(j=0;j<n;j++)
          {
            System.out.print(arr[i][j]+" ");
          }
          System.out.println();
        }
        else
          {
            for(j=n-1;j>=0;j--)
            {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
          }
             flag =!flag;
        }
        
            
	}
}
