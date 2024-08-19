class HelloWorld {
public static void main(String[] args) {
String s="suvetha";
StringBuilder sbr=new StringBuilder(s);
sbr.reverse().toString();
System.out.println(sbr);
    }
}

 public static String reverseString(String input) {
        // Convert the string to a character array
        char[] characters = input.toCharArray();
      // Initialize two pointers, one at the start and one at the end of the array
        int left = 0;
        int right = characters.length - 1;
        // Swap characters from the start and end until the pointers meet in the middle
        while (left < right) {
            // Swap the characters at left and right
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            // Move the pointers towards each other
            left++;
            right--;
        }
        // Convert the character array back to a string and return it
        return new String(characters);
    }
