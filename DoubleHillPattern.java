import java.util.Scanner;

public class DoubleHillPattern {

    public static void PrintHillPattern(int n) {
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
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
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

        PrintHillPattern(numberOfRow);
    }
}
