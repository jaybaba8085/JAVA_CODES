import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
  //   int x = countAbc(str);
  //   System.out.println(x);   
       System.out.println(countAbc(str));
	} 
  public static int countAbc(String str) 
  {
     if (str.length() < 3) 
      {
       return 0;
      }
    if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
      {
        return 1 + countAbc(str.substring(1));
      }
    else
      {
        return countAbc(str.substring(1));
      }
   }
}
