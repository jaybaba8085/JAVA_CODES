import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
	    int arr[] = {1,3,8,5,9};
        for(int i=0;i<arr.length-1;i++){
            int smaller = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smaller]>arr[j]){
                    smaller = j;
                }
            }
            int temp = arr[smaller];
            arr[smaller] = arr[i];
            arr[i] = temp;
        }
  
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
