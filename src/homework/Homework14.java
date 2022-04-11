package homework;

import java.util.Arrays;
import java.util.Locale;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("\n\t  -------- Task 1 --------");
        /*
    Write a program to find the first duplicated number in an int array
It should print "There is no duplicates" if there are no duplicate
elements.
NOTE: Make your code dynamic that works for any given int array.

//         */
//
//
//        //int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
//
//        boolean isDuplicates = false;
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] == numbers[j]) {
//                    System.out.println(numbers[i]);
//                    isDuplicates = true;
//                    break;
//                }
//
//            }
//            if (isDuplicates) break;
//        }
//        if (!isDuplicates) System.out.println("There is no duplicates");


        System.out.println("\n\t  -------- Task 2 --------");

        /*
        Write a program to find the first duplicated String in a String array, ignore cases.
         It should print "There is no duplicates" if there are no duplicate elements.
NOTE: Make your code dynamic that works for any given String array.

         */
        // String[] words = {"xyz", "java", "abc"};
        //String[] words = {"a", "b", "B", "xyz", "123"};

       String[] words = {"Z", "abc", "z", "123", "#" };
        boolean isDuplicate = false;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[j]);
                    isDuplicate = true;
                    break;
                }
            }if (isDuplicate) break;
        }
        if (!isDuplicate)
                System.out.println("There is no duplicates");


        System.out.println("\n\t  -------- Task 3 --------");

/*
Write a program to find the all duplicates in an int array.
It should print "There is no duplicates” if there are no duplicate elements.
NOTE: Make your code dynamic that works for any given int array.

// */
       int[] numbers1 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
           String s = "";

        for (int i = 0; i <= numbers1.length - 1; i++) {
           for (int j = i + 1; j < numbers1.length; j++) {
                if (numbers1[i] == numbers1[j] && !s.contains(numbers1[i] + "")) { // converting int to String (+ "");
                                 s+= numbers1[i];
                  System.out.println(numbers1[i]);
              }
          }
      }
       if (s.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("\n\t  -------- Task 4 --------");
        /*
        Write a program to find the all duplicates in a String array, ignore cases.
         It should print "There is no duplicates” if there are no duplicate elements.
NOTE: Make your code dynamic that works for any given String array.

         */
//        String[] words = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
//               String s3 = "";
//        for (int i = 0; i < words.length-1 ; i++) {
//            for (int j = i + 1; j < words.length ; j++) {
//                if (words[i].toLowerCase().equals(words[j].toLowerCase()) && !s3.toLowerCase().contains(words[j]) ){
//                   System.out.println(words[i];
//                    s3 += words[i] + "\n";
//                }
//            }
//        }
//        if (s3.isEmpty()) System.out.println("There is no duplicates");
//


        System.out.println("\n\t  -------- Task 5 --------");

        /*
        Write a program to reverse elements in an array, then print array.
NOTE: Make your code dynamic that works for any given array.

         */
        String[] words1 = {"abc", "foo", "bar"};

        String s4 = "";

        for (int i= words1.length-1; i >=0; i--){
            s4+= words1[i] + " ";

        }
//        System.out.println(s4.substring(0, s4.length()-1));
//
//        String[] wordsT5 = {"abc", "foo", "bar"};
//        ArrayList<String> wordsContainer = new ArrayList<String>();
//        for (int i = wordsT5.length - 1; i >= 0; i--) wordsContainer.add(wordsT5[i]);
//        System.out.println(wordsContainer);

        String[] words2 = {"java", "python", "ruby"};
//        String[] reverseWords2 = new String[words2.length];// [ruby, python, java]
//
//
//
//        for (int i = 0; i < words2.length; i++) {
//            reverseWords2[i] = words2[words2.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(reverseWords2));








        System.out.println("\n\t  -------- Task 6 --------");

        /*
        Write a program to reverse each word in a given String
NOTE: Make your code dynamic that works for any given String.

         */

        String str = "Today is a fun day";

        String s1 = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            s1+= str.charAt(i);
        }

        String[] s2 = s1.split(" ");

        String b = "";
        for (int i = s2.length-1; i >=0 ; i--) {
            b+= s2[i]+ " ";
        }
        System.out.println(b.substring(0, b.length()-1));


 //       String str = "Java is fun";

//        String[] w = str.split(" ");
//
//        for (int i = 0; i < w.length; i++) {
//            //w[i] --> Java
//            String currentReverseW = "";
//            for (int j = w[i].length() - 1; j >= 0 ; j--) {
//                currentReverseW += "" + w[i].charAt(j);
//            }
//            // currentReverseW --> avaJ
//            w[i] = currentReverseW;
//        }
//        // w -> [avaJ, si, nuf]
//
//        for (int i = 0; i < w.length; i++) {
//            System.out.print((i == w.length - 1) ? w[i]: w[i] + " ");
//        }



        System.out.println("\n- - - - - Task6 - - KEREM's- - -\n");
        String string = "Java is fun";
        String[] opposite = string.split(" ");
        for (int i = 0; i < opposite.length; i++){
            for (int j = opposite[i].length() - 1; j >= 0; j--) {
                System.out.print(opposite[i].charAt(j));
            }
            System.out.print(" ");
        }
        }
    }



