package homework;

import utilities.ScannerHelper;

import java.util.Locale;

public class Practise01 {
    public static void main(String[] args) {

  //======== Task 1 =============
/*
Assume that you are given a String as below;
String str = ”SDLC is step by step procedure to create an application”;
Write a program to find length of given String and the indexes of “SDLC” and “application” words
 */
//        String str = "SDLC is step by step procedure to create an application";
//
//        System.out.println(str.length()); // 55
//        System.out.println(str.indexOf("SDLC")); // 0
//        System.out.println(str.indexOf("application")); //44

        //======== Task 2 =============

/*
Assume that you are given a String as below;
String str = “  I know how to code with Python  ”;
•
Write a program to manipulate given String and convert it to be:
“I KNOW HOW TO CODE WITH JAVA”


// */
//        String str1 = "  I know how to code with Python  ";
//
//        System.out.println(str1.trim().toUpperCase().replace("PYTHON", "JAVA"));


        //======== Task 3 =============
/*
Assume that you are given a String as below;
String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
1.Find the first 'character' of given String which is not white space
2.Find the last character of given String which is not white space
 */
//        String str = "    SDLC has planning, design, development, testing, deployment and maintenance phases  ";
//
//        System.out.println(str.trim().charAt(0) + " " + str.trim().charAt(str.trim().length()-1));
//
//        System.out.println("First char that is not space is = " + str.charAt(0));
//        System.out.println("Last char that is not space is = " + str.charAt(str.length()-1));

        //======== Task 4 =============
/*
Assume you are given 3 Strings as below;
String s1 = “  TECH ”;
String s2 = “ glo  ”;
String s3 = “ BAL       “;
Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
Note: The length of s4 will be 10 at the end!!!
 */

//
//        String s1 = " TECH ".trim().toLowerCase().replace("t", "T");
//        String s2 = " glo  ".trim().replace("g", "G");
//        String s3 = " BAL       ".trim().toLowerCase();
//
//        System.out.println(s1 + s2 + s3);
//
////TechGlobal
//
//        String s4 = s1.trim().replace("ECH", "ech") + s2.trim().replace("g", "G") +
//                s3.trim().toLowerCase();


        //======== Task 5 =============

/*

Write a program that asks user to enter their favorite color.
Then, print the first and last characters of the color
Also, print the first and last 3 characters of the color

Test data:
green
Expected output:
1st character is = g
2nd character is = n
First 3 characters are = gre
Last 3 characters are = een
 */

//        String color = ScannerHelper.getAStringFromUser();
//
//        System.out.println("1st character is =" + color.charAt(0));
//        System.out.println("2nd character is = " + color.charAt(color.length()-1)); // last character
//        System.out.println("First 3 characters are = " + color.substring(0,3)); // endIndex is not included
//        System.out.println("Last 3 characters are = " + color.substring(color.length()-3)); // length -3


        //======== Task 6 =============

        /*
Write a program that asks user to enter a full sentence
Then, convert all sentence to lower case and print the first and last words in the given sentence
Test data:
JavA is an object-oriented programming LanguAGE
Expected output:
1st word is = java
2nd word is = language

         */

//        String sentence = ScannerHelper.getAStringFromUser();
//
//        System.out.println("1st word is = " + sentence.toLowerCase().substring(0, sentence.indexOf(' ')) + "\n2nd word is = " +
//                sentence.toLowerCase().substring(sentence.lastIndexOf(' ')+1 ));

        //======== Task 7 =============


        /*
Write a program that asks user to enter a full sentence
Then, check if given sentence contains $ character
If it contains $ character, then find the index of the $ character and print a proper message for the found index
Test data 1:
I saved $100 to buy new airpods
Expected output 1:
This sentence contains $ character
$ character’s index is = 8
Test data 2:
I’ll become a Software Engineer in Test
Expected output 2:
This sentence does not contain $ character

         */
        String sentence = ScannerHelper.getAStringFromUser();
       if (sentence.contains("$")) {
           System.out.println("This sentence contains $ character");
           System.out.println("$ character’s index is = " + sentence.indexOf('$'));
       } else System.out.println("This sentence does not contain $ character");

       //                 2nd way ternary
        System.out.println(sentence.contains("$") ?
                "This sentence contains $ character" + "\n$ character's index is = " + sentence.indexOf('$') :
                "This sentence does not contain $ character");

            }
}
