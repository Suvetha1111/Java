/*Write a program to give the following output for the given input
Input: a1b10
Output: abbbbbbbbbb
 Input: b3c6d15
Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.*/
import java.util.Scanner;
public class Extract 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        
        for(int j=0; j<str.length(); j++)
        {
            char a = str.charAt(j);
            int b = ((int)str.charAt(++j)-48);
           //  System.out.println(a);
            
            if(j+1 >= str.length())
            {
                for(int i=0; i<b; i++)
                System.out.print(a);
                break;
            }
            
            if (((int)str.charAt(j+1)-48)>-1 && ((int)str.charAt(j+1)-48)<10)
            {
                b = (b*10) + ((int)str.charAt(++j)-48);
            }
            //System.out.println(b);
            for(int i=0; i<b; i++)
                System.out.print(a);
        }
    } 
}
