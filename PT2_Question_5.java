import java.util.Random;
import java.util.Scanner;

public class Question_5 {
    public static void main(String args[]) {
        final int ORIGINAL_ARRAY_SIZE = 10;
        final int MAX_WORD_LENGTH = 3;
        final int NB_LETTERS = 6; // letters will be chosen at random from 'a' to ('a'+6)

        String[] array1 = new String[ORIGINAL_ARRAY_SIZE];
        String[] array2 = new String[ORIGINAL_ARRAY_SIZE];

        // set up the random generation
        Scanner keyboard = new Scanner(System.in);
        System.out.print("seed: ");
        int seed = keyboard.nextInt();
        Random myGenerator = new Random(seed);
        int lenghtOfWords = myGenerator.nextInt(MAX_WORD_LENGTH)+1; // words will have a random length from 1 to MAX_WORD_LENGTH

        // fill the 2 arrays with random words of lenght lenghtOfWords
        int randomInt;
        String word;
        for (int t=0; t < ORIGINAL_ARRAY_SIZE; t++) {
            // create a new word
            word= "";
            for (int i=0; i < lenghtOfWords; i++) {
                word+= (char) ('a'+ myGenerator.nextInt(NB_LETTERS));
            }
            // and place it in array1
            array1[t] = word;

            // create a new word
            word= "";
            for (int i=0; i< lenghtOfWords; i++) {
                word+= (char) ('a'+ myGenerator.nextInt(NB_LETTERS));
            }
            // and place it in array2
            array2[t] = word;
        }

        int indexOfMin;
        String valueOfMin, temp;

        // sort array1
        for (int index = 0; index < array1.length-1; index++) {
            // find the index of the smallest element between index and the last
            valueOfMin = array1[index];
            indexOfMin = index;
            for (int scan = index+1; scan < array1.length; scan++) {
                if (array1[scan].compareTo(valueOfMin) <0) {
                    valueOfMin = array1[scan];
                    indexOfMin = scan;
                }
            }
            // swap the smallest element with the one at position index
            temp = array1[indexOfMin];
            array1[indexOfMin] = array1[index];
            array1[index] = temp;
        }

        // sort array2
        for (int index = 0; index < array2.length-1; index++) {
            // find the index of the smallest element between index and the last
            valueOfMin = array2[index];
            indexOfMin = index;
            for (int scan = index+1; scan < array2.length; scan++) {
                if (array2[scan].compareTo(valueOfMin) <0) {
                    valueOfMin = array2[scan];
                    indexOfMin = scan;
                }
            }
            // swap the smallest element with the one at position index
            temp = array2[indexOfMin];
            array2[indexOfMin] = array2[index];
            array2[index] = temp;
        }


        // display array1
        System.out.print("\nsorted array1: ");
        for (int t=0; t < array1.length; t++) {
            System.out.print(array1[t] +" ");
        }
        // display array2
        System.out.print("\nsorted array2: ");
        for (int t=0; t < array2.length; t++) {
            System.out.print(array2[t] +" ");
        }
        System.out.println();

        String newArray[] = new String[array1.length + array2.length];
        int index = 0;
        int lastJ = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = lastJ; j < array2.length; j++) {
                if (array2[j].compareTo(array1[i]) <= 0) {
                    newArray[index] = array2[j];
                    index++;
                    lastJ = j + 1;
                }
                else {
                    newArray[index] = array1[i];
                    index++;
                    break;
                }
            }
        }

        for (int i = lastJ; i < array2.length; i++) {
            newArray[index] = array2[i];
            index++;
        }

        System.out.print("merged array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println(newArray.length);
    }
}
