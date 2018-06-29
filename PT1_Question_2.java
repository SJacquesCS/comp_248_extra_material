import java.util.Scanner;
import java.util.Random;

public class Question_2 {

	public static void main(String[] args) {
		int score, seed, skaters;
        int JUDGES = 6;
        int totalBefore = 0, totalAfter;
        int min = 9, max = 0;
        int bestScore = 0, winner = 1;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Number of skaters: ");
            skaters = keyboard.nextInt();
        } while (skaters < 2 || skaters > 10);

        System.out.print("seed: ");
        seed = keyboard.nextInt();

        Random generator = new Random(seed);

        for (int i = 0; i < skaters; i++) {
            for (int j = 0; j < JUDGES; j++) {
                // generate a random score between 0 (included) and 9 (included)
                score = generator.nextInt(9);
                System.out.println("Score " + (j + 1) + " of skater " + (i + 1) + ": " + score);

                if (score < min)
                    min = score;

                if (score > max)
                    max = score;

                totalBefore += score;
            }

            totalAfter = totalBefore - min - max;
            System.out.println("Total before: " + totalBefore);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("Total after: " + totalAfter + "\n");

            if (totalAfter > bestScore) {
                bestScore = totalAfter;
                winner = (i + 1);
            }

            totalBefore = 0;
            max = 0;
            min = 10;
        }

        System.out.println("Winner: skater " + winner);
	}
}
