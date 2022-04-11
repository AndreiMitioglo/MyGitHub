package arrays;

import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {
/*
Task-1
Create an array that will store 4 fruit names
Then, print the empty array

EXPECTED OUTPUT:
[null, null, null, null]
 */
        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits)); // [null, null, null, null]
/*
Task-2
Store your fav fruit in the index of 0
Store the 4th fav fruit in the index of 3
Print the array again

EXPECTED OUTPUT:
[Apple, null, null, Banana]
 [ 0      1     2     3 ]
 */

       fruits[0] = "Apple" ;
       fruits[3] = "Banana" ;
       System.out.println(Arrays.toString(fruits));


///   ======= Task 4 ========
        System.out.println(fruits.length); //4  do not put () at length -> error


        System.out.println(fruits[0]); // Apple
        System.out.println(fruits[3]); // Banana
        System.out.println(fruits[1]); // null

        System.out.println(fruits[0].toLowerCase()); // APPLE
        System.out.println(fruits[0].charAt(0)); // A
        System.out.println(fruits[0].length()); // 5
        System.out.println(fruits[3].startsWith("B")); // true

        //System.out.println(fruits[1].length()); // NullPointerException





    }
}
