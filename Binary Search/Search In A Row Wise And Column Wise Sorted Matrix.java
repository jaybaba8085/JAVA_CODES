import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
       static int rowAns  , colAns;
  
       static void search(int [][]mat,int x)
      {
          int n= mat.length;
          int row= 0,col=n-1;
        
          while(row<n && col>=0)
         {
             if(mat[row][col]==x)  {                                 //found value update ans
                                           rowAns = row;
                                           colAns = col;
                                            }
             if(mat[row][col] > x)  
             {    col--  ;    }            //go left
             else                        
             {    row++ ;   }           //go down
        
         }  
       }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
         {
            rowAns = -1;
            colAns = -1;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [][]mat = new int[n][n];
        
            for(int i=0;i<n;++i){
                   for(int j=0;j<n;++j){
                          mat[i][j] = sc.nextInt();    }   }
           
           search(mat,k);
           System.out.println(rowAns +" "+ colAns);
      }
    }
}
