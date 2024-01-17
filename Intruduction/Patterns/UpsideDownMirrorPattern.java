import java.util.Scanner;

class UpsideDownMirrorPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many rows and columns required : ");
        int n=scan.nextInt();
        int i, j;
        

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
