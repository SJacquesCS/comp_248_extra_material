import java.util.Random;
import java.util.Scanner;

public class Question_1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // let's get the user input:
        System.out.print("Matrix Dimension: ");
        int dimension = s.nextInt();

        System.out.print("Seed: ");
        int seed = s.nextInt();

        // let's fill a matrix with random integers and display it
        Random myGenerator = new Random();
        myGenerator.setSeed(seed);

        int[][] matrix = new int[dimension][dimension];

        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = myGenerator.nextInt(10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int total = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == matrix.length - 1) {
                    total += matrix[i][j];
                }
                else if (j == 0 || j == matrix[i].length - 1) {
                    total += matrix[i][j];
                }
            }
        }

        System.out.println("Sum: " + total);
    }
}
