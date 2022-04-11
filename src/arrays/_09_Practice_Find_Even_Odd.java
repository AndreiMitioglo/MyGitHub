package arrays;

import java.util.Arrays;

public class _09_Practice_Find_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        /*
        Find the first even and first odd.
         */

        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;

        for (int number : numbers) {
            if (number % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("First even = " + number); //First even = 0

            } else if (!isFirstOddFound) {
                isFirstOddFound = true;
                System.out.println("First odd = " + number); //First odd = 5
            }

        }
        if (!isFirstEvenFound) System.out.println("There is no even numbers in this array");


        System.out.println(Arrays.toString(numbers));


        int countEven = 0;
        int countOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0 && countEven == 0) {
                System.out.println("First even number is: " + number);
                countEven++;
            } else if (number % 2 == 1 && countOdd == 0) {
                System.out.println("First odd number is: " + number);
                countOdd++;

            }
        }
    }
}