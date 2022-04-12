package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework16 {

    /*
            Requirement:
        Write a method countWords() that takes a String as an argument, and returns how many words there are in the the given String

        Test data 1:
        String str = “      Java is fun       ”;
    Expected output 1:
    3
     */

    public static int countWords(String str) {
        int count = 1;
        String a = str.trim();
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == ' ') count++;
        }
        return count;

    }

/* Task -2
    Requirement:
    Write a method countA() that takes a String as an argument, and returns how many A or a there are in the the given String

    Test data 1:
    String str = “TechGlobal is a QA bootcamp”;
    Expected output 1:

 */

    public static int countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'a') count++;

        }
        return count;


    }

/* Task - 3
    Requirement:
    Write a method countPos() that takes an ArrayList of Integer as an argument, and returns how many elements are positive

    Test data 1:
    [-45, 0, 0, 34, 5, 67]

 */

    public static int countPos(ArrayList<Integer> arrayList) {
        int countPos = 0;
        for (Integer integer : arrayList) {
            if (integer > 0) countPos++;
        }
        return countPos;
    }

    // Task-4
/*
    Requirement:
    Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument, and returns it back with removed duplicates

    Test data 1:
    [10, 20, 35, 20, 35, 60, 70, 60]

 */


    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> removed = new ArrayList<>();

        for (Integer number : numbers) {
            if (!removed.contains(number)) removed.add(number);

        }
        return removed;

    }
    /* Task -5
        Requirement:
    Write a method removeDuplicateElements() that takes an ArrayList of String as an argument, and returns it back with removed duplicates

    Test data 1:
    [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]

     */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str) {
        ArrayList<String> removed = new ArrayList<>();

        for (String s : str) {
            if (!removed.contains(s)) removed.add(s);

        }
        return removed;

    }
    
    /* Task - 6
        Requirement:
    Write a method removeExtraSpaces() that takes a String as an argument, and returns a String with removed extra spaces

    Test data 1:
    String str = “   I   am      learning     Java      ”;

     */

    /*
    public static String removeExtraSpaces(String str) {
    str = str.replaceAll(" +", " ");
    return str;
     */

    public static String removeExtraSpaces(String str) { // not working
        String[] s1 = str.trim().split(" ");
        System.out.println(Arrays.toString(s1));
        String removedSpace = "";
        for (String s : s1) {
            if(!s.contains(" "))
            removedSpace += s + " ";

        }
        return removedSpace; // I am learning Java
    }


    /*  Task-7
    Requirement:
    Write a method add() that takes 2 int[] arrays as arguments and returns a new array with sum of given arrays elements.
    Test data 1:
    int[] arr1 = {3, 0, 0, 7, 5, 10};
    int[] arr2 = {6, 3, 2};

    Expected output 1:
    [9, 3, 2, 7, 5, 10]



 */
    public static int[] add(int[] n1, int[] n2){

//        n1[0] += n2[0];
//        n1[1] += n2[1];
//        n1[2] += n2[2];
        for (int i = 0; i < Math.min(n1.length, n2.length); i++) {
            if (n1.length > n2.length) n1[i] += n2[i];
            else n2[i] += n1[i];
        }

        return (n1.length > n2.length) ? n1: n2;
    }



//    public static int[] add(int[] a, int[] b) {
//        int[] c = new int[Math.max(a.length, b.length)];
//        for (int i = 0; i < Math.max(a.length, b.length); i++) {
//            if (i < Math.min(a.length, b.length)) {
//                c[i] = a[i] + b[i];
//            } else if (a.length > b.length) {
//                c[i] = a[i];
//            } else {
//                c[i] = b[i];
//            }
//
//        }
//        return c;
//    }

    /*  Task 8
        Requirement:
    Write a method findClosestTo10() that takes an int[] array as an argument,
    and returns the closest element to 10 from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
    5

     */
    public static int findClosestTo10(int[] arr){
        int closest = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) if (arr[i] != 10 && Math.abs(10 - arr[i]) < Math.abs(10 - closest)) closest = arr[i];
        return closest;
    }





        public static void main (String[]args){

            //String str = "Selenium is the most common UI automation tool.   ";

            // System.out.println(countWords(str));

            //String str = "";
            //System.out.println(countA(str));

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(35);
//        numbers.add(20);
//        numbers.add(35);
//        numbers.add(60);
//        numbers.add(70);
//        numbers.add(60);
//
//        System.out.println(removeDuplicateNumbers(numbers));a

//        ArrayList<String> a = new ArrayList<>();
//        a.add("Java");
//        a.add("C#");
//        a.add("ruby");
//        a.add("JAVA");
//        a.add("ruby");
//        a.add("C#");
//        a.add("C++");
//        System.out.println(removeDuplicateElements(a));

        String a = "   I   am     learning     Java      ";
//
       System.out.println(removeExtraSpaces(a));

//        int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
//        int[] arr2 = {10, 3, 6, 3, 2};
//
//        System.out.println(Arrays.toString(add(arr1, arr2)));

            int[] numbers = {10, 13, 8, 10, 12, 15, -20};

            System.out.println(findClosestTo10(numbers));


        }
    }

