import java.util.*;
public class Main 
{ 
    public static void main(String args[]) 
    { 
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number :");
     
     int n = sc.nextInt();
     int count = 0;
     int i =1;
     
     while(i<=n)
       {
         if(n%i==0)
         count = count + 1;
         i = i+1;
       }
     
     if(count==2)
     System.out.println("Prime");
     else
     System.out.println("Not Prime");
     
    }
}
