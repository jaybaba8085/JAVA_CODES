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
      System.out.print(pairStar(str));
	} 
public static String pairStar(String str) {
    if(str.length() <= 1)
    { return str;}         
    if(str.charAt(0) == str.charAt(1))
    {
        return str.charAt(0) + "*" + pairStar(str.substring(1));
    }
  else
    {              
    return str.charAt(0) + pairStar(str.substring(1));
    }
  }
}
