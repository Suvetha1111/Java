/*
Given a string s, return the number of palindromic substrings in it. A string is a palindrome when it reads the same backward as forward. A substring is a contiguous sequence of characters within the string.
Example 1:
Input: abc 
Output: 3 
Explanation: palindromic substrings are 'a', 'b' ,'c' 

Example 2:
Input: aaa 
Output: 6 
Explanation: palindromic substrings are 'a', 'a' ,'aa','aa','a','aaa'
*/
import java.util.Scanner;

class TUF {

    // Function to print all palindromic substrings and count them
    static int printAllPalindromicSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        // All substrings of length 1 are palindromic
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            System.out.println(s.substring(i, i + 1));
            count++;
        }

        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                System.out.println(s.substring(i, i + 2));
                count++;
            }
        }

        // Check for substrings of length greater than 2
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;

                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    System.out.println(s.substring(i, j + 1));
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter the string: ");
        String s = scanner.nextLine();

        System.out.println("All Palindromic Substrings are: ");
        int count = printAllPalindromicSubstrings(s);
        System.out.println("Total number of Palindromic Substrings: " + count);
    }
}







