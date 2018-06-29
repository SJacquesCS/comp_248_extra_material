import java.util.Random;
import java.util.Scanner;

public class Question_3 {
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

        int[][] newArray = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            newArray[i] = matrix[(matrix.length - 1) - i];
        }

        System.out.println("horizontal");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        newArray = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newArray[i][j] = matrix[i][(matrix.length - 1) - j];
            }
        }

        System.out.println("vertical");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
