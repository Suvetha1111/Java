/* 
5
E D C B A 
E D C B 
E D C 
E D 
E 
*/
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    	//Write code here
        Scanner sc=new Scanner(System.in);
   int row,col;
   int rows=sc.nextInt();
    int n=65+rows-1;
   for(row=1;row<=rows;row++)
   {
      char c=(char)n;
      for(col=rows;col>=row;col--)
      {
          System.out.print(c--+" ");
      }
      System.out.println();
   }
   }
}
