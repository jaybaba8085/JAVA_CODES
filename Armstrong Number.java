import java.util.*;
public class Main 
{ 
    public static void main(String args[]) 
    { 
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number :");
      int n = sc.nextInt();
      int z=n,count=0,digit,sum=0,pro;
      
      
      while(z>0)
       {
           count =count + 1;
           z = z/10;
       }
       System.out.println("Number of Digits:" + count);
       
     z=n;
     
     while(z>0)
     {
         digit = z%10;
         pro = 1;

         for(int i=1;i<=count;i++)
         {
             pro = pro*digit;
         }
     sum = sum + pro;
     z =z/10;
     }
     if(sum==n)
        System.out.println("Armstrong Number");
     else
        System.out.println("Not Armstrong Number");
     
     
    }
}
