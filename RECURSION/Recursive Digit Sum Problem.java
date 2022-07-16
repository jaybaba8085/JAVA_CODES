import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc =new Scanner(System.in);
      String n = sc.next();
      int k = sc.nextInt();
      String str="";
      for(int i=0;i<k;i++)
        {
          str += n;
        }
      superDigit(str);
         
	}
  public static void superDigit(String str)
  {
    if(str.length()==1)
    {
      System.out.println(str);
      return;
      }
    int sum=0;
    for(int i=0;i<str.length();i++)
      {
       sum += str.charAt(i) - '0'; // '0' in ASSIC char value is 48. a=97, A=65
        }
    str = Integer.toString(sum);
    superDigit(str);
    
  }
}
