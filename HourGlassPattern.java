import java.util.Scanner;

public class HourGlassPattern {

    public static void PrintHourGlassPattern(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Row : ");
        int numberOfRow = scanner.nextInt();
        scanner.close();

        PrintHourGlassPattern(numberOfRow);
    }
}
