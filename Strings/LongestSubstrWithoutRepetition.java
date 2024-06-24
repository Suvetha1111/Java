/*
Problem Statement: Given a String, find the length of longest substring without any repeating character.
Example 1:
Input: s = ”abcabcbb”
Output: 3
Explanation: The answer is abc with length of 3.

Example 2:
Input: s = ”bbbbb”
Output: 1
Explanation: The answer is b with length of 1 units.
*/
import java.util.*;
public class Main {
    static int solve(String str) {
        if (str.length() == 0)
            return 0;

        int maxans = Integer.MIN_VALUE;
        int start = 0;  // To store the starting index of the longest substring
        int end = 0;    // To store the ending index of the longest substring
        Set<Character> set = new HashSet<>();
        int l = 0;

        for (int r = 0; r < str.length(); r++) {
            if (set.contains(str.charAt(r))) {
                while (l < r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            if (r - l + 1 > maxans) {
                maxans = r - l + 1;
                start = l;
                end = r;
            }
        }

        String longestSubstring = str.substring(start, end + 1);
        System.out.println("The longest substring without repeating characters is \"" + longestSubstring + "\"");
        return maxans;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }
}
