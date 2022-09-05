import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static  List<Integer> findAnagrams(String s2, String s1) {
        int n = s2.length();
        int k = s1.length();
        List<Integer> res = new ArrayList<Integer>();
        int pat[] = new int[26];
        int str[] = new int[26];
        for(char c : s1.toCharArray()) pat[c-'a']++;
        int start = 0;
        for(int end = 0; end < n; end++) {
            str[s2.charAt(end)-'a']++;
            if(end>=k){
                str[s2.charAt(start)-'a']--;
                start++;
            }
            if(Arrays.equals(str,pat)) {
              res.add(start);
            }
        }
    return res;
    }
  public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      String s =sc.next();
      int m =sc.nextInt();
      String p =sc.next();
        List<Integer> miss=  findAnagrams(s,p);
          for(int i=0;i<miss.size();i++)
        {         
      System.out.print(miss.get(i)+" ");
        }
	}
}
