/*
Creating a password checker in Java can involve various criteria, such as checking the length of the password, 
verifying if it contains uppercase and lowercase letters, numbers, special characters, and ensuring it doesn't have repeated sequences or other specific conditions.
Here's an example of a simple password checker that could be similar to what might be asked in an Accenture interview:

Problem Statement:
Write a Java program that checks if a given password meets the following criteria:

The password must be at least 8 characters long.
It must contain at least one uppercase letter.
It must contain at least one lowercase letter.
It must contain at least one digit.
It must contain at least one special character (e.g., !, @, #, etc.).
The program should return true if the password meets all the criteria, and false otherwise
Also includes the condition that it should not contain space or slash and starting character must not be a number
*/
public class PasswordChecker {

    public static boolean isValidPassword(String password) {
        // Check if the password is at least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        // Check if the starting character is a number
        if (Character.isDigit(password.charAt(0))) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Traverse through the password and check each condition
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (isSpecialCharacter(c)) {
                hasSpecialChar = true;
            } else if (c == ' ' || c == '/') {
                // Check if the character is a space or a slash
                return false;
            }

            // If all conditions are met, no need to check further
            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                return true;
            }
        }

        // If any condition is not met, return false
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    // Helper function to check if a character is a special character
    private static boolean isSpecialCharacter(char c) {
        return "!@#$%^&*()-+".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        // Test the password checker with different cases
        String password1 = "Accenture@123";
        String password2 = "acc123";
        String password3 = "ACC123!";
        String password4 = "1Accent@re";
        String password5 = "Accenture 123";
        String password6 = "Accen/ture123";
        
        System.out.println(isValidPassword(password1)); // true
        System.out.println(isValidPassword(password2)); // false
        System.out.println(isValidPassword(password3)); // false
        System.out.println(isValidPassword(password4)); // false (starts with a number)
        System.out.println(isValidPassword(password5)); // false (contains a space)
        System.out.println(isValidPassword(password6)); // false (contains a slash)
    }
}
