import java.util.Scanner;

public class NumberPyramid {
    public static void main(String args[]) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(j);
            }

            for (int j = i + 1; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
