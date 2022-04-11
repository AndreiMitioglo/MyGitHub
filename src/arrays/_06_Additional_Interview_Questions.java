package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        System.out.println("\n------------- Task 1 ------------");
/*
Find the greatest and print it

RESULT:
{5, 3, 0, -5} -> 5
{4, 10, 15} -> 15

 */

             // with sort
        int[] numbers = {5, 3, 0, -5};
        Arrays.sort(numbers); //   last is the greatest; {-5, 0, 3, 5};
        System.out.println(numbers[numbers.length-1]); // 5

              // without sort

        int max = numbers[0]; // taking first number for reference number[0];
        for (int number : numbers){
            //if (number>max) max = number;
            max = Math.max(max, number);
        }
        System.out.println(max);
//--------------------------------------------------------------------------------------
        System.out.println("\n------------- Task 2 ------------");

/*
TASK-2
Create a double array and store below elements
{2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}

Find the minimum value

RESULT:
0.5
 */
        double[] num = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double min = num[0];
        for (double number : num){
            if (number < min) min = number;
        }
        System.out.println(min);

//        double minValue = Double.MAX_VALUE;
//
//        for (double number : array) {
//            //if(number < minValue) minValue = number;
//            minValue = Math.min(minValue, number);

//---------------------------------------------------------------------------------
        System.out.println("\n------------- Task 3 ------------");

        int counter = 0;
        double minVal = num[0];
        for (double number : num){
            if (number < minVal) minVal = number;
            counter++;
        }
        System.out.println(min); // 0.5


//-------------------------------------------------------------------------------------
        System.out.println("\n------------- Task 4 ------------");
        /*
        Use above double array and find second minimum value

        RESULT:
        1.5
         */
        // double[] num = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double minValue2 = Double.MAX_VALUE;

        for (double number : num) {
            if(number == minVal) continue;
            else if(number < minValue2) minValue2 = number;
        }
        System.out.println(minValue2); // 1.5

    }
}