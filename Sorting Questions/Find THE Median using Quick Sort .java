import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static int quickSort(int[] a, int p, int r,int index)
    {
        if(p==r)
            return a[p];
        if(p<r)
        {
            int q=partition(a,p,r);
            if(q==index)
                return a[q];
            else if(q>index)
                return quickSort(a,p,q-1,index);
            else
                return quickSort(a,q+1,r,index);
        }
        
        return 0;
    }

    private static int partition(int[] a, int p, int r) {

        int x = a[r];
        int i = p-1 ;
        int j = p ;
        
        for(;j<r;++j)
        {
              if(a[j]<=x)  
              {
                  ++i;
                  int temp = a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
        }
        
        a[r]=a[i+1];
        a[i+1]=x;
        
        return i+1;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;++i)
            arr[i]=sc.nextInt();
        
        System.out.println(quickSort(arr, 0, N-1,N/2));
    }
}
