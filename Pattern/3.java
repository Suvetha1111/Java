
/* 
6
          A 
        A B 
      A B C 
    A B C D 
  A B C D E 
A B C D E F 
 
*/
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int i,row,col;
         int space=n-1;
        for(row=1;row<=n;row++)
        { 
            char c='A';
            for(i=1;i<=space;i++)
            {
                System.out.print(" "+" ");
            } 
            for(i=1;i<=n-space;i++)
              System.out.print(c+++" ");
            space--;
            System.out.println();
        }
        }
}
