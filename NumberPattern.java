import java.util.Scanner;

public class NumberPattern {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        int n = keyboard.nextInt();

        // Loop for all rows
        for (int i = -1; i <= n; i++) {
            // Loop for all columns
            for (int j = -1; j <= n; j++) {
                // If we are in the first row
                if (i == -1) {
                    // If we are in the first 2 columns, print a tab
                    if (j < 1) {
                        System.out.print("\t");
                    }
                    // Otherwise, print the number followed by a tab
                    else {
                        System.out.print(j + "\t");
                    }
                }
                // If we're in the second row, print a line
                else if (i == 0) {
                    System.out.print("----");
                }
                // If we're in the remaining rows
                else {
                    // If we're  in the first column, print a tab
                    if (j < 0) {
                        System.out.print("\t");
                    }
                    // If we're in the second column, print the number followed by a '|'
                    else if (j == 0) {
                        System.out.print(i + "|\t");
                    }
                    // If j and i are the same, print a star
                    else if (j == i) {
                        System.out.print("*\t");
                    }
                    // If all else fails, print the product between j and i
                    else {
                        System.out.print(i * j + "\t");
                    }
                }
            }

            // Go to next row
            System.out.println();
        }
    }
}
