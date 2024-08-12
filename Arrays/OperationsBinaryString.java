/*
Problem statement:

The binary number system only uses two digits, 0 and 1. Any string that represents a number in the binary number system can be called a binary string. You are required to implement the following function:
int OperationsBinaryString(char *str);
The function accepts a string 'str' as its argument. The string 'str' consists of binary digits separated with an alphabet as follows:

'A' denotes AND operation
'B' denotes OR operation
'C' denotes XOR operation
You are required to calculate the result of the string 'str', scanning the string left to right, taking one operation at a time, and return the same.

Note:
No order of priorities of operations is required.
Length of 'str' is odd
If 'str' is NULL or None(in case of python), return -1

Example:
Input:
str: ICOCICIAOBI
Output: 1
*/
public class OperationsBinaryString {

    public static int operationsBinaryString(String str) {
        // Check if the input string is null
        if (str == null || str.isEmpty()) {
            return -1;
        }

        // Initialize the result with the first character of the string
        int result = str.charAt(0) - '0';  // Convert the first character to an integer

        // Traverse the string and apply the operations
        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);
            int nextDigit = str.charAt(i + 1) - '0';

            // Apply the operation based on the character
            switch (operation) {
                case 'A':
                    result = result & nextDigit;  // AND operation
                    break;
                case 'B':
                    result = result | nextDigit;  // OR operation
                    break;
                case 'C':
                    result = result ^ nextDigit;  // XOR operation
                    break;
                default:
                    return -1;  // Invalid operation character
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";  // Example input

        int result = operationsBinaryString(str);
        System.out.println(result);  // Output the result
    }
}
