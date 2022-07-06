import java.util.*;
import java.lang.*;
import java.io.*;

public class Main 
{ 
    public static void main(String args[]) 
    { 
     Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long x=0,y=1,z=0;
      for(int i=0;i<N;i++)
      {
          x=y;
          y=z;
          z=x+y;
      }
      long k =0;
      for(int i=0;i<=1;i++)
      {
         k = k*10 + z%10;
        z = z/10;
       }
      System.out.println(k);
      
	}
}
