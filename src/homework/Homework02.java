package homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        // ----- Task 1 -----

        /*

  Pseudo code

  1. Create an object of Scanner for each question
  2. Print out the questions
  3. Get the address by the nextLine method and store
  4. Print out the user results.


         */


        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name ? ");
        String firstName = input.next(); ///// input.next() pentru numai un cuvint

        System.out.println("What is your last name ? ");
        String lastName = input.next();  // next() numai pentru un cuvint
        Scanner collect = new Scanner(System.in);

        System.out.println("What is your age ?");
        int userAge = collect.nextInt();

        System.out.println("What is your email address ? ");
        String emailAddress = input.next();

        System.out.println("What is your phone number ? ");
        String phoneNumber = input.nextLine(); // pentru mai multe caractere(numere si spatii
        input.nextLine();  // asta e greseala de acasa, scoate spatiile goale

        System.out.println("Where is your address ? ");
        input.nextLine();////123 St Chicago IL 12345. contine mai multe spatii, numere, cuvinte
        String userAddress = input.nextLine();

        System.out.println("\tUser who join this program is " + firstName + " " + lastName + ". "
                + firstName + "'"  + " age is " + userAge + ". " + firstName +
                "'s email\n address is" + " " + emailAddress + ", " + "phone number " + phoneNumber +
                ", " + "and address is\n " + userAddress);

// User who joined this program is John Doe. John’s age is 45. John’s email
// address is johndoe@gmail.com, phone number (123) 123 1234, and address is
// 123 St Chicago IL 12345.



      //  ---- Task 2 ----
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your favorite book ? ");
        String favBook = scan.nextLine();
        System.out.println("What is your favorite color ? ");
        String favColor = scan.next();
        input.nextLine();
        System.out.println("What is your favorite number ? ");
        int favNumber = scan.nextInt();

        System.out.println("User's favorite book is: " + favBook + "\nUser's favorite color is: " + favColor +
                "\nUser;s favorite number is: " + favNumber);

    }

    }
