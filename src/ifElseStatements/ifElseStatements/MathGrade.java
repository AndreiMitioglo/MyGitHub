package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class MathGrade {

    public static void main(String[] args) {


/*

Write a program that asks David what his balance. If David's balance is greater
than or equal to $600.0, then print message "Awesome! You have enough money!".
If David's balance is less than $600.0, then print message "Sorry!  You are poor!".

EXAMPLE PROGRAM 1
Program: Hey David! Please enter your balance?
User: 600.0

Program: Awesome! You have enough money!

EXAMPLE PROGRAM 2
Program: Hey David! Please enter your balance?
User: 59

Program: Sorry! You are poor!

 */


        Scanner ask = new Scanner(System.in);

        System.out.println("What is your balance ?");
        double balance = ask.nextDouble();

        if (balance >= 600) {  // printing only true value // lucreaza numai cu numere

            System.out.println("Awesome You have enough money");
        } else {
            System.out.println(" Sorry! You are poor");
        }




    }
}
