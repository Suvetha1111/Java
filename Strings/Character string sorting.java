public class SortStringManually {

    public static void main(String[] args) {
        String input = "dcba";
        
        // Convert the string to a char array
        char[] characters = input.toCharArray();
        
        // Sort the array of characters manually using Bubble Sort
        for (int i = 0; i < characters.length - 1; i++) {
            for (int j = 0; j < characters.length - 1 - i; j++) {
                if (characters[j] > characters[j + 1]) {
                    // Swap the characters
                    char temp = characters[j];
                    characters[j] = characters[j + 1];
                    characters[j + 1] = temp;
                }
            }
        }
        
        // Convert the sorted char array back to a string
        String sortedString = new String(characters);
        
        // Output the sorted string
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
