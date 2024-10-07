/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
Input
5
Output
9 9 9 9 9 9 9 9 9
  7 7 7 7 7 7 7
    5 5 5 5 5
      3 3 3
        1
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();

     int row,col;
  int i;
     int startOdd=n*2-1;
     int space=0;
     for(row=1;row<=n;row++)
     {
     
       for(i=0;i<space;i++)
          System.out.print("  ");
        for(i=1;i<=startOdd;i++)
          System.out.print(startOdd+" ");

        System.out.println();
        startOdd-=2;
        space++;
      }
   }
}
