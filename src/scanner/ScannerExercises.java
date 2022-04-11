package scanner;

import java.util.Scanner;

public class ScannerExercises {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name ? ");

        String firstName = input.next();  // store the  first name


        System.out.println("What is your last name ? ");

        String lastName = input.next();  // store the last name

        System.out.println("First name and last name the user is -" + " " + firstName + " " + lastName);


        /*

        Address and Full name
  Pseudo code
  1. Create an object of Scanner
  2. Print out the question
  3. Get the address by the nextLine method and store
  4. Print out the user result.


         */

        Scanner inputAddress = new Scanner(System.in);

        System.out.println("Where is your address ? ");
         input.nextLine(); // takes the space
        String userAddress = input.nextLine();

        System.out.println("User address is = \"" + userAddress  + "\"");


        System.out.println("What is your favorite book ? ");
        String favBook = input.next();
        input.nextLine();  // moves scanning to next string line

        System.out.println("What is your favorite color ? ");
        String favColor = input.next();
        input.nextLine();

        System.out.println("What is your favorite number ? ");
        int favNumber = input.nextInt();

        System.out.println("User's favorite book is: " + favBook + "\nUser's favorite color is: " + favColor +
                "\nUser;s favorite number is: " + favNumber);



    }
}
