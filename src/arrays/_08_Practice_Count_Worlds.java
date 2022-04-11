package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Worlds {
    public static void main(String[] args) {

        System.out.println("\n--------TASK-1--------\n");
/*
TASK-1
Assume you are given a String as below
Please find how many words you have in the given String

String s1 = "Today is Tuesday";

RESULT:
3
 */
        String s1= "Today is Tuesday";

        System.out.println(s1.split(" ").length); // 3

/*

TASK-2
Assume you are given a String as below
Please find how many words you have in the given String starts with A or a

String s2 = "Some countries I visited were Argentina, Belgium and Malta";

RESULT:
2
 */

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        String[] words2 = s2.split(" ");

        int counter = 0;
        for (String word : words2) {
            if (word.toLowerCase().startsWith("a")) counter++; // "a" in double cottations
        }
            System.out.println(counter); // 2




    }
}
