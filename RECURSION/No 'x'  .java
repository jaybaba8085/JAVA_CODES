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
      System.out.println(noX(str,0));
    }
  public static String noX(String str , int start){
   
    if(start==str.length())
    {
      return "";
    }
    if(str.charAt(start)!='x'){

      return str.charAt(start) + noX(str,start+1);

    }
    return noX(str,start+1);
  }
}
         //Method 2


//import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class Main
// {
//     public static void main (String[] args) throws java.lang.Exception
//     {
//         //your code here
//       Scanner sc = new Scanner(System.in);
//       String str = sc.next();    
//       System.out.println(noX(str));
//     }
//   public static String noX(String str){
   
//     if(str.length()<=0)
//     {
//       return "";
//     }
//     if(str.charAt(0)!='x'){

//       return str.charAt(0) + noX(str.substring(1));

//     }
//     return noX(str.substring(1));
//   }
// }
