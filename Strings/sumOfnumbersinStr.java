public class SumOfNumbersInString {

    public static int sumOfNumbers(String input) {
        int sum = 0;
        int currentNumber = 0;
        boolean hasNumber = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to a digit and build the current number
                currentNumber = currentNumber * 10 + (ch - '0');
                hasNumber = true;
            } else {
                // If the character is not a digit and we have a number, add it to the sum
                if (hasNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    hasNumber = false;
                }
            }
        }

        // Add the last number if the string ends with digits
        if (hasNumber) {
            sum += currentNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        String input = "abc123xyz45lmn8";
        int result = sumOfNumbers(input);

        System.out.println("Sum of numbers in the string: " + result);
    }
}
