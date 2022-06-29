import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int ans =1;
          for(int i=1;i<=b;i++)
            { 
              ans = ans*a;
            }  
          System.out.print(ans);
        
      
	}
}
