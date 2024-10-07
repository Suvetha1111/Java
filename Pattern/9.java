/* 
 6
6 6 6 6 6 6 6 6 6 6 6 
  5 5 5 5 5 5 5 5 5 
    4 4 4 4 4 4 4 
      3 3 3 3 3 
        2 2 2 
          1 
*/
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    	//Write code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=n;
        int times=n*2-1;
        int space=0;
        for(int i=1;i<=n;i++)
        {
            for(int k=0;k<space;k++)
            {
         System.out.print(" "+" ");
            }
         for(int j=1;j<=times;j++)
            System.out.print(val+" "); 

            System.out.println();
            val--;
            times-=2;
            space++;
        }

   }
}
