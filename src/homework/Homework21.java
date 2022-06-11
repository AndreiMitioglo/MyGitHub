package homework;

import java.util.Locale;

public class Homework21 {

    /*Requirement: TASK 1
    -Create a method called fizzBuzz1()
    -This method will take an int argument, and it will print numbers starting from 1 to
     given argument. BUT, it will print “Fizz” for the numbers divided by 3, “Buzz” for the
      numbers divided by 5, and “FizzBuzz” for the numbers divided both by 3 and 5.

    Test Data 1: 3
    Expected Result 1:
    1
    2
    Fizz

    Test Data 2: 5
    Expected Result 2:
    1
    2
    Fizz
    4
    Buzz

    */


    public static void fizzBuzz1(int n) {

        for (int i=1; i<=n; i++){
            if (i%15==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }

    }



        /*
        Requirement: TASK 2
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return a String. BUT it will return “Fizz”
     if the given number is divided by 3, “Buzz” if the number is divided by 5, and “FizzBuzz” if the number
     is divided both by 3 and 5. Otherwise, it will return number itself.

    Test Data 1: 0
    Expected Result 1: FizzBuzz

    Test Data 2: 1
    Expected Result 2: 1

    Test Data 3: 3
    Expected Result 3: Fizz

    Test Data 4: 5
    Expected Result 4: Buzz

    Test Data 5: 15
    Expected Result 5: FizzBuzz

     */

    public static String fizzBuzz2(int n){
      if (n%15==0){ return "FizzBuzz";
       }else if(n%3==0) return "Fizz";
        else if(n%5==0) return "Buzz";
        return n+"";
    }

    /*
    Requirement: TASK 3
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return an int which is the sum of all numbers presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.

    Test Data 1: “abc$”
    Expected Result 1: 0

    Test Data 2: “a1b4c  6#”
    Expected Result 2: 11

    Test Data 3: “ab110c045d”
    Expected Result 3: 155

    Test Data 4: “525”
    Expected Result 4: 525


 */
    public static int findSumNumbers(String s){
        int sum = 0; // container to hold sum of numbers
        String temp = "0"; // container to hold String format of the numbers
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) temp += s.charAt(i); // checking if the current char is digit
            else { // else if current char is letter ...
                sum += Integer.parseInt(temp); // ... then add to the sum of the digits found prior to letter
                temp = "0"; // reset the String container back to empty
            }
        }return sum + Integer.parseInt(temp);
    }


/*
    Requirement: TASK 4
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will return an int which is the number presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.

    Test Data 1: “abc$”
    Expected Result 1: 0

    Test Data 2: “a1b4c  6#”
    Expected Result 2: 6

    Test Data 3: “ab110c045d”
    Expected Result 3: 110

    Test Data 4: “525”
    Expected Result 4: 525
 */

    public static int findBiggestNumber(String s){
        int max = Integer.MIN_VALUE;
        String temp = "0";
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) temp += s.charAt(i);
            else {
                if( Integer.parseInt(temp)> max) {
                max = Integer.parseInt(temp);
            }
                temp = "0";
            }
        }return max;
    }

   /*TASK 5
    -Create a method called
    countSequenceOfCharacters()
    -This method will take a String argument and it will
    return a String which is the count of repeated
    characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!! */

    public static String countSequenceOfCharacters(String str){
        String sequence = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!sequence.contains(str.charAt(i) + "")) {
                sequence += str.charAt(i);
                sequence += count;
                count = 1;
            }
        }
        return sequence;

    }



    public static void main(String[] args) {

        fizzBuzz1(18);
        System.out.println("Task2");
        System.out.println( fizzBuzz2(15));

        String a = "a160uh155c";
        System.out.println(findSumNumbers(a));

        System.out.println(findBiggestNumber(a));

        String b = "aabdbdd";

        System.out.println(countSequenceOfCharacters(b));
    }
}

