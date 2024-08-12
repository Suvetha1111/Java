import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Temperature Converter:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        // Perform conversion based on user choice
        switch (choice) {
            case 1:
                // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " °C = " + fahrenheit + " °F");
                break;
            case 2:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + " °F = " + celsius + " °C");
                break;
            default:
                System.out.println("Invalid choice. Please run the program again and choose either 1 or 2.");
        }

        scanner.close();
    }
}
