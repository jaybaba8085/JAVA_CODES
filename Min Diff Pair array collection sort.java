import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
 
class Main
{   
   public static void main(String args[])
   {
        ArrayList<Integer> arr = new ArrayList<Integer>();
         Scanner sc = new Scanner(System.in);
         while(sc.hasNextInt())
           {
           int i = sc.nextInt();
            arr.add(i);
           }
        ArrayList<ArrayList<Integer>> pairs = minAbsDiffPairs(arr);
        
        for (ArrayList<Integer> v : pairs)
          {
                for (int w : v)
                System.out.print(w + " ");
        }
    }
    static ArrayList<ArrayList<Integer>> minAbsDiffPairs(ArrayList<Integer> arr) {
 
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int n = arr.size();
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
      
        for (int i = 0; i < n - 1; i++)
            minDiff = Math.min(minDiff, Math.abs(arr.get(i) - arr.get(i + 1)));
      
        for (int i = 0; i < n - 1; i++)
        {
            ArrayList<Integer> pair = new ArrayList<Integer>();
            if (Math.abs(arr.get(i) - arr.get(i + 1)) == minDiff) {
                pair.add(Math.min(arr.get(i), arr.get(i + 1)));
                pair.add(Math.max(arr.get(i), arr.get(i + 1)));
                ans.add(pair);
            }
        }
        return ans;
    }

}
