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
      int k = sc.nextInt();
      int []arr = new int[n];
      for(int i=0;i<n;++i){
      arr[i] = sc.nextInt();
      }
      int count = 0;  
      for(int i=0;i<n;++i){
       int sum = 0;
        for(int j=i;j<n;++j){ 
          //int sum = 0;
          for(int m=i;m<n;++m)        
          {
            sum += arr[m];
          }   
             if(sum%k==0)
             {
                count++;
             }        
        }
       }
      System.out.print(count);
	}
  
}
