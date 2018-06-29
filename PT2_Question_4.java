import java.util.Random;
import java.util.Scanner;

public class Question_4 {
    public static void main(String args[]) {
        final int ORIGINAL_ARRAY_SIZE = 10;
        final int MAX_WORD_LENGTH = 3;
        final int NB_LETTERS = 6; // letters will be chosen at random from 'a' to ('a'+6)

        String[] array = new String[ORIGINAL_ARRAY_SIZE];

        Scanner keyboard = new Scanner(System.in);
        System.out.print("seed: ");
        int seed = keyboard.nextInt();
        Random myGenerator = new Random(seed);
        int lenghtOfWords = myGenerator.nextInt(MAX_WORD_LENGTH)+1; // words will have a random length from 1 to MAX_WORD_LENGTH

        // fill the array with random words of lenght lenghtOfWords
        int randomInt;
        String word;
        for (int t=0; t < ORIGINAL_ARRAY_SIZE; t++) {
            // create a new word and place it in the array 
            word= "";
            for (int i=0; i < lenghtOfWords; i++) {
                word += (char) ('a'+ myGenerator.nextInt(NB_LETTERS));
            }
            array[t] = word;
        }

        // sort the array
        int indexOfMin;
        String valueOfMin, temp;
        // for every element except the last...
        for (int index = 0; index < array.length-1; index++) {
            // find the index of the smallest element between index and the last
            valueOfMin = array[index];
            indexOfMin = index;
            for (int scan = index+1; scan < array.length; scan++)
                if (array[scan].compareTo(valueOfMin) < 0) {
                    valueOfMin = array[scan];
                    indexOfMin = scan;
                }

            // Swap the smallest element with the one at position index
            temp = array[indexOfMin];
            array[indexOfMin] = array[index];
            array[index] = temp;
        }

        // display the array
        System.out.print("\nsorted array: ");
        for (int t=0; t < array.length; t++) {
            System.out.print(array[t] +" ");
        }

        for (int i = 0; i < array.length; i++) {
            String currentWord = array[i];

            for (int j = 0; j < array.length; j++) {
                if (i != j && currentWord.compareTo(array[j]) == 0) {
                    String newArray[] = new String[array.length - 1];

                    int index = 0;

                    for (int k = 0; k < array.length; k++) {
                        if (k == j) {
                            continue;
                        }

                        newArray[index] = array[k];
                        index++;
                    }

                    array = newArray;
                }
            }
        }

        System.out.print("\nunique array: ");
        for (int t=0; t < array.length; t++) {
            System.out.print(array[t] +" ");
        }

        System.out.println(array.length);
    }
}
