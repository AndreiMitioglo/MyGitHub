package homework;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Locale;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n\t  -------- Task 1 --------");
        /*
        Write a program that prints all the numbers that are dividable by 7
         starting from 1 to 100 (1 and 100 are included)
         */
        String s = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) s += i + " - ";
        }
        System.out.println(s.substring(0, s.length() - 3));

        System.out.println("\n\t  -------- Task 2 --------");
//=======================================================================================
        /*
        Write a program that prints all the numbers that are dividable by both
        2 and 3 starting from 1 to 50 (1 and 50 are included)
NOTE: Result must be in one line with space and dash separators

         */

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0) s += i + " - ";
        }
        System.out.println(s.substring(0, s.length() - 3));
//=============================================================================================
        System.out.println("\n\t  -------- Task 3 --------");

        /*
        Write a program that prints all the numbers that are dividable by 5
         starting from 100 to 50 (100 and 50 are included)

         */

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) s += i + " - ";
        }

        System.out.println(s.substring(0, s.length() - 3));

        System.out.println("\n\t  -------- Task 4 --------");
//=============================================================================================
/*
Write a program that prints the squares of all numbers starting from 0 to 7 (0 and 7 are included)

 */

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);

        }

        System.out.println("\n\t  -------- Task 5 --------");
        /*
        Write a program that finds sum of the numbers starting from 1 to 10
            Calculation => 1+2+3+4+5+6+7+8+9+10
         */
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
//===================================================================================================
        System.out.println("\n\t  -------- Task 6 --------");
/*
Write a program that asks user to enter a positive number
And find the factorial of the number
0! = 1
1! = 1
2! = 1*2 = 2
3! = 1*2*3 = 6

 */
        int factorial = 1;
        int n = ScannerHelper.getNumberFromUser();
        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
//========================================================================================
        System.out.println("\n\t  -------- Task 7 --------");

        /*
        Write a program that asks user to enter their first and last name
And count how many vowel letters they have in their first and last name
Vowel letters = a, e, i, o, u

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scan.nextLine();


        int vowel = 0;
        for (int i = 0; i <= fullName.length() - 1; i++) {

            if (CharacterHelper.isVowel(fullName.charAt(i)))
                vowel++;
        }
        System.out.println("There are " + vowel + " vowel in this full name");
//=============================================================================================

        System.out.println("\n\t  -------- Task 8 --------");

/*
Write a program that asks user to enter a number
If number is less than 100, then ask user to enter another number and find sum of entered 2 numbers.
Keep asking user to enter numbers until the sum of all entered numbers is at least 100.

If first number entered by user more than or equal to 100, print message
 “This number is already more than 100” and do not ask user to enter any other numbers

 */

/*
1. Create a do- while loop
2. Get number from user whit scanner add them to sum

3. if they are more than or equal to 100 and print: "The number is at least 100'
4. Create a container for counter, sum and number


 */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int attempt = 0;

        do {
            System.out.println("Please enter a number");
            num = scanner.nextInt();
            if (attempt == 1 && num >= 100) {
                System.out.println("This number is already more than 100");
                break;
            } else {
                sum += num;
                if (sum > 100) {
                    System.out.println("Sum of the numbers is already more than 100");
                }
            }
            attempt++;
        } while (sum < 100);


//=============================================================================================
        System.out.println("\n\t  -------- Task 9 --------");

        /*
        Assume that you are given a number, and you are asked to find series of Fibonacci numbers
What is Fibonacci numbers: a series of numbers in which each number ( Fibonacci number )
is the sum of the two preceding numbers
It always starts with 0 and 1
EX: 0, 1, 1, 2, 3, 5, 8, 13, 21

         */


        // ===================== Fibonacci number ============================
//        int Fib = 5;
//        int n1 = 0, n2 = 1;
//        String s2 = "";
//        for (int i = 0; i <= Fib; i++) {
//            s += n1 + " - ";
//
//            int n3 = n2 + n1;
//            n1 = n2;
//            n2 = n3;

        int n1 = 0; // n1
        int n2 = 0; // n2
        int total = 0; // n3
        String message = "";

        for (int i = 0; i < 7; i++) {
            message += n1 + "-";
            total = n1 + n2;
            n1 = n2;
            total = n2;
        }
        System.out.println(message);


        System.out.println("\n\t  -------- Task 10 --------");
/*
Write a program that asks user to enter a name
If name starts with j or J, then finish the program
But, if the name does not start with j or J, then keep asking until user gives a name that starts with j or J.


 */

        String name = ScannerHelper.getANameFromUser();


        for (int i = 0; i <= name.length() - 1; i++) {

            if (name.charAt(0) == 'j' || name.charAt(0) == 'J')
                System.out.println("End of the program");

            else System.out.println("Please enter a name");


        }

    }

}

