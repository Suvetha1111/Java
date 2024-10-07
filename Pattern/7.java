/* 
 4
      1 
    3 2 1 
  5 4 3 2 1 
7 6 5 4 3 2 1 
*/
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int space =n-1;
       int row,i;
       int start=1;
      for(row=1;row<=n;row++)
       {
          for(i=1;i<=space;i++)
          {
              System.out.print(" "+" ");
          }
          int j=start;
          for(i=start;i>=1;i--)
          { 
              
              System.out.print(j--+" ");
          }
          start+=2;
          space--;
          System.out.println();
       }
}
}
