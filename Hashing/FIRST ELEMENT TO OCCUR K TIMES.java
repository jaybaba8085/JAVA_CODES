import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
        public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
           int k= sc.nextInt();
          int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
		int sol = findWord(arr,k);
		System.out.print(sol);
	}
	static int findWord(int [] arr,int k)
	{    
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        int n =arr.length;
        for (int i = 0; i < n; i++) 
        {
            int a = 0;
            if(hs.get(arr[i])   !=  null)
            {
                a = hs.get(arr[i]);
            }        
           hs.put(arr[i], a+1);
          
            if (hs.get(arr[i]) == k) 
            {
                return arr[i];
            }
        }
        return -1;
    }
}
