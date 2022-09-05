import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
        public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
		boolean sol = findWord(arr);
		System.out.print(sol);
	}
	static boolean findWord(int [] arr)
	{
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) 
        {
			if (hs.containsKey(arr[i])) 
            {
				hs.put(  arr[i]   ,  hs.get(arr[i]) + 1   );
			}
			else
            {
				hs.put(arr[i], 1);
			}
		}
      
    	int key = 0;
		int value = 0;

		for (Map.Entry<Integer, Integer> me : hs.entrySet()) 
        {		
			if (me.getValue() > value) 
            {
				value = me.getValue();
				key = me.getKey();
			}
		}
      if(value==2)
      {
          return true;
      }
		return false;
	}
}
