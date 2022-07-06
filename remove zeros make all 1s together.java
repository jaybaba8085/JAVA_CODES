import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); //number of testcases.
        String s=" ";
        for(int i=1;i<=t;i++){
          s=sc.next();
          char[] ch=s.toCharArray();
          int count=0;
          int pt1=0;
          int pt2=0;
          for(int j=0;j<ch.length;j++){ ///searching for 1st "1" from the beginning 
            if(ch[j]=='1'){
              pt1=j;
              break;
            } 
          }
          for(int j=ch.length-1;j>pt1;j--){ //searching for 1st "1" from the end
            if(ch[j]=='1'){
              pt2=j;
              break;
            }
          }
          ///after searching for "1" from beginnig and end ,
          ///then search for zeros in between them.
          for(int j=pt1;j<pt2;j++){
            if(ch[j]=='0'){
              count++;
            }
          }
          System.out.println(count);
      }
}}
