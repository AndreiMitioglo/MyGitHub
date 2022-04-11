package homework;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {


        // -------- Task 1 ---------

        int n1 = (int) (Math.random() * 11), n2 = (int) (Math.random() * 11),
                n3 = (int) (Math.random() * 11), n4 = (int) (Math.random() * 11);

        System.out.println("Number 1 = " + n1 + "\nNumber 2 = " + n2 + "\nNumber 3 = " + n3 + "\nNumber 4 = " + n4);


        int abs1 = Math.abs(n1 - 5), abs2 = Math.abs(n2 - 5), abs3 = Math.abs(n3 - 5),
                abs4 = Math.abs(n4 - 5);


        System.out.println("Absolute difference of " + n1 + " with 5 is = " + abs1);
        System.out.println("Absolute difference of " + n2 + " with 5 is = " + abs2);
        System.out.println("Absolute difference of " + n3 + " with 5 is = " + abs3);
        System.out.println("Absolute difference of " + n4 + " with 5 is = " + abs4);

        int greatest = Math.max(Math.max(Math.max(n1, n2), n3), n4);
        int smallest = Math.min(Math.min(Math.min(n1, n2), n3), n4);

        System.out.println("Greatest number is = " + greatest);
        System.out.println("Smallest number is = " + smallest);
        System.out.println();


        // ------ Task 2 ---------


        int num1 = (int) (Math.random() * 101) - 50, num2 = (int) (Math.random() * 101) - 50,
                num3 = (int) (Math.random() * 101) - 50, num4 = (int) (Math.random() * 101) - 50,
                num5 = (int) (Math.random() * 101) - 50, num6 = (int) (Math.random() * 101) - 50,
                num7 = (int) (Math.random() * 101) - 50, num8 = (int) (Math.random() * 101) - 50;

        System.out.println("Number 1 = " + num1 + "\nNumber 2 = " + num2 + "\nNumber 3 = " + num3 + "\nNumber 4 = " + num4
                + "\nNumber 5 = " + num5 + "\nNumber 6 = " + num6 + "\nNumber 7 = " + num7 + "\nNumber 8 = " + num8);

        int max = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4),
                Math.max(Math.max(Math.max(num5, num6), num7), num8));
        int min = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4),
                Math.min(Math.min(Math.min(num5, num6), num7), num8));

        System.out.println("Greatest number is = " + max);
        System.out.println("Smallest number is = " + min);

        int avg = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8;
        System.out.println("Average of 8 numbers is = " + avg);
        int abs = Math.abs(max - min);
        System.out.println("Absolute difference between smallest and greatest is = " + abs);

        if (num3 > 0) {  // zero is neutral
            System.out.println("3rd number is positive = "+ true);
        } else {
            System.out.println("3rd number is negative = " + false);

            if (num5 < 0) {
                System.out.println("5th number is negative = " + true);
            } else {
                System.out.println("5th number is positive = " + false);
            }

             if (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0)
             {
                System.out.println("There is at least one zero among those numbers is = " + false);
            } else  System.out.println("There is at least one zero among those numbers is = " + true);
            }
            System.out.println();


            // --------- Task 3 --------


            int numb1 = (int) (Math.random() * 51), numb2 = (int) (Math.random() * 51),
                    numb3 = (int) (Math.random() * 51), numb4 = (int) (Math.random() * 51),
                    numb5 = (int) (Math.random() * 51), numb6 = (int) (Math.random() * 51),
                    numb7 = (int) (Math.random() * 51);

            System.out.println("Number 1 = " + numb1 + "\nNumber 2 = " + numb2 + "\nNumber 3 = " + numb3 +
                    "\nNumber 4 = " + numb4 + "\nNumber 5 = " + numb1 + "\nNumber 6 = " + numb1 + "\nNumber 7 = " + numb7);


            int max1 = Math.max(Math.max(Math.max(Math.max(numb1, numb2), numb3), numb4),
                    Math.max(Math.max(numb5, numb6), numb7));
            int min1 = Math.min(Math.min(Math.min(Math.min(numb1, numb2), numb3), numb4),
                    Math.min(Math.min(numb5, numb6), numb7));

            System.out.println("Greatest number is = " + max1);
            System.out.println("Smallest number is = " + min1);

            int avg1 = (numb1 + numb2 + numb3 + numb4 + numb5 + numb6 + numb7) / 7;
            System.out.println("Average of 7 numbers is = " + avg1);

            if (numb1 >= 10) {
                System.out.println("First number is greater than or equal to 10 = true");
            } else {
                System.out.println("First number is greater than or equal to 10 = false");
            }
            if (numb7 <= 40) {
                System.out.println("Last number is less than or equal to 40 = true");
            } else {
                System.out.println("Last number is less than or equal to 40 = false");
            }

            if (numb1 > 25 && numb7 > 25) {
                System.out.println("Both first and last numbers are greater than 25 = true");
            } else {
                System.out.println("Both first and last numbers are greater than 25 = false");
            }

