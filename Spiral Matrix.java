// Spirally traversing a matrix
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();// rows=3
		int c=sc.nextInt();// columns=4
		
		int[][] mat=new int[r][c];
		for(int i=0; i<r; i++)
		    {
		        for(int j=0; j<c; j++)
		            {
		                mat[i][j]=sc.nextInt();
		            }
		    }
    //         1 2 3 4
    //         5 6 7 8
    //         9 10 11 12
		  
		    int top=0;     // top =0
    		int bottom=r-1;// bottom = 2
    		int left=0;    // left = 0
    		int right=c-1;//  right = 3
		 while (top<=bottom && left<=right)
		    {
		        
		                for(int column=left; column<=right; column++)
		                    {
		                        System.out.print(mat[top][column]+" "); 
		                    }
		                    top++;
		        
		                for(int row=top; row<=bottom; row++)
		                    {
		                        System.out.print(mat[row][right]+" ");
		                    }
		                    right--;
		                    
		                    if(top > bottom || left > right) break;
		                    
		                  //  System.out.println("Top : "+top +" "+"Bottom : " + bottom);
		       
		                for(int column=right; column>=left; column--)
		                    {
		                        System.out.print(mat[bottom][column]+" ");
		                    }
		                    bottom--;
		         
		                for(int row=bottom; row>=top; row--)
		                    {
		                        System.out.print(mat[row][left]+" ");
		                    }
		                    left++; 
		           
		    }
	}
}
