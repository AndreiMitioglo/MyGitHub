package homework;

import utilities.CharacterHelper;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class HomeworkR4 {



            /*  TASK 1
            Requirement:
    -Create a method called noSpace()
    -This method will take one String argument and it will return a new String with all spaces removed from the original String

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “Java”
    Expected Result 2: “Java”

         */

    public static String noSpace(String str) {
        return str.replaceAll(" ", "");
    }

            /* TASK 2
            Requirement:
    -Create a method called replaceFirstLast()
    -This method will take one String argument and it will return a new String with first and last characters replaced

    NOTE: if the length is less than 2, then return empty String
    NOTE: Ignore all before and after spaces (get actual String only)

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “A”
    Expected Result 2: “”

         */

    public static String replaceFirstLast(String str) {
        if (str.length()<2) return "";
        else {
            String first = str.charAt(0) + ""; // str.substring(0,1);
            String middle = str.substring(1, str.length()-1);
            String last = str.substring(str.length()-1) ;
            return last + middle + first;
        }
    }


/*
    Requirement: TASK 3
    -Create a method called hasVowel()
    -This method will take one String argument and it will return a boolean checking if String has any vowel or not

    NOTE: Vowels are = a, e, o, u, I
    NOTE: Ignore cases

    Test Data 1: “”
    Expected Result 1: false


 */

    public static boolean hasVowel(String str) {
        boolean isVowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (CharacterHelper.isVowel(str.charAt(i))) isVowel = true;
        }
        return isVowel;

    }

/* TASK 4
Requirement:
    -Create a method called checkAge()
    -This method will take an int yearOfBirth as  argument and it will print message below based on the entry
    If the age is less than 16, then print “AGE IS NOT ALLOWED”
    If the age is 16 or more, then print “AGE IS ALLOWED”
    If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
    NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.

Test Data 1: 2006
Expected Result 1: AGE IS NOT ALLOWED


 */

public static void checkAge(int age){
    Date date = new Date();

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

    int old = (Integer.parseInt(dateFormat.format(date))-age );
    System.out.println(old);
    if (old >100|| old <0) System.out.println("AGE IS NOT VALID");
    else if (old<16) System.out.println("AGE IS NOT ALLOWED");
    else  System.out.println("AGE IS ALLOWED");

}

/* TASK 5
Requirement:
    -Create a method called averageOfEdges()
    -This method will take three int arguments and it will return average of min and max numbers

    Test Data 1: 0, 0 ,0
    Expected Result 1: 0

    Test Data 2: 0, 0, 6
    Expected Result 2: 3

 */

public static int averageOfEdges(int a, int b, int c){
    int max = Math.max(a,Math.max(b,c));
    int min = Math.min(a,Math.min(b,c));
    return (max + min) /2;
}
/*
    Requirement: TASK 6
    -Create a method called noA()
    -This method will take a String array argument and it will return a new array with all elements starting with A or a replaced with “###”

    NOTE: Assume length will always be more than zero
    NOTE: Ignore cases

    Test Data 1: [“java”, “hello”, “123”, “xyz”]
    Expected Result 1: [“java”, “hello”, “123”, “xyz”]


 */
    public static String[] noA(String[] arr){
       for (int i=0; i< arr.length; i++){
            if(arr[i].toLowerCase().startsWith("a")) arr[i]="###" ;

        } return arr;
    }

/* TASK 7
     Requirement:
    -Create a method called no3or5()
    -This method will take an int array argument and it will return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with 101

    NOTE: Assume length will always be more than zero

    Test Data 1: [7, 4, 11, 23, 17]
    Expected Result 1: [7, 4, 11, 23, 17]
 */

    public static int[] no3or5(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 15== 0)  arr[i]=101;
            else if(arr[i] %3 == 0) arr[i]=100;
            else if (arr[i] % 5 == 0) arr[i]=99;
        }
        return arr;
    }

/* TASK 8
    Requirement:
    -Create a method called countPrimes()
    -This method will take an int array argument and it will return how many elements in the array are prime numbers

    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    NOTE: Smallest prime number is 2

    Test Data 1: [-10, -3, 0, 1]
    Expected Result 1: 0

 */

    public static int countPrimes(int[] nums){
        int count = 0;

        for (int num : nums) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) isPrime = false;
                break;
            }
            if (isPrime) count++;
        }
        return count;
        }




    public static void main(String[] args) {
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(hasVowel("1234"));
       checkAge(1920);
       String[] ar = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(ar)));
        System.out.println(averageOfEdges(10, 13, 20));
           int[] b = {7,4,11,23,17};
        System.out.println(Arrays.toString(no3or5(b)));
        System.out.println(countPrimes(b));
    }



}