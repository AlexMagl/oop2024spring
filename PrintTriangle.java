import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        // Define the number of rows in the triangle
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of triangle rows: ");

        int numberOfRows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= numberOfRows; i++) {
            // Inner loop for printing asterisks in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}