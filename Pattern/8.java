/* 
        A
      C C C
    E E E E E
G G G G G G G
*/
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        char c='A';
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int time=1,i,j;
        for(i=1;i<=n;i++)
        {
          for(j=1;j<=space;j++)
           System.out.print(" "+" ");
          for(i=1;i<=time;i++)
              System.out.print(c+" ");


         System.out.println();
            space--;
            time+=2;
            c+=2;
        }
   }
}
