import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix (and rows of the second matrix): ");
        int columns1 = scanner.nextInt();

        // Input dimensions for the second matrix
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[columns1][columns2];
        int[][] result = new int[rows1][columns2];

        // Input elements for the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < columns1; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Multiply the matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
