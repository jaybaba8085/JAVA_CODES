import java.util.*;
public class Main
{  
    //public static int count;
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
        { 
         
          int n=sc.nextInt();
          int arr[]=new int[n];
           int brr[]=new int[n];
          for(int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
            }
          mergesort(arr,0,n-1,brr);
        
              System.out.print(Arrays.toString(arr));
         
          }
	}
	public static void mergesort(int []arr, int l, int r, int []brr)
	{
	    if(l<r)
	    {
	        int mid = (l+r)/2;
	        mergesort(arr,l,mid,brr);
	        mergesort(arr,mid+1,r,brr);
	        merge(arr,l,mid,r,brr);
	    }
	}
	public static void merge(int []arr,int leftstart, int leftend, int rightend, int []brr)
	{   
	    int i=leftstart;
	    int j=leftend+1;
	    int k=leftstart;
	    while(i<=leftend && j<=rightend)
	    {
	        if(arr[i]<=arr[j]){
	            brr[k]=arr[i];
	            i++;
	            k++;
	           // count++;
	        }
	        else{
	            brr[k]=arr[j];
	            j++;
	            k++;
             // count++;
	        }
	    }
	    while(i<=leftend){
	        brr[k++]=arr[i++];
	    }
	    while(j<=rightend){
	        brr[k++]=arr[j++];
	    }
	    for(int p=leftstart;p<=rightend;p++){
	             arr[p]=brr[p];
	    }
       // return count;
	}
}
