import java.util.*;
public class Main
{  
    public static void main(String args[])
    { 
        int n = 5; 
        int i;
        for (i=1; i<=n; i++) 
        {   
               
              for (int j=0; j<=(n-i); j++ )
            { 
                System.out.print(" ");
            } 
              for (int k=1; k<=i; k++) 
            {   
                 System.out.print("* ");
            }
            System.out.println("");
            
            }
    } 
}
