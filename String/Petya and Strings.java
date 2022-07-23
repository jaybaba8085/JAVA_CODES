import java.util.*;
import java.io.*;
public class Main 
{
    public static void main(String[] args)
  {     
        Scanner sc = new Scanner(System.in);
        String first1 = sc.next();
        String second1 = sc.next();
       
        String first = first1.toLowerCase();
        String second = second1.toLowerCase();
      
        if(first.compareTo(second) ==0){
            System.out.println("0");
        }
        if(first.compareTo(second) > 0){
            System.out.println("1");
        }
        if(first.compareTo(second) < 0){
            System.out.println("-1");           
        }
    }
}
