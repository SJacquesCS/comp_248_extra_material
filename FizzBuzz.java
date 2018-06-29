import java.util.Scanner;

public class FizzBuzz {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = kb.nextInt();

        String output = "";

        if (num % 3 != 0 && num % 5 != 0) {
            output += "BAH";
        }
        else {
            if (num % 3 == 0) {
                output += "FIZZ";
            }
            if (num % 5 == 0) {
                output += "BUZZ";
            }
        }

        System.out.println(output);
    }
}
