package projects;

import utilities.ScannerHelper;

import java.util.Locale;

public class Project05 {

    public static void main(String[] args) {

        System.out.println("\t  -------- Task 1 --------");
        /*
        TASK-1
Write a program that asks user to enter a String, and swaps first and last 4
characters of this String and print the modified String
Test data:
TechGlobal
Expected output:
obalGlTech
NOTE: Write a program that handles any String
NOTE: First check if the length of String is at least 8, if the String’s length is
less than 8, then print message “This String does not have 8 characters
         */

        String str = ScannerHelper.getAStringFromUser(); // TechGlobal

        if(str.length() >= 8)

            System.out.println(str.substring(str.length()-4) +
                    str.substring(4, str.length()-4) + str.substring(0, 4));

            else System.out.println("This String does not have 8 characters");
//================================================================================================

        System.out.println("\t  -------- Task 2 --------");

        /*
        Write a program that asks user to enter a sentence, and swaps first and last
words of this sentence and print the modified sentence
Test data:
Selenium is an automation tool
Expected output:
tool is an automation Selenium
NOTE: Write a program that handles any sentence
NOTE: First check if the sentence has at least 2 words, if the sentence has
only one or no word, then print message “This sentence does not have 2 or
more words to swap
         */

        String sentence = ScannerHelper.getAStringFromUser();
               //Selenium is an automation tool
        if (sentence.trim().contains(" ")) // finding is there are more than 2 worlds in sentence
            // trim to get rid of front and end spaces  -> "   Selenium is an automation tools  "

            System.out.println(sentence.substring(sentence.lastIndexOf(' ')) +
                    sentence.substring(sentence.indexOf(' '), sentence.lastIndexOf(' '))

                     + " " + sentence.substring(0, sentence.indexOf(' ')));

            else System.out.println("This sentence does not have 2 or more words to swap");

//==================================================================================================
        System.out.println("\t  -------- Task 3 --------");
        /*
        TASK-3
Assume that you are given some Strings as below, and you want to replace
bad words with good words.
String str1 = “These books are so stupid”;
String str2 = “I like idiot behaviors”;
String str3 = “I had some stupid t-shirts in the past and also some idiot
look shoes”;
Write a Java program that checks any given String and replace bad words
like “stupid” and “idiot” with “nice” keyword

Expected output:
These books are so nice
I like nice behaviors
I had some nice t-shirts in the past and also some nice look shoes
NOTE: Write a program that handles any String
         */

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str2.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));
//================================================================================================
        System.out.println("\t  -------- Task 4 --------");
        /*
        Write a program that asks user to enter their name.
First check if length of name is more than 2 and is even or odd
If length of name is less than 2, then print “Invalid input!!!”
If length of name is odd, then print middle character from the name
If length of name is even, then print middle 2 characters from the name
Test data:
J
Expected output:
Invalid input!!!
Test data:
Lionel
Expected output:
on
Test data:
James
Expected output:
m
         */

        String name = ScannerHelper.getANameFromUser();
        if (name.length() > 2)
            if (name.length() %2 == 1)
            System.out.println(name.charAt(name.length() /2));
        else System.out.println("" + name.charAt(name.length() /2-1) + name.charAt(name.length() /2));


        else System.out.println("Invalid input!!!");

//=========================================================================================================
        System.out.println("\t  -------- Task 5 --------");

        /*
        TASK-5
Write a program that asks user to enter a country.
First check if length of country is more than 5. If not, then print “Invalid
input!!!”
If length of country is more than 5, then print country name without first 2
and last 2 characters
Test data:
Peru
Expected output:
Invalid input!!!
Test data:
Brazil
Expected output:
az
         */

        String country = ScannerHelper.getANameFromUser();

        if (country.length() > 5 )
            System.out.println(country.substring(2, country.length()-2));

            else System.out.println("Invalid input!!!");
//=============================================================================================================

        System.out.println("\t  -------- Task 6 --------");
        /*
        TASK-6
Write a program that asks user to enter their full address.
Replace all letter ‘a’ or ‘A’ with ‘*’
Replace all letter ‘e’ or ‘E’ with ‘#’
Replace all letter ‘i’ or ‘I’ with ‘+’
Replace all letter ‘u’ or ‘U’ with ‘$’
Replace all letter ‘o’ or ‘O’ with ‘@’
Then, print result after replacements
Test data:
2860 S River Rd Suite 350, Des Plaines IL 60018
Expected output:
2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018
         */

        String address = ScannerHelper.getAddressFromUser();

        System.out.println(address.replace("a","*" ).replace("e", "#").
                replace("i","+" ).replace("u", "$").replace("o", "@").
                replace("A","*" ).replace("E", "#").
                replace("I","+" ).replace("U", "$").replace("O", "@"));
//=======================================================================================================
        System.out.println("\t  -------- Task 7 --------");
        /*
        TASK-7
Write a program that generates 2 random numbers between 0 and 25 (0 and
25 are included), Then print all numbers between 2 random numbers that
cannot be divided by 5 in ascending order.
Test data:
int randomNumber1 = 12;
int randomNumber1 = 4;
Expected output:
4 – 6 – 7 – 8 – 9 – 11 - 12
         */

        int num1 = (int)(Math.random()*26);
        int num2 = (int)(Math.random()*26);

        String s = "";

        for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if(i % 5 != 0) s += i + " - ";
        }

        if(!s.isEmpty()) System.out.println(s.substring(0, s.length()-3));
        else System.out.println(s);

    }



    }

