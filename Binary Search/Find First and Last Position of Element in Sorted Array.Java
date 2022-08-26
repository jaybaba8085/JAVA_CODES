// Methode 1 TC O(n)
//import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class Main
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		//your code here
//        Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//       int target = sc.nextInt();
//       int []arr =new int[n];
//        for(int i=0;i<n;i++)
//          {
//            arr[i] = sc.nextInt();
//          }
         
//         findFirstAndLast(arr, target);
//     }
//     public static void findFirstAndLast(int arr[], int target)
//     {
//         int n = arr.length;
//         int first = -1; 
//         int last = -1;
//         for (int i = 0; i < n; i++) 
//         {
//             if (target != arr[i])     {     continue;      }
          
//             if (first == -1)   first = i;
              
//             else    last = i;
//         }
      
//         if (first != -1)     System.out.print(first +" "+last+" "); 
          
//           else                 System.out.println(("-1" + " " + "-1"));
// 	}
// }

// Methode 2 TC O(log n)
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      int k=sc.nextInt();

      int[] a=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }

      // 1st occurence

      int l=0;
      int r=n-1;
      int idx1=-1;

      while(l<=r){
        int mid=l+(r-l)/2;

        if(a[mid]==k){
          idx1=mid;
          r=mid-1;
        }

        else if(a[mid]>k){
          r=mid-1;
        }
        else{
          l=mid+1;
        }
      }

      if(idx1==-1){
        System.out.println("-1 -1");
        return;
      }

      // Last occurence

      l=0;
      r=n-1;
      int idx2=-1;

      while(l<=r){
        int mid=l+(r-l)/2;
        // int mid=(l+r)/2;
        
        if(a[mid]==k){
          idx2=mid;
          l=mid+1;
        }
        else if(a[mid]>k){
          r=mid-1;
        }
        else{
          l=mid+1;
        }
      }

      System.out.println(idx1+" "+idx2);




      
    }
}
