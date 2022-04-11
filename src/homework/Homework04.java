package homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        // ------ Task 1 ------

        Scanner input = new Scanner(System.in);
        System.out.println("What is first number ? ");
        int firstNumber = input.nextInt();
        System.out.println("Wat is yor second number ? ");
        int secondNumber = input.nextInt();

        System.out.println("The average of given 2 numbers is :" + (firstNumber + secondNumber) / 2);
        System.out.println();


        // ----- Task 2 -----

        System.out.println("Whats is first number ? ");
        int num1 = input.nextInt();
        System.out.println("What is your second number ?");
        int num2 = input.nextInt();

        System.out.println("The product of given 2 numbers is : " + num1 * num2);
        System.out.println();


        //   ------- Task 3 -----

        System.out.println("What is your number 1 ?");
        int number1 = input.nextInt();
        System.out.println("What is your number 2 ?");
        int number2 = input.nextInt();
        System.out.println("What is your number 3 ?");
        int number3 = input.nextInt();
        System.out.println("The " + number1 + " multiplied with " + number1 + " is = " + (number1 * number1));
        System.out.println("The " + number2 + " multiplied with " + number2 + " is = " + (number2 * number2));
        System.out.println("The " + number3 + " multiplied with " + number3 + " is = " + (number3 * number3));
        System.out.println();

        // ----- Task 4 ------

        System.out.println("Please enter first number");
        int firstNum = input.nextInt();
        System.out.println(" Please enter second number ");
        int secondNum = input.nextInt();
        System.out.println("The remainder of " + firstNum + " % " + secondNum + " = " + (firstNum % secondNum));
        System.out.println();

        // -------- Task 5 ------

        System.out.println("Please enter number 1 ");
        int a = input.nextInt();
        System.out.println(" Please enter  number 2 ");
        int b = input.nextInt();
        System.out.println("Please enter number 3 ");
        int c = input.nextInt();
        System.out.println(" Please enter  number 4 ");
        int d = input.nextInt();
        System.out.println("Please enter number 5 ");
        int e = input.nextInt();

        System.out.println(" The average of the given 5 numbers is : " + (a + b + c + d + e) / 5);
        System.out.println();

        // ----- Task 6 -------

        System.out.println("Please enter a number ");
        int f = input.nextInt();
        int num = 1;
        System.out.println(f + " * 1 = " + f * 1);
        System.out.println(f + " * 2 = " + f * 2);
        System.out.println(f + " * 3 = " + f * 3);
        System.out.println(f + " * 4 = " + f * 4);
        System.out.println(f + " * 5 = " + f * 5);
        System.out.println(f + " * 6 = " + f * 6);
        System.out.println(f + " * 7 = " + f * 7);
        System.out.println(f + " * 8 = " + f * 8);
        System.out.println(f + " * 9 = " + f * 9);
        System.out.println(f + " * 10 = " + f * 10);

        // 2nd way

        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));
        System.out.println(f + " * " + num + " = " + (f * num++));



        System.out.println();


        // ------ Task 7 ------

        System.out.println("Enter side of a square ");
        int sideOfSquare = input.nextInt();
        System.out.println("Perimeter of the square = " + (4 * sideOfSquare));
        System.out.println("Area of a square = " + (sideOfSquare * sideOfSquare));

    }

}
