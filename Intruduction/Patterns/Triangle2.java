import java.util.Scanner;

class Triangle2 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        // Outer loop controls the number of rows
        for (i = n; i >= 1; i--) {
            // Inner loop controls the number of spaces before the asterisks
            for (j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Inner loop controls the number of asterisks in each row
            for (j = i; j <= n; j++) {
                System.out.print("* ");
            }

            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
