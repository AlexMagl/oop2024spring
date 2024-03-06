import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Read the radius input from the user
        double radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: area = Math.PI * radius * radius
        double area = Math.PI * radius * radius;

        // Display the calculated area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}