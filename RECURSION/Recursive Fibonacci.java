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
      System.out.print(fib(n));
	}
     public static int fib(int n)
  {    
        if(n==1)
        {
         return 0; 
        }
        if(n==2)
        {
          return 1;
        }
        if(n>2)
        {
          return fib(n-1) + fib(n-2);
        }
       return fib(n);
  }
}
