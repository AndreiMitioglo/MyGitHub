package stringMethod;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PractiseFirstAndLastCharAt {

    public static void main(String[] args) {
/*
Write a Java program that asks user to enter their favorite book name and quote and
 store answers of user in different Strings
Finally, print the length of those Strings with proper message

 */
                                                        String name = ScannerHelper.getANameFromUser();

        System.out.println("First character in the name is " + name.charAt(0)); // first char
        System.out.println("Last character in the name is " + name.charAt(name.length()-1)); // last char//
        //                                                     charAT( lungimea -1, ca se numara si zero.);


int a = 9% 10;
        System.out.println(a);
    }
}
