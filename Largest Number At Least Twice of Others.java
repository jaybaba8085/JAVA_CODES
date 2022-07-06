import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{		//your code here
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int temp[] = new int[n]; 
      
       for(int i=0;i<n;i++)
         { arr[i] = sc.nextInt();  }
         
       for(int i=0;i<n;i++) 
          { temp[i] =arr[i]; }    
          
         Arrays.sort(arr);
         
       if(arr[n-1]>=2*arr[n-2])
       {  
            for(int i=0;i<n;i++) 
            {        
               if(temp[i]==arr[n-1])
               {
                   System.out.print(i); 
                   break;
          }}}
       else
       { System.out.print(-1); }                
 }
}
