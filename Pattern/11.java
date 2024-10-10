/*
9
                A 
              A B A 
            A B C A B 
          A B C D A B C 
        A B C D E A B C D 
      A B C D E F A B C D E 
    A B C D E F G A B C D E F 
  A B C D E F G H A B C D E F G 
A B C D E F G H I A B C D E F G H 


*/
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    	//Write code here
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int space=n-1;
       int i,j,k,m,o;
        int times=1;
       for(i=1;i<=n;i++)
       {
           char c='A';
           for(j=1;j<=space;j++)
            System.out.print(" "+" ");
           for(k=1;k<=i;k++)
              {
                    System.out.print(c+++" ");
                }
                c='A';
              for(o=k+1;o<=times+1;o++)
             {
                System.out.print(c+++" ");
             }
           space--;
           times+=2;
           System.out.println();
       }
    }
   }
