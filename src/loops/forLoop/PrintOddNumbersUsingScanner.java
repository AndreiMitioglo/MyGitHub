package loops.forLoop;

import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
        /*
        Ask user to enter a number and print the odd numbers (numere impare);
                      use ScannerHelper
               result:  1 3 5 7 9 .... 15
         */

        int givenNumberByUser = ScannerHelper.getNumberFromUser();

        for (int i = 0; i <= givenNumberByUser; i++) {
            if (i % 2 == 1) // odd number (impare)

                System.out.println(i);

        }
    }
}
