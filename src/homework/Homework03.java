package homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        // ------- Task 1 ------

/*
        1. Create an object of Scanner for each question
        2. Print out the questions
        3. Get the numbers from the user using  the nextLine method and store
        4. Print out the user results.

 */
        System.out.println("What is your first number ?");
        Scanner collect = new Scanner(System.in);
        int firstNumber = collect.nextInt();


        System.out.println("What is your second number ?");
        int secondNumber = collect.nextInt();
        System.out.println("The number 1 entered by user is = " + firstNumber);
        System.out.println("The number 2 entered by user is = " + secondNumber);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (firstNumber + secondNumber));
        System.out.println();

       // ------- Task 2 ------

        System.out.println("\n ------ Task 2 ---------\n");

        System.out.println("What is your first floating number ?");

        double firstFloatingNumber = collect.nextDouble();  // double df1 = collect.nextDouble();


        System.out.println("What is your second floating number ?");

        double secondFloatingNumber = collect.nextDouble();   //double df2 = collect.nextDouble();

        System.out.println("The number 1 entered by user is = " + firstFloatingNumber);
        System.out.println("The number 2 entered by user is = " + secondFloatingNumber);
        System.out.println("The division of number 1 and 2 entered by user is = " + (firstFloatingNumber / secondFloatingNumber));
        System.out.println();


      // ------ Task 3 ------

        System.out.println("\n ------ Task 3 ---------\n");
        System.out.println ("1.\t" + (-10 + (7*5)));
        System.out.println((72 +24) % 24);
        System.out.println(10 + ((-3*9)/9));
        System.out.println(5 + ((18/3) * 3)- (6 % 3));

        System.out.println();

        // ---- Task 4 ------
        System.out.println("\n ------ Task 6 ---------\n");

        System.out.println("What is your first floating number ?");
        double floatingNum1 = collect.nextDouble(); // double = d1

        System.out.println("What is your second floating number ?");
        double floatingNum2 = collect.nextDouble(); // double = d2
        // "please enter 2 numbers"
        // double = d1;  double = d2;
        System.out.println("number1 = " + floatingNum1);
        System.out.println("number2 = " + floatingNum2);
        System.out.println("The sum of the given numbers is = " + (floatingNum1 + floatingNum2)); // d1 / d2
        System.out.println("The product of the given numbers is = " + (floatingNum1 * floatingNum2));  // d1 +d2
        System.out.println("The subtraction of the given numbers is = " + (floatingNum1 - floatingNum2));
        System.out.println("The division of the given numbers is = " + (floatingNum1 / floatingNum2));
        System.out.println("The remainder of the given numbers is = " + (floatingNum1 % floatingNum2));
        System.out.println();


      // -----Task 5 -----
        System.out.println("\n ------ Task 5 ---------\n");

        double a = 7.5;
        double b = 10.5;

        System.out.println("Width of rectangle = " + a); // not sure if this is requaired :)
        System.out.println("Height of rectangle = " + b);

        double area =  a * b;
        double perimeter = 2 * (a+b);

        System.out.println("The area of the rectangle = " + area);
        System.out.println("The perimeter of the rectangle = " + perimeter);
        System.out.println();

    // ----- Task 6 -----
        System.out.println("\n ------ Task 6 ---------\n");

        int yearSalary = 90_000;   //  "_" under score
        int earnIn3Years = yearSalary * 3;

        System.out.println("A Software Engineer in Test can earn " + earnIn3Years
                + " in \n3 years");
        // 2nd way
       // System.out.println("A Software Engineer in Test can earn " + (earnSalary * 3)
        //                + " in \n3 years"); );


    }


}
