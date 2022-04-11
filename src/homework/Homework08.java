package homework;

import utilities.Calculator;
import utilities.MyMethods;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {


   System.out.println("\t  -------- Task 1 --------");
//
        int random = (int) (Math.random() * 51);
        System.out.println(random);
        if (random >= 10 && random <= 25) {
            System.out.println("true");
        } else System.out.println("false");

        System.out.println((random >= 10 && random <= 25)      // ternary way
                ? "r is in between 10 and 25(included)"
                : "r is NOT in between 10 and 25(included)");

        Calculator.isNumberBetween10And25(random); //


//-----------------------------------------------------------------
        System.out.println("\n\t  -------- Task 2 --------");

        int t2_random = (int) (Math.random() * 101);

        if ( t2_random <= 50) {
            System.out.println(t2_random + " is in the 1st half");

            if (t2_random <= 25) {
                System.out.println(t2_random + " is in the 1st quarter");
            } else System.out.println(t2_random + " is in the 2nd quarter");
        }

        else  {
            System.out.println(t2_random + " is in the 2nd half");
            if (t2_random <= 75) {
                System.out.println(t2_random + " is in the 3rd quarter");
            } else
                System.out.println(t2_random + " is in the 4th quarter");
        }
//-------------------------------------------------------------------------------
        System.out.println("\n\t  -------- Task 3 --------");

        Scanner ask = new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 10");
        int num1 = ask.nextInt(), num2 = ask.nextInt(), num3 = ask.nextInt(), num4 = ask.nextInt(),
                num5 = ask.nextInt();



        int a = 0; // a = points
        if (num1 >= 1 && num1 <= 10)
            a += num1 * 5;

        if (num2 >= 1 && num2 <= 10)
            a += num2 * 4;


        if (num3 >= 1 && num3 <= 10)
            a += num3 * 3;


        if (num4 >= 1 && num4 <= 10)
            a += num4 * 2;

        else a += num4;

        if (num5 >= 1 && num5 <= 10) {
            a += num5;
        } else a += num5;

        System.out.println(a);

    }
}



