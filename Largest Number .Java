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
        String  [] arr = new String[n];
        for (int i=0;i<n;i++) 
        {   arr[i]=sc.next();    }
        System.out.println(largestNumber(arr));
        sc.close();
    }
    public static String largestNumber(String[] arr) 
  {
        int n = arr.length;
    
        Arrays.sort(arr, (a, b) -> 
        {
            long n1 = Long.parseLong(a + b);
            long n2 = Long.parseLong(b + a);
            if (n1 > n2)
            {
             return 1;
            } 
            else if (n1 < n2)
            {
                return -1;
            } 
            else 
            {
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder("");
        for (int i = n - 1; i >= 0; i--) 
        {
             sb.append(arr[i]);
        }
        if (sb.charAt(0) == '0')
        {
            return "0";
       }
        return sb.toString();
    }
}
