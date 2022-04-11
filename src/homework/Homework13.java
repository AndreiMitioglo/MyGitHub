package homework;

import methods.RandomNumberGenerator;

import java.util.Arrays;
import java.util.Locale;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("\n\t  -------- Task 1 --------");

        /*
        Write a program that prints all the numbers from 1 to 10 (1 and 10 are included)

If the number is dividable by 2, then print “Foo” instead of number itself
If the number is dividable by 5, then print “Bar” instead of number itself
If the number is dividable by both 2 and 5, then print “FooBar” instead of number itself
Else print number itself

         */

        for (int i = 0; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n\t  -------- Task 2 --------");
/*
Write a program to find the first positive and negative numbers in an int array

 */

/*
         System.out.println((pos != -1) ? "First positive number is: " + pos : "Positive number was not found!");
        System.out.println((neg != 1) ? "First negative number is: " + neg : "Negative number was not found!");
 */

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        int firstPositive = 0;
        int firstNegative = 0;
        for (int number : numbers) {
            if (number > 0 && firstPositive == 0) {
                System.out.println("First positive number is:" + number);
                firstPositive+=number;
            } else if (number < 0 && firstNegative == 0) {
                System.out.println("First negative number is:" + number);
                firstNegative+= number;
            }
        }
        System.out.println("\n\t  -------- Task 3 --------");


/*
Write a program to generate 5 random numbers between 1 to 10
 (1 and 10 are included) and store those numbers in an int array.

Check if int array contains 2 or 3 as elements
If it contains 2 or 3, then return true
If it does not contain either 2 or 3, then return false

 */
//
//                  int[] numbers = new int[5];
//        numbers[0] = RandomNumberGenerator.getRandomGenerator(1,10);
//        numbers[1] = RandomNumberGenerator.getRandomGenerator(1,10);
//        numbers[2] = RandomNumberGenerator.getRandomGenerator(1,10);
//        numbers[3] = RandomNumberGenerator.getRandomGenerator(1,10);
//        numbers[4] = RandomNumberGenerator.getRandomGenerator(1,10);
//        System.out.println(Arrays.toString(numbers));
//                boolean contains = false;
//                for ( int number : numbers){
//                    if (number == 2 || number ==3 )
//                        contains = true;
//                }
//        System.out.println(contains);

        System.out.println("\n\t  -------- Task 4 --------");
        /*
        Write a program to find if String array contains “apple” as an element, ignore cases.

         */
        String[] list = {"banana", "orange", "Apple"};

        boolean apple = false;
        for (String fruit : list) {
            if (fruit.toLowerCase().equals("apple")) {
                apple = true;
                break;
            }

        }
        System.out.println(apple);


        System.out.println("\n\t  -------- Task 5 --------");

        /*
Write a program to find the all-matching elements between 2  int arrays

         */

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean isFound = false;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    System.out.println(numbers1[i]);
                    isFound = true;
                }
            }
        }
        if (!isFound) System.out.println("There is no matching elements");

        System.out.println("\n\t  -------- Task 6 --------");

/*
Write a program to print duplicated characters in a String, ignore cases

 */

        String str = "baNana";
        //            012345
        String duplicates = ""; // a , n

        for (int i = 0; i < str.length() - 1; i++) { // length -1 no need to check the last character
            for (int j = i + 1; j < str.length(); j++) { // j +1 no need to compare b(0) whit b(0) , need b(0) whit a(1)

                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !duplicates.contains(str.toLowerCase().substring(i, i + 1))) { // substring (i, i+1) inside container;
                    duplicates += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }
            }


        }
    }
}








