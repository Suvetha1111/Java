import java.util.Scanner;

public class IncircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the right-angled triangle
        System.out.print("Enter the length of the first leg (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of the second leg (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of the hypotenuse (c): ");
        double c = scanner.nextDouble();

        // Calculate the radius of the incircle
        double r = (a + b - c) / 2;

        // Calculate the area of the incircle
        double area = Math.PI * r * r;

        // Display the result
        System.out.println("The area of the incircle is: " + area);

        scanner.close();
    }
}
