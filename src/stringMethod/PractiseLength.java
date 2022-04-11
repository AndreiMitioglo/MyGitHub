package stringMethod;

import java.util.Scanner;

public class PractiseLength {

    public static void main(String[] args) {

//        Write a Java program that asks user to enter their favorite book name
//        and quote and store answers of user in different Strings
//        Finally, print the length of those Strings with proper message


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you fav book");
        String favBook = input.nextLine();
        System.out.println("Please enter you fav quote");
        String favQuote = input.nextLine();

        System.out.println("The length of " + favBook + " " + favBook.length());
        System.out.println("The length of " + favQuote + " " + favQuote.length());
        System.out.println(favBook.length());


        }
    }
