import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        if(v1>=v2){
            System.out.println("false");
            return ;
        }

        int extraDistance = h1-h2;

        int extraSpeed = v2-v1;

        if(extraDistance%extraSpeed==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
  
}
