package stringMethod;

import java.util.Scanner;

public class PractiseSubString {
    public static void main(String[] args) {

        /*
Write a program that asks user to enter a sentence (multiple words)
Find and print the first and the last words from the given sentence with below messages

Test data1:
I like Java

Expected output:
The first word is = I
The last word is = Java

Test data2:
Today is Sunday

Expected output:
The first word is = Today
The last word is = Sunday
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        System.out.println("The first world is = '" + sentence.substring(0, sentence.indexOf(' ')) + "'" +
                "\nThe last world is = '" + sentence.substring(sentence.lastIndexOf(' ') +1 ) + "'");




    }
}
