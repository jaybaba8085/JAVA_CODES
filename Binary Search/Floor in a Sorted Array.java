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

      int l=0;
      int r=n-1;
      int idx=-1;

      while(l<=r){
        int mid=l+(r-l)/2;

        if(a[mid]==k){
          System.out.println(mid);
          return;
        }
        
        if(a[mid]<k){
          idx=mid;
          l=mid+1;
        }

        else{
          r=mid-1;
       }       
      }

      System.out.println(idx);

    }
}
