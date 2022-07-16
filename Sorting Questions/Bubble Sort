import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int a[] = new int[n];
      
      for(int i=0;i<n;i++)
      {
        a[i] =sc.nextInt();
      }
     bubbleSort(a);
      } 
  public static void bubbleSort(int arr[])
  {
      int n = arr.length;
      int count =0;
      int x =0;
      for(int i=0;i<n-1;i++)
      {
        boolean flag = true; /// remove flag part then it will also run.
        for(int j=0;j<n-1-i;j++)
        {
          if(arr[j]>arr[j+1]){
            flag = false;
            int temp = arr[j+1];
            arr[j+1] =arr[j];
            arr[j] =temp;
            count++;
            x =1;
          }
        }
        if(flag==true)
        {
          break;
        }
      }
      if(x==0)
      {
         System.out.println("Array is sorted in " + 0 +" swaps.");
      }
     else
      {
        System.out.println("Array is sorted in " + count +" swaps.");
      }
      System.out.println("First Element: "+arr[0]);
      System.out.println("Last Element: "+arr[n-1]);
 
    }
}
