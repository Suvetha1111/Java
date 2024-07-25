/*Write a program to give the following output for the given input
Input: a1b10
Output: abbbbbbbbbb
 Input: b3c6d15
Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.*/
import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        
        int length = str.length();
        for (int j = 0; j < length; ) {
            char a = str.charAt(j);
            j++;
            
            // Extract the number (it might be more than one digit)
            int b = 0;
            while (j < length && str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                b = b * 10 + (str.charAt(j) - '0');
                j++;
            }
            
            // Print the character 'a' 'b' times
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        }
    }
}
