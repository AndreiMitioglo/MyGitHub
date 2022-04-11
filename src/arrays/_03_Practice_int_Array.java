package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {

/*
TASK-1
Create an int array and store below data

-3
-7
0
2
0
7
7
10
2
15

Print the array with message "Array not sorted = "
Print the sorted array with message "Array sorted = "
 */

        System.out.println("\n-------TASK-1-------\n");

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array  sorted = " + Arrays.toString(numbers));

//=============================================================================

        System.out.println("\n-------TASK-2-------\n");
       /* Count how many positive-negative and zero numbers you have

        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
                */



        int positives = 0, negatives = 0, zeros = 0;

        for (int number : numbers) {
            if(number > 0) positives++;
            else if(number < 0) negatives++;
            else zeros++;
        }

        System.out.println("Positives = " + positives);
        System.out.println("Negatives = " + negatives);
        System.out.println("Zeros = " + zeros);

        System.out.println("\n-------TASK-2 - another approach-------\n");
        int pos = 0, neg = 0;

        for (int number : numbers) {
            if(number > 0) pos++;
            else if(number < 0) neg++;
        }

        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length - pos - neg));

//=================================================================================

        System.out.println("\n-------TASK-3 - another approach-------\n");
/*
TASK-3
Count how many even and odds

EXPECTED:
Evens = 5
Odds = 5
*/

        //int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        int even = 0, odd = 0;
        for (int number : numbers){
            if(number % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Evens = " + even);
        System.out.println("Odds = " + odd);

        }

    }

