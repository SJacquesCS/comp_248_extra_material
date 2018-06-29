import java.util.Scanner;
import java.util.Random;

public class Question_1 {

	public static void main(String[] args) {
		String dna1 = "";
        String dna2 = "";
        final int MAX_MATCH = 3;
        final int DNA_LENGTH = 10;
        int r;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("seed: ");
        int seed = keyboard.nextInt();

        Random myGenerator = new Random(seed);

        for (int i=0; i< DNA_LENGTH ; i++) {

            r = myGenerator.nextInt(4);
            switch (r) {
                case 0: dna1+="A"; break;
                case 1: dna1+="C"; break;
                case 2: dna1+="T"; break;
                case 3: dna1+="G"; break;
            }

            r = myGenerator.nextInt(4);
            switch (r) {
                case 0: dna2+="A"; break;
                case 1: dna2+="C"; break;
                case 2: dna2+="T"; break;
                case 3: dna2+="G"; break;
            }
        }
        System.out.print(dna1 + " " + dna2);
        int forwardMismatches = 0;
        int backwardMismatches = 0;

        for (int i = 0; i < DNA_LENGTH; i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                forwardMismatches++;
            }
        }

        for (int i = 0; i < DNA_LENGTH; i++) {
            if (dna1.charAt(i) != dna2.charAt((DNA_LENGTH - 1) - i)) {
                backwardMismatches++;
            }
        }

        if (forwardMismatches <= 0) {
            System.out.println(" Forward match");
        }
        else if (backwardMismatches <= 0) {
            System.out.println(" Backward match");
        }
        else if (forwardMismatches < MAX_MATCH) {
            System.out.println(" Forward match with a distance of " + forwardMismatches);
        }
        else if (backwardMismatches < MAX_MATCH) {
            System.out.println(" Backward match with a distance of " + backwardMismatches);
        }
        else {
            System.out.println(" No match");
        }
	}

}
