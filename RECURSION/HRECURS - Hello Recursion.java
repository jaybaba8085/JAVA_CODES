import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
      for(int i=1;i<=t;i++)
         {    
       int n = sc.nextInt();
       int a[] = new int[n];
       for( int j=0;j<n;j++) {
          a[j]=sc.nextInt();
        }     
        System.out.println( "Case " + i + ": " + sumOfNumber(a,n));
     
           }
           
	}
    public static int sumOfNumber(int [] a,int n)
  {
       if (n <= 0){
            return 0;
         }
    else{
        return (sumOfNumber(a,n-1) + a[n-1]);
      }
  }
   
  
}
