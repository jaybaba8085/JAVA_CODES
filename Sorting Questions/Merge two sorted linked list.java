import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new  Scanner(System.in);
      int n = sc.nextInt();
      int a[] =new int[n];
      for(int i=0;i<n;++i)
        {
          a[i]= sc.nextInt();
        }
      int m= sc.nextInt();
      int b[]=new int[m];
      int c[]=new int[n+m];
       for(int i=0;i<m;++i)
        {
          b[i]= sc.nextInt();
          c[i+n]= b[i];
        } 
       for(int i=0;i<n;++i)
        {
          c[i] = a[i];
        }
     for(int i=0;i<n+m;++i){
         int j = i-1;
       while (j>-1 && c[j+1]<c[j])
         {
         int temp = c[j];
         c[j] = c[j+1];
         c[j+1] = temp;
         j--;
     }
       }
      
     for(int i=0;i<n+m;++i)
        {
          System.out.print(c[i] + " ");
        }      
      }
}
