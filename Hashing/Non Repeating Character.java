import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
        public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);
          String s=sc.next();         
          HashMap<Character, Integer> hs = new HashMap<>();
          
        for (int i = 0; i < s.length(); i++) 
        {
            int a = 0;
            if(hs.get(s.charAt(i))  !=null)
            {
                a = hs.get(s.charAt(i));
            }
             
           hs.put(s.charAt(i), a+1);
        }
          
        for (int i = 0; i < s.length(); i++)
        {
            if (hs.get(s.charAt(i)) ==1)
            {
                System.out.print( s.charAt(i));
                return;
            }
        }
  //         for (Map.Entry<Character, Integer> me : hs.entrySet()) 
  //       {		
		// 	if (me.getValue() == 1) 
  //           {
		// 	System.out.print(me.getKey());
  //           return;
		// 	}
		// }
       System.out.print( -1);
    }
}
