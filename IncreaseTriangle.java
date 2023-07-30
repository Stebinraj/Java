import java.util.Scanner;

public class IncreaseTriangle {
    public static void PrintIncreaseTrianglePattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Row : ");
        int numberOfRow = scanner.nextInt();
        scanner.close();

        PrintIncreaseTrianglePattern(numberOfRow);
    }
}
