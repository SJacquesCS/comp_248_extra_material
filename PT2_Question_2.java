import java.util.Random;
import java.util.Scanner;

public class Question_2 {
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

        boolean superior = true;
        boolean even = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i == (matrix[i].length - 1) - j) {
                    if (matrix[i][j] <= 3) {
                        superior = false;
                    }

                    if (matrix[i][j] % 2 != 0) {
                        even = false;
                    }
                }
            }
        }

        String output = "";

        if (superior) {
            output += "superior ";
        }

        if (even) {
            output += "even ";
        }

        if (!superior && !even) {
            output = "regular";
        }

        System.out.println(output);
    }
}
