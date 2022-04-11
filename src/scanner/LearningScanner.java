package scanner;

import java.util.Scanner;

public class LearningScanner {

    public static void main(String[] args){

        /*
               Pseudo code;
        1. I am going to use scanner class for creating my object.
        2. I will use the object for reading the data.


         */

        Scanner scanner  = new Scanner(System.in);  // Creating an object with name scanner for using the method
        System.out.println("Please put your name here");  // this is what i want user to put

        String firstName = scanner.next();  // storing the first name from user

           System.out.println("Please put your last name here"); // second message from user
           String lastName = scanner.next();  // storing the last name from user


        System.out.println("The name user put = " + firstName);// printing my object/variable
        System.out.println("First name = " + firstName);
        System.out.println("Last name = " + lastName);  // printing my object

        System.out.println( firstName + lastName);
    }
}
