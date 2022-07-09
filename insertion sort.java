import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
     public static void main(String a[]){    
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      insertionSort(arr);
     }
    public static void insertionSort(int [] array) {     
        int p = array.length;       
        for (int i=1;i<p;i++) 
        {  
              int j = i-1;  
            while (j>-1 && array[j]>array[j+1]) 
              {  
                int temp = array[j];
                array [j] = array [j+1];  
                array[j+1] = temp;
                j--;  
              }   
            System.out.println(Arrays.toString(array));
        }  
    } 
    }


       
   
