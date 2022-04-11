package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {
        System.out.println("\n----------------Task 1 --------------");
/*
TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
 */

        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for(int number : numbers){
            System.out.println(number);
        }
        System.out.println("\n----------------Task 2 --------------");


/*
TASK-2
Find the sum of all the elements

RESULT:
29
 */
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum); // 29

        System.out.println("\n----------------Task 2 -for i loop-------------");

              int sum2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);


        System.out.println("\n----------------Task 3 ------------");
/*
TASK-3
Find the sum of first 3 elements in the array

RESULT:
0
 */
        //int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        int sum3 = 0;
        for (int i = 0; i < 3; i++) {
          sum3 += numbers[i];
        }
        System.out.println(sum3);

        System.out.println("\n----------------Task 4 ------------");
        /*
TASK-4
Find the sum of last 5 elements in the array
// 10, -3, -7, 0, 0, 7, 22

RESULT:
22
 */

        int sum4 = 0;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            sum4 += numbers[i];
        }
        System.out.println(sum4);

        System.out.println("\n----------------Task 5 ------------");
/*
TASK-5
Find the product of last 4 elements in the array but exclude zero if there are any
// 10, -3, -7, 0, 0, 7, 22

RESULT:
156
 */
        int prod5 = 1;
        for (int i = numbers.length - 4; i < numbers.length; i++) {

          if (numbers[i] != 0)  prod5 *= numbers[i];
        }
        System.out.println(prod5);


        System.out.println("\n----------------Task 6 ------------");
/*
TASK-6
Check your collection and print true if one of the element is 0
Print false if none of the elements is zero

RESULT:
true
 */
         boolean hasZero = false;

         for (int number : numbers){
             if (number == 0)
                 hasZero = true;
                 break;  // break if find zero, the first 1
        }
        System.out.println(hasZero);




    }
}
