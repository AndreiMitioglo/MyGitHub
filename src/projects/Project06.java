package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Project06 {

    public static void main(String[] args) {

        System.out.println("\t  -------- Task 1 --------");

      /*
      Write a program that asks user to enter a sentence as a String,
       and count how many words that sentence has, and print it with given below message.

NOTE: Write a program that handles any String
NOTE: First check if the given sentence has 2 words at least.
If not, then just print “This sentence does not have multiple words”.

      */

////
     Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        int counter = 0;
         if (sentence.contains(" ")) {

             for (int i = 0; i < sentence.length(); i++) {

                 if (sentence.charAt(i) == ' ')
                     counter++;
             }
             System.out.println("This sentence has " + (counter + 1) + " words.");

         } else System.out.println("This sentence does not have multiple words");


        System.out.println("\t  -------- Task 2 --------");

        /*
        Write a program that asks user to enter a word, and check if it is palindrome or not.
Palindrome: It is a word that is read the same backward as forward
•EX/ kayak, civic, madam

NOTE: Write a program that handles any String
NOTE: First check if the given String has at least 1 character,
if the String does not have at least one character, then print message
“This word does not have 1 or more characters”
         */

        System.out.println("Please enter a sentence: ");
        String world = scanner.next();

        String reversed = "";

        if (world.length() >= 1) {

            for (int i = world.length()- 1; i >= 0; i--) {
                reversed += world.charAt(i);

            }
            if (world.equals(reversed))
                System.out.println("This world is palindrome");

            else System.out.println("This word is not palindrome");

        } else System.out.println("This word does not have 1 or more characters");





        System.out.println("\t  -------- Task 3 --------");

/*
Write a program that asks user to enter a sentence as a String
and count how many a or A letters that sentence has and print it with given below message.

NOTE: Write a program that handles any String
NOTE: First check if the given sentence has 1 character at least.
If not, then just print “This sentence does not have any characters”.
 */
        System.out.println("Please enter a sentence: ");
        String str = scanner.nextLine().toLowerCase();
        int count = 0;

        if (str.length() >= 1){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a')
                    count++;

            }
            System.out.println("This sentence has " + count + " a or A letters.");

        }else System.out.println("This sentence does not have any characters");

        System.out.println("\t  -------- Task 4 --------");

        /*
        Write a program that asks user to enter a positive number.
Print all the number starting from 1 to given number.
 But, print “Foo” for the numbers divided by 2,
 “Bar” for the numbers divided by 3 and “FooBar” for the numbers divided by both 2 and 3.

         */
        System.out.println("Please enter a positive number ");
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if(i % 2 == 0) System.out.println("Foo");
            else if(i % 3 == 0) System.out.println("Bar");

             else System.out.println(i);

        }

    }
}


