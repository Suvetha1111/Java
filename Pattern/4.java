
/*
6
          1 
        1 2 
      1 2 3 
    1 2 3 4 
  1 2 3 4 5 
1 2 3 4 5 6 
 
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

       int space =n-1;
       int row,i;
      for(row=1;row<=n;row++)
      {
        for(i=1;i<=space;i++)
        {
            System.out.print(" "+" ");
        }
        for(i=1;i<=n-space;i++)
           System.out.print(i+" ");
        space--;
        System.out.println();
      }


   }
}
