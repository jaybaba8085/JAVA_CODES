import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long mat[][]= new long[n][n];
      for(int i=0;i<n;i++)  {
          for(int j=0;j<n;j++)   {
              mat[i][j] = sc.nextInt();
         }    }
      long p1=0,p2=0,p3=0,p4=0;
      long c1=0,c2=0,c3=0,c4=0;


      
        for(int i=n-1;i>=0;i--)  {
          for(int j=n-1;j>=0;j--){
              if(mat[0][0] == mat[i][j] )
              { 
                 p1++;
                 break;
                }
            }  }
        if(p1>=(n-1))
        {
        c1=1;
        }
       if( mat[0][1]!= mat[0][0] && mat[0][1]!= mat[0][2] && mat[0][1]!= mat[0][3]){
       for(int i=n-1;i>=0;i--)  {
          for(int j=n-1;j>=1;j--){
              if(mat[0][1] == mat[i][j] )
              {
               p2++;
               break;
                }
            }
         }}
        if(p2>=(n-1))
         {
         c2=1; 
          }
       if( mat[0][2]!= mat[0][0] && mat[0][2]!= mat[0][1] && mat[0][2]!= mat[0][3]){ 
       for(int i=n-1;i>=0;i--)  {
          for(int j=n-1;j>=0;j--){
               
              if(mat[0][2] == mat[i][j])
              { 
               p3++;
               break;
                }
            }  }
         }
        if(p3>=(n-1))
        {
        c3=1; 
        }
      if( mat[0][3]!= mat[0][0] && mat[0][3]!= mat[0][1] && mat[0][3]!= mat[0][2]){
       for(int i=n-1;i>=0;i--)  {
          for(int j=n-1;j>=0;j--){
              if(mat[0][3] == mat[i][j])
              {
                p4++;
                break;
              }
         }
              }
        }
        if(p4>=(n-1))
        {
        c4=1 ;
        }
  
        System.out.print(c1 + c2 + c3 + c4);

      
         
      
	}
}
