import java.util.Scanner;

public class MinsToSecs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of minutes: ");

        int mins = scanner.nextInt();

        int seconds = mins * 60;

        System.out.println("Seconds: " + seconds);
    }
}
