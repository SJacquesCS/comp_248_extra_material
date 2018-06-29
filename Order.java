import java.util.Scanner;

public class Order {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num_1 = kb.nextInt();

        System.out.print("Enter second number: ");
        int num_2 = kb.nextInt();

        System.out.print("Enter third number: ");
        int num_3 = kb.nextInt();

        System.out.print("Enter fourth number: ");
        int num_4 = kb.nextInt();

        if (num_1 < num_2 && num_2 < num_3 && (num_4 > num_3 || num_4 > num_2 || num_4 > num_1)) {
            System.out.println("The order is correct");
        }
        else {
            System.out.println("The order is incorrect");
        }
    }
}
