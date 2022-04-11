package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {


    //  TASK-1 - findGreatestAndSmallestWithSort() method
/*
Write a method that takes an int array that has at least one element.
 Find the greatest and smallest elements from the array and print them.
  Complete task using sort() method.
 */

    public static void findGreatestAndSmallestWhithSort(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Smallest = " + arr[0]);
        System.out.println("Greatest = " + arr[arr.length - 1]);
    }

/*
TASK-2 findGreatestAndSmallest() method
Write a method that takes an int array that has at least one element.
 Find the greatest and smallest elements from the array and print them.
 DO NOT sort the array and complete task without sorting.
 */

    public static void findGreatestAndSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE, greatest = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number < smallest) smallest = number;
            else if (number > greatest) greatest = number;

        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);


    }

    /*
    TASK-3 - findSecondGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element.
     Find the second greatest and second smallest, element from the array and print them.
      Complete task using sort() method.
     */
    public static void findSecondGreatestAndSmallestWithSortMethod(int[] arr) {
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number != arr[arr.length - 1] && number > max)
                max = number;
            if (number != arr[0] && number < min)
                min = number;


        }
        System.out.println("Second greatest number is " + max);
        System.out.println("Second smallest number is " + min);
    }


    /*   ======== other way to solve it  ======================

    public static void findSecondGreatestAndSmallestWithSort(int[] nums){
        //[10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(nums);

        //[5, 5, 6, 7, 8, 10, 15, 15]
        // max = nums[nums.length - 1]
        // min = nums[0]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[0]){
                System.out.println(nums[i]);
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] != nums[nums.length - 1]){
                System.out.println(nums[i]);
                break;
            }
        }
     */


/*
TASK-4 - () method
Write a method that takes an int array that has at least one element.
 Find the second greatest and second smallest, elements from the array and print them.
 DO NOT sort the array and complete task without sorting.
 */

    public static void findSecondGreatestAndSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number < smallest) smallest = number;
            else if (number > greatest) greatest = number;


        }

        for (int number : arr) {
            if (number < secondSmallest && number != smallest) secondSmallest = number;
            else if (number > secondGreatest && number != greatest) secondGreatest = number;
        }

        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);


    }
/*
TASK-5 - findDuplicatedElementsInAnArray() method
Write a method that takes a String array. Find all duplicated elements and print them.
NOTE: It is case-sensitive!
 */

    public static void findDuplicatedElementsInAnArray(String[] str) {
        String s = "";
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]) && !s.contains(str[i])) s += str[i] + "\n";

            }

        }
        System.out.println(s);
    }

/*
TASK-6 findMostRepeatedElementInAnArray() method
Write a method that takes a String array. Find the most repeated element and print it.
 */

    public static void findMostRepeatedElementInAnArray(String[] str) {

        String a = "";

        for (int i = 0; i <= str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].contains(str[i])) {
                    a += str[j] + " ";

                }
            }
        }
        String[] s1 = a.split(" ");
        String b = "";
        for (int i = 0; i <= s1.length - 1; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].equals(s1[j]) && !b.contains(s1[i])) {
                    b+= s1[i];
                }
            }
        }
        System.out.println(b);

    }

             //   2nd way to solve
    public static void findMostRepeatedElemenntInAnArray(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }



//                     3rd way of solving

//    String mostRepeated = "";
//
//    for (int i = 0; i < s.length; i++) {
//
//        int count = 0;
//        int secondCount = count;
//        for (int j = i + 1; j < s.length; j++) {
//
//            if (s[i].equals(s[j])) count ++;
//
//        }
//        if (count > secondCount) mostRepeated = s[i];
//    }
//    System.out.println(mostRepeated);
//}
    public static void main(String[] args) {


        //int[] a = {10, 7, 7, 10 -3, 10, -3};
        //findGreatestAndSmallestWhithSort( a);

        // findGreatestAndSmallest(a);
        int[] a = {10, 5, 6, 7, 8, 5, 15, 15};
        // 5, 5, 6, 7, 8, 10, 15, 15
        // findSecondGreatestAndSmallestWithSortMethod(a);

        //findSecondGreatestAndSmallest(a);

        String[] str = {"eraser", "eraser", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

         //findDuplicatedElementsInAnArray(str);

//findMostRepeatedElementInAnArray(str);
    }
}


