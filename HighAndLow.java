import java.util.Scanner;

public class HighAndLow {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int min = 999999999;
        int max = -999999999;
        int value;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            value = keyboard.nextInt();

            if (value > max)
                max = value;

            if (value < min)
                min = value;
        }

        System.out.println();
        System.out.println("Highest Value = " + max);
        System.out.println("Lowest Value = " + min);
    }
}
