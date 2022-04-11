package ifElseStatements;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
/*
write a code asks a user age and
if the user is 16 or older print out "You can drive"
if the user is 18 or older print out "You can work"
if the user is 21 or older print out "You can drink"
if the user us 25 or older print out "You can rent a car"
 */
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your age ");
        int yourAge = a.nextInt();

        if (yourAge >= 16) {
            System.out.println("You can drive");
            if (yourAge > 17) {
                System.out.println("You can work");
                if (yourAge > 21) {
                    System.out.println(" You can drink");
                    if (yourAge > 25)
                        System.out.println("You can rent a car");
                    // le printeaza toate variantele posibile
                }

            }
        }


///           Turnery  (expresion) = (condition) ? true : false
        System.out.println("Please enter your Height in ft.");
        double h = a.nextDouble();

        String printOut = (h > 5) ? "You are tall" : " you can go...";
        System.out.println(printOut);
 /*
        Write a program that asks user their balance
        if their balance is lower than 50$ print out "You are poor"
        else print out "You are not poor"
         */

        System.out.println("Enter your balance");
        System.out.println((a.nextDouble() >= 50.0) ? "You are not poor" : "You are poor");

    }
}


