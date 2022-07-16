import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
          a[i] =sc.nextInt();
        }
        int count =0;
        for(int i=1;i<n;i++){
            int current = a[i];
            int j=i-1;
            while(j>=0 && a[j]>current)
            {
             a[j+1] = a[j];
                j--;
            }
            a[j+1]=current;
            for(int k=0;k<n;k++){
              System.out.print(a[k]+" ");

            }
          System.out.println();
          }


    }
}
