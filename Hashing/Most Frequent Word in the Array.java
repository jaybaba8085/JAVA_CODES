import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
        public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.next();
        }
		String sol = findWord(arr);
		System.out.print(sol);
	}
	static String findWord(String[] arr)
	{
		HashMap<String, Integer> hs = new HashMap<String, Integer>();

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
      
		String key = "";
		int value = 0;

		for (Map.Entry<String, Integer> me : hs.entrySet()) 
        {		
			if (me.getValue() > value) 
            {
				value = me.getValue();
				key = me.getKey();
			}
		}
      if(value==1)
      {
          return arr[arr.length-1];
      }
		return key;
	}
}