/* THIS IS A MORE EFFICIENT WAY TO CODE THIS^^ AND THEN SEE EXAMPLE FOR A ONE LINE OF CODE WAY:
if (num1 == 0 || num2 ==0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 ==0 || num7 == 0 || num8 == 0){
System.out.println("There is at least one zero among those numbers is = true");
}else System.out.println("There is at least one zero among those numbers is = false");

 */


            if (numb1 == 0 || numb1 == 50) {
                System.out.println("At least one of those numbers is 0 or 50  = true");
            } else if (numb2 == 0 || numb2 == 50) {
                System.out.println("At least one of those numbers is 0 or 50  = true");
            } else if (numb3 == 0 || numb3 == 50) {
                System.out.println("At least one of those numbers is 0 or 50  = true");
            } else if (numb4 == 0 || numb4 == 50) {
                System.out.println("At least one of those numbers is 0 or 50  = true");
            } else if (numb5 == 0 || numb5 == 50) {
                System.out.println("At least one of those numbers is 0 or 50  = true");
            } else if (numb6 == 0 || numb6 == 50) {
                System.out.println("At least one of those numbers is 0 or 50  = true");
            } else if (numb7 == 0 || numb7 == 50) {
                System.out.println("At least one of those numbers is 0 or 50  = true");
            } else {
                System.out.println("At least one of those numbers is 0 or 50  = false");
            }
                    // can NOT be more than 50 due to random of 0 to 50;
            if (numb1 < 40 && numb2 < 40 && numb3 < 40 && numb4 < 40 && numb5 < 40 && numb6 < 40 && numb7 <40) {
                System.out.println("There is no numbers between 40 and 50" + true);
            } else System.out.println("There is no numbers between 40 and 50" + false);

            //  ----------Task 4 ---------------


            int number1 = (int) (Math.random() * 101);
            int number2 = (int) (Math.random() * 101);
            int number3 = (int) (Math.random() * 101);
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);


            if (number1 > 25) {
                if (number2 > 25) {
                    if (number3 > 25) {
                        System.out.println("true");
                    } else System.out.println("false");
                    System.out.println();

                    // -------- Task 5 -----------

                    Scanner ask = new Scanner(System.in);
                    System.out.println("Please enter a number between 1 and 7");
                    int day = ask.nextInt();

                    if (day == 1) {
                        System.out.println("The number entered returns MONDAY");
                    } else if (day == 2) {
                        System.out.println("The number entered returns TUESDAY");
                    } else if (day == 3) {
                        System.out.println("The number entered returns WEDNESDAY");
                    } else if (day == 4) {
                        System.out.println("The number entered returns THURSDAY");
                    } else if (day == 5) {
                        System.out.println("The number entered returns FRIDAY");
                    } else if (day == 6) {
                        System.out.println("The number entered returns SATURDAY");
                    } else {
                        System.out.println("The number entered returns SUNDAY");
                    }
                    System.out.println();

                    // ------ Task 6 -------

                    System.out.println("Please enter a number between -10 and 10 both included");
                    int userNumber = ask.nextInt();
                    if (userNumber > 0) {
                        System.out.println("Number entered is POSITIVE");
                    } else if (userNumber < 0) {
                        System.out.println("Number entered is NEGATIVE");
                    } else {
                        System.out.println("Number entered is ZERO");

                    }
                    if (userNumber % 2 == 0) {
                        System.out.println("Number entered is EVEN");
                    } else {
                        System.out.println("Number is ODD");
                    }
                    System.out.println();

                    // ----- Task 7 ------


                    System.out.println("Tell me your exam results?");
                    int exam1 = ask.nextInt(), exam2 = ask.nextInt(), exam3 = ask.nextInt();
                    int average = (exam1 + exam2 + exam3) / 3;

                    if (average >= 70) {
                        System.out.println("You PASSED!");
                    } else System.out.println("You FAILED!");
                    System.out.println();


                    // ------- Task 8 -------

                    System.out.println("Please enter 3 numbers:");
                    int a = ask.nextInt(), b = ask.nextInt(), c = ask.nextInt();

                    if (a == b && a == c) {
                        System.out.println("TRIPLE MATCH");
                    } else if (a != b && a != c) {
                        System.out.println("NO MATCH");
                    }
                    if (a == b && a != c) {
                        System.out.println("DOUBLE MATCH");
                    }
                    if (a == c && a != b) {
                        System.out.println("DOUBLE MATCH");
                    }

                }
            }

        }
    }
