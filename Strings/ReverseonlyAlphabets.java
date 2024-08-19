public class ReverseAlphabets {

    public static String reverseAlphabetsOnly(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return the input as is if it's null or empty
        }

        // Convert the input string to a character array.
        char[] chars = input.toCharArray();
        
        // Use two pointers to swap the alphabetic characters from the start and end.
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move the left pointer to the next alphabetic character.
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }

            // Move the right pointer to the previous alphabetic character.
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }

            // Swap the characters at left and right pointers.
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers towards the center.
            left++;
            right--;
        }

        // Convert the character array back to a string.
        return new String(chars);
    }

    public static void main(String[] args) {
        String test1 = "a,b$c";
        String test2 = "Ab,c,de!$";
        String test3 = "12345";
        String test4 = "a1b2c3d4e";

        System.out.println("Test 1: " + reverseAlphabetsOnly(test1)); // "c,b$a"
        System.out.println("Test 2: " + reverseAlphabetsOnly(test2)); // "ed,c,bA!$"
        System.out.println("Test 3: " + reverseAlphabetsOnly(test3)); // "12345" (no change)
        System.out.println("Test 4: " + reverseAlphabetsOnly(test4)); // "e1d2c3b4a"
    }
}
