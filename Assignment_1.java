import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String args[]) {
        System.out.println("**********Welcome to my pocket calculator**********\n");
        System.out.println("Let's try with integers first...");

        Scanner kb = new Scanner(System.in);
        int iOperand_1 = 0, iOperand_2 = 0;

        try {
            System.out.print("Enter operand 1 (integer): ");
            iOperand_1 = kb.nextInt();
            System.out.print("Enter operand 2 (integer): ");
            iOperand_2 = kb.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter an integer. Please try again!");
            System.exit(0);
        }

        int iAddition = iOperand_1 + iOperand_2;
        int iSubtraction = iOperand_1 - iOperand_2;
        int iMultiplication = iOperand_1 * iOperand_2;
        int iDivision = iOperand_1 / iOperand_2;
        int iModulo = iOperand_1 % iOperand_2;

        System.out.println(iOperand_1 + " + " + iOperand_2 + " = " + iAddition);
        System.out.println(iOperand_1 + " - " + iOperand_2 + " = " + iSubtraction);
        System.out.println(iOperand_1 + " * " + iOperand_2 + " = " + iMultiplication);
        System.out.println(iOperand_1 + " / " + iOperand_2 + " = " + iDivision);
        System.out.println(iOperand_1 + " % " + iOperand_2 + " = " + iModulo);

        System.out.println("\nLet's try with doubles now...");

        double dOperand_1 = 0, dOperand_2 = 0;

        try {
            System.out.print("Enter operand 1 (integer): ");
            dOperand_1 = kb.nextDouble();
            System.out.print("Enter operand 2 (integer): ");
            dOperand_2 = kb.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter a double. Please try again!");
            System.exit(0);
        }

        double dAddition = dOperand_1 + dOperand_2;
        double dSubtraction = dOperand_1 - dOperand_2;
        double dMultiplication = dOperand_1 * dOperand_2;
        double dDivision = dOperand_1 / dOperand_2;
        double dModulo = dOperand_1 % dOperand_2;

        System.out.println(dOperand_1 + " + " + dOperand_2 + " = " + dAddition);
        System.out.println(dOperand_1 + " - " + dOperand_2 + " = " + dSubtraction);
        System.out.println(dOperand_1 + " * " + dOperand_2 + " = " + dMultiplication);
        System.out.println(dOperand_1 + " / " + dOperand_2 + " = " + dDivision);
        System.out.println(dOperand_1 + " % " + dOperand_2 + " = " + dModulo);
    }
}
