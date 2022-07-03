// METHOD_1
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
        for(int j=i+1;j<n;++j)
        {  
          if((arr[i]+arr[j])%k==0)
          {
            count++;
          }
        }
       }
      System.out.print(count);
	}
  
}
  
  
  
  
 // METHOD 2
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n]; 
      for(int i=0;i<n;i++)
        { 
          arr[i] =sc.nextInt();
        }
      int freq[] = new int[k];
      for(int i=0;i<n;i++)
        {
          freq[arr[i]%k]++;
        }
        int ans = (freq[0]*(freq[0]-1))/2;
      for(int i=1;i<=k/2 && i!=k-1;i++)
        {
         ans += freq[i]*freq[k-i];
        }
      if(k%2==0)
       {
        ans += (freq[k/2]*(freq[k/2]-1))/2;
       }
       System.out.print(ans);      
  	
