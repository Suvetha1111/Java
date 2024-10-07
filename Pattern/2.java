/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5 
*/
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        int row,col,rows;
        Scanner sc=new Scanner(System.in);
       rows=sc.nextInt();
      
        for(row=1;row<=rows;row++)
        {
            int val=rows;
          for(col=rows;col>=row;col--)
            {
                 System.out.print(val--+" ");
               
            }
            System.out.println();
        }

   }
}
