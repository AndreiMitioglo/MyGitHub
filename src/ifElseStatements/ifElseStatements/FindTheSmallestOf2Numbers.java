package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {

    public static void main(String[] args) {

/*
Write a program that asks user to enter 2 numbers
Find the smallest and print it

EXAMPLE PROGRAM:
Program: Please enter 2 numbers
User: 5 7

Program: 5
 */

        Scanner ask = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int n1 = ask.nextInt(), n2 = ask.nextInt();
          // 1st way to do it is Math.min()
        int SmallerNumber = Math.min(n1, n2);
        System.out.println(SmallerNumber);

         // 2nd way to do it if-else
        if (n1 < n2) System.out.println(n1); // shortcut fara brachete deoarece
                                           // contine numai o linei de executat
        else System.out.println(n2);


        // 3rd way Ternary Operator

        int smallestNumber = n1 < n2 ? n1 : n2;
        System.out.println(smallestNumber);
                // or
        System.out.println(n1 < n2 ? n1 : n2);

        System.out.println("End of Program!");


// Turnery operartor
        int a = 19;
        int b = 20;       // true : false
        int age = a > b ? b : a;
        System.out.println(age);
    }


}
