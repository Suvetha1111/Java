import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    String str="Suvetha";
    HashSet<Character> s=new HashSet<Character>();//since set can't store duplicates
    for(int i=0;i<str.length();i++)
    s.add(str.charAt(i));
 System.out.println(s.size());
    
    }
} 
public class HelloWorld {
    public static void main(String[] args) {
        String str = "Suvetha";
        int uniqueCount = 0;

        // Normalize the string to lowercase (or uppercase)
        str = str.toLowerCase();

        // Array to track encountered characters (size 26 for lowercase or uppercase)
        boolean[] encountered = new boolean[26];//but for all the char ohter than alphabet, make 256 as size and check.
      //Also for treating uppercase uniquely,make 52 as size with 1st 26 for upper and nxt 26 for lower
/*
 int index;

            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Uppercase characters: 'A' is at index 0
                index = currentChar - 'A';
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                // Lowercase characters: 'a' is at index 26
                index = currentChar - 'a' + 26;
            } else {
                continue; // Skip any non-alphabetic characters
            }*/
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int index;

            // Calculate the index for the character
            index = currentChar - 'a'; // 'a' is at index 0, 'z' is at index 25

            // Check if the character has already been encountered
            if (!encountered[index]) {
                encountered[index] = true; // Mark the character as encountered
                uniqueCount++; // Increment the count of unique characters
            }
        }

        // Print the number of unique characters
        System.out.println("Number of unique characters: " + uniqueCount);
    }
}
