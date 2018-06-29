public class MissingNumber {
    public static void main(String args[]) {
        int numbers[] =
        {
            6, 27, 18, 19, 10,
            46, 37, 43, 39, 40,
            41, 42, 8, 49, 5,
            21, 17, 33, 4, 15,
            11, 47, 48, 34, 25,
            16, 32, 23, 29, 30,
            1, 12, 38, 14, 50,
            31, 2, 28, 24, 45,
            26, 7 ,3 ,9 , 20,
            36, 22, 13, 44
        };

        int missingNumber = 0;

        for (int i = 1; i <= 50; i++) {
            boolean isThere = false;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    isThere = true;
                }
            }

            if (!isThere) {
                missingNumber = i;
                break;
            }
        }

        System.out.println("Missing number is: " + missingNumber);
    }
}
